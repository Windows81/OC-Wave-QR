package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class q implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38529A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38530B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38531z;

    public /* synthetic */ q(String str, Modifier modifier, boolean z2, int i2, int i3) {
        this.f38531z = str;
        this.f38529A = modifier;
        this.f38530B = z2;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemKt.j(this.f38531z, this.f38529A, this.f38530B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
