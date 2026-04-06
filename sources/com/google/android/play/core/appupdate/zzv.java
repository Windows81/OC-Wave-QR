package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;

final class zzv extends AppUpdateOptions.Builder {

    /* renamed from: a  reason: collision with root package name */
    public int f27507a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27508b;

    /* renamed from: c  reason: collision with root package name */
    public byte f27509c;

    public final AppUpdateOptions a() {
        if (this.f27509c == 3) {
            return new zzx(this.f27507a, this.f27508b, (zzw) null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f27509c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f27509c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AppUpdateOptions.Builder b(boolean z2) {
        this.f27508b = z2;
        this.f27509c = (byte) (this.f27509c | 2);
        return this;
    }

    public final AppUpdateOptions.Builder c(int i2) {
        this.f27507a = i2;
        this.f27509c = (byte) (this.f27509c | 1);
        return this;
    }
}
