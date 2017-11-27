package org.bansang.service;

import java.util.List;

import org.bansang.dto.RecommendDTO;
import org.bansang.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	StoreMapper storeMapper;
	
	@Override
	public List<RecommendDTO> list() {
		return storeMapper.listPage();
	}

	@Override
	public RecommendDTO view(Long storeNumber) {
		return storeMapper.view(storeNumber);
	}

}
