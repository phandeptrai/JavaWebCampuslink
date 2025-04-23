package com.phandeptrai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phandeptrai.dao.SinhVienDAO;
import com.phandeptrai.entities.SinhVien;

@Service
public class SinhVienServiceImpl implements SinhVienService {

	@Autowired
	private SinhVienDAO sinhVienDAO;
	@Override
	public List<SinhVien> getSinhVienByString(String searchString) {

		return sinhVienDAO.getSinhVienByString(searchString);
	}

}
