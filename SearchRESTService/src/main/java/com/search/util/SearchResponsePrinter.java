package com.search.util;

import java.util.List;

import com.search.domain.Document;
import com.search.domain.SearchResponse;


public class SearchResponsePrinter {

	public static void printResponse(SearchResponse searchResponse){
		System.out.println("status="+searchResponse.getResponseHeader().getStatus());
		System.out.println("QTime="+searchResponse.getResponseHeader().getQTime());
		System.out.println("Params="+searchResponse.getResponseHeader().getParams());
		System.out.println("NumFound="+searchResponse.getResponse().getNumFound());
		System.out.println("Start="+searchResponse.getResponse().getStart());
		System.out.println("Docs="+searchResponse.getResponse().getDocs());
		List<Document> docs = searchResponse.getResponse().getDocs();
		for (Document document : docs) {
			System.out.println(document.getFields());
		} 
	}
	
}
