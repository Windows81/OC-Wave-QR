package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final /* synthetic */ class zzii {
    public static Object a(zzih zzih) {
        long clearCallingIdentity;
        try {
            return zzih.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a2 = zzih.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
