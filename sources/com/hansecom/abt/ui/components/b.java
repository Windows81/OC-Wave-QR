package com.hansecom.abt.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f37949A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f37950B;
    public final /* synthetic */ long C;
    public final /* synthetic */ FontStyle D;
    public final /* synthetic */ FontWeight E;
    public final /* synthetic */ FontFamily F;
    public final /* synthetic */ long G;
    public final /* synthetic */ TextDecoration H;
    public final /* synthetic */ TextAlign I;
    public final /* synthetic */ long J;
    public final /* synthetic */ int K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ Function1 O;
    public final /* synthetic */ TextStyle P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CharSequence f37951z;

    public /* synthetic */ b(CharSequence charSequence, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Function1 function1, TextStyle textStyle, int i5, int i6, int i7) {
        this.f37951z = charSequence;
        this.f37949A = modifier;
        this.f37950B = j2;
        this.C = j3;
        this.D = fontStyle;
        this.E = fontWeight;
        this.F = fontFamily;
        this.G = j4;
        this.H = textDecoration;
        this.I = textAlign;
        this.J = j5;
        this.K = i2;
        this.L = z2;
        this.M = i3;
        this.N = i4;
        this.O = function1;
        this.P = textStyle;
        this.Q = i5;
        this.R = i6;
        this.S = i7;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return AbtTextKt.e(this.f37951z, this.f37949A, this.f37950B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (Composer) obj, intValue);
    }
}
