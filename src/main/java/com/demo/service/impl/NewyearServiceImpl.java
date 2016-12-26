package com.demo.service.impl;

import com.demo.dao.NewyearDao;
import com.demo.pojo.Newyear;
import com.demo.service.NewyearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenjianhui on 16/12/22.
 */
@Service
public class NewyearServiceImpl implements NewyearService {

    @Autowired
    private NewyearDao newyearDao;

    @Override
    public List<Newyear> getNewYear(){
        return newyearDao.getNewYear();
    }

}
