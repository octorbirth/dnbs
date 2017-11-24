package org.bansang.web;

import java.util.List;
import org.apache.poi.ss.usermodel.Header;
import org.bansang.dto.CommentDTO;
import org.bansang.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@Log
@CrossOrigin
@RestController
@RequestMapping("/review/*")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	//댓글 추가
	@PostMapping("/add")
	public void addComment(@RequestBody CommentDTO dto) {
		log.info("===================");
		log.info("Comment Controller: " + dto.getCommentContents());		
		log.info("===================");
		
		commentService.commentRegister(dto);
	}
	
	//댓글 리스트 가져오기
	@GetMapping("/commentList/{recommendNumber}")
	public List<CommentDTO> commentList(@PathVariable("recommendNumber") Long recommendNumber){
//		log.info("===================");
//		log.info("소속번호 : " + recommendNumber);		
//		log.info("===================");
		return commentService.commentList(recommendNumber);
	}
	
	
	//댓글 삭제
	@DeleteMapping("/delete/{commentNumber}")
	public ResponseEntity<String> deleteComment(@PathVariable("commentNumber") Long commentNumber){
		log.info("del recommendNumber: "+ commentNumber);
		
//		commentService.commentDelete(dto);
		
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
		
	}

}
