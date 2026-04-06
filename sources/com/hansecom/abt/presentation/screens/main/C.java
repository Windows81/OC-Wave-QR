package com.hansecom.abt.presentation.screens.main;

import com.hansecom.abt.data.useCases.appUpdate.AppUpdate;
import com.hansecom.abt.presentation.screens.main.Main;
import com.hansecom.abt.presentation.screens.main.MainViewModel;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class C implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppUpdate f37525z;

    public /* synthetic */ C(AppUpdate appUpdate) {
        this.f37525z = appUpdate;
    }

    public final Object invoke(Object obj) {
        return MainViewModel.AnonymousClass3.C(this.f37525z, (Main.State) obj);
    }
}
