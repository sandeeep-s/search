
package com.search.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.search.domain.SearchResponse;

public class Searcher {

	private String baseURL;

	private String collection;

	private RestClient restClient = new SpringRestClient();

	public Searcher(String baseURL, String collection) {

		this.baseURL = baseURL;
		this.collection = collection;
	}

	public List<com.search.domain.Document> search(String searchTxt) {

		Map<String, String> options = new HashMap<String, String>();
		options.put("indent", "on");
		String solrURL = getSolrURL(getBaseURL(), getCollection(), "select", searchTxt, "json", options);

		SearchResponse searchResponse = restClient.getSearchResponse(solrURL);

		return searchResponse.getResponse().getDocs();
	}

	String getQuery(String searchTxt, Map<String, String> options) {

		StringBuilder sb = new StringBuilder();
		sb.append("q=" + searchTxt);

		Iterator<String> iterator = options.keySet().iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = options.get(key);
			sb.append("&");
			sb.append(key + "=" + value);
		}

		return sb.toString();
	}

	String getSolrURL(
		String baseURL, String collection, String operation, String searchTxt, String responseFormat,
		Map<String, String> options) {

		StringBuilder sb = new StringBuilder();
		sb.append(baseURL);
		sb.append('/');
		sb.append(collection);
		sb.append('/');
		sb.append(operation);
		sb.append('?');
		sb.append("wt=" + responseFormat);
		sb.append("&");
		sb.append(getQuery(searchTxt, options));
		System.out.println(sb.toString());

		return sb.toString();
	}

	public String getBaseURL() {

		return baseURL;
	}

	public void setBaseURL(String baseURL) {

		this.baseURL = baseURL;
	}

	public String getCollection() {

		return collection;
	}

	public void setCollection(String collection) {

		this.collection = collection;
	}

	public RestClient getRestClient() {

		return restClient;
	}

	public void setRestClient(RestClient restClient) {

		this.restClient = restClient;
	}

}
