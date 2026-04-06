package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class GmsClientSupervisor {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f24887a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static zzs f24888b = null;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f24889c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Executor f24890d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f24891e = false;

    public static int a() {
        return 4225;
    }

    public static GmsClientSupervisor b(Context context) {
        synchronized (f24887a) {
            try {
                if (f24888b == null) {
                    f24888b = new zzs(context.getApplicationContext(), f24891e ? c().getLooper() : context.getMainLooper(), f24890d);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f24888b;
    }

    public static HandlerThread c() {
        synchronized (f24887a) {
            try {
                HandlerThread handlerThread = f24889c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f24889c = handlerThread2;
                handlerThread2.start();
                HandlerThread handlerThread3 = f24889c;
                return handlerThread3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d(zzo zzo, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i2, ServiceConnection serviceConnection, String str3, boolean z2) {
        d(new zzo(str, str2, 4225, z2), serviceConnection, str3);
    }

    public abstract boolean f(zzo zzo, ServiceConnection serviceConnection, String str, Executor executor);
}
