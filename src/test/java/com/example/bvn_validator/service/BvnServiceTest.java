package com.example.bvn_validator.service;

import com.example.bvn_validator.dtos.BvnRequest;
import com.example.bvn_validator.dtos.BvnResponse;
import com.example.bvn_validator.model.Bvn;
import com.example.bvn_validator.repository.BvnRepository;
import com.example.bvn_validator.repository.RequestResponseRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BvnServiceTest extends Mockito {

    @Autowired
    BvnRepository bvnRepository =mock(BvnRepository.class);
    @Autowired
    RequestResponseRepository requestResponseRepository = mock(RequestResponseRepository.class);

    Bvn bvn = new Bvn(1L, "12345678901", "Adedamola", "Babatunde", 'M', "temp.png");

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    void validateBvn() {
    /*    BvnRequest bvnRequest = new BvnRequest();
        bvnRequest.setBvn("12345678901");
        when(bvnRepository.findByBvn(bvnRequest.getBvn())).thenReturn(Optional.ofNullable(bvn));
        BvnService bvnService = new BvnService(bvnRepository, requestResponseRepository);
        BvnResponse bvnResponse = bvnService.validateBvn(bvnRequest);
        assertEquals(bvnResponse.getBvn(), bvn.getBvn());
        assertEquals(bvnResponse.getImageDetail(), bvn.getImageDetails());
        assertEquals(bvnResponse.getCode(), 00);
        BvnRequest notFoundBvnRequest = new BvnRequest("12345678906");
        when(bvnRepository.findByBvn(notFoundBvnRequest.getBvn())).thenReturn(Optional.empty());
        bvnResponse = bvnService.validateBvn(notFoundBvnRequest);
        assertEquals(bvnResponse.getCode(), 01);
        BvnRequest shortBvnRequest = new BvnRequest("1234567890");
        bvnResponse = bvnService.validateBvn(shortBvnRequest);
        assertEquals(bvnResponse.getCode(), 02);
        BvnRequest nullBvnRequest = new BvnRequest();
        bvnResponse = bvnService.validateBvn(nullBvnRequest);
        assertEquals(bvnResponse.getCode(), 400);
        BvnRequest mixedBvnRequest = new BvnRequest("1234567890a");
        bvnResponse = bvnService.validateBvn(mixedBvnRequest);
        assertEquals(bvnResponse.getMessage(), "The searched BVN is invalid");*/
    }
}