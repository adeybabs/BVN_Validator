package com.example.bvn_validator.controller;

import com.example.bvn_validator.dtos.BvnRequest;
import com.example.bvn_validator.dtos.BvnResponse;
import com.example.bvn_validator.service.BvnService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/bvn-service")
public class BvnController {
    private final BvnService bvnService;

    @PostMapping("/validate/wrapper")
    public BvnResponse postRequest(@RequestBody BvnRequest bvnRequest) {
        return bvnService.validateBvn(bvnRequest);
    }
}
