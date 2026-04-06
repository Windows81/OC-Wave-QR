package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ProcessDetails {

    /* renamed from: a  reason: collision with root package name */
    public final String f31500a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31501b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31502c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f31503d;

    public ProcessDetails(String str, int i2, int i3, boolean z2) {
        Intrinsics.i(str, "processName");
        this.f31500a = str;
        this.f31501b = i2;
        this.f31502c = i3;
        this.f31503d = z2;
    }

    public final int a() {
        return this.f31502c;
    }

    public final int b() {
        return this.f31501b;
    }

    public final String c() {
        return this.f31500a;
    }

    public final boolean d() {
        return this.f31503d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        return Intrinsics.d(this.f31500a, processDetails.f31500a) && this.f31501b == processDetails.f31501b && this.f31502c == processDetails.f31502c && this.f31503d == processDetails.f31503d;
    }

    public int hashCode() {
        int hashCode = ((((this.f31500a.hashCode() * 31) + Integer.hashCode(this.f31501b)) * 31) + Integer.hashCode(this.f31502c)) * 31;
        boolean z2 = this.f31503d;
        if (z2) {
            z2 = true;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f31500a + ", pid=" + this.f31501b + ", importance=" + this.f31502c + ", isDefaultProcess=" + this.f31503d + ')';
    }
}
