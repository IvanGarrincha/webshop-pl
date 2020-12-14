package com.moose.domainmodel.data.products;

import lombok.Data;

@Data
public class Image {

	private String filepath;
	
	public Image(String path) {
		this.filepath = path;
	}
	
	
}
