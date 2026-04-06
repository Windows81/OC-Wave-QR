package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.ui.components.formFields.i  reason: case insensitive filesystem */
public final /* synthetic */ class C0642i implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38388A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38389B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CharSequence f38390z;

    public /* synthetic */ C0642i(CharSequence charSequence, String str, boolean z2, Function1 function1, Modifier modifier, int i2, int i3) {
        this.f38390z = charSequence;
        this.f38388A = str;
        this.f38389B = z2;
        this.C = function1;
        this.D = modifier;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return CheckboxFieldKt.e(this.f38390z, this.f38388A, this.f38389B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
