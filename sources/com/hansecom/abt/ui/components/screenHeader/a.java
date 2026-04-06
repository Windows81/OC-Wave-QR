package com.hansecom.abt.ui.components.screenHeader;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f38780A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f38781B;
    public final /* synthetic */ long C;
    public final /* synthetic */ String D;
    public final /* synthetic */ CharSequence E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38782z;

    public /* synthetic */ a(Modifier modifier, PaddingValues paddingValues, long j2, long j3, String str, CharSequence charSequence, boolean z2, int i2, int i3) {
        this.f38782z = modifier;
        this.f38780A = paddingValues;
        this.f38781B = j2;
        this.C = j3;
        this.D = str;
        this.E = charSequence;
        this.F = z2;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ScreenHeaderKt.c(this.f38782z, this.f38780A, this.f38781B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
