package com.google.android.gms.wallet.contract;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;

public class ApiTaskResult<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f27342a;

    /* renamed from: b  reason: collision with root package name */
    public final Status f27343b;

    public ApiTaskResult(Object obj, Status status) {
        this.f27342a = obj;
        this.f27343b = status;
    }

    public Object a() {
        return this.f27342a;
    }

    public Status b() {
        return this.f27343b;
    }

    public String toString() {
        return Objects.c(this).a("status", this.f27343b).a("result", this.f27342a).toString();
    }

    public ApiTaskResult(Status status) {
        this((Object) null, status);
    }
}
