package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareCappingRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RefreshFareMediaDataUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaTransferTimeRepository f33926a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33927b;

    /* renamed from: c  reason: collision with root package name */
    public final FareCappingRepository f33928c;

    public RefreshFareMediaDataUseCase(FareMediaTransferTimeRepository fareMediaTransferTimeRepository, FareMediaRepository fareMediaRepository, FareCappingRepository fareCappingRepository) {
        Intrinsics.i(fareMediaTransferTimeRepository, "fareMediaTransferTimeRepository");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(fareCappingRepository, "fareCappingRepository");
        this.f33926a = fareMediaTransferTimeRepository;
        this.f33927b = fareMediaRepository;
        this.f33928c = fareCappingRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r6)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2 r6 = new com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.E = r3
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.f(r6, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
