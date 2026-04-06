package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class zzc {

    /* renamed from: a  reason: collision with root package name */
    public Object f24974a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24975b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f24976c;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.f24976c = baseGmsClient;
        this.f24974a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f24974a;
                if (this.f24975b) {
                    String obj2 = toString();
                    Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f24975b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f24974a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f24976c.f24852r) {
            this.f24976c.f24852r.remove(this);
        }
    }
}
