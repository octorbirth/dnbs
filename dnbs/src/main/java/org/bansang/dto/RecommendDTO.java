package org.bansang.dto;

import java.util.Date;

import lombok.Data;

@Data
public class RecommendDTO {
	private Date regiterDate;
	private String recommendContents;
	private Long storeNumber;
	private Long memberId;
}
