package org.bansang.service;

import javax.inject.Inject;

import org.bansang.dto.StoreDTO;
import org.bansang.mapper.StoreMapper;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService{

	@Inject
    private StoreMapper storeMapper;

	@Override
	public void recommend(StoreDTO dto) {
		storeMapper.recommend(dto);
	}

}
