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

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod-gIAlu-s$$inlined$retrofit$default$1", f = "PaymentMethodsRepository.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod-gIAlu-s$$inlined$retrofit$default$1  reason: invalid class name */
public final class PaymentMethodsRepository$removePaymentMethodgIAlus$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ PaymentMethodsRepository F;
    public final /* synthetic */ long G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepository$removePaymentMethodgIAlus$$inlined$retrofit$default$1(Json json, Continuation continuation, PaymentMethodsRepository paymentMethodsRepository, long j2) {
        super(2, continuation);
        this.E = json;
        this.F = paymentMethodsRepository;
        this.G = j2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PaymentMethodsRepository$removePaymentMethodgIAlus$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PaymentMethodsRepository$removePaymentMethodgIAlus$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00bf */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009b A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x008f=Splitter:B:34:0x008f, B:48:0x00bf=Splitter:B:48:0x00bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r5.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r6)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0031
        L_0x000f:
            r6 = move-exception
            goto L_0x00cb
        L_0x0012:
            r6 = move-exception
            goto L_0x00d6
        L_0x0015:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001d:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r6 = r5.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.UserDataApi r6 = r6.f33527k     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            long r3 = r5.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r5.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r6 = r6.l(r3, r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r6 != r0) goto L_0x0031
            return r0
        L_0x0031:
            retrofit2.Response r6 = (retrofit2.Response) r6     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r6.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0067
            int r0 = r6.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x0044
            kotlin.Unit r6 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x004b
        L_0x0044:
            java.lang.Object r0 = r6.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0054
            r6 = r0
        L_0x004b:
            kotlin.jvm.internal.Intrinsics.f(r6)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00ea
        L_0x0054:
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r6, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0067:
            kotlinx.serialization.json.Json r0 = r5.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r6.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00a3
            okhttp3.ResponseBody r6 = r6.d()     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x008e
            java.lang.String r6 = r6.k()     // Catch:{ all -> 0x008e }
            r0.a()     // Catch:{ all -> 0x008e }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x008e }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x008e }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x008e }
            java.lang.Object r6 = r0.b(r1, r6)     // Catch:{ all -> 0x008e }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r6 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r6     // Catch:{ all -> 0x008e }
            goto L_0x008f
        L_0x008e:
            r6 = r3
        L_0x008f:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r6 == 0) goto L_0x0098
            java.lang.String r1 = r6.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0099
        L_0x0098:
            r1 = r3
        L_0x0099:
            if (r6 == 0) goto L_0x009f
            java.lang.String r3 = r6.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x009f:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00a3:
            okhttp3.ResponseBody r1 = r6.d()     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x00bf
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00bf }
            r0.a()     // Catch:{ all -> 0x00bf }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00bf }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00bf }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00bf }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00bf }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00bf }
            r3 = r0
        L_0x00bf:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r6 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r6     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00cb:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
            goto L_0x00ea
        L_0x00d6:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r6)
            kotlin.Result$Companion r6 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r6 = new com.hansecom.abt.api.NoConnectionException
            r6.<init>()
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L_0x00ea:
            kotlin.Result r6 = kotlin.Result.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethodgIAlus$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
