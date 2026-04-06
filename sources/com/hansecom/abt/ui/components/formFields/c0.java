package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38369A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f38370B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ String E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ FocusRequester H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ KeyboardActions L;
    public final /* synthetic */ VisualTransformation M;
    public final /* synthetic */ Function2 N;
    public final /* synthetic */ ContentType O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38371z;

    public /* synthetic */ c0(String str, Function1 function1, String str2, String str3, Modifier modifier, String str4, boolean z2, boolean z3, FocusRequester focusRequester, int i2, int i3, int i4, KeyboardActions keyboardActions, VisualTransformation visualTransformation, Function2 function2, ContentType contentType, int i5, int i6, int i7) {
        this.f38371z = str;
        this.f38369A = function1;
        this.f38370B = str2;
        this.C = str3;
        this.D = modifier;
        this.E = str4;
        this.F = z2;
        this.G = z3;
        this.H = focusRequester;
        this.I = i2;
        this.J = i3;
        this.K = i4;
        this.L = keyboardActions;
        this.M = visualTransformation;
        this.N = function2;
        this.O = contentType;
        this.P = i5;
        this.Q = i6;
        this.R = i7;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return ValidatedOutlinedTextFieldKt.i(this.f38371z, this.f38369A, this.f38370B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (Composer) obj, intValue);
    }
}
