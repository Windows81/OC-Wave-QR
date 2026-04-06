package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class FirebasePerfOkHttpClient {
    public static void a(Response response, NetworkRequestMetricBuilder networkRequestMetricBuilder, long j2, long j3) {
        Request E = response.E();
        if (E != null) {
            networkRequestMetricBuilder.u(E.k().u().toString());
            networkRequestMetricBuilder.j(E.h());
            if (E.a() != null) {
                long a2 = E.a().a();
                if (a2 != -1) {
                    networkRequestMetricBuilder.n(a2);
                }
            }
            ResponseBody a3 = response.a();
            if (a3 != null) {
                long d2 = a3.d();
                if (d2 != -1) {
                    networkRequestMetricBuilder.q(d2);
                }
                MediaType f2 = a3.f();
                if (f2 != null) {
                    networkRequestMetricBuilder.p(f2.toString());
                }
            }
            networkRequestMetricBuilder.k(response.f());
            networkRequestMetricBuilder.o(j2);
            networkRequestMetricBuilder.s(j3);
            networkRequestMetricBuilder.b();
        }
    }

    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        Callback callback2 = callback;
        call.f0(new InstrumentOkHttpEnqueueCallback(callback2, TransportManager.k(), timer, timer.e()));
    }

    public static Response execute(Call call) {
        NetworkRequestMetricBuilder c2 = NetworkRequestMetricBuilder.c(TransportManager.k());
        Timer timer = new Timer();
        long e2 = timer.e();
        try {
            Response D = call.D();
            a(D, c2, e2, timer.c());
            return D;
        } catch (IOException e3) {
            Request m2 = call.m();
            if (m2 != null) {
                HttpUrl k2 = m2.k();
                if (k2 != null) {
                    c2.u(k2.u().toString());
                }
                if (m2.h() != null) {
                    c2.j(m2.h());
                }
            }
            c2.o(e2);
            c2.s(timer.c());
            NetworkRequestMetricBuilderUtil.d(c2);
            throw e3;
        }
    }
}
