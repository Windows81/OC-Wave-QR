package com.hansecom.abt.presentation.screens.main;

import android.content.Context;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class k implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37657A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f37658B;
    public final /* synthetic */ Context C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f37659z;

    public /* synthetic */ k(Object obj, NavHostController navHostController, Object obj2, Context context) {
        this.f37659z = obj;
        this.f37657A = navHostController;
        this.f37658B = obj2;
        this.C = context;
    }

    public final Object invoke(Object obj) {
        return MainNavigationKt.i(this.f37659z, this.f37657A, this.f37658B, this.C, (NavGraphBuilder) obj);
    }
}
