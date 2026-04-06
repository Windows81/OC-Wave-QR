package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.Preconditions;

public final class zzcr {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f25406a = new zzcu();

    public static SharedPreferences a(Context context, String str, int i2, zzcm zzcm) {
        zzcq zzcq = zzcf.a().a(str, zzcm, zzcj.SHARED_PREFS_TYPE).equals("") ? new zzcq() : null;
        if (zzcq != null) {
            return zzcq;
        }
        ThreadLocal threadLocal = f25406a;
        Preconditions.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f25406a.set(Boolean.TRUE);
            throw th;
        }
    }
}
