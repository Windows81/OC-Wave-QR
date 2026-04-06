package com.hansecom.abt.ui.components.formFields;

import kotlin.jvm.functions.Function1;

/* renamed from: com.hansecom.abt.ui.components.formFields.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0641h implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38386A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f38387z;

    public /* synthetic */ C0641h(Function1 function1, boolean z2) {
        this.f38387z = function1;
        this.f38386A = z2;
    }

    public final Object invoke(Object obj) {
        return CheckboxFieldKt.d(this.f38387z, this.f38386A, ((Boolean) obj).booleanValue());
    }
}
