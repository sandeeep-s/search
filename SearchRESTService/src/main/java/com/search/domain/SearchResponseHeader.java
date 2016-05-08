
package com.search.domain;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResponseHeader {

	private int status, QTime;

	private Map<String, Object> params;

	public int getStatus() {

		return status;
	}

	public void setStatus(int status) {

		this.status = status;
	}

	public int getQTime() {

		return QTime;
	}

	public void setQTime(int qTime) {

		QTime = qTime;
	}

	public Map<String, Object> getParams() {

		return params;
	}

	public void setParams(Map<String, Object> params) {

		this.params = params;
	}

}
