package com.example.qualifierdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qualifierdemo.entity.InputData;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/testdemo")
public class QualifiController {

	@Autowired
	public InputData inputData;

	@Autowired
	@Qualifier("employeeData")
	public InputData inputData1;

	@Value("${oito.training.value:value_not_found}")
	private String message;

	@PostMapping
	public String inputName() {
		log.debug(inputData.readData(message));
		return message;
	}

	private String message1 = "Employee";

	@PostMapping("/employee")
	public String inputName1() {
		log.debug(inputData1.readData(message1));
		return message;
	}

}
