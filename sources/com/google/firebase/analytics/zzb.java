package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdd;
import java.util.concurrent.ThreadPoolExecutor;

final class zzb extends ThreadPoolExecutor {
    public final void execute(Runnable runnable) {
        super.execute(zzdd.a().b(runnable));
    }
}
