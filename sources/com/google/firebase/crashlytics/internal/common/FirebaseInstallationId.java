package com.google.firebase.crashlytics.internal.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FirebaseInstallationId {

    /* renamed from: a  reason: collision with root package name */
    public final String f30086a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30087b;

    public FirebaseInstallationId(String str, String str2) {
        this.f30086a = str;
        this.f30087b = str2;
    }

    public final String a() {
        return this.f30087b;
    }

    public final String b() {
        return this.f30086a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) obj;
        return Intrinsics.d(this.f30086a, firebaseInstallationId.f30086a) && Intrinsics.d(this.f30087b, firebaseInstallationId.f30087b);
    }

    public int hashCode() {
        String str = this.f30086a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30087b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f30086a + ", authToken=" + this.f30087b + ')';
    }
}
