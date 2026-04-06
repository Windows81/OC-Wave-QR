package com.hansecom.abt.presentation.screens.home.barcode;

import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
public final class BarcodeDisplayViewModel extends MviViewModel<BarcodeDisplay.Action, BarcodeDisplay.State, BarcodeDisplay.Effect> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BarcodeDisplayViewModel(androidx.lifecycle.SavedStateHandle r16, com.hansecom.abt.data.useCases.GetVirtualCardFlowUseCase r17, com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase r18) {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r3)
            java.lang.String r3 = "getVirtualCardFlowUseCase"
            kotlin.jvm.internal.Intrinsics.i(r1, r3)
            java.lang.String r3 = "getValidAztecCodeFlowUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r3)
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay$State r3 = new com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay$State
            r13 = 7
            r14 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            r15.<init>(r0, r3)
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel$1
            r0 = 0
            r5.<init>(r1, r2, r15, r0)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r15
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.useCases.GetVirtualCardFlowUseCase, com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase):void");
    }

    /* renamed from: w */
    public Object o(BarcodeDisplay.Action action, Continuation continuation) {
        return Unit.f40552a;
    }
}
