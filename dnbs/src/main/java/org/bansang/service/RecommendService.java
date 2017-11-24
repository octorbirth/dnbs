package org.bansang.service;

import java.util.List;

import org.bansang.dto.RecommendDTO;

public interface RecommendService {
<<<<<<< HEAD

	 public void recommend(RecommendDTO dto);
	 
=======
 
	 public List<RecommendDTO> list(RecommendDTO dto);

	public RecommendDTO get(Long recommendNum);
>>>>>>> branch 'master' of https://github.com/octorbirth/dnbs.git
}
