package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzaj implements zzaq {

    /* renamed from: A  reason: collision with root package name */
    public final String f25330A;

    /* renamed from: z  reason: collision with root package name */
    public final zzaq f25331z;

    public zzaj(String str) {
        this.f25331z = zzaq.f25336m;
        this.f25330A = str;
    }

    public final zzaq a() {
        return this.f25331z;
    }

    public final String b() {
        return this.f25330A;
    }

    public final zzaq c() {
        return new zzaj(this.f25330A, this.f25331z.c());
    }

    public final Boolean e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzaj = (zzaj) obj;
        return this.f25330A.equals(zzaj.f25330A) && this.f25331z.equals(zzaj.f25331z);
    }

    public final Double g() {
        throw new IllegalStateException("Control is not a double");
    }

    public final String h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.f25330A.hashCode() * 31) + this.f25331z.hashCode();
    }

    public final Iterator i() {
        return null;
    }

    public final zzaq o(String str, zzh zzh, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public zzaj(String str, zzaq zzaq) {
        this.f25331z = zzaq;
        this.f25330A = str;
    }
}
