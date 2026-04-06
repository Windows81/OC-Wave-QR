package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34318A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f34319B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f34320z;

    public /* synthetic */ d(LoginViewModel loginViewModel, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, int i2, int i3) {
        this.f34320z = loginViewModel;
        this.f34318A = function0;
        this.f34319B = function1;
        this.C = function02;
        this.D = function03;
        this.E = function04;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return LoginScreenKt.l(this.f34320z, this.f34318A, this.f34319B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
