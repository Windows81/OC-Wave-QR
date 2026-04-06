package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.zzl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzx {

    /* renamed from: o  reason: collision with root package name */
    public static final Map f27443o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f27444a;

    /* renamed from: b  reason: collision with root package name */
    public final zzm f27445b;

    /* renamed from: c  reason: collision with root package name */
    public final String f27446c;

    /* renamed from: d  reason: collision with root package name */
    public final List f27447d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Set f27448e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f27449f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f27450g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f27451h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f27452i;

    /* renamed from: j  reason: collision with root package name */
    public final IBinder.DeathRecipient f27453j = new zzp(this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f27454k = new AtomicInteger(0);

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f27455l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f27456m;

    /* renamed from: n  reason: collision with root package name */
    public final zzl f27457n;

    public zzx(Context context, zzm zzm, String str, Intent intent, zzl zzl, zzs zzs) {
        this.f27444a = context;
        this.f27445b = zzm;
        this.f27446c = "AppUpdateService";
        this.f27451h = intent;
        this.f27457n = zzl;
        this.f27452i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void j(zzx zzx) {
        zzx.f27445b.d("reportBinderDeath", new Object[0]);
        zzs zzs = (zzs) zzx.f27452i.get();
        if (zzs != null) {
            zzx.f27445b.d("calling onBinderDied", new Object[0]);
            zzs.a();
        } else {
            zzx.f27445b.d("%s : Binder has died.", zzx.f27446c);
            for (zzn c2 : zzx.f27447d) {
                c2.c(zzx.v());
            }
            zzx.f27447d.clear();
        }
        synchronized (zzx.f27449f) {
            zzx.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(zzx zzx, TaskCompletionSource taskCompletionSource) {
        zzx.f27448e.add(taskCompletionSource);
        taskCompletionSource.a().b(new zzo(zzx, taskCompletionSource));
    }

    public static /* bridge */ /* synthetic */ void p(zzx zzx, zzn zzn) {
        if (zzx.f27456m == null && !zzx.f27450g) {
            zzx.f27445b.d("Initiate binding to the service.", new Object[0]);
            zzx.f27447d.add(zzn);
            zzw zzw = new zzw(zzx, (zzv) null);
            zzx.f27455l = zzw;
            zzx.f27450g = true;
            if (!zzx.f27444a.bindService(zzx.f27451h, zzw, 1)) {
                zzx.f27445b.d("Failed to bind to the service.", new Object[0]);
                zzx.f27450g = false;
                for (zzn c2 : zzx.f27447d) {
                    c2.c(new zzy());
                }
                zzx.f27447d.clear();
            }
        } else if (zzx.f27450g) {
            zzx.f27445b.d("Waiting to bind to the service.", new Object[0]);
            zzx.f27447d.add(zzn);
        } else {
            zzn.run();
        }
    }

    public static /* bridge */ /* synthetic */ void q(zzx zzx) {
        zzx.f27445b.d("linkToDeath", new Object[0]);
        try {
            zzx.f27456m.asBinder().linkToDeath(zzx.f27453j, 0);
        } catch (RemoteException e2) {
            zzx.f27445b.c(e2, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(zzx zzx) {
        zzx.f27445b.d("unlinkToDeath", new Object[0]);
        zzx.f27456m.asBinder().unlinkToDeath(zzx.f27453j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f27443o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f27446c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f27446c, 10);
                    handlerThread.start();
                    map.put(this.f27446c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f27446c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f27456m;
    }

    public final void s(zzn zzn, TaskCompletionSource taskCompletionSource) {
        c().post(new zzq(this, zzn.b(), taskCompletionSource, zzn));
    }

    public final /* synthetic */ void t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f27449f) {
            this.f27448e.remove(taskCompletionSource);
        }
    }

    public final void u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f27449f) {
            this.f27448e.remove(taskCompletionSource);
        }
        c().post(new zzr(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f27446c).concat(" : Binder has died."));
    }

    public final void w() {
        for (TaskCompletionSource d2 : this.f27448e) {
            d2.d(v());
        }
        this.f27448e.clear();
    }
}
