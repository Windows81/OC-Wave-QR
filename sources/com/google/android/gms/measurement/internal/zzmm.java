package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

public final class zzmm implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f26821a;

    /* renamed from: b  reason: collision with root package name */
    public volatile zzgj f26822b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ zzlp f26823c;

    public zzmm(zzlp zzlp) {
        this.f26823c = zzlp;
    }

    public final void J(int i2) {
        Preconditions.f("MeasurementServiceConnection.onConnectionSuspended");
        this.f26823c.m().F().a("Service connection suspended");
        this.f26823c.f().D(new zzmq(this));
    }

    public final void N(ConnectionResult connectionResult) {
        Preconditions.f("MeasurementServiceConnection.onConnectionFailed");
        zzgi E = this.f26823c.f26587a.E();
        if (E != null) {
            E.L().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f26821a = false;
            this.f26822b = null;
        }
        this.f26823c.f().D(new zzmt(this));
    }

    public final void P(Bundle bundle) {
        Preconditions.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.m(this.f26822b);
                this.f26823c.f().D(new zzmr(this, (zzgb) this.f26822b.I()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f26822b = null;
                this.f26821a = false;
            }
        }
    }

    public final void a() {
        this.f26823c.n();
        Context a2 = this.f26823c.a();
        synchronized (this) {
            try {
                if (this.f26821a) {
                    this.f26823c.m().K().a("Connection attempt already in progress");
                } else if (this.f26822b == null || (!this.f26822b.g() && !this.f26822b.a())) {
                    this.f26822b = new zzgj(a2, Looper.getMainLooper(), this, this);
                    this.f26823c.m().K().a("Connecting to remote service");
                    this.f26821a = true;
                    Preconditions.m(this.f26822b);
                    this.f26822b.v();
                } else {
                    this.f26823c.m().K().a("Already awaiting connection attempt");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        this.f26823c.n();
        Context a2 = this.f26823c.a();
        ConnectionTracker b2 = ConnectionTracker.b();
        synchronized (this) {
            try {
                if (this.f26821a) {
                    this.f26823c.m().K().a("Connection attempt already in progress");
                    return;
                }
                this.f26823c.m().K().a("Using local app measurement service");
                this.f26821a = true;
                b2.a(a2, intent, this.f26823c.f26758c, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f26822b != null && (this.f26822b.a() || this.f26822b.g())) {
            this.f26822b.j();
        }
        this.f26822b = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f26823c.m().G().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.Preconditions.f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f26821a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzlp r4 = r3.f26823c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0097
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0060 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.zzgb     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x003a
            com.google.android.gms.measurement.internal.zzgb r1 = (com.google.android.gms.measurement.internal.zzgb) r1     // Catch:{ RemoteException -> 0x0060 }
        L_0x0038:
            r0 = r1
            goto L_0x0040
        L_0x003a:
            com.google.android.gms.measurement.internal.zzgd r1 = new com.google.android.gms.measurement.internal.zzgd     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0038
        L_0x0040:
            com.google.android.gms.measurement.internal.zzlp r5 = r3.f26823c     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.zzgi r5 = r5.m()     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.K()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0050:
            com.google.android.gms.measurement.internal.zzlp r5 = r3.f26823c     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.zzgi r5 = r5.m()     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.G()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0060:
            com.google.android.gms.measurement.internal.zzlp r5 = r3.f26823c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzgi r5 = r5.m()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.G()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006f:
            if (r0 != 0) goto L_0x0087
            r3.f26821a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.ConnectionTracker.b()     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.zzlp r5 = r3.f26823c     // Catch:{ IllegalArgumentException -> 0x0095 }
            android.content.Context r5 = r5.a()     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.zzlp r0 = r3.f26823c     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.zzmm r0 = r0.f26758c     // Catch:{ IllegalArgumentException -> 0x0095 }
            r4.c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0095 }
            goto L_0x0095
        L_0x0087:
            com.google.android.gms.measurement.internal.zzlp r4 = r3.f26823c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzhp r4 = r4.f()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzmp r5 = new com.google.android.gms.measurement.internal.zzmp     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.D(r5)     // Catch:{ all -> 0x001c }
        L_0x0095:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmm.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.f("MeasurementServiceConnection.onServiceDisconnected");
        this.f26823c.m().F().a("Service disconnected");
        this.f26823c.f().D(new zzmo(this, componentName));
    }
}
