package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class InstrumentApacheHttpResponseHandler<T> implements ResponseHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ResponseHandler f31023a;

    /* renamed from: b  reason: collision with root package name */
    public final Timer f31024b;

    /* renamed from: c  reason: collision with root package name */
    public final NetworkRequestMetricBuilder f31025c;

    public InstrumentApacheHttpResponseHandler(ResponseHandler responseHandler, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.f31023a = responseHandler;
        this.f31024b = timer;
        this.f31025c = networkRequestMetricBuilder;
    }

    public Object handleResponse(HttpResponse httpResponse) {
        this.f31025c.s(this.f31024b.c());
        this.f31025c.k(httpResponse.getStatusLine().getStatusCode());
        Long a2 = NetworkRequestMetricBuilderUtil.a(httpResponse);
        if (a2 != null) {
            this.f31025c.q(a2.longValue());
        }
        String b2 = NetworkRequestMetricBuilderUtil.b(httpResponse);
        if (b2 != null) {
            this.f31025c.p(b2);
        }
        this.f31025c.b();
        return this.f31023a.handleResponse(httpResponse);
    }
}
