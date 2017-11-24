package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.bansang.dto.StoreDTO;

public interface StoreMapper {

	@Select("select * from table_store")
	public List<StoreDTO> listPage();

}
