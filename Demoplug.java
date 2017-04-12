package com.es.plugindemo;

import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.script.ScriptModule;

public class Demoplug extends Plugin {

	private static final String PLUGIN_NAME = "demoscore";

	@Override
	public String name() {
		return PLUGIN_NAME;
	}

	@Override
	public String description() {
		return "this is a demo about how to build a script score plugin.";
	}

	public void onModule(ScriptModule scriptModule) {
		scriptModule.registerScript(PLUGIN_NAME, DemoScriptFactory.class);
	}
}