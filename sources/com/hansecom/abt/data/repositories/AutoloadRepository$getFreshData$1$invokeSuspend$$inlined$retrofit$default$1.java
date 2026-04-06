package com.hansecom.abt.data.repositories;

import com.hansecom.mapi.models.FareMediaAutoload;
import java.util.List;
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
@DebugMetadata(c = "com.hansecom.abt.data.repositories.AutoloadRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1", f = "AutoloadRepository.kt", l = {86}, m = "invokeSuspend")
public final class AutoloadRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends FareMediaAutoload>>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ AutoloadRepository F;
    public final /* synthetic */ String G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1(Json json, Continuation continuation, AutoloadRepository autoloadRepository, String str) {
        super(2, continuation);
        this.E = json;
        this.F = autoloadRepository;
        this.G = str;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AutoloadRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AutoloadRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:47|48|(2:50|51)|52|53|54) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00e8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c4 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x00b8=Splitter:B:38:0x00b8, B:52:0x00e8=Splitter:B:52:0x00e8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0035
        L_0x000f:
            r10 = move-exception
            goto L_0x00f4
        L_0x0012:
            r10 = move-exception
            goto L_0x00ff
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001d:
            kotlin.ResultKt.b(r10)
            com.hansecom.abt.data.repositories.AutoloadRepository r10 = r9.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.AutoloadsApi r3 = r10.f33392f     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r4 = r9.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r9.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r5 = 0
            r7 = 2
            r8 = 0
            r6 = r9
            java.lang.Object r10 = com.hansecom.mapi.apis.AutoloadsApi.DefaultImpls.a(r3, r4, r5, r6, r7, r8)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r10 != r0) goto L_0x0035
            return r0
        L_0x0035:
            retrofit2.Response r10 = (retrofit2.Response) r10     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r10.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0090
            int r0 = r10.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x006d
            kotlin.Unit r10 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r10 instanceof java.util.List     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x004c
            goto L_0x0074
        L_0x004c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.append(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r10.<init>(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r10     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x006d:
            java.lang.Object r0 = r10.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x007d
            r10 = r0
        L_0x0074:
            kotlin.jvm.internal.Intrinsics.f(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r10 = kotlin.Result.b(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0113
        L_0x007d:
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r10, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0090:
            kotlinx.serialization.json.Json r0 = r9.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r10.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00cc
            okhttp3.ResponseBody r10 = r10.d()     // Catch:{ all -> 0x00b7 }
            if (r10 == 0) goto L_0x00b7
            java.lang.String r10 = r10.k()     // Catch:{ all -> 0x00b7 }
            r0.a()     // Catch:{ all -> 0x00b7 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00b7 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00b7 }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00b7 }
            java.lang.Object r10 = r0.b(r1, r10)     // Catch:{ all -> 0x00b7 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r10 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r10     // Catch:{ all -> 0x00b7 }
            goto L_0x00b8
        L_0x00b7:
            r10 = r3
        L_0x00b8:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r10 == 0) goto L_0x00c1
            java.lang.String r1 = r10.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00c2
        L_0x00c1:
            r1 = r3
        L_0x00c2:
            if (r10 == 0) goto L_0x00c8
            java.lang.String r3 = r10.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00c8:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00cc:
            okhttp3.ResponseBody r1 = r10.d()     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x00e8
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00e8 }
            r0.a()     // Catch:{ all -> 0x00e8 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00e8 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00e8 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00e8 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00e8 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00e8 }
            r3 = r0
        L_0x00e8:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r10 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r10     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00f4:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r10 = kotlin.ResultKt.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
            goto L_0x0113
        L_0x00ff:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r10)
            kotlin.Result$Companion r10 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r10 = new com.hansecom.abt.api.NoConnectionException
            r10.<init>()
            java.lang.Object r10 = kotlin.ResultKt.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
        L_0x0113:
            kotlin.Result r10 = kotlin.Result.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.AutoloadRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
