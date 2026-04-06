package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CheckFareMediaCardBalanceUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaManager f33890a;

    public CheckFareMediaCardBalanceUseCase(FareMediaManager fareMediaManager) {
        Intrinsics.i(fareMediaManager, "fareMediaManager");
        this.f33890a = fareMediaManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC, Splitter:B:26:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase$invoke$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase$invoke$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.j()
            goto L_0x007f
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r6 = r0.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.C
            com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase r7 = (com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase) r7
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            goto L_0x005f
        L_0x004c:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.data.managers.FareMediaManager r8 = r5.f33890a
            r0.C = r5
            r0.D = r6
            r0.G = r4
            java.lang.Object r8 = r8.h(r6, r7, r0)
            if (r8 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r7 = r5
        L_0x005f:
            java.lang.Throwable r2 = kotlin.Result.e(r8)
            if (r2 != 0) goto L_0x0077
            com.hansecom.mapi.models.FareMediumUsagePermission r8 = (com.hansecom.mapi.models.FareMediumUsagePermission) r8
            com.hansecom.abt.data.managers.FareMediaManager r7 = r7.f33890a
            r2 = 0
            r0.C = r2
            r0.D = r2
            r0.G = r3
            java.lang.Object r6 = r7.g(r6, r8, r0)
            if (r6 != r1) goto L_0x007f
            return r1
        L_0x0077:
            java.lang.Object r6 = kotlin.ResultKt.a(r2)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L_0x007f:
            java.lang.Throwable r7 = kotlin.Result.e(r6)
            if (r7 != 0) goto L_0x0086
            goto L_0x00b5
        L_0x0086:
            boolean r6 = r7 instanceof com.hansecom.abt.api.ApiException     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x009e
            r6 = r7
            com.hansecom.abt.api.ApiException r6 = (com.hansecom.abt.api.ApiException) r6     // Catch:{ all -> 0x009c }
            int r6 = r6.c()     // Catch:{ all -> 0x009c }
            r8 = 404(0x194, float:5.66E-43)
            if (r6 == r8) goto L_0x0096
            goto L_0x009e
        L_0x0096:
            com.hansecom.abt.data.useCases.fareMedia.CheckBalancePhysicalCardNumberInvalidException r6 = new com.hansecom.abt.data.useCases.fareMedia.CheckBalancePhysicalCardNumberInvalidException     // Catch:{ all -> 0x009c }
            r6.<init>()     // Catch:{ all -> 0x009c }
            throw r6     // Catch:{ all -> 0x009c }
        L_0x009c:
            r6 = move-exception
            goto L_0x00ab
        L_0x009e:
            boolean r6 = r7 instanceof com.hansecom.abt.api.ApiValidationException     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x00aa
            com.hansecom.abt.data.exceptions.FieldErrorsException r6 = new com.hansecom.abt.data.exceptions.FieldErrorsException     // Catch:{ all -> 0x009c }
            com.hansecom.abt.api.ApiValidationException r7 = (com.hansecom.abt.api.ApiValidationException) r7     // Catch:{ all -> 0x009c }
            r6.<init>(r7)     // Catch:{ all -> 0x009c }
            throw r6     // Catch:{ all -> 0x009c }
        L_0x00aa:
            throw r7     // Catch:{ all -> 0x009c }
        L_0x00ab:
            kotlin.Result$Companion r7 = kotlin.Result.f40519A
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L_0x00b5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
