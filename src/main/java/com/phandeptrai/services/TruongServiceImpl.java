package com.phandeptrai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phandeptrai.dao.TruongDAO;
import com.phandeptrai.dtos.TruongResponse;

@Service
public class TruongServiceImpl implements TruongService{

	@Autowired
	private TruongDAO truongDao;
	
	@Override
	public List<TruongResponse> getAllTruong() {
		return truongDao.layTatCaTruong();
	}

}
