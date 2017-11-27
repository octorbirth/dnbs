package org.bansang.dto;

import java.util.Date;

import lombok.Data;

@Data
public class RecommendDTO {
	
	private Long recommendNumber;
	private Date registerDate;
	private String recommendContents;
	private Long storeNumber;
	private Long memberId;
}
