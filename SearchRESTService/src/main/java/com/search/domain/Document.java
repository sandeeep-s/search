
package com.search.domain;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {

	
	private Map<String, Object> fields = new HashMap<String, Object>();

	public Map<String, Object> getFields() {

		return fields;
	}

	public void setFields(Map<String, Object> fields) {

		this.fields = fields;
	}
	
	@JsonAnySetter
	public void setField(String name, Object value){
		fields.put(name, value);
	}

}
