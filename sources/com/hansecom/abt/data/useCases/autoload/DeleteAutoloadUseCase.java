package com.hansecom.abt.data.useCases.autoload;

import com.hansecom.abt.data.managers.AutoloadManager;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DeleteAutoloadUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AutoloadRepository f33834a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33835b;

    /* renamed from: c  reason: collision with root package name */
    public final AutoloadManager f33836c;

    public DeleteAutoloadUseCase(AutoloadRepository autoloadRepository, FareMediaRepository fareMediaRepository, AutoloadManager autoloadManager) {
        Intrinsics.i(autoloadRepository, "autoloadRepository");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(autoloadManager, "autoloadManager");
        this.f33834a = autoloadRepository;
        this.f33835b = fareMediaRepository;
        this.f33836c = autoloadManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r11, long r12, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase$invoke$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase$invoke$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x007d
            if (r2 == r8) goto L_0x006b
            if (r2 == r7) goto L_0x005d
            if (r2 == r6) goto L_0x004c
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r11 = r0.C
            kotlin.ResultKt.b(r14)
            goto L_0x00df
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0041:
            java.lang.Object r11 = r0.D
            java.lang.Object r12 = r0.C
            com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase r12 = (com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase) r12
            kotlin.ResultKt.b(r14)
            goto L_0x00d0
        L_0x004c:
            java.lang.Object r11 = r0.E
            java.lang.Object r12 = r0.D
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.C
            com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase r13 = (com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase) r13
            kotlin.ResultKt.b(r14)
        L_0x0059:
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x00bf
        L_0x005d:
            java.lang.Object r11 = r0.E
            java.lang.Object r12 = r0.D
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.C
            com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase r13 = (com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase) r13
            kotlin.ResultKt.b(r14)
            goto L_0x00ae
        L_0x006b:
            java.lang.Object r11 = r0.D
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.C
            com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase r12 = (com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase) r12
            kotlin.ResultKt.b(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r13 = r14.j()
            goto L_0x0090
        L_0x007d:
            kotlin.ResultKt.b(r14)
            com.hansecom.abt.data.managers.AutoloadManager r14 = r10.f33836c
            r0.C = r10
            r0.D = r11
            r0.H = r8
            java.lang.Object r13 = r14.d(r11, r12, r0)
            if (r13 != r1) goto L_0x008f
            return r1
        L_0x008f:
            r12 = r10
        L_0x0090:
            boolean r14 = kotlin.Result.h(r13)
            if (r14 == 0) goto L_0x00e0
            r14 = r13
            com.hansecom.mapi.models.FareMediaAutoload r14 = (com.hansecom.mapi.models.FareMediaAutoload) r14
            com.hansecom.abt.data.repositories.AutoloadRepository r14 = r12.f33834a
            r0.C = r12
            r0.D = r11
            r0.E = r13
            r0.H = r7
            java.lang.Object r14 = r14.n(r11, r0)
            if (r14 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r9 = r12
            r12 = r11
            r11 = r13
            r13 = r9
        L_0x00ae:
            com.hansecom.abt.data.repositories.FareMediaRepository r14 = r13.f33835b
            r0.C = r13
            r0.D = r12
            r0.E = r11
            r0.H = r6
            java.lang.Object r14 = r14.D(r0)
            if (r14 != r1) goto L_0x0059
            return r1
        L_0x00bf:
            com.hansecom.abt.data.repositories.AutoloadRepository r14 = r12.f33834a
            r0.C = r12
            r0.D = r11
            r0.E = r3
            r0.H = r5
            java.lang.Object r13 = r14.o(r13, r0)
            if (r13 != r1) goto L_0x00d0
            return r1
        L_0x00d0:
            com.hansecom.abt.data.repositories.FareMediaRepository r12 = r12.f33835b
            r0.C = r11
            r0.D = r3
            r0.H = r4
            java.lang.Object r12 = r12.H(r0)
            if (r12 != r1) goto L_0x00df
            return r1
        L_0x00df:
            r13 = r11
        L_0x00e0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase.a(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
