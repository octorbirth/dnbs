package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.bansang.dto.StoreDTO;

public interface StoreMapper {

	@Select("select * from tbl_store")
	public List<StoreDTO> listPage();
	
	@Select("select * from tbl_store where store_number = #{storeNumber}")
	public StoreDTO view(Long storeNumber);

}
