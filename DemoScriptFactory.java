package com.es.plugindemo;

import java.util.Map;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

public class DemoScriptFactory implements NativeScriptFactory {
	@Override
	public ExecutableScript newScript(@Nullable Map<String, Object> params) {
		return new DemoScript(params);
	}

	@Override
	public boolean needsScores() {
		return false;
	}
}