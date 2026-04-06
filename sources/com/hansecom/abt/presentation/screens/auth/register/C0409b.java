package com.hansecom.abt.presentation.screens.auth.register;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.auth.register.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0409b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34437A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Context f34438B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f34439z;

    public /* synthetic */ C0409b(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Context context, int i2) {
        this.f34439z = navBackStackEntry;
        this.f34437A = navHostController;
        this.f34438B = context;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return RegisterNavigationKt.g(this.f34439z, this.f34437A, this.f34438B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
