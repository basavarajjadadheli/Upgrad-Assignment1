package com.terra.main.common;

import com.terra.main.entity.ProcessPensionInput;

public class TransactionRequest {

	private ProcessPensionInput processPensionInput;
	private PensionerDetail pensionerDetail;
	public ProcessPensionInput getProcessPensionInput() {
		return processPensionInput;
	}
	public void setProcessPensionInput(ProcessPensionInput processPensionInput) {
		this.processPensionInput = processPensionInput;
	}
	public PensionerDetail getPensionerDetail() {
		return pensionerDetail;
	}
	public void setPensionerDetail(PensionerDetail pensionerDetail) {
		this.pensionerDetail = pensionerDetail;
	}
	
	
}
