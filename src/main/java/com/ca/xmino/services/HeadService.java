package com.ca.xmino.services;

import com.ca.xmino.TO.Head;
import com.ca.xmino.repositories.HeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HeadService {

    @Autowired
    private HeadRepository headRepository;

    public Iterable<Head> getAllHead(){

        Iterable<Head> headCol = headRepository.findAll();
        return headCol;
    }

    public Optional<Head> getHeadById(String id){

        return headRepository.findById(id);
    }


}
