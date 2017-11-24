package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bansang.dto.RecommendDTO;

public interface RecommendMapper {

	@Select("select * from tbl_sj")
	List<RecommendDTO> list(RecommendDTO dto);

	@Select("select * from tbl_recommend where recommend_number = #{recommendNumber}")
	RecommendDTO selectInfo(Long recommendNumber);
}