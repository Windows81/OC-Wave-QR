package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

public final class InstrHttpInputStream extends InputStream {

    /* renamed from: A  reason: collision with root package name */
    public final NetworkRequestMetricBuilder f31008A;

    /* renamed from: B  reason: collision with root package name */
    public final Timer f31009B;
    public long C = -1;
    public long D;
    public long E = -1;

    /* renamed from: z  reason: collision with root package name */
    public final InputStream f31010z;

    public InstrHttpInputStream(InputStream inputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.f31009B = timer;
        this.f31010z = inputStream;
        this.f31008A = networkRequestMetricBuilder;
        this.D = networkRequestMetricBuilder.e();
    }

    public int available() {
        try {
            return this.f31010z.available();
        } catch (IOException e2) {
            this.f31008A.s(this.f31009B.c());
            NetworkRequestMetricBuilderUtil.d(this.f31008A);
            throw e2;
        }
    }

    public void close() {
        long c2 = this.f31009B.c();
        if (this.E == -1) {
            this.E = c2;
        }
        try {
            this.f31010z.close();
            long j2 = this.C;
            if (j2 != -1) {
                this.f31008A.q(j2);
            }
            long j3 = this.D;
            if (j3 != -1) {
                this.f31008A.t(j3);
            }
            this.f31008A.s(this.E);
            this.f31008A.b();
        } catch (IOException e2) {
            this.f31008A.s(this.f31009B.c());
            NetworkRequestMetricBuilderUtil.d(this.f31008A);
            throw e2;
        }
    }

    public void mark(int i2) {
        this.f31010z.mark(i2);
    }

    public boolean markSupported() {
        return this.f31010z.markSupported();
    }

    public int read() {
        try {
            int read = this.f31010z.read();
            long c2 = this.f31009B.c();
            if (this.D == -1) {
                this.D = c2;
            }
            if (read == -1 && this.E == -1) {
                this.E = c2;
                this.f31008A.s(c2);
                this.f31008A.b();
            } else {
                long j2 = this.C + 1;
                this.C = j2;
                this.f31008A.q(j2);
            }
            return read;
        } catch (IOException e2) {
            this.f31008A.s(this.f31009B.c());
            NetworkRequestMetricBuilderUtil.d(this.f31008A);
            throw e2;
        }
    }

    public void reset() {
        try {
            this.f31010z.reset();
        } catch (IOException e2) {
            this.f31008A.s(this.f31009B.c());
            NetworkRequestMetricBuilderUtil.d(this.f31008A);
            throw e2;
        }
    }

    public long skip(long j2) {
        try {
            long skip = this.f31010z.skip(j2);
            long c2 = this.f31009B.c();
            if (this.D == -1) {
                this.D = c2;
            }
            if (skip == -1 && this.E == -1) {
                this.E = c2;
                this.f31008A.s(c2);
            } else {
                long j3 = this.C + skip;
                this.C = j3;
                this.f31008A.q(j3);
            }
            return skip;
        } catch (IOException e2) {
            this.f31008A.s(this.f31009B.c());
            NetworkRequestMetricBuilderUtil.d(this.f31008A);
            throw e2;
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        try {
            int read = this.f31010z.read(bArr, i2, i3);
            long c2 = this.f31009B.c();
            if (this.D == -1) {
                this.D = c2;
            }
            if (read == -1 && this.E == -1) {
                this.E = c2;
                this.f31008A.s(c2);
                this.f31008A.b();
            } else {
                long j2 = this.C + ((long) read);
                this.C = j2;
                this.f31008A.q(j2);
            }
            return read;
        } catch (IOException e2) {
            this.f31008A.s(this.f31009B.c());
            NetworkRequestMetricBuilderUtil.d(this.f31008A);
            throw e2;
        }
    }

    public int read(byte[] bArr) {
        try {
            int read = this.f31010z.read(bArr);
            long c2 = this.f31009B.c();
            if (this.D == -1) {
                this.D = c2;
            }
            if (read == -1 && this.E == -1) {
                this.E = c2;
                this.f31008A.s(c2);
                this.f31008A.b();
            } else {
                long j2 = this.C + ((long) read);
                this.C = j2;
                this.f31008A.q(j2);
            }
            return read;
        } catch (IOException e2) {
            this.f31008A.s(this.f31009B.c());
            NetworkRequestMetricBuilderUtil.d(this.f31008A);
            throw e2;
        }
    }
}
