package org.bansang.service;

import java.util.List;

import javax.inject.Inject;

import org.bansang.dto.RecommendDTO;
import org.bansang.mapper.RecommendMapper;
import org.springframework.stereotype.Service;

@Service
public class RecommendServiceImpl implements RecommendService {

	@Inject
    private RecommendMapper recommendMapper;
	
	@Override
	public List<RecommendDTO> list(RecommendDTO dto) {
		return recommendMapper.list(dto);
	}

	@Override
	public RecommendDTO get(Long recommendNum) {
		return recommendMapper.selectInfo(recommendNum);
	}

}
