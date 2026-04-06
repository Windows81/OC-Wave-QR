package com.hansecom.abt.data.useCases.auth;

import com.hansecom.abt.api.RealmPreferences;
import com.hansecom.abt.api.oauth.OAuthService;
import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RefreshAccessTokenUseCase {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f33804d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f33805e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final OAuthService f33806a;

    /* renamed from: b  reason: collision with root package name */
    public final AuthenticationPreferences f33807b;

    /* renamed from: c  reason: collision with root package name */
    public final RealmPreferences f33808c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RefreshAccessTokenUseCase(OAuthService oAuthService, AuthenticationPreferences authenticationPreferences, RealmPreferences realmPreferences) {
        Intrinsics.i(oAuthService, "oAuthService");
        Intrinsics.i(authenticationPreferences, "authenticationPreferences");
        Intrinsics.i(realmPreferences, "realmPreferences");
        this.f33806a = oAuthService;
        this.f33807b = authenticationPreferences;
        this.f33808c = realmPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r0 = r0.C
            kotlin.ResultKt.b(r8)
            goto L_0x0082
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0036:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase r2 = (com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase) r2
            kotlin.ResultKt.b(r8)
            goto L_0x005d
        L_0x003e:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.api.JsonParser r8 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r8 = r8.c()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke-IoAF18A$$inlined$retrofit$default$1 r5 = new com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke-IoAF18A$$inlined$retrofit$default$1
            r6 = 0
            r5.<init>(r8, r6, r7)
            r0.C = r7
            r0.F = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.g(r2, r5, r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r7
        L_0x005d:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            boolean r4 = kotlin.Result.h(r8)
            if (r4 == 0) goto L_0x0083
            r4 = r8
            com.hansecom.abt.api.oauth.OAuthTokenResponse r4 = (com.hansecom.abt.api.oauth.OAuthTokenResponse) r4
            com.hansecom.abt.data.preferences.AuthenticationPreferences r2 = r2.f33807b
            java.lang.String r5 = r4.a()
            java.lang.String r4 = r4.b()
            r0.C = r8
            r0.F = r3
            java.lang.Object r0 = r2.h(r5, r4, r0)
            if (r0 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r0 = r8
        L_0x0082:
            r8 = r0
        L_0x0083:
            boolean r0 = kotlin.Result.h(r8)
            if (r0 == 0) goto L_0x008f
            com.hansecom.abt.api.oauth.OAuthTokenResponse r8 = (com.hansecom.abt.api.oauth.OAuthTokenResponse) r8
            java.lang.String r8 = r8.a()
        L_0x008f:
            java.lang.Object r8 = kotlin.Result.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
