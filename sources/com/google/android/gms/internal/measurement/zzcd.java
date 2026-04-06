package com.google.android.gms.internal.measurement;

final class zzcd extends zzcl {

    /* renamed from: a  reason: collision with root package name */
    public String f25380a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f25381b;

    /* renamed from: c  reason: collision with root package name */
    public zzco f25382c;

    /* renamed from: d  reason: collision with root package name */
    public byte f25383d;

    public final zzcl a(zzco zzco) {
        if (zzco != null) {
            this.f25382c = zzco;
            return this;
        }
        throw new NullPointerException("Null filePurpose");
    }

    public final zzcl b(boolean z2) {
        this.f25383d = (byte) (this.f25383d | 1);
        return this;
    }

    public final zzcm c() {
        if (this.f25383d == 3 && this.f25380a != null && this.f25382c != null) {
            return new zzce(this.f25380a, false, this.f25381b, (zzcc) null, (zzcb) null, this.f25382c, (zzcg) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f25380a == null) {
            sb.append(" fileOwner");
        }
        if ((this.f25383d & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.f25383d & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.f25382c == null) {
            sb.append(" filePurpose");
        }
        String valueOf = String.valueOf(sb);
        throw new IllegalStateException("Missing required properties:" + valueOf);
    }

    public final zzcl d(boolean z2) {
        this.f25381b = z2;
        this.f25383d = (byte) (this.f25383d | 2);
        return this;
    }

    public final zzcl e(String str) {
        this.f25380a = str;
        return this;
    }
}
