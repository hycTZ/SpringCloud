package com.noah.client.mongodb.dao;

import com.noah.client.mongodb.entry.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository  extends MongoRepository<Test,String> {
}