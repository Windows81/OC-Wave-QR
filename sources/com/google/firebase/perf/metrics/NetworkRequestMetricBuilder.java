package com.google.firebase.perf.metrics;

import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class NetworkRequestMetricBuilder extends AppStateUpdateHandler implements SessionAwareObject {
    public static final AndroidLogger H = AndroidLogger.e();

    /* renamed from: A  reason: collision with root package name */
    public final GaugeManager f30987A;

    /* renamed from: B  reason: collision with root package name */
    public final TransportManager f30988B;
    public final NetworkRequestMetric.Builder C;
    public final WeakReference D;
    public String E;
    public boolean F;
    public boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final List f30989z;

    public NetworkRequestMetricBuilder(TransportManager transportManager) {
        this(transportManager, AppStateMonitor.b(), GaugeManager.getInstance());
    }

    public static NetworkRequestMetricBuilder c(TransportManager transportManager) {
        return new NetworkRequestMetricBuilder(transportManager);
    }

    private boolean g() {
        return this.C.T();
    }

    private boolean h() {
        return this.C.V();
    }

    public static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    public void a(PerfSession perfSession) {
        if (perfSession == null) {
            H.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (g() && !h()) {
            this.f30989z.add(perfSession);
        }
    }

    public NetworkRequestMetric b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.D);
        unregisterForAppState();
        com.google.firebase.perf.v1.PerfSession[] b2 = PerfSession.b(d());
        if (b2 != null) {
            this.C.O(Arrays.asList(b2));
        }
        NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.C.d();
        if (!NetworkRequestMetricBuilderUtil.c(this.E)) {
            H.a("Dropping network request from a 'User-Agent' that is not allowed");
            return networkRequestMetric;
        } else if (!this.F) {
            this.f30988B.B(networkRequestMetric, getAppState());
            this.F = true;
            return networkRequestMetric;
        } else {
            if (this.G) {
                H.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return networkRequestMetric;
        }
    }

    public List d() {
        List unmodifiableList;
        synchronized (this.f30989z) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f30989z) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } finally {
            }
        }
        return unmodifiableList;
    }

    public long e() {
        return this.C.R();
    }

    public boolean f() {
        return this.C.U();
    }

    public NetworkRequestMetricBuilder j(String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            NetworkRequestMetric.HttpMethod httpMethod2 = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c2 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c2 = 8;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case 1:
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case 2:
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case 3:
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case 4:
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case 5:
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case 6:
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case 7:
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case 8:
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.C.X(httpMethod);
        }
        return this;
    }

    public NetworkRequestMetricBuilder k(int i2) {
        this.C.Y(i2);
        return this;
    }

    public NetworkRequestMetricBuilder l() {
        this.C.Z(NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR);
        return this;
    }

    public NetworkRequestMetricBuilder n(long j2) {
        this.C.a0(j2);
        return this;
    }

    public NetworkRequestMetricBuilder o(long j2) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.D);
        this.C.W(j2);
        a(perfSession);
        if (perfSession.e()) {
            this.f30987A.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public NetworkRequestMetricBuilder p(String str) {
        if (str == null) {
            this.C.P();
            return this;
        }
        if (i(str)) {
            this.C.b0(str);
        } else {
            AndroidLogger androidLogger = H;
            androidLogger.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public NetworkRequestMetricBuilder q(long j2) {
        this.C.c0(j2);
        return this;
    }

    public NetworkRequestMetricBuilder r(long j2) {
        this.C.d0(j2);
        return this;
    }

    public NetworkRequestMetricBuilder s(long j2) {
        this.C.e0(j2);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f30987A.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public NetworkRequestMetricBuilder t(long j2) {
        this.C.g0(j2);
        return this;
    }

    public NetworkRequestMetricBuilder u(String str) {
        if (str != null) {
            this.C.h0(Utils.e(Utils.d(str), 2000));
        }
        return this;
    }

    public NetworkRequestMetricBuilder v(String str) {
        this.E = str;
        return this;
    }

    public NetworkRequestMetricBuilder(TransportManager transportManager, AppStateMonitor appStateMonitor, GaugeManager gaugeManager) {
        super(appStateMonitor);
        this.C = NetworkRequestMetric.P0();
        this.D = new WeakReference(this);
        this.f30988B = transportManager;
        this.f30987A = gaugeManager;
        this.f30989z = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
