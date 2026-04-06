package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.appupdate.internal.zzz;

public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    public static zza f27474a;

    public static synchronized zza a(Context context) {
        zza zza;
        synchronized (zzb.class) {
            try {
                if (f27474a == null) {
                    zzab zzab = new zzab((zzaa) null);
                    zzab.b(new zzi(zzz.a(context)));
                    f27474a = zzab.a();
                }
                zza = f27474a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return zza;
    }
}
