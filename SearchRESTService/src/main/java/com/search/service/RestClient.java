package com.search.service;

import com.search.domain.SearchResponse;


public interface RestClient {

	
	public String getResponse(String url);
	
	public SearchResponse getSearchResponse(String url);
	
}
