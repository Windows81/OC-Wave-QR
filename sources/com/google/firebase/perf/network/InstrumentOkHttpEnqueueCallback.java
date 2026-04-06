package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class InstrumentOkHttpEnqueueCallback implements Callback {

    /* renamed from: A  reason: collision with root package name */
    public final NetworkRequestMetricBuilder f31026A;

    /* renamed from: B  reason: collision with root package name */
    public final Timer f31027B;
    public final long C;

    /* renamed from: z  reason: collision with root package name */
    public final Callback f31028z;

    public InstrumentOkHttpEnqueueCallback(Callback callback, TransportManager transportManager, Timer timer, long j2) {
        this.f31028z = callback;
        this.f31026A = NetworkRequestMetricBuilder.c(transportManager);
        this.C = j2;
        this.f31027B = timer;
    }

    public void b(Call call, Response response) {
        Response response2 = response;
        FirebasePerfOkHttpClient.a(response2, this.f31026A, this.C, this.f31027B.c());
        this.f31028z.b(call, response);
    }

    public void c(Call call, IOException iOException) {
        Request m2 = call.m();
        if (m2 != null) {
            HttpUrl k2 = m2.k();
            if (k2 != null) {
                this.f31026A.u(k2.u().toString());
            }
            if (m2.h() != null) {
                this.f31026A.j(m2.h());
            }
        }
        this.f31026A.o(this.C);
        this.f31026A.s(this.f31027B.c());
        NetworkRequestMetricBuilderUtil.d(this.f31026A);
        this.f31028z.c(call, iOException);
    }
}
