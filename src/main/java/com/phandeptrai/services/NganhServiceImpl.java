package com.phandeptrai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phandeptrai.dao.NganhDAO;
import com.phandeptrai.dtos.NganhResponse;

@Service
public class NganhServiceImpl implements NganhService{
	
	@Autowired
	private NganhDAO nganhDAO;
	
	@Override
	public List<NganhResponse> getAllNganh() {
		
		return nganhDAO.layTatCaTruong();
	}

}
