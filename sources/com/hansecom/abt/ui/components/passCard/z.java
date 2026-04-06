package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class z implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f38652A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCardState f38653z;

    public /* synthetic */ z(PassCardState passCardState, int i2) {
        this.f38653z = passCardState;
        this.f38652A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PassCardStatusKt.j(this.f38653z, this.f38652A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
