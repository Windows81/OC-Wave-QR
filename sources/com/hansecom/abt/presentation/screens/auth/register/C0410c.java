package com.hansecom.abt.presentation.screens.auth.register;

import android.content.Context;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function1;

/* renamed from: com.hansecom.abt.presentation.screens.auth.register.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0410c implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f34440A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34441B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f34442z;

    public /* synthetic */ C0410c(Context context, NavBackStackEntry navBackStackEntry, NavHostController navHostController) {
        this.f34442z = context;
        this.f34440A = navBackStackEntry;
        this.f34441B = navHostController;
    }

    public final Object invoke(Object obj) {
        return RegisterNavigationKt.f(this.f34442z, this.f34440A, this.f34441B, (NavGraphBuilder) obj);
    }
}
