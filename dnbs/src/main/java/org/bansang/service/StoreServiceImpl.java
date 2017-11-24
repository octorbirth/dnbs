package org.bansang.service;

import java.util.List;

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

	@Override
	public List<StoreDTO> list(StoreDTO dto) {
		return storeMapper.list(dto);
	}

}
