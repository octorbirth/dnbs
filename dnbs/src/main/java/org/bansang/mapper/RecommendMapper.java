package org.bansang.mapper;


import org.apache.ibatis.annotations.Insert;
import org.bansang.dto.RecommendDTO;

public interface RecommendMapper {
	
	@Insert("insert into tbl_recommend (store_number, recommend_contents, member_id) values (LAST_INSERT_ID(), #{recommendContents}, #{memberId} )")
    public void firstRegister(RecommendDTO dto);

	@Insert("insert into tbl_recommend (store_number, recommend_contents, member_id) values (#{storeNumber}, #{recommendContents}, #{memberId} )")
	public void plusRegister(RecommendDTO recommendDto);
}