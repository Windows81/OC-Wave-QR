package com.hansecom.abt.presentation.screens.main;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class l implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Context f37660A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f37661B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37662z;

    public /* synthetic */ l(NavHostController navHostController, Context context, Object obj, Object obj2, int i2) {
        this.f37662z = navHostController;
        this.f37660A = context;
        this.f37661B = obj;
        this.C = obj2;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return MainNavigationKt.k(this.f37662z, this.f37660A, this.f37661B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
