package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38366A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38367B;
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
    public final /* synthetic */ String f38368z;

    public /* synthetic */ b0(String str, Function1 function1, int i2, String str2, Modifier modifier, String str3, boolean z2, boolean z3, FocusRequester focusRequester, int i3, int i4, int i5, KeyboardActions keyboardActions, VisualTransformation visualTransformation, Function2 function2, ContentType contentType, int i6, int i7, int i8) {
        this.f38368z = str;
        this.f38366A = function1;
        this.f38367B = i2;
        this.C = str2;
        this.D = modifier;
        this.E = str3;
        this.F = z2;
        this.G = z3;
        this.H = focusRequester;
        this.I = i3;
        this.J = i4;
        this.K = i5;
        this.L = keyboardActions;
        this.M = visualTransformation;
        this.N = function2;
        this.O = contentType;
        this.P = i6;
        this.Q = i7;
        this.R = i8;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return ValidatedOutlinedTextFieldKt.g(this.f38368z, this.f38366A, this.f38367B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (Composer) obj, intValue);
    }
}
