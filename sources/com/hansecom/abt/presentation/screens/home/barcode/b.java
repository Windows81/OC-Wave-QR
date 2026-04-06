package com.hansecom.abt.presentation.screens.home.barcode;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35857A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35858B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BarcodeDisplay.State f35859z;

    public /* synthetic */ b(BarcodeDisplay.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2, int i3) {
        this.f35859z = state;
        this.f35857A = function1;
        this.f35858B = flow;
        this.C = function0;
        this.D = function02;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BarcodeDisplayScreenKt.j(this.f35859z, this.f35857A, this.f35858B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
