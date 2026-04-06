package com.hansecom.abt.presentation.screens.main.debugMenu;

import com.hansecom.abt.impl.Realm;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class n implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Realm f37655A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DebugMenuViewModel f37656z;

    public /* synthetic */ n(DebugMenuViewModel debugMenuViewModel, Realm realm) {
        this.f37656z = debugMenuViewModel;
        this.f37655A = realm;
    }

    public final Object invoke(Object obj) {
        return DebugMenuViewModel.AnonymousClass1.C(this.f37656z, this.f37655A, (DebugMenu.State) obj);
    }
}
