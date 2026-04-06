package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

public class URLWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final URL f31137a;

    public URLWrapper(URL url) {
        this.f31137a = url;
    }

    public URLConnection a() {
        return this.f31137a.openConnection();
    }

    public String toString() {
        return this.f31137a.toString();
    }
}
