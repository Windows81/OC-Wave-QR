package com.hansecom.abt.presentation.screens.main.debugMenu;

import com.hansecom.abt.impl.Realm;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class m implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Realm f37654z;

    public /* synthetic */ m(Realm realm) {
        this.f37654z = realm;
    }

    public final Object invoke(Object obj) {
        return DebugMenuViewModel.A(this.f37654z, (DebugMenu.State) obj);
    }
}
