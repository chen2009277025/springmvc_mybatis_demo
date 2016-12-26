package com.demo.dao.impl;

import com.demo.dao.MySqlSessionDaoSupport;
import com.demo.dao.NewyearDao;
import com.demo.pojo.Newyear;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by chenjianhui on 16/12/22.
 */
@Repository(NewyearDaoImpl.NAME)
public class NewyearDaoImpl extends MySqlSessionDaoSupport implements NewyearDao{

    public final static String NAME = "newyearDao";

    @Override
    public List<Newyear> getNewYear(){

        HashMap<String, Object> params = new HashMap<String, Object>();

        params.put("id",1);

        List<Newyear> lists = getSqlSession().selectList(
                getNameSpace() + ".getNewYear", params);
        return lists;
    }

}
