package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f38014A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f38015B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Modifier F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f38016z;

    public /* synthetic */ b(int i2, List list, Function1 function1, boolean z2, boolean z3, Function0 function0, Modifier modifier, int i3, int i4) {
        this.f38016z = i2;
        this.f38014A = list;
        this.f38015B = function1;
        this.C = z2;
        this.D = z3;
        this.E = function0;
        this.F = modifier;
        this.G = i3;
        this.H = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return BottomBarKt.d(this.f38016z, this.f38014A, this.f38015B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
