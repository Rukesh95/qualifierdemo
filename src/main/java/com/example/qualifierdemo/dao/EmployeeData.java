package com.example.qualifierdemo.dao;

import org.springframework.stereotype.Component;

import com.example.qualifierdemo.entity.InputData;

import lombok.extern.slf4j.Slf4j;

@Component("employeeData")
@Slf4j
public class EmployeeData implements InputData {

	@Override
	public String readData(final String employeeName) {
		log.info("Employee class");
		return employeeName;
	}

}
