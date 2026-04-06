package com.hansecom.abt.data.useCases.auth;

import com.hansecom.abt.api.RealmPreferences;
import com.hansecom.abt.api.oauth.OAuthService;
import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LogInUseCase {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f33794e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f33795f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final OAuthService f33796a;

    /* renamed from: b  reason: collision with root package name */
    public final AuthenticationPreferences f33797b;

    /* renamed from: c  reason: collision with root package name */
    public final SetShownUserBiometricDialogUseCase f33798c;

    /* renamed from: d  reason: collision with root package name */
    public final RealmPreferences f33799d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LogInUseCase(OAuthService oAuthService, AuthenticationPreferences authenticationPreferences, SetShownUserBiometricDialogUseCase setShownUserBiometricDialogUseCase, RealmPreferences realmPreferences) {
        Intrinsics.i(oAuthService, "oAuthService");
        Intrinsics.i(authenticationPreferences, "authenticationPreferences");
        Intrinsics.i(setShownUserBiometricDialogUseCase, "setShownUserBiometricDialogUseCase");
        Intrinsics.i(realmPreferences, "realmPreferences");
        this.f33796a = oAuthService;
        this.f33797b = authenticationPreferences;
        this.f33798c = setShownUserBiometricDialogUseCase;
        this.f33799d = realmPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r15, java.lang.String r16, kotlin.coroutines.Continuation r17) {
        /*
            r14 = this;
            r6 = r14
            r0 = r17
            boolean r1 = r0 instanceof com.hansecom.abt.data.useCases.auth.LogInUseCase$invoke$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.hansecom.abt.data.useCases.auth.LogInUseCase$invoke$1 r1 = (com.hansecom.abt.data.useCases.auth.LogInUseCase$invoke$1) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.H = r2
        L_0x0015:
            r7 = r1
            goto L_0x001d
        L_0x0017:
            com.hansecom.abt.data.useCases.auth.LogInUseCase$invoke$1 r1 = new com.hansecom.abt.data.useCases.auth.LogInUseCase$invoke$1
            r1.<init>(r14, r0)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r0 = r7.F
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.H
            r9 = 3
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L_0x0057
            if (r1 == r11) goto L_0x004e
            if (r1 == r10) goto L_0x003f
            if (r1 != r9) goto L_0x0037
            java.lang.Object r1 = r7.C
            kotlin.ResultKt.b(r0)
            goto L_0x00b6
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r1 = r7.E
            com.hansecom.abt.api.oauth.OAuthTokenResponse r1 = (com.hansecom.abt.api.oauth.OAuthTokenResponse) r1
            java.lang.Object r2 = r7.D
            java.lang.Object r3 = r7.C
            com.hansecom.abt.data.useCases.auth.LogInUseCase r3 = (com.hansecom.abt.data.useCases.auth.LogInUseCase) r3
            kotlin.ResultKt.b(r0)
            r0 = r2
            goto L_0x009b
        L_0x004e:
            java.lang.Object r1 = r7.C
            com.hansecom.abt.data.useCases.auth.LogInUseCase r1 = (com.hansecom.abt.data.useCases.auth.LogInUseCase) r1
            kotlin.ResultKt.b(r0)
            r3 = r1
            goto L_0x007b
        L_0x0057:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.api.JsonParser r0 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r1 = r0.c()
            kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.useCases.auth.LogInUseCase$invoke-0E7RQCE$$inlined$retrofit$default$1 r13 = new com.hansecom.abt.data.useCases.auth.LogInUseCase$invoke-0E7RQCE$$inlined$retrofit$default$1
            r2 = 0
            r0 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r7.C = r6
            r7.H = r11
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r12, r13, r7)
            if (r0 != r8) goto L_0x007a
            return r8
        L_0x007a:
            r3 = r6
        L_0x007b:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            boolean r1 = kotlin.Result.h(r0)
            if (r1 == 0) goto L_0x00b7
            r1 = r0
            com.hansecom.abt.api.oauth.OAuthTokenResponse r1 = (com.hansecom.abt.api.oauth.OAuthTokenResponse) r1
            com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase r2 = r3.f33798c
            r7.C = r3
            r7.D = r0
            r7.E = r1
            r7.H = r10
            java.lang.Object r2 = r2.a(r11, r7)
            if (r2 != r8) goto L_0x009b
            return r8
        L_0x009b:
            com.hansecom.abt.data.preferences.AuthenticationPreferences r2 = r3.f33797b
            java.lang.String r3 = r1.a()
            java.lang.String r1 = r1.b()
            r7.C = r0
            r4 = 0
            r7.D = r4
            r7.E = r4
            r7.H = r9
            java.lang.Object r1 = r2.h(r3, r1, r7)
            if (r1 != r8) goto L_0x00b5
            return r8
        L_0x00b5:
            r1 = r0
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            boolean r1 = kotlin.Result.h(r0)
            if (r1 == 0) goto L_0x00c1
            com.hansecom.abt.api.oauth.OAuthTokenResponse r0 = (com.hansecom.abt.api.oauth.OAuthTokenResponse) r0
            kotlin.Unit r0 = kotlin.Unit.f40552a
        L_0x00c1:
            java.lang.Object r0 = kotlin.Result.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.auth.LogInUseCase.c(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
