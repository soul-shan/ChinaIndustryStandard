package com.ws.config;

public interface EventBusType {
	int imageSucc = 0;
	int imageFail = 1;
	int imageCancel = 2;
	int serverError = 3;

	int taskStart = 20;
	int taskCancel = 21;
	int taskSucc_Inspetion = 22;
	int taskSucc_Daily = 23;
	int taskFail = 24;

	int noticeStart = 7;
	int noticeSucc = 8;
	int noticeFail = 9;
}
