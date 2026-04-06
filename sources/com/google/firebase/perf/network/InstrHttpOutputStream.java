package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

public final class InstrHttpOutputStream extends OutputStream {

    /* renamed from: A  reason: collision with root package name */
    public final Timer f31011A;

    /* renamed from: B  reason: collision with root package name */
    public NetworkRequestMetricBuilder f31012B;
    public long C = -1;

    /* renamed from: z  reason: collision with root package name */
    public final OutputStream f31013z;

    public InstrHttpOutputStream(OutputStream outputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.f31013z = outputStream;
        this.f31012B = networkRequestMetricBuilder;
        this.f31011A = timer;
    }

    public void close() {
        long j2 = this.C;
        if (j2 != -1) {
            this.f31012B.n(j2);
        }
        this.f31012B.r(this.f31011A.c());
        try {
            this.f31013z.close();
        } catch (IOException e2) {
            this.f31012B.s(this.f31011A.c());
            NetworkRequestMetricBuilderUtil.d(this.f31012B);
            throw e2;
        }
    }

    public void flush() {
        try {
            this.f31013z.flush();
        } catch (IOException e2) {
            this.f31012B.s(this.f31011A.c());
            NetworkRequestMetricBuilderUtil.d(this.f31012B);
            throw e2;
        }
    }

    public void write(int i2) {
        try {
            this.f31013z.write(i2);
            long j2 = this.C + 1;
            this.C = j2;
            this.f31012B.n(j2);
        } catch (IOException e2) {
            this.f31012B.s(this.f31011A.c());
            NetworkRequestMetricBuilderUtil.d(this.f31012B);
            throw e2;
        }
    }

    public void write(byte[] bArr) {
        try {
            this.f31013z.write(bArr);
            long length = this.C + ((long) bArr.length);
            this.C = length;
            this.f31012B.n(length);
        } catch (IOException e2) {
            this.f31012B.s(this.f31011A.c());
            NetworkRequestMetricBuilderUtil.d(this.f31012B);
            throw e2;
        }
    }

    public void write(byte[] bArr, int i2, int i3) {
        try {
            this.f31013z.write(bArr, i2, i3);
            long j2 = this.C + ((long) i3);
            this.C = j2;
            this.f31012B.n(j2);
        } catch (IOException e2) {
            this.f31012B.s(this.f31011A.c());
            NetworkRequestMetricBuilderUtil.d(this.f31012B);
            throw e2;
        }
    }
}
