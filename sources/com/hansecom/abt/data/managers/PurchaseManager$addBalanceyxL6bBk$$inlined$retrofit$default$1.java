package com.hansecom.abt.data.managers;

import java.math.BigDecimal;
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
@DebugMetadata(c = "com.hansecom.abt.data.managers.PurchaseManager$addBalance-yxL6bBk$$inlined$retrofit$default$1", f = "PurchaseManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.PurchaseManager$addBalance-yxL6bBk$$inlined$retrofit$default$1  reason: invalid class name */
public final class PurchaseManager$addBalanceyxL6bBk$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ PurchaseManager F;
    public final /* synthetic */ long G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ BigDecimal J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseManager$addBalanceyxL6bBk$$inlined$retrofit$default$1(Json json, Continuation continuation, PurchaseManager purchaseManager, long j2, String str, String str2, BigDecimal bigDecimal) {
        super(2, continuation);
        this.E = json;
        this.F = purchaseManager;
        this.G = j2;
        this.H = str;
        this.I = str2;
        this.J = bigDecimal;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PurchaseManager$addBalanceyxL6bBk$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PurchaseManager$addBalanceyxL6bBk$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I, this.J);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00fd */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00cd=Splitter:B:34:0x00cd, B:48:0x00fd=Splitter:B:48:0x00fd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.D
            r3 = 1
            if (r2 == 0) goto L_0x0021
            if (r2 != r3) goto L_0x0019
            kotlin.ResultKt.b(r20)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r2 = r20
            goto L_0x0070
        L_0x0013:
            r0 = move-exception
            goto L_0x0109
        L_0x0016:
            r0 = move-exception
            goto L_0x0114
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0021:
            kotlin.ResultKt.b(r20)
            com.hansecom.abt.data.managers.PurchaseManager r2 = r1.F     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.mapi.apis.PurchaseOperationsApi r2 = r2.f33302a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.mapi.models.CombinedProductOrderRequest r15 = new com.hansecom.mapi.models.CombinedProductOrderRequest     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            long r4 = r1.G     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.d(r4)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r9 = r1.H     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.mapi.models.TopUpReference r4 = new com.hansecom.mapi.models.TopUpReference     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r5 = r1.I     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.math.BigDecimal r6 = r1.J     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.math.BigDecimal r6 = com.hansecom.abt.util.BigDecimalExtKt.f(r6)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            long r6 = r6.longValue()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.d(r6)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.util.List r12 = kotlin.collections.CollectionsKt.e(r4)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.util.List r13 = kotlin.collections.CollectionsKt.m()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r16 = 613(0x265, float:8.59E-43)
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r4 = r15
            r18 = r15
            r15 = r16
            r16 = r17
            r4.<init>((java.util.List) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.Long) r8, (java.lang.String) r9, (com.hansecom.mapi.models.AdditionalPaymentInfo) r10, (java.lang.Boolean) r11, (java.util.List) r12, (java.util.List) r13, (com.hansecom.mapi.models.UserAddress) r14, (int) r15, (kotlin.jvm.internal.DefaultConstructorMarker) r16)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.D = r3     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3 = r18
            java.lang.Object r2 = r2.b(r3, r1)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r2 != r0) goto L_0x0070
            return r0
        L_0x0070:
            retrofit2.Response r2 = (retrofit2.Response) r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            boolean r0 = r2.e()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x00a5
            int r0 = r2.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3 = 204(0xcc, float:2.86E-43)
            if (r0 != r3) goto L_0x0083
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x0089
        L_0x0083:
            java.lang.Object r0 = r2.a()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x0092
        L_0x0089:
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x0128
        L_0x0092:
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00a5:
            kotlinx.serialization.json.Json r0 = r1.E     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            int r3 = r2.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r4 = 401(0x191, float:5.62E-43)
            r5 = 0
            if (r3 != r4) goto L_0x00e1
            okhttp3.ResponseBody r2 = r2.d()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00cc
            java.lang.String r2 = r2.k()     // Catch:{ all -> 0x00cc }
            r0.a()     // Catch:{ all -> 0x00cc }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r3 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00cc }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ all -> 0x00cc }
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r0.b(r3, r2)     // Catch:{ all -> 0x00cc }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r0 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r0     // Catch:{ all -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
            r0 = r5
        L_0x00cd:
            com.hansecom.abt.api.NotAuthorizedException r2 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r3 = r0.a()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x00d7
        L_0x00d6:
            r3 = r5
        L_0x00d7:
            if (r0 == 0) goto L_0x00dd
            java.lang.String r5 = r0.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00dd:
            r2.<init>(r3, r5)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00e1:
            okhttp3.ResponseBody r3 = r2.d()     // Catch:{ all -> 0x00fd }
            if (r3 == 0) goto L_0x00fd
            java.lang.String r3 = r3.k()     // Catch:{ all -> 0x00fd }
            r0.a()     // Catch:{ all -> 0x00fd }
            com.hansecom.mapi.models.ErrorResponse$Companion r4 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00fd }
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch:{ all -> 0x00fd }
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4     // Catch:{ all -> 0x00fd }
            java.lang.Object r0 = r0.b(r4, r3)     // Catch:{ all -> 0x00fd }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00fd }
            r5 = r0
        L_0x00fd:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            retrofit2.HttpException r3 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.api.ApiException r0 = r0.a(r5, r3)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r0     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x0109:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            goto L_0x0128
        L_0x0114:
            timber.log.Timber$Forest r2 = timber.log.Timber.f44337a
            r2.c(r0)
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r0 = new com.hansecom.abt.api.NoConnectionException
            r0.<init>()
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x0128:
            kotlin.Result r0 = kotlin.Result.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager$addBalanceyxL6bBk$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
