package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzoa implements zzoo {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zznv f26942a;

    public zzoa(zznv zznv) {
        this.f26942a = zznv;
    }

    public final void b(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f26942a.f().D(new zzod(this, str, str2, bundle));
        } else if (this.f26942a.f26911l != null) {
            this.f26942a.f26911l.m().G().b("AppId not known when logging event", str2);
        }
    }
}
