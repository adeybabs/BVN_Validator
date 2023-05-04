package com.example.bvn_validator.repository;

import com.example.bvn_validator.model.Bvn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BvnRepository extends MongoRepository<Bvn, Long> {

    Optional<Bvn> findByBvn(String bvn);
}
