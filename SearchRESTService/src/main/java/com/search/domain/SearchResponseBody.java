
package com.search.domain;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResponseBody {

	private int numFound, start;

	private ArrayList<Document> docs;

	public int getNumFound() {

		return numFound;
	}

	public void setNumFound(int numFound) {

		this.numFound = numFound;
	}

	public int getStart() {

		return start;
	}

	public void setStart(int start) {

		this.start = start;
	}

	public ArrayList<Document> getDocs() {

		return docs;
	}

	public void setDocs(ArrayList<Document> docs) {

		this.docs = docs;
	}

}
