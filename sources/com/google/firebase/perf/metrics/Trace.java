package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Trace extends AppStateUpdateHandler implements Parcelable, FirebasePerformanceAttributable, SessionAwareObject {
    public static final Parcelable.Creator<Trace> CREATOR = new Parcelable.Creator<Trace>() {
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false);
        }

        /* renamed from: b */
        public Trace[] newArray(int i2) {
            return new Trace[i2];
        }
    };
    public static final AndroidLogger L = AndroidLogger.e();
    public static final Map M = new ConcurrentHashMap();
    public static final Parcelable.Creator N = new Parcelable.Creator<Trace>() {
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true);
        }

        /* renamed from: b */
        public Trace[] newArray(int i2) {
            return new Trace[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final Trace f30990A;

    /* renamed from: B  reason: collision with root package name */
    public final GaugeManager f30991B;
    public final String C;
    public final Map D;
    public final Map E;
    public final List F;
    public final List G;
    public final TransportManager H;
    public final Clock I;
    public Timer J;
    public Timer K;

    /* renamed from: z  reason: collision with root package name */
    public final WeakReference f30992z;

    public static Trace c(String str) {
        return new Trace(str);
    }

    public void a(PerfSession perfSession) {
        if (perfSession == null) {
            L.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (j() && !l()) {
            this.F.add(perfSession);
        }
    }

    public final void b(String str, String str2) {
        if (l()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.C}));
        } else if (this.E.containsKey(str) || this.E.size() < 5) {
            PerfMetricValidator.d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    public Map d() {
        return this.D;
    }

    public int describeContents() {
        return 0;
    }

    public Timer e() {
        return this.K;
    }

    public String f() {
        return this.C;
    }

    public void finalize() {
        try {
            if (k()) {
                L.k("Trace '%s' is started but not stopped when it is destructed!", this.C);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public List g() {
        List unmodifiableList;
        synchronized (this.F) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.F) {
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

    public String getAttribute(String str) {
        return (String) this.E.get(str);
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.E);
    }

    public long getLongMetric(String str) {
        Counter counter = str != null ? (Counter) this.D.get(str.trim()) : null;
        if (counter == null) {
            return 0;
        }
        return counter.a();
    }

    public Timer h() {
        return this.J;
    }

    public List i() {
        return this.G;
    }

    public void incrementMetric(String str, long j2) {
        String e2 = PerfMetricValidator.e(str);
        if (e2 != null) {
            L.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e2);
        } else if (!j()) {
            L.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.C);
        } else if (l()) {
            L.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.C);
        } else {
            Counter n2 = n(str.trim());
            n2.c(j2);
            L.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(n2.a()), this.C);
        }
    }

    public boolean j() {
        return this.J != null;
    }

    public boolean k() {
        return j() && !l();
    }

    public boolean l() {
        return this.K != null;
    }

    public final Counter n(String str) {
        Counter counter = (Counter) this.D.get(str);
        if (counter != null) {
            return counter;
        }
        Counter counter2 = new Counter(str);
        this.D.put(str, counter2);
        return counter2;
    }

    public final void o(Timer timer) {
        if (!this.G.isEmpty()) {
            Trace trace = (Trace) this.G.get(this.G.size() - 1);
            if (trace.K == null) {
                trace.K = timer;
            }
        }
    }

    public void putAttribute(String str, String str2) {
        boolean z2;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            L.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.C);
            z2 = true;
        } catch (Exception e2) {
            L.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e2.getMessage());
            z2 = false;
        }
        if (z2) {
            this.E.put(str, str2);
        }
    }

    public void putMetric(String str, long j2) {
        String e2 = PerfMetricValidator.e(str);
        if (e2 != null) {
            L.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e2);
        } else if (!j()) {
            L.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.C);
        } else if (l()) {
            L.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.C);
        } else {
            n(str.trim()).d(j2);
            L.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j2), this.C);
        }
    }

    public void removeAttribute(String str) {
        if (l()) {
            L.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.E.remove(str);
        }
    }

    public void start() {
        if (!ConfigResolver.g().K()) {
            L.a("Trace feature is disabled.");
            return;
        }
        String f2 = PerfMetricValidator.f(this.C);
        if (f2 != null) {
            L.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.C, f2);
        } else if (this.J != null) {
            L.d("Trace '%s' has already started, should not start again!", this.C);
        } else {
            this.J = this.I.a();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f30992z);
            a(perfSession);
            if (perfSession.e()) {
                this.f30991B.collectGaugeMetricOnce(perfSession.d());
            }
        }
    }

    public void stop() {
        if (!j()) {
            L.d("Trace '%s' has not been started so unable to stop!", this.C);
        } else if (l()) {
            L.d("Trace '%s' has already stopped, should not stop again!", this.C);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f30992z);
            unregisterForAppState();
            Timer a2 = this.I.a();
            this.K = a2;
            if (this.f30990A == null) {
                o(a2);
                if (!this.C.isEmpty()) {
                    this.H.C(new TraceMetricBuilder(this).a(), getAppState());
                    if (SessionManager.getInstance().perfSession().e()) {
                        this.f30991B.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                        return;
                    }
                    return;
                }
                L.c("Trace name is empty, no log is sent to server");
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f30990A, 0);
        parcel.writeString(this.C);
        parcel.writeList(this.G);
        parcel.writeMap(this.D);
        parcel.writeParcelable(this.J, 0);
        parcel.writeParcelable(this.K, 0);
        synchronized (this.F) {
            parcel.writeList(this.F);
        }
    }

    public Trace(String str) {
        this(str, TransportManager.k(), new Clock(), AppStateMonitor.b(), GaugeManager.getInstance());
    }

    public Trace(String str, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor) {
        this(str, transportManager, clock, appStateMonitor, GaugeManager.getInstance());
    }

    public Trace(String str, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor, GaugeManager gaugeManager) {
        super(appStateMonitor);
        this.f30992z = new WeakReference(this);
        this.f30990A = null;
        this.C = str.trim();
        this.G = new ArrayList();
        this.D = new ConcurrentHashMap();
        this.E = new ConcurrentHashMap();
        this.I = clock;
        this.H = transportManager;
        this.F = Collections.synchronizedList(new ArrayList());
        this.f30991B = gaugeManager;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Trace(Parcel parcel, boolean z2) {
        super(z2 ? null : AppStateMonitor.b());
        this.f30992z = new WeakReference(this);
        Class<Trace> cls = Trace.class;
        this.f30990A = (Trace) parcel.readParcelable(cls.getClassLoader());
        this.C = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        parcel.readList(arrayList, cls.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.D = concurrentHashMap;
        this.E = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        Class<Timer> cls2 = Timer.class;
        this.J = (Timer) parcel.readParcelable(cls2.getClassLoader());
        this.K = (Timer) parcel.readParcelable(cls2.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.F = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z2) {
            this.H = null;
            this.I = null;
            this.f30991B = null;
            return;
        }
        this.H = TransportManager.k();
        this.I = new Clock();
        this.f30991B = GaugeManager.getInstance();
    }
}
