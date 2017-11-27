package org.bansang.dto;

import lombok.Data;

@Data
public class GroupMemberDTO {

	private int gno;
	private String memberName; // 이름
	private String memberEmail; // 이메일
}
