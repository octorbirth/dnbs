package org.bansang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.bansang.dto.SampleDTO;


public interface SampleMapper {
	@Select("select * from tbl_sample")
	public List<SampleDTO> list();
}
