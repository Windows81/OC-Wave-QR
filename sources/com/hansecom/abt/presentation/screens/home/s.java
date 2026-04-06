package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.MutableIntState;
import androidx.navigation.NavHostController;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37492A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableIntState f37493B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37494z;

    public /* synthetic */ s(List list, NavHostController navHostController, MutableIntState mutableIntState) {
        this.f37494z = list;
        this.f37492A = navHostController;
        this.f37493B = mutableIntState;
    }

    public final Object invoke(Object obj) {
        return HomeScreenKt$HomeBottomBar$4.h(this.f37494z, this.f37492A, this.f37493B, ((Integer) obj).intValue());
    }
}
