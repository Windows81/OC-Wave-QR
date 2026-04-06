package com.google.android.play.core.appupdate;

final class zzx extends AppUpdateOptions {

    /* renamed from: a  reason: collision with root package name */
    public final int f27510a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f27511b;

    public /* synthetic */ zzx(int i2, boolean z2, zzw zzw) {
        this.f27510a = i2;
        this.f27511b = z2;
    }

    public final boolean a() {
        return this.f27511b;
    }

    public final int b() {
        return this.f27510a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateOptions) {
            AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
            return this.f27510a == appUpdateOptions.b() && this.f27511b == appUpdateOptions.a();
        }
    }

    public final int hashCode() {
        return ((this.f27510a ^ 1000003) * 1000003) ^ (true != this.f27511b ? 1237 : 1231);
    }

    public final String toString() {
        int i2 = this.f27510a;
        boolean z2 = this.f27511b;
        return "AppUpdateOptions{appUpdateType=" + i2 + ", allowAssetPackDeletion=" + z2 + "}";
    }
}
