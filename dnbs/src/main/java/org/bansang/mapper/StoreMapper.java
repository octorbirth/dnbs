package org.bansang.mapper;

import org.apache.ibatis.annotations.Insert;
import org.bansang.dto.StoreDTO;

public interface StoreMapper {
	
	@Insert("insert into tbl_store (x, y) values (#{x}, #{y})")
    void recommend(StoreDTO dto);

	
}
