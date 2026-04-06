package com.hansecom.abt.api;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.api.RetrofitExtKt$retrofit$2", f = "RetrofitExt.kt", l = {19}, m = "invokeSuspend")
public final class RetrofitExtKt$retrofit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<Object>>, Object> {
    public int D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Json F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetrofitExtKt$retrofit$2(Function1 function1, Json json, Continuation continuation) {
        super(2, continuation);
        this.E = function1;
        this.F = json;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RetrofitExtKt$retrofit$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        Intrinsics.n();
        return new RetrofitExtKt$retrofit$2(this.E, this.F, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:47|48|(2:50|51)|52|53|54) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00e3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7 A[Catch:{ IOException -> 0x0014, all -> 0x0011 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc A[Catch:{ IOException -> 0x0014, all -> 0x0011 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf A[Catch:{ IOException -> 0x0014, all -> 0x0011 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x00b3=Splitter:B:38:0x00b3, B:52:0x00e3=Splitter:B:52:0x00e3} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r0 = "T"
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r4.D
            r3 = 1
            if (r2 == 0) goto L_0x001f
            if (r2 != r3) goto L_0x0017
            kotlin.ResultKt.b(r5)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            goto L_0x002d
        L_0x0011:
            r5 = move-exception
            goto L_0x00ef
        L_0x0014:
            r5 = move-exception
            goto L_0x00fa
        L_0x0017:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001f:
            kotlin.ResultKt.b(r5)
            kotlin.jvm.functions.Function1 r5 = r4.E     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r4.D = r3     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.Object r5 = r5.invoke(r4)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            if (r5 != r1) goto L_0x002d
            return r1
        L_0x002d:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            boolean r1 = r5.e()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            if (r1 == 0) goto L_0x008b
            int r1 = r5.b()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r2 = 204(0xcc, float:2.86E-43)
            if (r1 != r2) goto L_0x006b
            kotlin.Unit r5 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1 = 3
            kotlin.jvm.internal.Intrinsics.o(r1, r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            if (r5 == 0) goto L_0x0046
            goto L_0x0072
        L_0x0046:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1 = 4
            kotlin.jvm.internal.Intrinsics.o(r1, r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.<init>()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.append(r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            throw r5     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
        L_0x006b:
            java.lang.Object r0 = r5.a()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            if (r0 == 0) goto L_0x0078
            r5 = r0
        L_0x0072:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            goto L_0x010e
        L_0x0078:
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            throw r0     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
        L_0x008b:
            kotlinx.serialization.json.Json r0 = r4.F     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            int r1 = r5.b()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00c7
            okhttp3.ResponseBody r5 = r5.d()     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x00b2
            java.lang.String r5 = r5.k()     // Catch:{ all -> 0x00b2 }
            r0.a()     // Catch:{ all -> 0x00b2 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00b2 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00b2 }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00b2 }
            java.lang.Object r5 = r0.b(r1, r5)     // Catch:{ all -> 0x00b2 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r5 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r5     // Catch:{ all -> 0x00b2 }
            goto L_0x00b3
        L_0x00b2:
            r5 = r3
        L_0x00b3:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            if (r5 == 0) goto L_0x00bc
            java.lang.String r1 = r5.a()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            goto L_0x00bd
        L_0x00bc:
            r1 = r3
        L_0x00bd:
            if (r5 == 0) goto L_0x00c3
            java.lang.String r3 = r5.b()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
        L_0x00c3:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            throw r0     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
        L_0x00c7:
            okhttp3.ResponseBody r1 = r5.d()     // Catch:{ all -> 0x00e3 }
            if (r1 == 0) goto L_0x00e3
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00e3 }
            r0.a()     // Catch:{ all -> 0x00e3 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00e3 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00e3 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00e3 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00e3 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00e3 }
            r3 = r0
        L_0x00e3:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            com.hansecom.abt.api.ApiException r5 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            throw r5     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
        L_0x00ef:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            goto L_0x010e
        L_0x00fa:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r5)
            kotlin.Result$Companion r5 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r5 = new com.hansecom.abt.api.NoConnectionException
            r5.<init>()
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L_0x010e:
            kotlin.Result r5 = kotlin.Result.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.api.RetrofitExtKt$retrofit$2.x(java.lang.Object):java.lang.Object");
    }
}
