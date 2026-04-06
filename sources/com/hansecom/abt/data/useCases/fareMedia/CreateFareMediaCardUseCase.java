package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CreateFareMediaCardUseCase {

    /* renamed from: c  reason: collision with root package name */
    public static final int f33896c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaManager f33897a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33898b;

    public CreateFareMediaCardUseCase(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        Intrinsics.i(fareMediaManager, "fareMediaManager");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        this.f33897a = fareMediaManager;
        this.f33898b = fareMediaRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase$invoke$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.C
            kotlin.Result r7 = (kotlin.Result) r7
            kotlin.ResultKt.b(r8)
            goto L_0x008d
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            java.lang.Object r7 = r0.D
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase r2 = (com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase) r2
            kotlin.ResultKt.b(r8)
            goto L_0x007d
        L_0x0047:
            java.lang.Object r7 = r0.C
            com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase r7 = (com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase) r7
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            r2 = r7
            goto L_0x0067
        L_0x0056:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.data.managers.FareMediaManager r8 = r6.f33897a
            r0.C = r6
            r0.G = r5
            java.lang.Object r8 = r8.e(r7, r0)
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r6
        L_0x0067:
            kotlin.Result r7 = kotlin.Result.a(r8)
            r7.j()
            com.hansecom.abt.data.repositories.FareMediaRepository r8 = r2.f33898b
            r0.C = r2
            r0.D = r7
            r0.G = r4
            java.lang.Object r8 = r8.D(r0)
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            com.hansecom.abt.data.repositories.FareMediaRepository r8 = r2.f33898b
            r0.C = r7
            r2 = 0
            r0.D = r2
            r0.G = r3
            java.lang.Object r8 = r8.G(r0)
            if (r8 != r1) goto L_0x008d
            return r1
        L_0x008d:
            java.lang.Object r7 = r7.j()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
