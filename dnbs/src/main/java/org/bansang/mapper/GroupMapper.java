package org.bansang.mapper;

import org.apache.ibatis.annotations.Insert;
import org.bansang.dto.GroupDTO;

public interface GroupMapper {

	@Insert ("insert into tbl_groupmember (member_name, member_email) values ")
	public void insert(GroupDTO dto);

}
