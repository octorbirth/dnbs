package org.bansang.dto;

import java.util.Date;

import lombok.Data;

@Data
public class RecommendDTO {

	private Long recommendNumber;


	private Date registerDate;
	private String recommendContents;
	private Long storeNumber;
	private String memberId;
	private String storeName;
	private String storeAddress;
	private String areaKeyword;
	private Double latitude;
	private Double longitude;
	


}
