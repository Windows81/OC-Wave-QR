package com.hansecom.abt.data.repositories;

import com.hansecom.mapi.models.User;
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
@DebugMetadata(c = "com.hansecom.abt.data.repositories.UserRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1", f = "UserRepository.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.repositories.UserRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1  reason: invalid class name */
public final class UserRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends User>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ UserRepository F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1(Json json, Continuation continuation, UserRepository userRepository) {
        super(2, continuation);
        this.E = json;
        this.F = userRepository;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UserRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new UserRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1(this.E, continuation, this.F);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00dc */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00ac=Splitter:B:34:0x00ac, B:48:0x00dc=Splitter:B:48:0x00dc} */
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
            goto L_0x002f
        L_0x000f:
            r5 = move-exception
            goto L_0x00e8
        L_0x0012:
            r5 = move-exception
            goto L_0x00f3
        L_0x0015:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001d:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.repositories.UserRepository r5 = r4.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.UserDataApi r5 = r5.f33538k     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r4.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r5 = r5.p(r4)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r5 != r0) goto L_0x002f
            return r0
        L_0x002f:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r5.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0084
            int r0 = r5.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x0061
            java.lang.Object r0 = r5.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x004e
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r5 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0107
        L_0x004e:
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0061:
            kotlin.Unit r5 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Class<com.hansecom.mapi.models.User> r0 = com.hansecom.mapi.models.User.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.append(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r5     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0084:
            kotlinx.serialization.json.Json r0 = r4.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r5.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00c0
            okhttp3.ResponseBody r5 = r5.d()     // Catch:{ all -> 0x00ab }
            if (r5 == 0) goto L_0x00ab
            java.lang.String r5 = r5.k()     // Catch:{ all -> 0x00ab }
            r0.a()     // Catch:{ all -> 0x00ab }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00ab }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00ab }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00ab }
            java.lang.Object r5 = r0.b(r1, r5)     // Catch:{ all -> 0x00ab }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r5 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r5     // Catch:{ all -> 0x00ab }
            goto L_0x00ac
        L_0x00ab:
            r5 = r3
        L_0x00ac:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r5 == 0) goto L_0x00b5
            java.lang.String r1 = r5.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00b6
        L_0x00b5:
            r1 = r3
        L_0x00b6:
            if (r5 == 0) goto L_0x00bc
            java.lang.String r3 = r5.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00bc:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00c0:
            okhttp3.ResponseBody r1 = r5.d()     // Catch:{ all -> 0x00dc }
            if (r1 == 0) goto L_0x00dc
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00dc }
            r0.a()     // Catch:{ all -> 0x00dc }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00dc }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00dc }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00dc }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00dc }
            r3 = r0
        L_0x00dc:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r5 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r5     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00e8:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            goto L_0x0107
        L_0x00f3:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r5)
            kotlin.Result$Companion r5 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r5 = new com.hansecom.abt.api.NoConnectionException
            r5.<init>()
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L_0x0107:
            kotlin.Result r5 = kotlin.Result.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
