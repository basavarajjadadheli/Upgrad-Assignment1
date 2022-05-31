package com.terra.main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.terra.main.common.TransactionRequest;
import com.terra.main.common.TransactionResponse;
import com.terra.main.service.ProcessPensionService;


@RestController
public class PensionProcessController {

	@Autowired
	ProcessPensionService processPensionService;
	
	@PostMapping("/processPension")
	public TransactionResponse processPension(@RequestBody TransactionRequest transactionRequest) {
		TransactionResponse response = processPensionService.processPension(transactionRequest);
		return processPensionService.processPension(transactionRequest);
		
	}
}
