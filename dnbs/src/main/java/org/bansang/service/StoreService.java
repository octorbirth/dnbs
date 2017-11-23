package org.bansang.service;

import java.util.List;

import org.bansang.dto.StoreDTO;

public interface StoreService {
	 public void recommend(StoreDTO dto);
	 
	 public List<StoreDTO> list(StoreDTO dto);
}
