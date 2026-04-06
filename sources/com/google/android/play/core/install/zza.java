package com.google.android.play.core.install;

final class zza extends InstallState {

    /* renamed from: a  reason: collision with root package name */
    public final int f27522a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27523b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27524c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27525d;

    /* renamed from: e  reason: collision with root package name */
    public final String f27526e;

    public zza(int i2, long j2, long j3, int i3, String str) {
        this.f27522a = i2;
        this.f27523b = j2;
        this.f27524c = j3;
        this.f27525d = i3;
        if (str != null) {
            this.f27526e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final long a() {
        return this.f27523b;
    }

    public final int b() {
        return this.f27525d;
    }

    public final int c() {
        return this.f27522a;
    }

    public final String d() {
        return this.f27526e;
    }

    public final long e() {
        return this.f27524c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f27522a == installState.c() && this.f27523b == installState.a() && this.f27524c == installState.e() && this.f27525d == installState.b() && this.f27526e.equals(installState.d());
        }
    }

    public final int hashCode() {
        long j2 = this.f27523b;
        long j3 = this.f27524c;
        return ((((((((this.f27522a ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f27525d) * 1000003) ^ this.f27526e.hashCode();
    }

    public final String toString() {
        int i2 = this.f27522a;
        long j2 = this.f27523b;
        long j3 = this.f27524c;
        int i3 = this.f27525d;
        String str = this.f27526e;
        return "InstallState{installStatus=" + i2 + ", bytesDownloaded=" + j2 + ", totalBytesToDownload=" + j3 + ", installErrorCode=" + i3 + ", packageName=" + str + "}";
    }
}
