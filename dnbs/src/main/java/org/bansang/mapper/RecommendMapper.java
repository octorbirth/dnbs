package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bansang.dto.RecommendDTO;

public interface RecommendMapper {

<<<<<<< HEAD
	@Insert("insert into tbl_store (x, y) values (#{x}, #{y})")
	void recommend(RecommendDTO dto);
=======
	@Select("select * from tbl_sj")
	List<RecommendDTO> list(RecommendDTO dto);

	@Select("select * from tbl_recommend where recommend_number = #{recommendNumber}")
	RecommendDTO selectInfo(Long recommendNumber);
>>>>>>> branch 'master' of https://github.com/octorbirth/dnbs.git
}