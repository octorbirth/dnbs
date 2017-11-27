package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.bansang.dto.StoreDTO;

public interface StoreMapper {
	
	@Insert("insert into tbl_store (x, y, recommendStore) values (#{x}, #{y}, #{recommendStore})")
    public void recommend(StoreDTO dto);

	@Select("select * from tbl_sj")
	public List<StoreDTO> list(StoreDTO dto);
}
