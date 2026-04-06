package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class n implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38522A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38523B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RowScope f38524z;

    public /* synthetic */ n(RowScope rowScope, String str, Modifier modifier, int i2, int i3) {
        this.f38524z = rowScope;
        this.f38522A = str;
        this.f38523B = modifier;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemKt.p(this.f38524z, this.f38522A, this.f38523B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
