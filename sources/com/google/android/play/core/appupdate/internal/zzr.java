package com.google.android.play.core.appupdate.internal;

final class zzr extends zzn {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzx f27438A;

    public zzr(zzx zzx) {
        this.f27438A = zzx;
    }

    public final void a() {
        synchronized (this.f27438A.f27449f) {
            try {
                if (this.f27438A.f27454k.get() > 0) {
                    if (this.f27438A.f27454k.decrementAndGet() > 0) {
                        this.f27438A.f27445b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                zzx zzx = this.f27438A;
                if (zzx.f27456m != null) {
                    zzx.f27445b.d("Unbind from service.", new Object[0]);
                    zzx zzx2 = this.f27438A;
                    zzx2.f27444a.unbindService(zzx2.f27455l);
                    this.f27438A.f27450g = false;
                    this.f27438A.f27456m = null;
                    this.f27438A.f27455l = null;
                }
                this.f27438A.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
