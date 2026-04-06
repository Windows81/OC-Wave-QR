package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.MutableState;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class J implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f37809A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SheetState f37810B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37811z;

    public /* synthetic */ J(Function1 function1, CoroutineScope coroutineScope, SheetState sheetState, MutableState mutableState) {
        this.f37811z = function1;
        this.f37809A = coroutineScope;
        this.f37810B = sheetState;
        this.C = mutableState;
    }

    public final Object invoke(Object obj) {
        return PaymentMethodSelectorKt$PaymentMethodSelector$4.h(this.f37811z, this.f37809A, this.f37810B, this.C, (PaymentMethodState) obj);
    }
}
