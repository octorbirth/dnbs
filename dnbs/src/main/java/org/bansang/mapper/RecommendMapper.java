package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.bansang.dto.RecommendDTO;

public interface RecommendMapper {
	
	@Select("select * from tbl_recommend where store_number = #{storeNumber}")
	public List<RecommendDTO> selectList(Long storeNumber);
}