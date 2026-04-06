package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.material3.SheetState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class b implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SheetState f38052A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38053B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f38054z;

    public /* synthetic */ b(CoroutineScope coroutineScope, SheetState sheetState, Function0 function0) {
        this.f38054z = coroutineScope;
        this.f38052A = sheetState;
        this.f38053B = function0;
    }

    public final Object invoke() {
        return AbtBottomSheetKt.h(this.f38054z, this.f38052A, this.f38053B);
    }
}
