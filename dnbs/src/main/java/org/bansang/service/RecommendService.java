package org.bansang.service;

import java.util.List;

import org.bansang.dto.RecommendDTO;

public interface RecommendService {

	 public void recommend(RecommendDTO dto);
	 
	 public List<RecommendDTO> list(RecommendDTO dto);
}