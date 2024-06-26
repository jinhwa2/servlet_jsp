package com.khmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.SC;
import com.khmall.mapper.SCMapper;

@Service
public class SCService {
	@Autowired
	private SCMapper scmapper;
	
	public List<SC> getAllSC(){
		return scmapper.getAllSC();
	}
	//getSnackById()
	
	public SC getSnackByID(int snack_id) {
		return scmapper.getSnackById(snack_id);
	
  }
	public SC getcompany(String company_adderess) {
		return scmapper.getcompany(company_adderess);
}

}