package com.liuchang.thriftserver.service;

import com.liuchang.thrift.DataException;
import com.liuchang.thrift.Person;
import com.liuchang.thrift.PersonService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：liuchang
 * @ Date       ：Created in 20:16 2020/2/12
 * @ Description：
 * @ Modified By：
 */
@Service
public class PersonServiceImpl implements PersonService.Iface{
    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        System.out.println("befin--------------------------");
        Person person = new Person();
        person.setAge(11);
        person.setUsername("sam");
        person.setMarried(true);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println(person.getAge());
        System.out.println(person.getUsername());
        System.out.println(person.isMarried());
        System.out.println(person);
    }
}
