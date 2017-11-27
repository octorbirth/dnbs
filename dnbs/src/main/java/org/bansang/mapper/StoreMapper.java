package org.bansang.mapper;

import org.apache.ibatis.annotations.Select;
import org.bansang.dto.RecommendDTO;

public interface StoreMapper {

	@Select("select * from tbl_store where store_number = #{storeNumber}")
	public RecommendDTO selectInfo(Long storeNumber);
}
