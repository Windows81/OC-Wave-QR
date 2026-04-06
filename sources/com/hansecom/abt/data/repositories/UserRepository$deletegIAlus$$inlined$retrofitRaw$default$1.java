package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import retrofit2.Response;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.UserRepository$delete-gIAlu-s$$inlined$retrofitRaw$default$1", f = "UserRepository.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.repositories.UserRepository$delete-gIAlu-s$$inlined$retrofitRaw$default$1  reason: invalid class name */
public final class UserRepository$deletegIAlus$$inlined$retrofitRaw$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Response<Unit>>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ UserRepository F;
    public final /* synthetic */ String G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$deletegIAlus$$inlined$retrofitRaw$default$1(Json json, Continuation continuation, UserRepository userRepository, String str) {
        super(2, continuation);
        this.E = json;
        this.F = userRepository;
        this.G = str;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UserRepository$deletegIAlus$$inlined$retrofitRaw$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new UserRepository$deletegIAlus$$inlined$retrofitRaw$default$1(this.E, continuation, this.F, this.G);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:35|36|(2:38|39)|40|41|42) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x009c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x006c=Splitter:B:26:0x006c, B:40:0x009c=Splitter:B:40:0x009c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0036
        L_0x000f:
            r5 = move-exception
            goto L_0x00a8
        L_0x0012:
            r5 = move-exception
            goto L_0x00b3
        L_0x0015:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001d:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.repositories.UserRepository r5 = r4.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.UserDataApi r5 = r5.f33538k     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.DeleteUserRequest r1 = new com.hansecom.mapi.models.DeleteUserRequest     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r3 = r4.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r4.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r5 = r5.i(r1, r4)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r5 != r0) goto L_0x0036
            return r0
        L_0x0036:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r5.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0044
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00c7
        L_0x0044:
            kotlinx.serialization.json.Json r0 = r4.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r5.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x0080
            okhttp3.ResponseBody r5 = r5.d()     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x006b
            java.lang.String r5 = r5.k()     // Catch:{ all -> 0x006b }
            r0.a()     // Catch:{ all -> 0x006b }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x006b }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x006b }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x006b }
            java.lang.Object r5 = r0.b(r1, r5)     // Catch:{ all -> 0x006b }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r5 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r5     // Catch:{ all -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r5 = r3
        L_0x006c:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r5 == 0) goto L_0x0075
            java.lang.String r1 = r5.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0076
        L_0x0075:
            r1 = r3
        L_0x0076:
            if (r5 == 0) goto L_0x007c
            java.lang.String r3 = r5.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x007c:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0080:
            okhttp3.ResponseBody r1 = r5.d()     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x009c }
            r0.a()     // Catch:{ all -> 0x009c }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x009c }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x009c }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x009c }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x009c }
            r3 = r0
        L_0x009c:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r5 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r5     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00a8:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            goto L_0x00c7
        L_0x00b3:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r5)
            kotlin.Result$Companion r5 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r5 = new com.hansecom.abt.api.NoConnectionException
            r5.<init>()
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L_0x00c7:
            kotlin.Result r5 = kotlin.Result.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository$deletegIAlus$$inlined$retrofitRaw$default$1.x(java.lang.Object):java.lang.Object");
    }
}
