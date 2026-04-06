package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.net.Uri;

public final class zzo {

    /* renamed from: f  reason: collision with root package name */
    public static final Uri f24988f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f24989a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24990b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentName f24991c = null;

    /* renamed from: d  reason: collision with root package name */
    public final int f24992d = 4225;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24993e;

    public zzo(String str, String str2, int i2, boolean z2) {
        Preconditions.g(str);
        this.f24989a = str;
        Preconditions.g(str2);
        this.f24990b = str2;
        this.f24993e = z2;
    }

    public final ComponentName a() {
        return this.f24991c;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent b(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.f24989a
            if (r1 == 0) goto L_0x0060
            boolean r1 = r5.f24993e
            r2 = 0
            if (r1 == 0) goto L_0x0050
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.f24989a
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0024 }
            android.net.Uri r3 = f24988f     // Catch:{ IllegalArgumentException -> 0x0024 }
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r6 = r6.call(r3, r4, r2, r1)     // Catch:{ IllegalArgumentException -> 0x0024 }
            goto L_0x0033
        L_0x0024:
            r6 = move-exception
            java.lang.String r1 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
            r6 = r2
        L_0x0033:
            if (r6 != 0) goto L_0x0036
            goto L_0x003f
        L_0x0036:
            java.lang.String r1 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r6.getParcelable(r1)
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2
        L_0x003f:
            if (r2 != 0) goto L_0x0050
            java.lang.String r6 = r5.f24989a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        L_0x0050:
            if (r2 != 0) goto L_0x006b
            java.lang.String r6 = r5.f24989a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r6 = r5.f24990b
            android.content.Intent r6 = r0.setPackage(r6)
            return r6
        L_0x0060:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.f24991c
            android.content.Intent r2 = r6.setComponent(r0)
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzo.b(android.content.Context):android.content.Intent");
    }

    public final String c() {
        return this.f24990b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzo = (zzo) obj;
        return Objects.a(this.f24989a, zzo.f24989a) && Objects.a(this.f24990b, zzo.f24990b) && Objects.a(this.f24991c, zzo.f24991c) && this.f24993e == zzo.f24993e;
    }

    public final int hashCode() {
        return Objects.b(this.f24989a, this.f24990b, this.f24991c, 4225, Boolean.valueOf(this.f24993e));
    }

    public final String toString() {
        String str = this.f24989a;
        if (str != null) {
            return str;
        }
        Preconditions.m(this.f24991c);
        return this.f24991c.flattenToString();
    }
}
