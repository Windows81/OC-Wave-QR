package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f35878A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f35879B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f35880z;

    public /* synthetic */ f(HomeViewModel homeViewModel, Function0 function0, int i2, int i3) {
        this.f35880z = homeViewModel;
        this.f35878A = function0;
        this.f35879B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return HomeScreenKt.B(this.f35880z, this.f35878A, this.f35879B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
