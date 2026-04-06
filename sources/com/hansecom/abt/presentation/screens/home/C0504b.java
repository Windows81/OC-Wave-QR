package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0504b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f35838A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35839z;

    public /* synthetic */ C0504b(NavHostController navHostController, int i2) {
        this.f35839z = navHostController;
        this.f35838A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return HomeNavigationKt.d(this.f35839z, this.f35838A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
