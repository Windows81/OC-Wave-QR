package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class zaab implements PendingResult.StatusListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f24548a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zaad f24549b;

    public zaab(zaad zaad, BasePendingResult basePendingResult) {
        this.f24549b = zaad;
        this.f24548a = basePendingResult;
    }

    public final void a(Status status) {
        this.f24549b.f24552a.remove(this.f24548a);
    }
}
