package com.hansecom.abt.presentation.screens.home;

import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.hansecom.abt.presentation.main.MainActivity;
import kotlin.jvm.functions.Function1;

/* renamed from: com.hansecom.abt.presentation.screens.home.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0505c implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MainActivity f35875A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35876z;

    public /* synthetic */ C0505c(NavHostController navHostController, MainActivity mainActivity) {
        this.f35876z = navHostController;
        this.f35875A = mainActivity;
    }

    public final Object invoke(Object obj) {
        return HomeNavigationKt$HomeNavigation$1.e(this.f35876z, this.f35875A, (NavGraphBuilder) obj);
    }
}
