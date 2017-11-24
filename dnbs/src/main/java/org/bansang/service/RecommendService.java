package org.bansang.service;

import java.util.List;

import org.bansang.dto.RecommendDTO;

public interface RecommendService {
 
	 public List<RecommendDTO> list(RecommendDTO dto);

	public RecommendDTO get(Long recommendNum);
}
