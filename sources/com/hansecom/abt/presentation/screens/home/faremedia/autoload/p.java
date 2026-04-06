package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class p implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Autoload.Action f36289z;

    public /* synthetic */ p(Autoload.Action action) {
        this.f36289z = action;
    }

    public final Object invoke(Object obj) {
        return AutoloadViewModel.G(this.f36289z, (Autoload.State) obj);
    }
}
