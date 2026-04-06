package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransferFareMediaCardUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaManager f33932a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33933b;

    public TransferFareMediaCardUseCase(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        Intrinsics.i(fareMediaManager, "fareMediaManager");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        this.f33932a = fareMediaManager;
        this.f33933b = fareMediaRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase$invoke$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            kotlin.Result r0 = (kotlin.Result) r0
            kotlin.ResultKt.b(r7)
            goto L_0x008f
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            java.lang.Object r2 = r0.D
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r4 = r0.C
            com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase r4 = (com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase) r4
            kotlin.ResultKt.b(r7)
            r7 = r2
            goto L_0x007e
        L_0x0048:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase r2 = (com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase) r2
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0067
        L_0x0056:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.data.managers.FareMediaManager r7 = r6.f33932a
            r0.C = r6
            r0.G = r5
            java.lang.Object r7 = r7.n(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r6
        L_0x0067:
            kotlin.Result r7 = kotlin.Result.a(r7)
            r7.j()
            com.hansecom.abt.data.repositories.FareMediaRepository r5 = r2.f33933b
            r0.C = r2
            r0.D = r7
            r0.G = r4
            java.lang.Object r4 = r5.D(r0)
            if (r4 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r4 = r2
        L_0x007e:
            com.hansecom.abt.data.repositories.FareMediaRepository r2 = r4.f33933b
            r0.C = r7
            r4 = 0
            r0.D = r4
            r0.G = r3
            java.lang.Object r0 = r2.G(r0)
            if (r0 != r1) goto L_0x008e
            return r1
        L_0x008e:
            r0 = r7
        L_0x008f:
            java.lang.Object r7 = r0.j()
            java.lang.Object r7 = com.hansecom.abt.util.ResultExtKt.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
