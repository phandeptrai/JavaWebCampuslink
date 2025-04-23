package com.phandeptrai.dtos;

public class SearchRequest {
	public SearchRequest() {
		super();
	}

	private String searchString;

	public SearchRequest(String searchString) {
		super();
		this.searchString = searchString;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
}
