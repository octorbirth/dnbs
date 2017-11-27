package org.bansang.mapper;

import org.apache.ibatis.annotations.Select;
import org.bansang.dto.StoreDTO;

public interface StoreMapper {

	@Select("select * from tbl_store where store_number = #{storeNumber}")
	public StoreDTO selectInfo(Long storeNumber);
}
