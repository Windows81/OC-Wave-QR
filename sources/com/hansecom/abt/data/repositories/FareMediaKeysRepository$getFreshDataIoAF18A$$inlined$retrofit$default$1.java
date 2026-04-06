package com.hansecom.abt.data.repositories;

import com.hansecom.mapi.models.PrivKey;
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
@DebugMetadata(c = "com.hansecom.abt.data.repositories.FareMediaKeysRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1", f = "FareMediaKeysRepository.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.repositories.FareMediaKeysRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1  reason: invalid class name */
public final class FareMediaKeysRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends PrivKey>>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ FareMediaKeysRepository F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaKeysRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1(Json json, Continuation continuation, FareMediaKeysRepository fareMediaKeysRepository) {
        super(2, continuation);
        this.E = json;
        this.F = fareMediaKeysRepository;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaKeysRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaKeysRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1(this.E, continuation, this.F);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:47|48|(2:50|51)|52|53|54) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00e2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b6 A[Catch:{ IOException -> 0x0013, all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb A[Catch:{ IOException -> 0x0013, all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[Catch:{ IOException -> 0x0013, all -> 0x0010 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x00b2=Splitter:B:38:0x00b2, B:52:0x00e2=Splitter:B:52:0x00e2} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.D
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.ResultKt.b(r5)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            goto L_0x0030
        L_0x0010:
            r5 = move-exception
            goto L_0x00ee
        L_0x0013:
            r5 = move-exception
            goto L_0x00f9
        L_0x0016:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001e:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.repositories.FareMediaKeysRepository r5 = r4.F     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.mapi.apis.SigningApi r5 = r5.f33463k     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r4.D = r2     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.Object r5 = com.hansecom.mapi.apis.SigningApi.DefaultImpls.a(r5, r3, r4, r2, r3)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r5 != r0) goto L_0x0030
            return r0
        L_0x0030:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            boolean r0 = r5.e()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r0 == 0) goto L_0x008b
            int r0 = r5.b()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x0068
            kotlin.Unit r5 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r0 == 0) goto L_0x0047
            goto L_0x006f
        L_0x0047:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.<init>()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.append(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            throw r5     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x0068:
            java.lang.Object r0 = r5.a()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r0 == 0) goto L_0x0078
            r5 = r0
        L_0x006f:
            kotlin.jvm.internal.Intrinsics.f(r5)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            goto L_0x010d
        L_0x0078:
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            throw r0     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x008b:
            kotlinx.serialization.json.Json r0 = r4.E     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            int r1 = r5.b()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r2 = 401(0x191, float:5.62E-43)
            if (r1 != r2) goto L_0x00c6
            okhttp3.ResponseBody r5 = r5.d()     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00b1
            java.lang.String r5 = r5.k()     // Catch:{ all -> 0x00b1 }
            r0.a()     // Catch:{ all -> 0x00b1 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00b1 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00b1 }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00b1 }
            java.lang.Object r5 = r0.b(r1, r5)     // Catch:{ all -> 0x00b1 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r5 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r5     // Catch:{ all -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
            r5 = r3
        L_0x00b2:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r5 == 0) goto L_0x00bb
            java.lang.String r1 = r5.a()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            goto L_0x00bc
        L_0x00bb:
            r1 = r3
        L_0x00bc:
            if (r5 == 0) goto L_0x00c2
            java.lang.String r3 = r5.b()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x00c2:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            throw r0     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x00c6:
            okhttp3.ResponseBody r1 = r5.d()     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00e2
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00e2 }
            r0.a()     // Catch:{ all -> 0x00e2 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00e2 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00e2 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00e2 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00e2 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00e2 }
            r3 = r0
        L_0x00e2:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.abt.api.ApiException r5 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            throw r5     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x00ee:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            goto L_0x010d
        L_0x00f9:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r5)
            kotlin.Result$Companion r5 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r5 = new com.hansecom.abt.api.NoConnectionException
            r5.<init>()
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L_0x010d:
            kotlin.Result r5 = kotlin.Result.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareMediaKeysRepository$getFreshDataIoAF18A$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
