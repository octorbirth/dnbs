package org.bansang.service;

import org.bansang.dto.GroupDTO;
import org.bansang.mapper.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {
	
	@Autowired
	GroupMapper groupMapper;

	@Override
	public void uploadExcel(GroupDTO dto) {

		groupMapper.insert(dto);
	}	
}
