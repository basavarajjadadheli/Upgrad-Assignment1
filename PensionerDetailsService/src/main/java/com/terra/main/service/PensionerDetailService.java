package com.terra.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terra.main.dao.PensionerDetailRepository;
import com.terra.main.entity.PensionerDetail;



@Service
public class PensionerDetailService {

	@Autowired
	PensionerDetailRepository pensionerDetailRepository;
	
	public PensionerDetail pensionerDetailByAadhaar(long aadhaarNumber) {
		return pensionerDetailRepository.getById(aadhaarNumber);
	}

	public PensionerDetail createPensioner(PensionerDetail pensionerDetail) {
		
		return pensionerDetailRepository.save(pensionerDetail);
	}

	
}