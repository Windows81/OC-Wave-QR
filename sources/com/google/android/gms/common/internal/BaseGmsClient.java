package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseGmsClient<T extends IInterface> {
    public static final String[] D = {"service_esmobile", "service_googleme"};
    public static final Feature[] E = new Feature[0];

    /* renamed from: A  reason: collision with root package name */
    public boolean f24833A;

    /* renamed from: B  reason: collision with root package name */
    public volatile zzk f24834B;
    public AtomicInteger C;

    /* renamed from: a  reason: collision with root package name */
    public int f24835a;

    /* renamed from: b  reason: collision with root package name */
    public long f24836b;

    /* renamed from: c  reason: collision with root package name */
    public long f24837c;

    /* renamed from: d  reason: collision with root package name */
    public int f24838d;

    /* renamed from: e  reason: collision with root package name */
    public long f24839e;

    /* renamed from: f  reason: collision with root package name */
    public volatile String f24840f;

    /* renamed from: g  reason: collision with root package name */
    public zzv f24841g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f24842h;

    /* renamed from: i  reason: collision with root package name */
    public final Looper f24843i;

    /* renamed from: j  reason: collision with root package name */
    public final GmsClientSupervisor f24844j;

    /* renamed from: k  reason: collision with root package name */
    public final GoogleApiAvailabilityLight f24845k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f24846l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f24847m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f24848n;

    /* renamed from: o  reason: collision with root package name */
    public IGmsServiceBroker f24849o;

    /* renamed from: p  reason: collision with root package name */
    public ConnectionProgressReportCallbacks f24850p;

    /* renamed from: q  reason: collision with root package name */
    public IInterface f24851q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f24852r;

    /* renamed from: s  reason: collision with root package name */
    public zze f24853s;

    /* renamed from: t  reason: collision with root package name */
    public int f24854t;

    /* renamed from: u  reason: collision with root package name */
    public final BaseConnectionCallbacks f24855u;

    /* renamed from: v  reason: collision with root package name */
    public final BaseOnConnectionFailedListener f24856v;

    /* renamed from: w  reason: collision with root package name */
    public final int f24857w;

    /* renamed from: x  reason: collision with root package name */
    public final String f24858x;

    /* renamed from: y  reason: collision with root package name */
    public volatile String f24859y;

    /* renamed from: z  reason: collision with root package name */
    public ConnectionResult f24860z;

    public interface BaseConnectionCallbacks {
        void J(int i2);

        void P(Bundle bundle);
    }

    public interface BaseOnConnectionFailedListener {
        void N(ConnectionResult connectionResult);
    }

    public interface ConnectionProgressReportCallbacks {
        void a(ConnectionResult connectionResult);
    }

    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.f0()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.e((IAccountAccessor) null, baseGmsClient.H());
            } else if (BaseGmsClient.this.f24856v != null) {
                BaseGmsClient.this.f24856v.N(connectionResult);
            }
        }
    }

    public interface SignOutCallbacks {
        void a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.b(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.h()
            com.google.android.gms.common.internal.Preconditions.m(r13)
            com.google.android.gms.common.internal.Preconditions.m(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    public static /* bridge */ /* synthetic */ void h0(BaseGmsClient baseGmsClient, zzk zzk) {
        baseGmsClient.f24834B = zzk;
        if (baseGmsClient.X()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzk.C;
            RootTelemetryConfigManager.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.m0());
        }
    }

    public static /* bridge */ /* synthetic */ void i0(BaseGmsClient baseGmsClient, int i2) {
        int i3;
        int i4;
        synchronized (baseGmsClient.f24847m) {
            i3 = baseGmsClient.f24854t;
        }
        if (i3 == 3) {
            baseGmsClient.f24833A = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = baseGmsClient.f24846l;
        handler.sendMessage(handler.obtainMessage(i4, baseGmsClient.C.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean l0(BaseGmsClient baseGmsClient, int i2, int i3, IInterface iInterface) {
        synchronized (baseGmsClient.f24847m) {
            try {
                if (baseGmsClient.f24854t != i2) {
                    return false;
                }
                baseGmsClient.n0(i3, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean m0(BaseGmsClient baseGmsClient) {
        if (baseGmsClient.f24833A || TextUtils.isEmpty(baseGmsClient.J()) || TextUtils.isEmpty(baseGmsClient.G())) {
            return false;
        }
        try {
            Class.forName(baseGmsClient.J());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public Feature[] A() {
        return E;
    }

    public Executor B() {
        return null;
    }

    public Bundle C() {
        return null;
    }

    public final Context D() {
        return this.f24842h;
    }

    public int E() {
        return this.f24857w;
    }

    public Bundle F() {
        return new Bundle();
    }

    public String G() {
        return null;
    }

    public Set H() {
        return Collections.emptySet();
    }

    public final IInterface I() {
        IInterface iInterface;
        synchronized (this.f24847m) {
            try {
                if (this.f24854t != 5) {
                    w();
                    iInterface = this.f24851q;
                    Preconditions.n(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String J();

    public abstract String K();

    public String L() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration M() {
        zzk zzk = this.f24834B;
        if (zzk == null) {
            return null;
        }
        return zzk.C;
    }

    public boolean N() {
        return o() >= 211700000;
    }

    public boolean O() {
        return this.f24834B != null;
    }

    public void P(IInterface iInterface) {
        this.f24837c = System.currentTimeMillis();
    }

    public void Q(ConnectionResult connectionResult) {
        this.f24838d = connectionResult.H();
        this.f24839e = System.currentTimeMillis();
    }

    public void R(int i2) {
        this.f24835a = i2;
        this.f24836b = System.currentTimeMillis();
    }

    public void S(int i2, IBinder iBinder, Bundle bundle, int i3) {
        this.f24846l.sendMessage(this.f24846l.obtainMessage(1, i3, -1, new zzf(this, i2, iBinder, bundle)));
    }

    public boolean T() {
        return false;
    }

    public void U(String str) {
        this.f24859y = str;
    }

    public void V(int i2) {
        this.f24846l.sendMessage(this.f24846l.obtainMessage(6, this.C.get(), i2));
    }

    public void W(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i2, PendingIntent pendingIntent) {
        Preconditions.n(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f24850p = connectionProgressReportCallbacks;
        this.f24846l.sendMessage(this.f24846l.obtainMessage(3, this.C.get(), i2, pendingIntent));
    }

    public boolean X() {
        return false;
    }

    public boolean a() {
        boolean z2;
        synchronized (this.f24847m) {
            z2 = this.f24854t == 4;
        }
        return z2;
    }

    public boolean c() {
        return false;
    }

    public final String c0() {
        String str = this.f24858x;
        return str == null ? this.f24842h.getClass().getName() : str;
    }

    public void e(IAccountAccessor iAccountAccessor, Set set) {
        Set set2 = set;
        Bundle F = F();
        String str = this.f24859y;
        int i2 = GoogleApiAvailabilityLight.f24392a;
        Scope[] scopeArr = GetServiceRequest.N;
        Bundle bundle = new Bundle();
        int i3 = this.f24857w;
        Feature[] featureArr = GetServiceRequest.O;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i3, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.C = this.f24842h.getPackageName();
        getServiceRequest3.F = F;
        if (set2 != null) {
            getServiceRequest3.E = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (t()) {
            Account z2 = z();
            if (z2 == null) {
                z2 = new Account("<<default account>>", "com.google");
            }
            getServiceRequest3.G = z2;
            if (iAccountAccessor != null) {
                getServiceRequest3.D = iAccountAccessor.asBinder();
            }
        } else if (T()) {
            getServiceRequest3.G = z();
        }
        getServiceRequest3.H = E;
        getServiceRequest3.I = A();
        if (X()) {
            getServiceRequest3.L = true;
        }
        try {
            synchronized (this.f24848n) {
                IGmsServiceBroker iGmsServiceBroker = this.f24849o;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.D0(new zzd(this, this.C.get()), getServiceRequest3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            V(3);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            S(8, (IBinder) null, (Bundle) null, this.C.get());
        } catch (Throwable th) {
            throw th;
        }
    }

    public void f(String str) {
        this.f24840f = str;
        j();
    }

    public boolean g() {
        boolean z2;
        synchronized (this.f24847m) {
            int i2 = this.f24854t;
            z2 = true;
            if (i2 != 2) {
                if (i2 != 3) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    public String h() {
        zzv zzv;
        if (a() && (zzv = this.f24841g) != null) {
            return zzv.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void i(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.n(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f24850p = connectionProgressReportCallbacks;
        n0(2, (IInterface) null);
    }

    public void j() {
        this.C.incrementAndGet();
        synchronized (this.f24852r) {
            try {
                int size = this.f24852r.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((zzc) this.f24852r.get(i2)).d();
                }
                this.f24852r.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.f24848n) {
            this.f24849o = null;
        }
        n0(1, (IInterface) null);
    }

    public final void j0(int i2, Bundle bundle, int i3) {
        this.f24846l.sendMessage(this.f24846l.obtainMessage(7, i3, -1, new zzg(this, i2, (Bundle) null)));
    }

    public void k(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.a();
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.f24847m) {
            i2 = this.f24854t;
            iInterface = this.f24851q;
        }
        synchronized (this.f24848n) {
            iGmsServiceBroker = this.f24849o;
        }
        printWriter.append(str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(J()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f24837c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j2 = this.f24837c;
            String format = simpleDateFormat.format(new Date(j2));
            append.println(j2 + " " + format);
        }
        if (this.f24836b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i3 = this.f24835a;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i3 != 3) {
                printWriter.append(String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.f24836b;
            String format2 = simpleDateFormat.format(new Date(j3));
            append2.println(j3 + " " + format2);
        }
        if (this.f24839e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(CommonStatusCodes.a(this.f24838d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.f24839e;
            String format3 = simpleDateFormat.format(new Date(j4));
            append3.println(j4 + " " + format3);
        }
    }

    public boolean m() {
        return true;
    }

    public final void n0(int i2, IInterface iInterface) {
        zzv zzv;
        boolean z2 = false;
        if ((i2 == 4) == (iInterface != null)) {
            z2 = true;
        }
        Preconditions.a(z2);
        synchronized (this.f24847m) {
            try {
                this.f24854t = i2;
                this.f24851q = iInterface;
                if (i2 == 1) {
                    zze zze = this.f24853s;
                    if (zze != null) {
                        GmsClientSupervisor gmsClientSupervisor = this.f24844j;
                        String b2 = this.f24841g.b();
                        Preconditions.m(b2);
                        gmsClientSupervisor.e(b2, this.f24841g.a(), 4225, zze, c0(), this.f24841g.c());
                        this.f24853s = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    zze zze2 = this.f24853s;
                    if (!(zze2 == null || (zzv = this.f24841g) == null)) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzv.b() + " on " + zzv.a());
                        GmsClientSupervisor gmsClientSupervisor2 = this.f24844j;
                        String b3 = this.f24841g.b();
                        Preconditions.m(b3);
                        gmsClientSupervisor2.e(b3, this.f24841g.a(), 4225, zze2, c0(), this.f24841g.c());
                        this.C.incrementAndGet();
                    }
                    zze zze3 = new zze(this, this.C.get());
                    this.f24853s = zze3;
                    zzv zzv2 = (this.f24854t != 3 || G() == null) ? new zzv(L(), K(), false, 4225, N()) : new zzv(D().getPackageName(), G(), true, 4225, false);
                    this.f24841g = zzv2;
                    if (zzv2.c()) {
                        if (o() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f24841g.b())));
                        }
                    }
                    GmsClientSupervisor gmsClientSupervisor3 = this.f24844j;
                    String b4 = this.f24841g.b();
                    Preconditions.m(b4);
                    if (!gmsClientSupervisor3.f(new zzo(b4, this.f24841g.a(), 4225, this.f24841g.c()), zze3, c0(), B())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f24841g.b() + " on " + this.f24841g.a());
                        j0(16, (Bundle) null, this.C.get());
                    }
                } else if (i2 == 4) {
                    Preconditions.m(iInterface);
                    P(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int o() {
        return GoogleApiAvailabilityLight.f24392a;
    }

    public final Feature[] p() {
        zzk zzk = this.f24834B;
        if (zzk == null) {
            return null;
        }
        return zzk.f24985A;
    }

    public String r() {
        return this.f24840f;
    }

    public Intent s() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean t() {
        return false;
    }

    public void v() {
        int j2 = this.f24845k.j(this.f24842h, o());
        if (j2 != 0) {
            n0(1, (IInterface) null);
            W(new LegacyClientCallbackAdapter(), j2, (PendingIntent) null);
            return;
        }
        i(new LegacyClientCallbackAdapter());
    }

    public final void w() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface x(IBinder iBinder);

    public boolean y() {
        return false;
    }

    public Account z() {
        return null;
    }

    public BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i2, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.f24840f = null;
        this.f24847m = new Object();
        this.f24848n = new Object();
        this.f24852r = new ArrayList();
        this.f24854t = 1;
        this.f24860z = null;
        this.f24833A = false;
        this.f24834B = null;
        this.C = new AtomicInteger(0);
        Preconditions.n(context, "Context must not be null");
        this.f24842h = context;
        Preconditions.n(looper, "Looper must not be null");
        this.f24843i = looper;
        Preconditions.n(gmsClientSupervisor, "Supervisor must not be null");
        this.f24844j = gmsClientSupervisor;
        Preconditions.n(googleApiAvailabilityLight, "API availability must not be null");
        this.f24845k = googleApiAvailabilityLight;
        this.f24846l = new zzb(this, looper);
        this.f24857w = i2;
        this.f24855u = baseConnectionCallbacks;
        this.f24856v = baseOnConnectionFailedListener;
        this.f24858x = str;
    }
}
