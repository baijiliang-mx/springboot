package com.data.springboot.sservice.service;

import com.data.springboot.sdao.dao.Sdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S_Service implements Sservice {
    @Autowired
    private Sdao dao;
    @Override
    public String list() {
        return dao.save();
    }
}
