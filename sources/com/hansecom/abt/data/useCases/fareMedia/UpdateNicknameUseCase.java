package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UpdateNicknameUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaManager f33944a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33945b;

    public UpdateNicknameUseCase(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        Intrinsics.i(fareMediaManager, "fareMediaManager");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        this.f33944a = fareMediaManager;
        this.f33945b = fareMediaRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095 A[SYNTHETIC, Splitter:B:32:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase$invoke$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase$invoke$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.C
            kotlin.ResultKt.b(r10)
            goto L_0x008d
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            java.lang.Object r8 = r0.D
            java.lang.Object r9 = r0.C
            com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase r9 = (com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase) r9
            kotlin.ResultKt.b(r10)
            goto L_0x007d
        L_0x0043:
            java.lang.Object r8 = r0.C
            com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase r8 = (com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase) r8
            kotlin.ResultKt.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r9 = r10.j()
            goto L_0x0062
        L_0x0051:
            kotlin.ResultKt.b(r10)
            com.hansecom.abt.data.managers.FareMediaManager r10 = r7.f33944a
            r0.C = r7
            r0.G = r5
            java.lang.Object r9 = r10.q(r8, r9, r0)
            if (r9 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r8 = r7
        L_0x0062:
            boolean r10 = kotlin.Result.h(r9)
            if (r10 == 0) goto L_0x008e
            r10 = r9
            com.hansecom.mapi.models.FareMedium r10 = (com.hansecom.mapi.models.FareMedium) r10
            com.hansecom.abt.data.repositories.FareMediaRepository r10 = r8.f33945b
            r0.C = r8
            r0.D = r9
            r0.G = r4
            java.lang.Object r10 = r10.D(r0)
            if (r10 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x007d:
            com.hansecom.abt.data.repositories.FareMediaRepository r9 = r9.f33945b
            r0.C = r8
            r10 = 0
            r0.D = r10
            r0.G = r3
            java.lang.Object r9 = r9.G(r0)
            if (r9 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r9 = r8
        L_0x008e:
            java.lang.Throwable r8 = kotlin.Result.e(r9)
            if (r8 != 0) goto L_0x0095
            goto L_0x00ae
        L_0x0095:
            boolean r9 = r8 instanceof com.hansecom.abt.api.ApiValidationException     // Catch:{ all -> 0x00a1 }
            if (r9 == 0) goto L_0x00a3
            com.hansecom.abt.data.exceptions.FieldErrorsException r9 = new com.hansecom.abt.data.exceptions.FieldErrorsException     // Catch:{ all -> 0x00a1 }
            com.hansecom.abt.api.ApiValidationException r8 = (com.hansecom.abt.api.ApiValidationException) r8     // Catch:{ all -> 0x00a1 }
            r9.<init>(r8)     // Catch:{ all -> 0x00a1 }
            throw r9     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r8 = move-exception
            goto L_0x00a4
        L_0x00a3:
            throw r8     // Catch:{ all -> 0x00a1 }
        L_0x00a4:
            kotlin.Result$Companion r9 = kotlin.Result.f40519A
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
            java.lang.Object r9 = kotlin.Result.b(r8)
        L_0x00ae:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
