package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bansang.dto.StoreDTO;

public interface StoreMapper {
	
	@Insert("insert into tbl_store (x, y) values (#{x}, #{y})")
    void recommend(StoreDTO dto);

	@Select("select * from tbl_sj")
	List<StoreDTO> list(StoreDTO dto);
}
