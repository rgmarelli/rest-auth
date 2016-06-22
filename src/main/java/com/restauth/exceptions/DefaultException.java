package com.restauth.exceptions;

public class DefaultException extends Exception {
	
	private String body;
	private Integer code;
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}