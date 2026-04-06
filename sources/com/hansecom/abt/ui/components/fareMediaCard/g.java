package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38238A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38239B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38240z;

    public /* synthetic */ g(Modifier modifier, boolean z2, int i2, int i3) {
        this.f38240z = modifier;
        this.f38238A = z2;
        this.f38239B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return LockedBadgeKt.c(this.f38240z, this.f38238A, this.f38239B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
