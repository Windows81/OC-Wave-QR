package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class zzs extends GmsClientSupervisor {

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f25002f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Context f25003g;

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f25004h;

    /* renamed from: i  reason: collision with root package name */
    public final zzr f25005i;

    /* renamed from: j  reason: collision with root package name */
    public final ConnectionTracker f25006j;

    /* renamed from: k  reason: collision with root package name */
    public final long f25007k;

    /* renamed from: l  reason: collision with root package name */
    public final long f25008l;

    /* renamed from: m  reason: collision with root package name */
    public volatile Executor f25009m;

    public zzs(Context context, Looper looper, Executor executor) {
        zzr zzr = new zzr(this, (zzq) null);
        this.f25005i = zzr;
        this.f25003g = context.getApplicationContext();
        this.f25004h = new zzi(looper, zzr);
        this.f25006j = ConnectionTracker.b();
        this.f25007k = 5000;
        this.f25008l = 300000;
        this.f25009m = executor;
    }

    public final void d(zzo zzo, ServiceConnection serviceConnection, String str) {
        Preconditions.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f25002f) {
            try {
                zzp zzp = (zzp) this.f25002f.get(zzo);
                if (zzp == null) {
                    String obj = zzo.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
                } else if (zzp.h(serviceConnection)) {
                    zzp.f(serviceConnection, str);
                    if (zzp.i()) {
                        this.f25004h.sendMessageDelayed(this.f25004h.obtainMessage(0, zzo), this.f25007k);
                    }
                } else {
                    String obj2 = zzo.toString();
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(zzo zzo, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j2;
        Preconditions.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f25002f) {
            try {
                zzp zzp = (zzp) this.f25002f.get(zzo);
                if (executor == null) {
                    executor = this.f25009m;
                }
                if (zzp == null) {
                    zzp = new zzp(this, zzo);
                    zzp.d(serviceConnection, serviceConnection, str);
                    zzp.e(str, executor);
                    this.f25002f.put(zzo, zzp);
                } else {
                    this.f25004h.removeMessages(0, zzo);
                    if (!zzp.h(serviceConnection)) {
                        zzp.d(serviceConnection, serviceConnection, str);
                        int a2 = zzp.a();
                        if (a2 == 1) {
                            serviceConnection.onServiceConnected(zzp.b(), zzp.c());
                        } else if (a2 == 2) {
                            zzp.e(str, executor);
                        }
                    } else {
                        String obj = zzo.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                    }
                }
                j2 = zzp.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }
}
