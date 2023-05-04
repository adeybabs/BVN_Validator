package com.example.bvn_validator.repository;

import com.example.bvn_validator.model.RequestResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestResponseRepository extends MongoRepository<RequestResponse, Long> {
}
