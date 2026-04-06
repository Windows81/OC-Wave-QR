package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

public final /* synthetic */ class h implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f38062A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f38063B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38064z;

    public /* synthetic */ h(String str, ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, boolean z2, Function0 function0, int i2) {
        this.f38064z = str;
        this.f38062A = immutableList;
        this.f38063B = function1;
        this.C = function12;
        this.D = function13;
        this.E = z2;
        this.F = function0;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return OptionsBottomSheetKt.k(this.f38064z, this.f38062A, this.f38063B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
