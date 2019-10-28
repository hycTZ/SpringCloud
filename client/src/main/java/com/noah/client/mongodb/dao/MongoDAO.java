package com.noah.client.mongodb.dao;

import com.noah.client.mongodb.entry.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoDAO {

    @Autowired
    private MongoTemplate mongoTemplate;


    public List<Test> query(String name){
        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(name));
        return mongoTemplate.find(query, Test.class);
    }


}
