package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmpDao;
import com.google.gson.Gson;

@RestController
public class EmpController {

	@Autowired
	private EmpDao dao;
	public EmpDao getDao() {
		return dao;
	}
	
	@RequestMapping(value = "list", produces = "application/json;charset=UTF-8")
	public String listAll() {
		String str = "";
		Gson gson = new Gson();
		str = gson.toJson(dao.listAll());
		//System.out.println(str);
		return str;
	}
}
