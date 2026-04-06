package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.URLWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    public static Object a(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) {
        timer.g();
        long e2 = timer.e();
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            URLConnection a2 = uRLWrapper.a();
            return a2 instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) a2, timer, c2).getContent() : a2 instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) a2, timer, c2).getContent() : a2.getContent();
        } catch (IOException e3) {
            c2.o(e2);
            c2.s(timer.c());
            c2.u(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e3;
        }
    }

    public static Object b(URLWrapper uRLWrapper, Class[] clsArr, TransportManager transportManager, Timer timer) {
        timer.g();
        long e2 = timer.e();
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            URLConnection a2 = uRLWrapper.a();
            return a2 instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) a2, timer, c2).getContent(clsArr) : a2 instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) a2, timer, c2).getContent(clsArr) : a2.getContent(clsArr);
        } catch (IOException e3) {
            c2.o(e2);
            c2.s(timer.c());
            c2.u(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e3;
        }
    }

    public static InputStream c(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) {
        if (!TransportManager.k().u()) {
            return uRLWrapper.a().getInputStream();
        }
        timer.g();
        long e2 = timer.e();
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            URLConnection a2 = uRLWrapper.a();
            return a2 instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) a2, timer, c2).getInputStream() : a2 instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) a2, timer, c2).getInputStream() : a2.getInputStream();
        } catch (IOException e3) {
            c2.o(e2);
            c2.s(timer.c());
            c2.u(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e3;
        }
    }

    public static Object getContent(URL url) {
        return a(new URLWrapper(url), TransportManager.k(), new Timer());
    }

    public static Object instrument(Object obj) {
        return obj instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) obj, new Timer(), NetworkRequestMetricBuilder.c(TransportManager.k())) : obj instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) obj, new Timer(), NetworkRequestMetricBuilder.c(TransportManager.k())) : obj;
    }

    public static InputStream openStream(URL url) {
        return c(new URLWrapper(url), TransportManager.k(), new Timer());
    }

    public static Object getContent(URL url, Class[] clsArr) {
        return b(new URLWrapper(url), clsArr, TransportManager.k(), new Timer());
    }
}
