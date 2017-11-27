package org.bansang.service;

import javax.inject.Inject;

import org.bansang.dto.RecommendDTO;
import org.bansang.mapper.RecommendMapper;
import org.bansang.mapper.StoreMapper;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

	@Inject
	private StoreMapper storeMapper;
	
	@Inject
	private RecommendMapper recommendMapper;
	
	@Override
	public void register(RecommendDTO dto) {
		
		RecommendDTO obj = storeMapper.exist(dto);
		if(obj == null) { // store 테이블에 없는 새로운 가게일 때
			storeMapper.register(dto);
			recommendMapper.firstRegister(dto);
		}else { // 기존의 등록된 가게로 추가적인 추천을 받았을 때
			dto.setStoreNumber(obj.getStoreNumber());
			recommendMapper.plusRegister(dto);
		}
		
	}

}
