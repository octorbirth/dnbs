package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.bansang.dto.RecommendDTO;


public interface StoreMapper {

	@Select("select * from tbl_store")
	public List<RecommendDTO> listPage();
	
	@Select("select * from tbl_store where store_number = #{storeNumber}")
	public RecommendDTO view(Long storeNumber);

}
