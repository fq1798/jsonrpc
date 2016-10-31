package com.json.rpc.server.utils;

import javax.servlet.http.HttpServletRequest;

public class HttpUtils {

	public static Object parameterValue(HttpServletRequest request, String name) {
		String[] value = request.getParameterValues(name);
		if (value == null) {
			return null;
		}
		if (value.length == 1) {
			return value[0];
		}
		return value;
	}

	public static String getJsonpParameter(HttpServletRequest request) {
		String callback = request.getParameter("jsonpCallback");
		if (callback == null) {
			callback = request.getParameter("callback");
		}
		return callback;
	}

}
