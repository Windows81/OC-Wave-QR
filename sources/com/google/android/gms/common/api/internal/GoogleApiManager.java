package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArraySet;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleApiManager implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final Status f24480p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q  reason: collision with root package name */
    public static final Status f24481q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r  reason: collision with root package name */
    public static final Object f24482r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static GoogleApiManager f24483s;

    /* renamed from: a  reason: collision with root package name */
    public long f24484a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24485b = false;

    /* renamed from: c  reason: collision with root package name */
    public TelemetryData f24486c;

    /* renamed from: d  reason: collision with root package name */
    public TelemetryLoggingClient f24487d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f24488e;

    /* renamed from: f  reason: collision with root package name */
    public final GoogleApiAvailability f24489f;

    /* renamed from: g  reason: collision with root package name */
    public final zal f24490g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f24491h = new AtomicInteger(1);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f24492i = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    public final Map f24493j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k  reason: collision with root package name */
    public zaae f24494k = null;

    /* renamed from: l  reason: collision with root package name */
    public final Set f24495l = new ArraySet();

    /* renamed from: m  reason: collision with root package name */
    public final Set f24496m = new ArraySet();

    /* renamed from: n  reason: collision with root package name */
    public final Handler f24497n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f24498o = true;

    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f24488e = context;
        zau zau = new zau(looper, this);
        this.f24497n = zau;
        this.f24489f = googleApiAvailability;
        this.f24490g = new zal(googleApiAvailability);
        if (DeviceProperties.a(context)) {
            this.f24498o = false;
        }
        zau.sendMessage(zau.obtainMessage(6));
    }

    public static Status f(ApiKey apiKey, ConnectionResult connectionResult) {
        String b2 = apiKey.b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b2 + " is not available on this device. Connection failed with: " + valueOf);
    }

    public static GoogleApiManager t(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f24482r) {
            try {
                if (f24483s == null) {
                    f24483s = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.c().getLooper(), GoogleApiAvailability.q());
                }
                googleApiManager = f24483s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleApiManager;
    }

    public final void A(GoogleApi googleApi, int i2, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f24497n.sendMessage(this.f24497n.obtainMessage(4, new zach(new zae(i2, apiMethodImpl), this.f24492i.get(), googleApi)));
    }

    public final void B(GoogleApi googleApi, int i2, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        j(taskCompletionSource, taskApiCall.d(), googleApi);
        this.f24497n.sendMessage(this.f24497n.obtainMessage(4, new zach(new zag(i2, taskApiCall, taskCompletionSource, statusExceptionMapper), this.f24492i.get(), googleApi)));
    }

    public final void C(MethodInvocation methodInvocation, int i2, long j2, int i3) {
        this.f24497n.sendMessage(this.f24497n.obtainMessage(18, new zace(methodInvocation, i2, j2, i3)));
    }

    public final void D(ConnectionResult connectionResult, int i2) {
        if (!e(connectionResult, i2)) {
            Handler handler = this.f24497n;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
        }
    }

    public final void E() {
        Handler handler = this.f24497n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(GoogleApi googleApi) {
        Handler handler = this.f24497n;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void a(zaae zaae) {
        synchronized (f24482r) {
            try {
                if (this.f24494k != zaae) {
                    this.f24494k = zaae;
                    this.f24495l.clear();
                }
                this.f24495l.addAll(zaae.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(zaae zaae) {
        synchronized (f24482r) {
            try {
                if (this.f24494k == zaae) {
                    this.f24494k = null;
                    this.f24495l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.f24485b) {
            return false;
        }
        RootTelemetryConfiguration a2 = RootTelemetryConfigManager.b().a();
        if (a2 != null && !a2.S()) {
            return false;
        }
        int a3 = this.f24490g.a(this.f24488e, 203400000);
        return a3 == -1 || a3 == 0;
    }

    public final boolean e(ConnectionResult connectionResult, int i2) {
        return this.f24489f.A(this.f24488e, connectionResult, i2);
    }

    public final zabq g(GoogleApi googleApi) {
        Map map = this.f24493j;
        ApiKey k2 = googleApi.k();
        zabq zabq = (zabq) map.get(k2);
        if (zabq == null) {
            zabq = new zabq(this, googleApi);
            this.f24493j.put(k2, zabq);
        }
        if (zabq.a()) {
            this.f24496m.add(k2);
        }
        zabq.C();
        return zabq;
    }

    public final TelemetryLoggingClient h() {
        if (this.f24487d == null) {
            this.f24487d = TelemetryLogging.a(this.f24488e);
        }
        return this.f24487d;
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        long j2 = 300000;
        zabq zabq = null;
        switch (i2) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.f24484a = j2;
                this.f24497n.removeMessages(12);
                for (ApiKey obtainMessage : this.f24493j.keySet()) {
                    Handler handler = this.f24497n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f24484a);
                }
                break;
            case 2:
                zal zal = (zal) message.obj;
                Iterator it = zal.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey apiKey = (ApiKey) it.next();
                        zabq zabq2 = (zabq) this.f24493j.get(apiKey);
                        if (zabq2 == null) {
                            zal.b(apiKey, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zabq2.Q()) {
                            zal.b(apiKey, ConnectionResult.D, zabq2.t().h());
                        } else {
                            ConnectionResult r2 = zabq2.r();
                            if (r2 != null) {
                                zal.b(apiKey, r2, (String) null);
                            } else {
                                zabq2.H(zal);
                                zabq2.C();
                            }
                        }
                    }
                }
            case 3:
                for (zabq zabq3 : this.f24493j.values()) {
                    zabq3.B();
                    zabq3.C();
                }
                break;
            case 4:
            case 8:
            case 13:
                zach zach = (zach) message.obj;
                zabq zabq4 = (zabq) this.f24493j.get(zach.f24698c.k());
                if (zabq4 == null) {
                    zabq4 = g(zach.f24698c);
                }
                if (zabq4.a() && this.f24492i.get() != zach.f24697b) {
                    zach.f24696a.a(f24480p);
                    zabq4.K();
                    break;
                } else {
                    zabq4.D(zach.f24696a);
                    break;
                }
            case 5:
                int i3 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f24493j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq zabq5 = (zabq) it2.next();
                        if (zabq5.p() == i3) {
                            zabq = zabq5;
                        }
                    }
                }
                if (zabq != null) {
                    if (connectionResult.H() != 13) {
                        zabq.e(f(zabq.f24660n, connectionResult));
                        break;
                    } else {
                        String g2 = this.f24489f.g(connectionResult.H());
                        String Q = connectionResult.Q();
                        zabq.e(new Status(17, "Error resolution was canceled by the user, original error message: " + g2 + ": " + Q));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i3 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f24488e.getApplicationContext() instanceof Application) {
                    BackgroundDetector.c((Application) this.f24488e.getApplicationContext());
                    BackgroundDetector.b().a(new zabl(this));
                    if (!BackgroundDetector.b().e(true)) {
                        this.f24484a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                g((GoogleApi) message.obj);
                break;
            case 9:
                if (this.f24493j.containsKey(message.obj)) {
                    ((zabq) this.f24493j.get(message.obj)).I();
                    break;
                }
                break;
            case 10:
                for (ApiKey remove : this.f24496m) {
                    zabq zabq6 = (zabq) this.f24493j.remove(remove);
                    if (zabq6 != null) {
                        zabq6.K();
                    }
                }
                this.f24496m.clear();
                break;
            case 11:
                if (this.f24493j.containsKey(message.obj)) {
                    ((zabq) this.f24493j.get(message.obj)).L();
                    break;
                }
                break;
            case 12:
                if (this.f24493j.containsKey(message.obj)) {
                    ((zabq) this.f24493j.get(message.obj)).b();
                    break;
                }
                break;
            case 14:
                zaaf zaaf = (zaaf) message.obj;
                ApiKey a2 = zaaf.a();
                if (this.f24493j.containsKey(a2)) {
                    zaaf.b().c(Boolean.valueOf(((zabq) this.f24493j.get(a2)).o(false)));
                    break;
                } else {
                    zaaf.b().c(Boolean.FALSE);
                    break;
                }
            case 15:
                zabs zabs = (zabs) message.obj;
                if (this.f24493j.containsKey(zabs.f24671a)) {
                    zabq.z((zabq) this.f24493j.get(zabs.f24671a), zabs);
                    break;
                }
                break;
            case 16:
                zabs zabs2 = (zabs) message.obj;
                if (this.f24493j.containsKey(zabs2.f24671a)) {
                    zabq.A((zabq) this.f24493j.get(zabs2.f24671a), zabs2);
                    break;
                }
                break;
            case 17:
                i();
                break;
            case 18:
                zace zace = (zace) message.obj;
                if (zace.f24691c != 0) {
                    TelemetryData telemetryData = this.f24486c;
                    if (telemetryData != null) {
                        List Q2 = telemetryData.Q();
                        if (telemetryData.H() != zace.f24690b || (Q2 != null && Q2.size() >= zace.f24692d)) {
                            this.f24497n.removeMessages(17);
                            i();
                        } else {
                            this.f24486c.S(zace.f24689a);
                        }
                    }
                    if (this.f24486c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zace.f24689a);
                        this.f24486c = new TelemetryData(zace.f24690b, arrayList);
                        Handler handler2 = this.f24497n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zace.f24691c);
                        break;
                    }
                } else {
                    h().a(new TelemetryData(zace.f24690b, Arrays.asList(new MethodInvocation[]{zace.f24689a})));
                    break;
                }
                break;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                this.f24485b = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i2);
                return false;
        }
        return true;
    }

    public final void i() {
        TelemetryData telemetryData = this.f24486c;
        if (telemetryData != null) {
            if (telemetryData.H() > 0 || d()) {
                h().a(telemetryData);
            }
            this.f24486c = null;
        }
    }

    public final void j(TaskCompletionSource taskCompletionSource, int i2, GoogleApi googleApi) {
        zacd b2;
        if (i2 != 0 && (b2 = zacd.b(this, i2, googleApi.k())) != null) {
            Task a2 = taskCompletionSource.a();
            Handler handler = this.f24497n;
            handler.getClass();
            a2.c(new zabk(handler), b2);
        }
    }

    public final int k() {
        return this.f24491h.getAndIncrement();
    }

    public final zabq s(ApiKey apiKey) {
        return (zabq) this.f24493j.get(apiKey);
    }

    public final Task v(GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey, int i2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j(taskCompletionSource, i2, googleApi);
        this.f24497n.sendMessage(this.f24497n.obtainMessage(13, new zach(new zah(listenerKey, taskCompletionSource), this.f24492i.get(), googleApi)));
        return taskCompletionSource.a();
    }
}
