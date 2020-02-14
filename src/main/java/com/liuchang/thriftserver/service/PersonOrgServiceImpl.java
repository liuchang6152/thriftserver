package com.liuchang.thriftserver.service;

import com.liuchang.thrift.DataException;
import com.liuchang.thrift.OrgService;
import com.liuchang.thrift.PersonOrg;
import org.apache.thrift.TException;

/**
 * @ Author     ：liuchang
 * @ Date       ：Created in 15:48 2020/2/14
 * @ Description：
 * @ Modified By：
 */
public class PersonOrgServiceImpl implements OrgService.Iface {
    @Override
    public PersonOrg getorgByCode(String orgCode) throws DataException, TException {
        return null;
    }

    @Override
    public void saveOrg(PersonOrg personOrg) throws DataException, TException {

    }
}
