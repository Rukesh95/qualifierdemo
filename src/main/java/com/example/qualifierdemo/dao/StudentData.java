package com.example.qualifierdemo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.qualifierdemo.entity.InputData;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Primary
public class StudentData implements InputData {

	@Override
	public String readData(final String studentName) {
		log.info("Student class");
		return studentName;
	}

}
