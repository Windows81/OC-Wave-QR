package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PurchaseVirtualCardUseCase {

    /* renamed from: c  reason: collision with root package name */
    public static final int f33921c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaManager f33922a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33923b;

    public PurchaseVirtualCardUseCase(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        Intrinsics.i(fareMediaManager, "fareMediaManager");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        this.f33922a = fareMediaManager;
        this.f33923b = fareMediaRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r13, java.lang.Integer r14, java.lang.Long r15, java.math.BigDecimal r16, kotlin.coroutines.Continuation r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r17
            boolean r2 = r1 instanceof com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase$invoke$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase$invoke$1) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.G = r3
            goto L_0x001b
        L_0x0016:
            com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase$invoke$1
            r2.<init>(r12, r1)
        L_0x001b:
            java.lang.Object r1 = r2.E
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.G
            r10 = 3
            r11 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0056
            if (r3 == r4) goto L_0x0047
            if (r3 == r11) goto L_0x003c
            if (r3 != r10) goto L_0x0034
            java.lang.Object r2 = r2.C
            kotlin.ResultKt.b(r1)
            goto L_0x0096
        L_0x0034:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003c:
            java.lang.Object r3 = r2.D
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase r4 = (com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase) r4
            kotlin.ResultKt.b(r1)
            r1 = r3
            goto L_0x0085
        L_0x0047:
            java.lang.Object r3 = r2.C
            com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase r3 = (com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase) r3
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            r4 = r3
            goto L_0x006d
        L_0x0056:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.data.managers.FareMediaManager r3 = r0.f33922a
            r2.C = r0
            r2.G = r4
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r2
            java.lang.Object r1 = r3.l(r4, r5, r6, r7, r8)
            if (r1 != r9) goto L_0x006c
            return r9
        L_0x006c:
            r4 = r0
        L_0x006d:
            boolean r3 = kotlin.Result.h(r1)
            if (r3 == 0) goto L_0x0097
            r3 = r1
            com.hansecom.mapi.models.FareMedium r3 = (com.hansecom.mapi.models.FareMedium) r3
            com.hansecom.abt.data.repositories.FareMediaRepository r3 = r4.f33923b
            r2.C = r4
            r2.D = r1
            r2.G = r11
            java.lang.Object r3 = r3.D(r2)
            if (r3 != r9) goto L_0x0085
            return r9
        L_0x0085:
            com.hansecom.abt.data.repositories.FareMediaRepository r3 = r4.f33923b
            r2.C = r1
            r4 = 0
            r2.D = r4
            r2.G = r10
            java.lang.Object r2 = r3.G(r2)
            if (r2 != r9) goto L_0x0095
            return r9
        L_0x0095:
            r2 = r1
        L_0x0096:
            r1 = r2
        L_0x0097:
            java.lang.Object r1 = com.hansecom.abt.util.ResultExtKt.c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase.a(java.lang.String, java.lang.Integer, java.lang.Long, java.math.BigDecimal, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
