package com.liuchang.thriftserver.common;

import com.liuchang.thrift.PersonService;
import com.liuchang.thriftserver.service.PersonServiceImpl;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：liuchang
 * @ Date       ：Created in 12:36 2020/2/14
 * @ Description：
 * @ Modified By：
 */
@Component
public class ThriftServer  implements ApplicationRunner {
    @Value("${thrift.server.port}")
    private int thriftPort;
    @Value("${thrift.minWorkerThreads}")
    private int minWorkerThreads;
    @Value("${thrift.maxWorkerThreads}")
    private int maxWorkerThreads;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        TNonblockingServerSocket socket = new TNonblockingServerSocket(thriftPort);
        THsHaServer.Args arg = new THsHaServer.Args(socket).minWorkerThreads(minWorkerThreads).maxWorkerThreads(maxWorkerThreads);
        PersonService.Processor<PersonServiceImpl> processor = new PersonService.Processor<>(new PersonServiceImpl());

        arg.protocolFactory(new TCompactProtocol.Factory());
        arg.transportFactory(new TFramedTransport.Factory());
        arg.processorFactory(new TProcessorFactory(processor));

        TServer server = new THsHaServer(arg);
        System.out.println("Thrift Server Started");

        server.serve();
    }
}
