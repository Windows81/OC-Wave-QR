package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.ui.components.formFields.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0638e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38376A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38377B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Function2 L;
    public final /* synthetic */ VisualTransformation M;
    public final /* synthetic */ KeyboardOptions N;
    public final /* synthetic */ KeyboardActions O;
    public final /* synthetic */ boolean P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ MutableInteractionSource S;
    public final /* synthetic */ Shape T;
    public final /* synthetic */ ContentType U;
    public final /* synthetic */ int V;
    public final /* synthetic */ int W;
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38378z;

    public /* synthetic */ C0638e(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, String str2, String str3, String str4, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, ContentType contentType, int i4, int i5, int i6, int i7) {
        this.f38378z = str;
        this.f38376A = function1;
        this.f38377B = modifier;
        this.C = z2;
        this.D = z3;
        this.E = str2;
        this.F = str3;
        this.G = str4;
        this.H = function2;
        this.I = function22;
        this.J = function23;
        this.K = function24;
        this.L = function25;
        this.M = visualTransformation;
        this.N = keyboardOptions;
        this.O = keyboardActions;
        this.P = z4;
        this.Q = i2;
        this.R = i3;
        this.S = mutableInteractionSource;
        this.T = shape;
        this.U = contentType;
        this.V = i4;
        this.W = i5;
        this.X = i6;
        this.Y = i7;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return AbtOutlineTextFieldKt.g(this.f38378z, this.f38376A, this.f38377B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, (Composer) obj, intValue);
    }
}
