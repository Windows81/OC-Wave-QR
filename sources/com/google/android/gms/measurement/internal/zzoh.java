package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

public final class zzoh {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26953a;

    public zzoh(Context context) {
        Preconditions.m(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m(applicationContext);
        this.f26953a = applicationContext;
    }
}
