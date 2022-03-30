package com.user.define.exception.api.error;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {
	
	private Integer errorCode ;
	private String errorDisc ;
	private Date date ;

}
