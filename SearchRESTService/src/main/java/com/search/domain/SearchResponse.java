
package com.search.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResponse {

	private SearchResponseHeader responseHeader;

	// TODO To be chanhed to responseBody 
	private SearchResponseBody response;

	public SearchResponseHeader getResponseHeader() {

		return responseHeader;
	}

	public void setResponseHeader(SearchResponseHeader responseHeader) {

		this.responseHeader = responseHeader;
	}

	public SearchResponseBody getResponse() {

		return response;
	}

	public void setResponse(SearchResponseBody response) {

		this.response = response;
	}

}
