package com.phandeptrai.services;

import java.util.List;

import com.phandeptrai.entities.SinhVien;

public interface SinhVienService {
	List<SinhVien> getSinhVienByString(String searchString);
}
