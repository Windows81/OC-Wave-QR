package com.hansecom.abt.ui.components.coupon;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class j implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38118A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38119B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Modifier F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ AbtButtonState I;
    public final /* synthetic */ int J;
    public final /* synthetic */ KeyboardActions K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38120z;

    public /* synthetic */ j(String str, String str2, boolean z2, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, String str3, String str4, AbtButtonState abtButtonState, int i2, KeyboardActions keyboardActions, int i3, int i4, int i5) {
        this.f38120z = str;
        this.f38118A = str2;
        this.f38119B = z2;
        this.C = function1;
        this.D = function0;
        this.E = function02;
        this.F = modifier;
        this.G = str3;
        this.H = str4;
        this.I = abtButtonState;
        this.J = i2;
        this.K = keyboardActions;
        this.L = i3;
        this.M = i4;
        this.N = i5;
    }

    public final Object m(Object obj, Object obj2) {
        return CouponFieldKt.c(this.f38120z, this.f38118A, this.f38119B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (Composer) obj, ((Integer) obj2).intValue());
    }
}
