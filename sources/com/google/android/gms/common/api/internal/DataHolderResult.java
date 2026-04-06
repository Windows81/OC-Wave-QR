package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class DataHolderResult implements Result, Releasable {

    /* renamed from: A  reason: collision with root package name */
    public final DataHolder f24478A;

    /* renamed from: z  reason: collision with root package name */
    public final Status f24479z;

    public Status A() {
        return this.f24479z;
    }

    public void g() {
        DataHolder dataHolder = this.f24478A;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
