package com.hansecom.abt.ui.components.formFields;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class Y implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38352A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f38353z;

    public /* synthetic */ Y(Function1 function1, boolean z2) {
        this.f38353z = function1;
        this.f38352A = z2;
    }

    public final Object invoke(Object obj) {
        return SwitchFieldKt.d(this.f38353z, this.f38352A, ((Boolean) obj).booleanValue());
    }
}
