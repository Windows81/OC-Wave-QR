package com.hansecom.abt.data.useCases;

import android.graphics.Bitmap;
import com.hansecom.abt.data.managers.FareMediaManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetCashPaymentBarcodeUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaManager f33727a;

    public GetCashPaymentBarcodeUseCase(FareMediaManager fareMediaManager) {
        Intrinsics.i(fareMediaManager, "fareMediaManager");
        this.f33727a = fareMediaManager;
    }

    public static /* synthetic */ Object c(GetCashPaymentBarcodeUseCase getCashPaymentBarcodeUseCase, String str, int i2, int i3, int i4, int i5, Bitmap.Config config, Continuation continuation, int i6, Object obj) {
        return getCashPaymentBarcodeUseCase.b(str, i2, i3, (i6 & 8) != 0 ? -16777216 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? Bitmap.Config.ALPHA_8 : config, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r16, int r17, int r18, int r19, int r20, android.graphics.Bitmap.Config r21, kotlin.coroutines.Continuation r22) {
        /*
            r15 = this;
            r0 = r22
            boolean r1 = r0 instanceof com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase$invoke$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase$invoke$1 r1 = (com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase$invoke$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.E = r2
            r11 = r15
            goto L_0x001c
        L_0x0016:
            com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase$invoke$1 r1 = new com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase$invoke$1
            r11 = r15
            r1.<init>(r15, r0)
        L_0x001c:
            java.lang.Object r0 = r1.C
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.E
            r13 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r13) goto L_0x002d
            kotlin.ResultKt.b(r0)
            goto L_0x0059
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            kotlin.ResultKt.b(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.a()
            com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase$invoke$2 r14 = new com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase$invoke$2
            r10 = 0
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.E = r13
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r0, r14, r1)
            if (r0 != r12) goto L_0x0059
            return r12
        L_0x0059:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase.b(java.lang.String, int, int, int, int, android.graphics.Bitmap$Config, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
