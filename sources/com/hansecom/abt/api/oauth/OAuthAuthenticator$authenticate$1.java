package com.hansecom.abt.api.oauth;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.api.oauth.OAuthAuthenticator$authenticate$1", f = "OAuthAuthenticator.kt", l = {32, 41, 44, 48, 55}, m = "invokeSuspend")
public final class OAuthAuthenticator$authenticate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Request>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ Request F;
    public final /* synthetic */ OAuthAuthenticator G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuthAuthenticator$authenticate$1(Request request, OAuthAuthenticator oAuthAuthenticator, Continuation continuation) {
        super(2, continuation);
        this.F = request;
        this.G = oAuthAuthenticator;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((OAuthAuthenticator$authenticate$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new OAuthAuthenticator$authenticate$1(this.F, this.G, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.E
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r1 == 0) goto L_0x0042
            if (r1 == r6) goto L_0x003a
            if (r1 == r5) goto L_0x0036
            if (r1 == r4) goto L_0x0031
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            kotlin.ResultKt.b(r10)
            goto L_0x010b
        L_0x001e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0026:
            kotlin.ResultKt.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.j()
            goto L_0x00cc
        L_0x0031:
            kotlin.ResultKt.b(r10)
            goto L_0x00bc
        L_0x0036:
            kotlin.ResultKt.b(r10)
            goto L_0x00a0
        L_0x003a:
            java.lang.Object r1 = r9.D
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.b(r10)
            goto L_0x005c
        L_0x0042:
            kotlin.ResultKt.b(r10)
            okhttp3.Request r10 = r9.F
            java.lang.String r1 = com.hansecom.abt.api.RequestExtKt.b(r10)
            com.hansecom.abt.api.oauth.OAuthAuthenticator r10 = r9.G
            com.hansecom.abt.data.preferences.AuthenticationPreferences r10 = r10.f33149d
            r9.D = r1
            r9.E = r6
            java.lang.Object r10 = r10.e(r9)
            if (r10 != r0) goto L_0x005c
            return r0
        L_0x005c:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x006a
            timber.log.Timber$Forest r10 = timber.log.Timber.f44337a
            java.lang.String r0 = "Missing access token, give up"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r10.o(r0, r1)
            return r7
        L_0x006a:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r10, r1)
            if (r1 != 0) goto L_0x008f
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Update access token from preferences "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r0.i(r1, r2)
            okhttp3.Request r0 = r9.F
            okhttp3.Request r10 = com.hansecom.abt.api.RequestExtKt.c(r0, r10)
            return r10
        L_0x008f:
            com.hansecom.abt.api.oauth.OAuthAuthenticator r10 = r9.G
            com.hansecom.abt.data.preferences.AuthenticationPreferences r10 = r10.f33149d
            r9.D = r7
            r9.E = r5
            java.lang.Object r10 = r10.g(r9)
            if (r10 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x00bd
            timber.log.Timber$Forest r10 = timber.log.Timber.f44337a
            java.lang.String r1 = "Missing refresh token, give up"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r10.o(r1, r2)
            com.hansecom.abt.api.oauth.OAuthAuthenticator r10 = r9.G
            com.hansecom.abt.data.useCases.LogOutUseCase r10 = r10.f33151f
            r9.E = r4
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            return r7
        L_0x00bd:
            com.hansecom.abt.api.oauth.OAuthAuthenticator r10 = r9.G
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase r10 = r10.f33150e
            r9.E = r3
            java.lang.Object r10 = r10.d(r9)
            if (r10 != r0) goto L_0x00cc
            return r0
        L_0x00cc:
            okhttp3.Request r1 = r9.F
            com.hansecom.abt.api.oauth.OAuthAuthenticator r3 = r9.G
            java.lang.Throwable r4 = kotlin.Result.e(r10)
            if (r4 != 0) goto L_0x00f5
            java.lang.String r10 = (java.lang.String) r10
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Refreshed access token "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r0.i(r2, r3)
            okhttp3.Request r7 = com.hansecom.abt.api.RequestExtKt.c(r1, r10)
            goto L_0x010b
        L_0x00f5:
            timber.log.Timber$Forest r10 = timber.log.Timber.f44337a
            java.lang.String r1 = "Failed to refresh access token, give up"
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r10.d(r4, r1, r5)
            com.hansecom.abt.data.useCases.LogOutUseCase r10 = r3.f33151f
            r9.E = r2
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L_0x010b
            return r0
        L_0x010b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.api.oauth.OAuthAuthenticator$authenticate$1.x(java.lang.Object):java.lang.Object");
    }
}
