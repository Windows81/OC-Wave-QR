package com.hansecom.abt.presentation.screens.main;

import android.content.Context;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class m implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f37693A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Context f37694B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37695z;

    public /* synthetic */ m(NavHostController navHostController, Object obj, Context context) {
        this.f37695z = navHostController;
        this.f37693A = obj;
        this.f37694B = context;
    }

    public final Object invoke(Object obj) {
        return MainNavigationKt.j(this.f37695z, this.f37693A, this.f37694B, (NavGraphBuilder) obj);
    }
}
