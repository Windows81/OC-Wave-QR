package com.hansecom.abt.presentation.screens.auth.welcome;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34673A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34674B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WelcomeViewModel f34675z;

    public /* synthetic */ a(WelcomeViewModel welcomeViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3) {
        this.f34675z = welcomeViewModel;
        this.f34673A = function0;
        this.f34674B = function02;
        this.C = function03;
        this.D = function04;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return WelcomeScreenKt.g(this.f34675z, this.f34673A, this.f34674B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
