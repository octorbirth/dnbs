package org.bansang.web;

import org.bansang.dto.GroupDTO;
import org.bansang.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/excel/*")
public class GroupController {

	@Autowired
	GroupService groupService;

	@PostMapping("upload")
	public void uploadExcelFile(GroupDTO dto) {

		groupService.uploadExcel(dto);
	}

}
