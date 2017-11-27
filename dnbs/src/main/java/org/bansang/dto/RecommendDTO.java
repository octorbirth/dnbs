package org.bansang.dto;

import java.util.Date;

import lombok.Data;

@Data
public class RecommendDTO {
	private Long recommendNumber;
	private Long storeNumber;
	private String memberId;
	private String recommendContents;
	private String storeName;
	private String storeAddress;
	private String areaKeyword;
	private Double latitude;
	private Double longitude;
	private Date regiterDate;
}
