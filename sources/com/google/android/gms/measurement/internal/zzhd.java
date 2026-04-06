package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzbz;

public final class zzhd {

    /* renamed from: a  reason: collision with root package name */
    public final zzhw f26435a;

    public zzhd(zznv zznv) {
        this.f26435a = zznv.t0();
    }

    public final Bundle a(String str, zzbz zzbz) {
        this.f26435a.f().n();
        if (zzbz == null) {
            this.f26435a.m().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle u2 = zzbz.u(bundle);
            if (u2 != null) {
                return u2;
            }
            this.f26435a.m().G().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.f26435a.m().G().b("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }

    public final boolean b() {
        try {
            PackageManagerWrapper a2 = Wrappers.a(this.f26435a.a());
            if (a2 != null) {
                return a2.d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f26435a.m().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e2) {
            this.f26435a.m().K().b("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }
}
