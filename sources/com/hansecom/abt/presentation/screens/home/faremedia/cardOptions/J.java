package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class J implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36600A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36601B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function0 I;
    public final /* synthetic */ Function0 J;
    public final /* synthetic */ Function0 K;
    public final /* synthetic */ Function0 L;
    public final /* synthetic */ Function0 M;
    public final /* synthetic */ Function0 N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardOptions.State f36602z;

    public /* synthetic */ J(CardOptions.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function0 function010, Function0 function011, Function0 function012, int i2, int i3) {
        this.f36602z = state;
        this.f36600A = function1;
        this.f36601B = flow;
        this.C = function0;
        this.D = function02;
        this.E = function03;
        this.F = function04;
        this.G = function05;
        this.H = function06;
        this.I = function07;
        this.J = function08;
        this.K = function09;
        this.L = function010;
        this.M = function011;
        this.N = function012;
        this.O = i2;
        this.P = i3;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return CardOptionsScreenKt.g(this.f36602z, this.f36600A, this.f36601B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (Composer) obj, intValue);
    }
}
