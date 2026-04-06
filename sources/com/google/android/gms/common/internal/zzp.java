package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

final class zzp implements ServiceConnection, zzt {

    /* renamed from: a  reason: collision with root package name */
    public final Map f24994a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f24995b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24996c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f24997d;

    /* renamed from: e  reason: collision with root package name */
    public final zzo f24998e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f24999f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ zzs f25000g;

    public zzp(zzs zzs, zzo zzo) {
        this.f25000g = zzs;
        this.f24998e = zzo;
    }

    public final int a() {
        return this.f24995b;
    }

    public final ComponentName b() {
        return this.f24999f;
    }

    public final IBinder c() {
        return this.f24997d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f24994a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f24995b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            zzs zzs = this.f25000g;
            boolean d2 = zzs.f25006j.d(zzs.f25003g, str, this.f24998e.b(zzs.f25003g), this, 4225, executor);
            this.f24996c = d2;
            if (d2) {
                this.f25000g.f25004h.sendMessageDelayed(this.f25000g.f25004h.obtainMessage(1, this.f24998e), this.f25000g.f25008l);
            } else {
                this.f24995b = 2;
                try {
                    zzs zzs2 = this.f25000g;
                    zzs2.f25006j.c(zzs2.f25003g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f24994a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f25000g.f25004h.removeMessages(1, this.f24998e);
        zzs zzs = this.f25000g;
        zzs.f25006j.c(zzs.f25003g, this);
        this.f24996c = false;
        this.f24995b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f24994a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f24994a.isEmpty();
    }

    public final boolean j() {
        return this.f24996c;
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f25000g.f25002f) {
            try {
                this.f25000g.f25004h.removeMessages(1, this.f24998e);
                this.f24997d = iBinder;
                this.f24999f = componentName;
                for (ServiceConnection onServiceConnected : this.f24994a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.f24995b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f25000g.f25002f) {
            try {
                this.f25000g.f25004h.removeMessages(1, this.f24998e);
                this.f24997d = null;
                this.f24999f = componentName;
                for (ServiceConnection onServiceDisconnected : this.f24994a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.f24995b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
