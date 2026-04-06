package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class U implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38335A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38336B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Modifier F;
    public final /* synthetic */ String G;
    public final /* synthetic */ int H;
    public final /* synthetic */ KeyboardActions I;
    public final /* synthetic */ int J;
    public final /* synthetic */ FocusRequester K;
    public final /* synthetic */ ContentType L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38337z;

    public /* synthetic */ U(String str, Function1 function1, boolean z2, Function0 function0, int i2, String str2, Modifier modifier, String str3, int i3, KeyboardActions keyboardActions, int i4, FocusRequester focusRequester, ContentType contentType, int i5, int i6, int i7) {
        this.f38337z = str;
        this.f38335A = function1;
        this.f38336B = z2;
        this.C = function0;
        this.D = i2;
        this.E = str2;
        this.F = modifier;
        this.G = str3;
        this.H = i3;
        this.I = keyboardActions;
        this.J = i4;
        this.K = focusRequester;
        this.L = contentType;
        this.M = i5;
        this.N = i6;
        this.O = i7;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return PasswordOutlinedTextFieldKt.h(this.f38337z, this.f38335A, this.f38336B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (Composer) obj, intValue);
    }
}
