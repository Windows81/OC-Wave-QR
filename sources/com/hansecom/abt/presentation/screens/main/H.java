package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class H implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f37547A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37548B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37549z;

    public /* synthetic */ H(NavHostController navHostController, Object obj, int i2) {
        this.f37549z = navHostController;
        this.f37547A = obj;
        this.f37548B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PriorityNavigationKt.i(this.f37549z, this.f37547A, this.f37548B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
