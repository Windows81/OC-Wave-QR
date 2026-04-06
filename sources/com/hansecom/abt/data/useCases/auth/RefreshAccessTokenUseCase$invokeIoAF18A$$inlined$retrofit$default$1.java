package com.hansecom.abt.data.useCases.auth;

import com.hansecom.abt.api.oauth.OAuthTokenResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke-IoAF18A$$inlined$retrofit$default$1", f = "RefreshAccessTokenUseCase.kt", l = {87, 86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invoke-IoAF18A$$inlined$retrofit$default$1  reason: invalid class name */
public final class RefreshAccessTokenUseCase$invokeIoAF18A$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends OAuthTokenResponse>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ RefreshAccessTokenUseCase F;
    public Object G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshAccessTokenUseCase$invokeIoAF18A$$inlined$retrofit$default$1(Json json, Continuation continuation, RefreshAccessTokenUseCase refreshAccessTokenUseCase) {
        super(2, continuation);
        this.E = json;
        this.F = refreshAccessTokenUseCase;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RefreshAccessTokenUseCase$invokeIoAF18A$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new RefreshAccessTokenUseCase$invokeIoAF18A$$inlined$retrofit$default$1(this.E, continuation, this.F);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:51|52|(2:54|55)|56|57|58) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0118 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c1 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f1 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f4 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x00e8=Splitter:B:42:0x00e8, B:56:0x0118=Splitter:B:56:0x0118} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r11.D
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            kotlin.ResultKt.b(r12)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x006c
        L_0x0013:
            r12 = move-exception
            goto L_0x0124
        L_0x0016:
            r12 = move-exception
            goto L_0x012f
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0021:
            java.lang.Object r1 = r11.G
            com.hansecom.abt.api.oauth.OAuthService r1 = (com.hansecom.abt.api.oauth.OAuthService) r1
            kotlin.ResultKt.b(r12)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x0028:
            r5 = r1
            goto L_0x0044
        L_0x002a:
            kotlin.ResultKt.b(r12)
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase r12 = r11.F     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.api.oauth.OAuthService r1 = r12.f33806a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase r12 = r11.F     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.data.preferences.AuthenticationPreferences r12 = r12.f33807b     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r11.G = r1     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r11.D = r3     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Object r12 = r12.g(r11)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r12 != r0) goto L_0x0028
            return r0
        L_0x0044:
            kotlin.jvm.internal.Intrinsics.f(r12)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r7 = "refresh_token"
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase r12 = r11.F     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.api.RealmPreferences r12 = r12.f33808c     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r8 = r12.e()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase r12 = r11.F     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.api.RealmPreferences r12 = r12.f33808c     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r9 = r12.f()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r11.G = r4     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r11.D = r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r10 = r11
            java.lang.Object r12 = r5.b(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r12 != r0) goto L_0x006c
            return r0
        L_0x006c:
            retrofit2.Response r12 = (retrofit2.Response) r12     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            boolean r0 = r12.e()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x00c1
            int r0 = r12.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x009e
            java.lang.Object r0 = r12.a()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x008b
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Object r12 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x0143
        L_0x008b:
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r12, r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r0.<init>(r12)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r0     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x009e:
            kotlin.Unit r12 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Class<com.hansecom.abt.api.oauth.OAuthTokenResponse> r0 = com.hansecom.abt.api.oauth.OAuthTokenResponse.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.<init>()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.append(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r12.<init>(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r12     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00c1:
            kotlinx.serialization.json.Json r0 = r11.E     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            int r1 = r12.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r2 = 401(0x191, float:5.62E-43)
            if (r1 != r2) goto L_0x00fc
            okhttp3.ResponseBody r12 = r12.d()     // Catch:{ all -> 0x00e7 }
            if (r12 == 0) goto L_0x00e7
            java.lang.String r12 = r12.k()     // Catch:{ all -> 0x00e7 }
            r0.a()     // Catch:{ all -> 0x00e7 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00e7 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00e7 }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00e7 }
            java.lang.Object r12 = r0.b(r1, r12)     // Catch:{ all -> 0x00e7 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r12 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r12     // Catch:{ all -> 0x00e7 }
            goto L_0x00e8
        L_0x00e7:
            r12 = r4
        L_0x00e8:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r12 == 0) goto L_0x00f1
            java.lang.String r1 = r12.a()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x00f2
        L_0x00f1:
            r1 = r4
        L_0x00f2:
            if (r12 == 0) goto L_0x00f8
            java.lang.String r4 = r12.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00f8:
            r0.<init>(r1, r4)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r0     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00fc:
            okhttp3.ResponseBody r1 = r12.d()     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x0118
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x0118 }
            r0.a()     // Catch:{ all -> 0x0118 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x0118 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x0118 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x0118 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x0118 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x0118 }
            r4 = r0
        L_0x0118:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.<init>(r12)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.api.ApiException r12 = r0.a(r4, r1)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r12     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x0124:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
            goto L_0x0143
        L_0x012f:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r12)
            kotlin.Result$Companion r12 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r12 = new com.hansecom.abt.api.NoConnectionException
            r12.<init>()
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
        L_0x0143:
            kotlin.Result r12 = kotlin.Result.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase$invokeIoAF18A$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
