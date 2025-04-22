package com.phandeptrai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phandeptrai.dao.SinhVienDAO;
import com.phandeptrai.dtos.ThongTinTNRequest;

@Service
public class SinhVienTNServiceImpl implements SinhVienTNService{
	
	@Autowired
	private SinhVienDAO sinhVienDAO;
	@Override
	public boolean saveThongTinTN(ThongTinTNRequest request) {
		return sinhVienDAO.saveThongTinTN(request);
	}

}
