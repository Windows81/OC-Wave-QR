package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class zzl {

    /* renamed from: a  reason: collision with root package name */
    public final zzm f27425a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f27426b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f27427c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f27428d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public zzk f27429e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f27430f = false;

    public zzl(zzm zzm, IntentFilter intentFilter, Context context) {
        this.f27425a = zzm;
        this.f27426b = intentFilter;
        this.f27427c = zzz.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(StateUpdatedListener stateUpdatedListener) {
        this.f27425a.d("registerListener", new Object[0]);
        zzac.a(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.f27428d.add(stateUpdatedListener);
        d();
    }

    public final synchronized void c(Object obj) {
        Iterator it = new HashSet(this.f27428d).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).a(obj);
        }
    }

    public final void d() {
        zzk zzk;
        if (!this.f27428d.isEmpty() && this.f27429e == null) {
            zzk zzk2 = new zzk(this, (zzj) null);
            this.f27429e = zzk2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f27427c.registerReceiver(zzk2, this.f27426b, 2);
            } else {
                this.f27427c.registerReceiver(zzk2, this.f27426b);
            }
        }
        if (this.f27428d.isEmpty() && (zzk = this.f27429e) != null) {
            this.f27427c.unregisterReceiver(zzk);
            this.f27429e = null;
        }
    }
}
