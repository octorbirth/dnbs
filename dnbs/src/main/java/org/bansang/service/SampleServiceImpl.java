package org.bansang.service;

import java.util.List;

import javax.inject.Inject;

import org.bansang.dto.SampleDTO;
import org.bansang.mapper.SampleMapper;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{

	@Inject
    private SampleMapper sampleMapper;
    
	@Override
	public List<SampleDTO> list() {
		
		return sampleMapper.list();
	}

}
