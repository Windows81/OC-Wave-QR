package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38017A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38018B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RowScope f38019z;

    public /* synthetic */ c(RowScope rowScope, boolean z2, Function0 function0, int i2, Modifier modifier, boolean z3, int i3, int i4, int i5) {
        this.f38019z = rowScope;
        this.f38017A = z2;
        this.f38018B = function0;
        this.C = i2;
        this.D = modifier;
        this.E = z3;
        this.F = i3;
        this.G = i4;
        this.H = i5;
    }

    public final Object m(Object obj, Object obj2) {
        return BottomBarKt.g(this.f38019z, this.f38017A, this.f38018B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
