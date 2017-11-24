package org.bansang.dto;

import java.util.Date;

import lombok.Data;

@Data
public class RecommendDTO {
	private Long recommendNumber;
	private String latitude;
	private String longitude;
	private Date regiterDate;
	private String recommendStore;
	private String recommendContents;
	private String recommendAddress;
	private int memberId;
}
