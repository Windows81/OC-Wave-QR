package com.hansecom.abt.util;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f39052z;

    public /* synthetic */ i(Placeable placeable) {
        this.f39052z = placeable;
    }

    public final Object invoke(Object obj) {
        return ModifierExtKt.e(this.f39052z, (Placeable.PlacementScope) obj);
    }
}
