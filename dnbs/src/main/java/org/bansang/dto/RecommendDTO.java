package org.bansang.dto;

import java.util.Date;

import lombok.Data;

@Data
public class RecommendDTO {
	private Long recommendNumber;
	private String latitude;
	private String longitude;
	private Date regiterDate;
	private String recommendContents;
	private Long storeNumber;
	private Long memberId;
}
