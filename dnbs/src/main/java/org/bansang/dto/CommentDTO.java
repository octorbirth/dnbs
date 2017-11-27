package org.bansang.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CommentDTO {
	private Long commentNumber;  
	private String commentContents;
	private Date registerDate;
	private Long recommendNumber;
}
