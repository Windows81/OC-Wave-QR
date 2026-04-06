package com.google.android.gms.common.api;

public final class BatchResult implements Result {

    /* renamed from: A  reason: collision with root package name */
    public final PendingResult[] f24422A;

    /* renamed from: z  reason: collision with root package name */
    public final Status f24423z;

    public BatchResult(Status status, PendingResult[] pendingResultArr) {
        this.f24423z = status;
        this.f24422A = pendingResultArr;
    }

    public Status A() {
        return this.f24423z;
    }
}
