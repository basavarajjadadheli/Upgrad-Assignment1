package com.terra.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.terra.main.common.PensionerDetail;
import com.terra.main.common.TransactionRequest;
import com.terra.main.common.TransactionResponse;
import com.terra.main.entity.ProcessPensionInput;

@Service
public class ProcessPensionService {

	@Autowired
	private com.terra.main.dao.ProcessPensionRepository processPensionRepository;

	@Autowired
	private RestTemplate template;

	public TransactionResponse processPension(TransactionRequest request) {

		ProcessPensionInput pensionInput = request.getProcessPensionInput();
		PensionerDetail pensionerDetail = request.getPensionerDetail();

		//  load balancing
		PensionerDetail pensionerResponse = template.postForObject(
				"http://PENSIONDETAIL-SERVICE/PensionerDetailByAadhaar/{aadhaarNumber}", pensionerDetail,
				PensionerDetail.class);

		return new TransactionResponse(pensionInput, pensionerResponse);
	}

}
