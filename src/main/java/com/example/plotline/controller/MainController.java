package com.example.plotline.controller;


import com.example.plotline.exceptions.InvalidAccountIdException;
import com.example.plotline.models.entity.response.SuccessResponse;

import com.example.plotline.services.ResponseGeneratorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping(path = "api/v1/")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class MainController {

    private final ResponseGeneratorService responseGeneratorService;

    @GetMapping(value = "/fetch")
    public ResponseEntity fetch() throws InvalidAccountIdException {
       return new ResponseEntity(SuccessResponse.getSuccessResponse(responseGeneratorService.populateResponseData()), HttpStatus.OK);
    }
}
