package com.example.sports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sports.Model.sports;
import com.example.sports.Respository.sportsResp;


@Service
public class sportservices {

	@Autowired
	private sportsResp bRepo;
	
	public void save(sports s) {
		bRepo.save(s);
	}
	
public List<sports> getAllspo(){
	return bRepo.findAll();
	}
public void deletecode(int id) {
	bRepo.deleteById(id);
}

}