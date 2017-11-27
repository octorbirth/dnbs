package org.bansang.dto;

import lombok.Data;

@Data
public class StoreDTO {

	Long storeNumber;
	String storeName;
	double latitude;
	double longitude;
	String areaKeyword;
	String storeAddress;
}
