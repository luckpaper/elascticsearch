package com.es.plugindemo;

import java.util.Map;

import org.elasticsearch.script.AbstractFloatSearchScript;

public class DemoScript extends AbstractFloatSearchScript {

	private int param1;
	private int param2;
	private String param3;
	private String param4;
	private int length;

	public DemoScript(Map<String, Object> params) {

		super();
		param1 = (int) params.get("param1");
		param2 = (int) params.get("param2");
		param3 = (String) params.get("param3");
		param4 = (String) params.get("param4");
	}

	@Override
	public float runAsFloat() {
		try {

			return 666;
		} catch (Exception ex) {
			ex.printStackTrace();
			return -1;
		}
	}
}
