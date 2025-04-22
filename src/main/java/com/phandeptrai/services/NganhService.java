package com.phandeptrai.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phandeptrai.dtos.NganhResponse;


public interface NganhService {
	List<NganhResponse> getAllNganh();
}
