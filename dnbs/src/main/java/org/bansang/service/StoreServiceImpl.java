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
		if(obj == null) { // store ���̺� ���� ���ο� ������ ��
			storeMapper.register(dto);
			recommendMapper.firstRegister(dto);
		}else { // ������ ��ϵ� ���Է� �߰����� ��õ�� �޾��� ��
			dto.setStoreNumber(obj.getStoreNumber());
			recommendMapper.plusRegister(dto);
		}
		
	}

}
