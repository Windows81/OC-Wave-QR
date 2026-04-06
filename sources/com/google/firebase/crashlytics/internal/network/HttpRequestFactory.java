package com.google.firebase.crashlytics.internal.network;

import java.util.Map;

public class HttpRequestFactory {
    public HttpGetRequest a(String str, Map map) {
        return new HttpGetRequest(str, map);
    }
}
