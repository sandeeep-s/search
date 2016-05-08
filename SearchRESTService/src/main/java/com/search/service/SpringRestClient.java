
package com.search.service;

import org.springframework.web.client.RestTemplate;

import com.search.domain.SearchResponse;
import com.search.util.SearchResponsePrinter;

public class SpringRestClient implements RestClient {

	public SearchResponse getSearchResponse(String url) {

		RestTemplate restTemplate = new RestTemplate();
		SearchResponse searchResponse = restTemplate.getForObject(url, SearchResponse.class);
		
		SearchResponsePrinter.printResponse(searchResponse);
		
		return searchResponse;
	}

	public String getResponse(String url) {

		// TODO Auto-generated method stub
		return null;
	}

}
