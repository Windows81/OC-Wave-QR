package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class x implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f38546A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38547B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38548z;

    public /* synthetic */ x(Modifier modifier, Function3 function3, int i2, int i3) {
        this.f38548z = modifier;
        this.f38546A = function3;
        this.f38547B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemListKt.m(this.f38548z, this.f38546A, this.f38547B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
