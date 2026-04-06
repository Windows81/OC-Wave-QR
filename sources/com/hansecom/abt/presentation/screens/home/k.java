package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f37407A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f37408B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37409z;

    public /* synthetic */ k(NavHostController navHostController, boolean z2, String str, Modifier modifier, int i2, int i3) {
        this.f37409z = navHostController;
        this.f37407A = z2;
        this.f37408B = str;
        this.C = modifier;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return HomeScreenKt.F(this.f37409z, this.f37407A, this.f37408B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
