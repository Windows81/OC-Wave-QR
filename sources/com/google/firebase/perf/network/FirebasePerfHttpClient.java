package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    public static Object a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            c2.u(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long a2 = NetworkRequestMetricBuilderUtil.a(httpRequest);
            if (a2 != null) {
                c2.n(a2.longValue());
            }
            timer.g();
            c2.o(timer.e());
            return httpClient.execute(httpHost, httpRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, c2));
        } catch (IOException e2) {
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e2;
        }
    }

    public static Object b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            c2.u(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long a2 = NetworkRequestMetricBuilderUtil.a(httpRequest);
            if (a2 != null) {
                c2.n(a2.longValue());
            }
            timer.g();
            c2.o(timer.e());
            return httpClient.execute(httpHost, httpRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, c2), httpContext);
        } catch (IOException e2) {
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e2;
        }
    }

    public static Object c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            c2.u(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long a2 = NetworkRequestMetricBuilderUtil.a(httpUriRequest);
            if (a2 != null) {
                c2.n(a2.longValue());
            }
            timer.g();
            c2.o(timer.e());
            return httpClient.execute(httpUriRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, c2));
        } catch (IOException e2) {
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e2;
        }
    }

    public static Object d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            c2.u(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long a2 = NetworkRequestMetricBuilderUtil.a(httpUriRequest);
            if (a2 != null) {
                c2.n(a2.longValue());
            }
            timer.g();
            c2.o(timer.e());
            return httpClient.execute(httpUriRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, c2), httpContext);
        } catch (IOException e2) {
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e2;
        }
    }

    public static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            c2.u(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long a2 = NetworkRequestMetricBuilderUtil.a(httpRequest);
            if (a2 != null) {
                c2.n(a2.longValue());
            }
            timer.g();
            c2.o(timer.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c2.s(timer.c());
            c2.k(execute.getStatusLine().getStatusCode());
            Long a3 = NetworkRequestMetricBuilderUtil.a(execute);
            if (a3 != null) {
                c2.q(a3.longValue());
            }
            String b2 = NetworkRequestMetricBuilderUtil.b(execute);
            if (b2 != null) {
                c2.p(b2);
            }
            c2.b();
            return execute;
        } catch (IOException e2) {
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new Timer(), TransportManager.k());
    }

    public static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            c2.u(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long a2 = NetworkRequestMetricBuilderUtil.a(httpRequest);
            if (a2 != null) {
                c2.n(a2.longValue());
            }
            timer.g();
            c2.o(timer.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c2.s(timer.c());
            c2.k(execute.getStatusLine().getStatusCode());
            Long a3 = NetworkRequestMetricBuilderUtil.a(execute);
            if (a3 != null) {
                c2.q(a3.longValue());
            }
            String b2 = NetworkRequestMetricBuilderUtil.b(execute);
            if (b2 != null) {
                c2.p(b2);
            }
            c2.b();
            return execute;
        } catch (IOException e2) {
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e2;
        }
    }

    public static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            c2.u(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long a2 = NetworkRequestMetricBuilderUtil.a(httpUriRequest);
            if (a2 != null) {
                c2.n(a2.longValue());
            }
            timer.g();
            c2.o(timer.e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c2.s(timer.c());
            c2.k(execute.getStatusLine().getStatusCode());
            Long a3 = NetworkRequestMetricBuilderUtil.a(execute);
            if (a3 != null) {
                c2.q(a3.longValue());
            }
            String b2 = NetworkRequestMetricBuilderUtil.b(execute);
            if (b2 != null) {
                c2.p(b2);
            }
            c2.b();
            return execute;
        } catch (IOException e2) {
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e2;
        }
    }

    public static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(transportManager);
        try {
            c2.u(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long a2 = NetworkRequestMetricBuilderUtil.a(httpUriRequest);
            if (a2 != null) {
                c2.n(a2.longValue());
            }
            timer.g();
            c2.o(timer.e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c2.s(timer.c());
            c2.k(execute.getStatusLine().getStatusCode());
            Long a3 = NetworkRequestMetricBuilderUtil.a(execute);
            if (a3 != null) {
                c2.q(a3.longValue());
            }
            String b2 = NetworkRequestMetricBuilderUtil.b(execute);
            if (b2 != null) {
                c2.p(b2);
            }
            c2.b();
            return execute;
        } catch (IOException e2) {
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new Timer(), TransportManager.k());
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return c(httpClient, httpUriRequest, responseHandler, new Timer(), TransportManager.k());
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), TransportManager.k());
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new Timer(), TransportManager.k());
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new Timer(), TransportManager.k());
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), TransportManager.k());
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), TransportManager.k());
    }
}
