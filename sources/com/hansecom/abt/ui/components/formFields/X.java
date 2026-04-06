package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class X implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38349A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38350B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ FocusRequester E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38351z;

    public /* synthetic */ X(String str, Function1 function1, int i2, Modifier modifier, boolean z2, FocusRequester focusRequester, int i3, int i4, int i5, int i6) {
        this.f38351z = str;
        this.f38349A = function1;
        this.f38350B = i2;
        this.C = modifier;
        this.D = z2;
        this.E = focusRequester;
        this.F = i3;
        this.G = i4;
        this.H = i5;
        this.I = i6;
    }

    public final Object m(Object obj, Object obj2) {
        return SearchTextFieldKt.e(this.f38351z, this.f38349A, this.f38350B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
