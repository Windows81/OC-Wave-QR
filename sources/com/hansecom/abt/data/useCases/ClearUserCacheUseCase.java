package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.preferences.LockPreferences;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareCappingRepository;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository;
import com.hansecom.abt.data.repositories.InstitutionsRepository;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ClearUserCacheUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaPassesToOfferRepository f33700a;

    /* renamed from: b  reason: collision with root package name */
    public final CardHistoryRepository f33701b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaPassesRepository f33702c;

    /* renamed from: d  reason: collision with root package name */
    public final FareMediaRepository f33703d;

    /* renamed from: e  reason: collision with root package name */
    public final FareCappingRepository f33704e;

    /* renamed from: f  reason: collision with root package name */
    public final FareMediaConfigRepository f33705f;

    /* renamed from: g  reason: collision with root package name */
    public final FareMediaTransferTimeRepository f33706g;

    /* renamed from: h  reason: collision with root package name */
    public final InstitutionsRepository f33707h;

    /* renamed from: i  reason: collision with root package name */
    public final PaymentMethodsRepository f33708i;

    /* renamed from: j  reason: collision with root package name */
    public final UserRepository f33709j;

    /* renamed from: k  reason: collision with root package name */
    public final LockPreferences f33710k;

    public ClearUserCacheUseCase(FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository, CardHistoryRepository cardHistoryRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaRepository fareMediaRepository, FareCappingRepository fareCappingRepository, FareMediaConfigRepository fareMediaConfigRepository, FareMediaTransferTimeRepository fareMediaTransferTimeRepository, InstitutionsRepository institutionsRepository, PaymentMethodsRepository paymentMethodsRepository, UserRepository userRepository, LockPreferences lockPreferences) {
        Intrinsics.i(fareMediaPassesToOfferRepository, "fareMediaPassesToOfferRepository");
        Intrinsics.i(cardHistoryRepository, "cardHistRepository");
        Intrinsics.i(fareMediaPassesRepository, "fareMediaPassesRepository");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(fareCappingRepository, "fareCappingRepository");
        Intrinsics.i(fareMediaConfigRepository, "fareMediaConfigRepository");
        Intrinsics.i(fareMediaTransferTimeRepository, "fareMediaTransferTimeRepository");
        Intrinsics.i(institutionsRepository, "institutionsRepository");
        Intrinsics.i(paymentMethodsRepository, "paymentMethodsRepository");
        Intrinsics.i(userRepository, "userRepository");
        Intrinsics.i(lockPreferences, "lockPreferences");
        this.f33700a = fareMediaPassesToOfferRepository;
        this.f33701b = cardHistoryRepository;
        this.f33702c = fareMediaPassesRepository;
        this.f33703d = fareMediaRepository;
        this.f33704e = fareCappingRepository;
        this.f33705f = fareMediaConfigRepository;
        this.f33706g = fareMediaTransferTimeRepository;
        this.f33707h = institutionsRepository;
        this.f33708i = paymentMethodsRepository;
        this.f33709j = userRepository;
        this.f33710k = lockPreferences;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r6 = r2.f33703d;
        r0.C = r2;
        r0.F = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        if (r6.f(r0) != r1) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c1, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        r6 = r2.f33705f;
        r0.C = r2;
        r0.F = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
        if (r6.b(r0) != r1) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cf, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        r6 = r2.f33706g;
        r0.C = r2;
        r0.F = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00db, code lost:
        if (r6.b(r0) != r1) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        r6 = r2.f33707h;
        r0.C = r2;
        r0.F = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e9, code lost:
        if (r6.f(r0) != r1) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        r6 = r2.f33708i;
        r0.C = r2;
        r0.F = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
        if (r6.f(r0) != r1) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f9, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fa, code lost:
        r6 = r2.f33702c;
        r0.C = r2;
        r0.F = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0105, code lost:
        if (r6.b(r0) != r1) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0107, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        r6 = r2.f33701b;
        r0.C = r2;
        r0.F = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0114, code lost:
        if (r6.b(r0) != r1) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0116, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0117, code lost:
        r6 = r2.f33700a;
        r0.C = r2;
        r0.F = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0123, code lost:
        if (r6.b(r0) != r1) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
        r6 = r2.f33704e;
        r0.C = r2;
        r0.F = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        if (r6.b(r0) != r1) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0134, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0135, code lost:
        r6 = r2.f33710k;
        r0.C = r2;
        r0.F = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0141, code lost:
        if (r6.l(false, r0) != r1) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0143, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
        r6 = r2.f33710k;
        r0.C = r2;
        r0.F = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0150, code lost:
        if (r6.m(false, r0) != r1) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0152, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        r6 = r2.f33710k;
        r0.C = null;
        r0.F = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0160, code lost:
        if (r6.i((java.time.LocalDateTime) null, r0) != r1) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0162, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        return kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.data.useCases.ClearUserCacheUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase$invoke$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.ClearUserCacheUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0091;
                case 2: goto L_0x0089;
                case 3: goto L_0x0081;
                case 4: goto L_0x0079;
                case 5: goto L_0x0070;
                case 6: goto L_0x0067;
                case 7: goto L_0x005e;
                case 8: goto L_0x0055;
                case 9: goto L_0x004c;
                case 10: goto L_0x0043;
                case 11: goto L_0x003a;
                case 12: goto L_0x0031;
                case 13: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002c:
            kotlin.ResultKt.b(r6)
            goto L_0x0163
        L_0x0031:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x0153
        L_0x003a:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x0144
        L_0x0043:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x0135
        L_0x004c:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x0126
        L_0x0055:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x0117
        L_0x005e:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x0108
        L_0x0067:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x00fa
        L_0x0070:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x00ec
        L_0x0079:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x00de
        L_0x0081:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x00d0
        L_0x0089:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x00c2
        L_0x0091:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.ClearUserCacheUseCase r2 = (com.hansecom.abt.data.useCases.ClearUserCacheUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x00b4
        L_0x0099:
            kotlin.ResultKt.b(r6)
            timber.log.Timber$Forest r6 = timber.log.Timber.f44337a
            java.lang.String r2 = "Clearing cache"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r6.a(r2, r4)
            com.hansecom.abt.data.repositories.UserRepository r6 = r5.f33709j
            r0.C = r5
            r2 = 1
            r0.F = r2
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            r2 = r5
        L_0x00b4:
            com.hansecom.abt.data.repositories.FareMediaRepository r6 = r2.f33703d
            r0.C = r2
            r4 = 2
            r0.F = r4
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L_0x00c2
            return r1
        L_0x00c2:
            com.hansecom.abt.data.repositories.FareMediaConfigRepository r6 = r2.f33705f
            r0.C = r2
            r4 = 3
            r0.F = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L_0x00d0
            return r1
        L_0x00d0:
            com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository r6 = r2.f33706g
            r0.C = r2
            r4 = 4
            r0.F = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L_0x00de
            return r1
        L_0x00de:
            com.hansecom.abt.data.repositories.InstitutionsRepository r6 = r2.f33707h
            r0.C = r2
            r4 = 5
            r0.F = r4
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L_0x00ec
            return r1
        L_0x00ec:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r6 = r2.f33708i
            r0.C = r2
            r4 = 6
            r0.F = r4
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L_0x00fa
            return r1
        L_0x00fa:
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r6 = r2.f33702c
            r0.C = r2
            r4 = 7
            r0.F = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L_0x0108
            return r1
        L_0x0108:
            com.hansecom.abt.data.repositories.CardHistoryRepository r6 = r2.f33701b
            r0.C = r2
            r4 = 8
            r0.F = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L_0x0117
            return r1
        L_0x0117:
            com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository r6 = r2.f33700a
            r0.C = r2
            r4 = 9
            r0.F = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L_0x0126
            return r1
        L_0x0126:
            com.hansecom.abt.data.repositories.FareCappingRepository r6 = r2.f33704e
            r0.C = r2
            r4 = 10
            r0.F = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L_0x0135
            return r1
        L_0x0135:
            com.hansecom.abt.data.preferences.LockPreferences r6 = r2.f33710k
            r0.C = r2
            r4 = 11
            r0.F = r4
            java.lang.Object r6 = r6.l(r3, r0)
            if (r6 != r1) goto L_0x0144
            return r1
        L_0x0144:
            com.hansecom.abt.data.preferences.LockPreferences r6 = r2.f33710k
            r0.C = r2
            r4 = 12
            r0.F = r4
            java.lang.Object r6 = r6.m(r3, r0)
            if (r6 != r1) goto L_0x0153
            return r1
        L_0x0153:
            com.hansecom.abt.data.preferences.LockPreferences r6 = r2.f33710k
            r2 = 0
            r0.C = r2
            r3 = 13
            r0.F = r3
            java.lang.Object r6 = r6.i(r2, r0)
            if (r6 != r1) goto L_0x0163
            return r1
        L_0x0163:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.ClearUserCacheUseCase.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
