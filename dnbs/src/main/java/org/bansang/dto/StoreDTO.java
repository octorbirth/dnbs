package org.bansang.dto;

import lombok.Data;

@Data
public class StoreDTO {
	private Long storeNuber;
	private String storeName;
	private String storeAddress;
	private Double latitude;
	private Double longtitude;
}
