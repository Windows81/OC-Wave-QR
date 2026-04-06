package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.material3.SheetState;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class k implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f37349A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SheetState f37350B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37351z;

    public /* synthetic */ k(Function1 function1, CoroutineScope coroutineScope, SheetState sheetState, Function0 function0) {
        this.f37351z = function1;
        this.f37349A = coroutineScope;
        this.f37350B = sheetState;
        this.C = function0;
    }

    public final Object invoke(Object obj) {
        return FareMediaSelectorKt$FareMediaSelectorBottomSheet$1.f(this.f37351z, this.f37349A, this.f37350B, this.C, (PaymentMethodState.FareMedia) obj);
    }
}
