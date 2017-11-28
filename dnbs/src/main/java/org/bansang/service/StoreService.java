package org.bansang.service;

import org.bansang.dto.RecommendDTO;
import org.bansang.dto.StoreDTO;
public interface StoreService {
	
	public void register(RecommendDTO dto);

	public RecommendDTO getInfo(Long storeNum);
}
