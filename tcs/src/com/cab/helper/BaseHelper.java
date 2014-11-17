package com.cab.helper;

import org.json.JSONObject;
public abstract class BaseHelper {
	public void insertRecord(JSONObject jsonObject){
		System.out.println("base helper : insert");
	}
	public void deleteRecord(JSONObject jsonObject){
		System.out.println("base helper : delete");
	}
	public void readRecords(JSONObject jsonObject){
		System.out.println("base helper : read");
	}
	public void updateRecord(JSONObject jsonObject){
		System.out.println("base helper : update ");
	}
	public void customProcedure(JSONObject jsonObject){
		System.out.println("base Helper custom procedure : ");
	}
}

