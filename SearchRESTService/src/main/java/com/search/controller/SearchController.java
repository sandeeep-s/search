
package com.search.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.search.domain.Document;
import com.search.service.Searcher;

@RestController
public class SearchController {

	@RequestMapping("/select")
	public List<Document> search(@RequestParam(value = "q", required = true) String searchTxt) {

		String baseURL = "http://localhost:8983/solr";
		String collection = "techproducts";
		Searcher searcher = new Searcher(baseURL, collection);
		return searcher.search(searchTxt);
	}

}
