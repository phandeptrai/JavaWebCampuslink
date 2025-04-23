package com.phandeptrai.services;

import com.phandeptrai.dtos.ThongTinTNCVResponse;
import com.phandeptrai.dtos.ThongTinTNRequest;

public interface SinhVienTNService {
	boolean saveThongTinTN(ThongTinTNRequest request);
	ThongTinTNCVResponse getThongTinTNVaCV(String soCMND);
}
