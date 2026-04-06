package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38232A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38233B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38234z;

    public /* synthetic */ e(Modifier modifier, boolean z2, int i2, int i3) {
        this.f38234z = modifier;
        this.f38232A = z2;
        this.f38233B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaMockCardKt.c(this.f38234z, this.f38232A, this.f38233B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
