package com.jega.swagger;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private Integer id=1;
	private String name="Jegadeesh";
	private String dept="EEE";
}
