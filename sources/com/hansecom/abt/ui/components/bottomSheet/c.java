package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38055A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f38056B;
    public final /* synthetic */ long C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ Function3 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f38057z;

    public /* synthetic */ c(SheetState sheetState, String str, long j2, long j3, Shape shape, Function2 function2, Function0 function0, Function3 function3, Function3 function32, int i2, int i3) {
        this.f38057z = sheetState;
        this.f38055A = str;
        this.f38056B = j2;
        this.C = j3;
        this.D = shape;
        this.E = function2;
        this.F = function0;
        this.G = function3;
        this.H = function32;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtBottomSheetKt.j(this.f38057z, this.f38055A, this.f38056B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
