package org.bansang.service;

import org.bansang.dto.StoreDTO;
import org.bansang.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreMapper storeMapper;
	
	@Override
	public StoreDTO getInfo(Long storeNum) {
		
		return storeMapper.selectInfo(storeNum);
	}
}
