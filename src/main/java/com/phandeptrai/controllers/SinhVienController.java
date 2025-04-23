package com.phandeptrai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phandeptrai.dtos.SearchRequest;
import com.phandeptrai.dtos.ThongTinTNCVResponse;
import com.phandeptrai.entities.SinhVien;
import com.phandeptrai.services.SinhVienService;
import com.phandeptrai.services.SinhVienTNService;


@Controller
@RequestMapping(value = "/search")
public class SinhVienController {
	
	private SinhVienService sinhVienService;
	private SinhVienTNService sinhVienTNService;
	
	@Autowired
	public SinhVienController(SinhVienService sinhVienService,SinhVienTNService sinhVienTNService) {
		super();
		this.sinhVienService = sinhVienService;
		this.sinhVienTNService = sinhVienTNService;
	}

	@GetMapping(value ="/showform")
	public String showForm(Model model) {
		model.addAttribute("command", new SearchRequest());
		return "searchstring";
	}
	@GetMapping(value = "/sinhvien")
	public String searchSinhVien(@ModelAttribute("command")SearchRequest searchRequest ,Model model) {
		
		List<SinhVien> sinhviens = sinhVienService.getSinhVienByString(searchRequest.getSearchString());
		
		model.addAttribute("results",sinhviens);
		
		return "searchstring";
	}
	
	@GetMapping(value = "/showform2")
	public String showForm2(Model model) {
		model.addAttribute("command", new SearchRequest());
		return "searchTTTN";
	}
	
	@GetMapping("/result")
	public String searchTTTN(@ModelAttribute("command") SearchRequest searchRequest, Model model) {
		ThongTinTNCVResponse thongTinTNCVResponse = sinhVienTNService.getThongTinTNVaCV(searchRequest.getSearchString());
		
		model.addAttribute("responsett", thongTinTNCVResponse);
		return "searchTTTN";
	}
}
