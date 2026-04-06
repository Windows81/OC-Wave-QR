package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38373A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38374B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ VisualTransformation F;
    public final /* synthetic */ FocusRequester G;
    public final /* synthetic */ int H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38375z;

    public /* synthetic */ d0(String str, Function1 function1, Modifier modifier, String str2, String str3, boolean z2, VisualTransformation visualTransformation, FocusRequester focusRequester, int i2, boolean z3, int i3, int i4) {
        this.f38375z = str;
        this.f38373A = function1;
        this.f38374B = modifier;
        this.C = str2;
        this.D = str3;
        this.E = z2;
        this.F = visualTransformation;
        this.G = focusRequester;
        this.H = i2;
        this.I = z3;
        this.J = i3;
        this.K = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return ValueFieldKt.c(this.f38375z, this.f38373A, this.f38374B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (Composer) obj, ((Integer) obj2).intValue());
    }
}
