package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class y implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38549A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38550B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38551z;

    public /* synthetic */ y(String str, Function0 function0, Modifier modifier, boolean z2, int i2, int i3) {
        this.f38551z = str;
        this.f38549A = function0;
        this.f38550B = modifier;
        this.C = z2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return OptionItemKt.c(this.f38551z, this.f38549A, this.f38550B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
