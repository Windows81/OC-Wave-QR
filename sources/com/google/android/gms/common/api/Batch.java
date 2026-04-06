package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

public final class Batch extends BasePendingResult<BatchResult> {

    /* renamed from: q  reason: collision with root package name */
    public int f24417q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f24418r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f24419s;

    /* renamed from: t  reason: collision with root package name */
    public final PendingResult[] f24420t;

    /* renamed from: u  reason: collision with root package name */
    public final Object f24421u;

    public static final class Builder {
    }

    public void d() {
        super.d();
        int i2 = 0;
        while (true) {
            PendingResult[] pendingResultArr = this.f24420t;
            if (i2 < pendingResultArr.length) {
                pendingResultArr[i2].d();
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    public BatchResult f(Status status) {
        return new BatchResult(status, this.f24420t);
    }
}
