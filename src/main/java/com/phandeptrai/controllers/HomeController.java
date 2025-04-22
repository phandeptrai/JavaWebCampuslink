package com.phandeptrai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phandeptrai.dtos.NganhResponse;
import com.phandeptrai.dtos.ThongTinTNRequest;
import com.phandeptrai.dtos.TruongResponse;
import com.phandeptrai.entities.Nganh;
import com.phandeptrai.services.*;

import jakarta.validation.Valid;


@Controller
@RequestMapping(value = "/sinhvien")
public class HomeController {

	private NganhService nganhService;
	private TruongService truongService;
	private SinhVienTNService sinhVienTNService;

	@Autowired
	public HomeController(NganhService nganhService, TruongService truongService,SinhVienTNService sinhVienTNService) {
		this.nganhService = nganhService;
		this.truongService = truongService;
		this.sinhVienTNService = sinhVienTNService;
	}

	@GetMapping(value = "/showform")
	public String showForm(Model model) {
		List<NganhResponse> nganhResponses = nganhService.getAllNganh();
		List<TruongResponse> truongResponses = truongService.getAllTruong();
		
		model.addAttribute("nganhs", nganhResponses);
		model.addAttribute("truongs", truongResponses);
		model.addAttribute("ThongTinTNRequest", new ThongTinTNRequest());
		return "home";
	}

	@PostMapping(value = "/save")
	public String saveSinhVien(@ModelAttribute("ThongTinTNRequest") ThongTinTNRequest thongTinTTRequest, Model model) {
		
		boolean success = sinhVienTNService.saveThongTinTN(thongTinTTRequest);
		
		if(success)
			model.addAttribute("success", "nhap thong tin sinh vien:"+ success);
		

		return"test";
	}


}
