package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzko implements zzoo {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzjk f26696a;

    public zzko(zzjk zzjk) {
        this.f26696a = zzjk;
    }

    public final void b(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f26696a.i0("auto", str2, bundle, str);
        } else {
            this.f26696a.U0("auto", str2, bundle);
        }
    }
}
