package com.restauth.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restauth.entities.Thing;
import com.restauth.exceptions.DefaultException;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@RestController
@RequestMapping("/v1/thing")
public class MyController {
	
    @RequestMapping(method = RequestMethod.GET, path = "/search", produces = "application/json")
    public Thing search(@RequestParam(value="id", required=true) Integer id) throws DefaultException {


    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	String name=auth.getName();
    	String credentials=auth.getCredentials().toString();
		
    	if( name != null && credentials != null ) {
    		
    	}
    	
    	return new Thing(id,name);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ping", produces = "application/json")
    public Thing ping(@RequestParam(value="data", required=false) String data) throws DefaultException {

    	if( data == null ) {
    		DefaultException e = new DefaultException();
    		e.setCode(HttpStatus.BAD_REQUEST.value());
    		throw e;
    	}

    	return new Thing(0,data);
    }
}

