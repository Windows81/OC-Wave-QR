package com.hansecom.abt.presentation.mvi;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f34207z;

    public /* synthetic */ c(long j2) {
        this.f34207z = j2;
    }

    public final Object invoke(Object obj) {
        return MviViewModel$whileSubscribed$1.C(this.f34207z, ((Boolean) obj).booleanValue());
    }
}
