package org.bansang.service;

import java.util.List;

import org.bansang.dto.StoreDTO;
import org.bansang.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	StoreMapper storeMapper;
	
	@Override
	public List<StoreDTO> list() {
		return storeMapper.listPage();
	}

}
