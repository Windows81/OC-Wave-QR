package com.google.firebase.perf.util;

public enum StorageUnit {
    TERABYTES(1099511627776L) {
    },
    GIGABYTES(1073741824) {
    },
    MEGABYTES(1048576) {
    },
    KILOBYTES(1024) {
    },
    BYTES(1) {
    };
    

    /* renamed from: z  reason: collision with root package name */
    public long f31133z;

    public long f(long j2) {
        return (j2 * this.f31133z) / KILOBYTES.f31133z;
    }

    /* access modifiers changed from: public */
    StorageUnit(long j2) {
        this.f31133z = j2;
    }
}
