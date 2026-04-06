package com.hansecom.abt.ui.components.passCard;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class B implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38581A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f38582z;

    public /* synthetic */ B(Function1 function1, boolean z2) {
        this.f38582z = function1;
        this.f38581A = z2;
    }

    public final Object invoke(Object obj) {
        return PassCardStatusKt.h(this.f38582z, this.f38581A, ((Boolean) obj).booleanValue());
    }
}
