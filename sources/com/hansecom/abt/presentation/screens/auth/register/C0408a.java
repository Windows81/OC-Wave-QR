package com.hansecom.abt.presentation.screens.auth.register;

import android.content.Context;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function1;

/* renamed from: com.hansecom.abt.presentation.screens.auth.register.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0408a implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f34434A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34435B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f34436z;

    public /* synthetic */ C0408a(Context context, NavBackStackEntry navBackStackEntry, NavHostController navHostController) {
        this.f34436z = context;
        this.f34434A = navBackStackEntry;
        this.f34435B = navHostController;
    }

    public final Object invoke(Object obj) {
        return RegisterNavigationKt.e(this.f34436z, this.f34434A, this.f34435B, (NavGraphBuilder) obj);
    }
}
