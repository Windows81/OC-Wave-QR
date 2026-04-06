package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class q implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37489A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f37490B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f37491z;

    public /* synthetic */ q(boolean z2, NavHostController navHostController, boolean z3, boolean z4, boolean z5, Function0 function0, int i2) {
        this.f37491z = z2;
        this.f37489A = navHostController;
        this.f37490B = z3;
        this.C = z4;
        this.D = z5;
        this.E = function0;
        this.F = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return HomeScreenKt.x(this.f37491z, this.f37489A, this.f37490B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
