package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

public final /* synthetic */ class i implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38065A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f38066B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f38067z;

    public /* synthetic */ i(SheetState sheetState, String str, ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i2) {
        this.f38067z = sheetState;
        this.f38065A = str;
        this.f38066B = immutableList;
        this.C = function1;
        this.D = function12;
        this.E = function13;
        this.F = function0;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return OptionsBottomSheetKt.g(this.f38067z, this.f38065A, this.f38066B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
