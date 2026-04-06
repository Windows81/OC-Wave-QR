package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.URLAllowlist;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;

final class FirebasePerfNetworkValidator extends PerfMetricValidator {

    /* renamed from: c  reason: collision with root package name */
    public static final AndroidLogger f31003c = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final NetworkRequestMetric f31004a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f31005b;

    public FirebasePerfNetworkValidator(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f31005b = context;
        this.f31004a = networkRequestMetric;
    }

    public boolean c() {
        if (j(this.f31004a.G0())) {
            AndroidLogger androidLogger = f31003c;
            androidLogger.j("URL is missing:" + this.f31004a.G0());
            return false;
        }
        URI g2 = g(this.f31004a.G0());
        if (g2 == null) {
            f31003c.j("URL cannot be parsed");
            return false;
        } else if (!h(g2, this.f31005b)) {
            AndroidLogger androidLogger2 = f31003c;
            androidLogger2.j("URL fails allowlist rule: " + g2);
            return false;
        } else if (!k(g2.getHost())) {
            f31003c.j("URL host is null or invalid");
            return false;
        } else if (!p(g2.getScheme())) {
            f31003c.j("URL scheme is null or invalid");
            return false;
        } else if (!r(g2.getUserInfo())) {
            f31003c.j("URL user info is null");
            return false;
        } else if (!o(g2.getPort())) {
            f31003c.j("URL port is less than or equal to 0");
            return false;
        } else {
            if (!l(this.f31004a.I0() ? this.f31004a.x0() : null)) {
                AndroidLogger androidLogger3 = f31003c;
                androidLogger3.j("HTTP Method is null or invalid: " + this.f31004a.x0());
                return false;
            } else if (this.f31004a.J0() && !m(this.f31004a.y0())) {
                AndroidLogger androidLogger4 = f31003c;
                androidLogger4.j("HTTP ResponseCode is a negative value:" + this.f31004a.y0());
                return false;
            } else if (this.f31004a.K0() && !n(this.f31004a.A0())) {
                AndroidLogger androidLogger5 = f31003c;
                androidLogger5.j("Request Payload is a negative value:" + this.f31004a.A0());
                return false;
            } else if (this.f31004a.L0() && !n(this.f31004a.C0())) {
                AndroidLogger androidLogger6 = f31003c;
                androidLogger6.j("Response Payload is a negative value:" + this.f31004a.C0());
                return false;
            } else if (!this.f31004a.H0() || this.f31004a.v0() <= 0) {
                AndroidLogger androidLogger7 = f31003c;
                androidLogger7.j("Start time of the request is null, or zero, or a negative value:" + this.f31004a.v0());
                return false;
            } else if (this.f31004a.M0() && !q(this.f31004a.D0())) {
                AndroidLogger androidLogger8 = f31003c;
                androidLogger8.j("Time to complete the request is a negative value:" + this.f31004a.D0());
                return false;
            } else if (this.f31004a.O0() && !q(this.f31004a.F0())) {
                AndroidLogger androidLogger9 = f31003c;
                androidLogger9.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f31004a.F0());
                return false;
            } else if (!this.f31004a.N0() || this.f31004a.E0() <= 0) {
                AndroidLogger androidLogger10 = f31003c;
                androidLogger10.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f31004a.E0());
                return false;
            } else if (this.f31004a.J0()) {
                return true;
            } else {
                f31003c.j("Did not receive a HTTP Response Code");
                return false;
            }
        }
    }

    public final URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            f31003c.k("getResultUrl throws exception %s", e2.getMessage());
            return null;
        }
    }

    public final boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return URLAllowlist.a(uri, context);
    }

    public final boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    public final boolean j(String str) {
        return i(str);
    }

    public final boolean k(String str) {
        return str != null && !i(str) && str.length() <= 255;
    }

    public boolean l(NetworkRequestMetric.HttpMethod httpMethod) {
        return (httpMethod == null || httpMethod == NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    public final boolean m(int i2) {
        return i2 > 0;
    }

    public final boolean n(long j2) {
        return j2 >= 0;
    }

    public final boolean o(int i2) {
        return i2 == -1 || i2 > 0;
    }

    public final boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    public final boolean q(long j2) {
        return j2 >= 0;
    }

    public final boolean r(String str) {
        return str == null;
    }
}
