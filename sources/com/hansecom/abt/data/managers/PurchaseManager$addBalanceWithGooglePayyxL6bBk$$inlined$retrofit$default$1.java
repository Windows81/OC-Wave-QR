package com.hansecom.abt.data.managers;

import com.google.android.gms.wallet.PaymentData;
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
@DebugMetadata(c = "com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay-yxL6bBk$$inlined$retrofit$default$1", f = "PurchaseManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay-yxL6bBk$$inlined$retrofit$default$1  reason: invalid class name */
public final class PurchaseManager$addBalanceWithGooglePayyxL6bBk$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ PurchaseManager F;
    public final /* synthetic */ PaymentData G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ BigDecimal J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseManager$addBalanceWithGooglePayyxL6bBk$$inlined$retrofit$default$1(Json json, Continuation continuation, PurchaseManager purchaseManager, PaymentData paymentData, String str, String str2, BigDecimal bigDecimal) {
        super(2, continuation);
        this.E = json;
        this.F = purchaseManager;
        this.G = paymentData;
        this.H = str;
        this.I = str2;
        this.J = bigDecimal;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PurchaseManager$addBalanceWithGooglePayyxL6bBk$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PurchaseManager$addBalanceWithGooglePayyxL6bBk$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I, this.J);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00ec */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00bc=Splitter:B:34:0x00bc, B:48:0x00ec=Splitter:B:48:0x00ec} */
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
            goto L_0x005e
        L_0x000f:
            r10 = move-exception
            goto L_0x00f8
        L_0x0012:
            r10 = move-exception
            goto L_0x0103
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001d:
            kotlin.ResultKt.b(r10)
            com.hansecom.abt.data.managers.PurchaseManager r10 = r9.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.PurchaseOperationsApi r10 = r10.f33302a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.CombinedProductOrderGooglePayRequest r1 = new com.hansecom.mapi.models.CombinedProductOrderGooglePayRequest     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.google.android.gms.wallet.PaymentData r3 = r9.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r3 = r3.Q()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r4 = "toJson(...)"
            kotlin.jvm.internal.Intrinsics.h(r3, r4)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r4 = r9.H     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.TopUpReference r5 = new com.hansecom.mapi.models.TopUpReference     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r6 = r9.I     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.math.BigDecimal r7 = r9.J     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.math.BigDecimal r7 = com.hansecom.abt.util.BigDecimalExtKt.f(r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            long r7 = r7.longValue()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.d(r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.util.List r5 = kotlin.collections.CollectionsKt.e(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.util.List r6 = kotlin.collections.CollectionsKt.m()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r3, r4, r5, r6)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r9.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r10 = r10.a(r1, r9)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r10 != r0) goto L_0x005e
            return r0
        L_0x005e:
            retrofit2.Response r10 = (retrofit2.Response) r10     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r10.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0094
            int r0 = r10.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x0071
            kotlin.Unit r10 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0078
        L_0x0071:
            java.lang.Object r0 = r10.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0081
            r10 = r0
        L_0x0078:
            kotlin.jvm.internal.Intrinsics.f(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r10 = kotlin.Result.b(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0117
        L_0x0081:
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r10, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0094:
            kotlinx.serialization.json.Json r0 = r9.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r10.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00d0
            okhttp3.ResponseBody r10 = r10.d()     // Catch:{ all -> 0x00bb }
            if (r10 == 0) goto L_0x00bb
            java.lang.String r10 = r10.k()     // Catch:{ all -> 0x00bb }
            r0.a()     // Catch:{ all -> 0x00bb }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00bb }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00bb }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00bb }
            java.lang.Object r10 = r0.b(r1, r10)     // Catch:{ all -> 0x00bb }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r10 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r10     // Catch:{ all -> 0x00bb }
            goto L_0x00bc
        L_0x00bb:
            r10 = r3
        L_0x00bc:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r10 == 0) goto L_0x00c5
            java.lang.String r1 = r10.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00c6
        L_0x00c5:
            r1 = r3
        L_0x00c6:
            if (r10 == 0) goto L_0x00cc
            java.lang.String r3 = r10.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00cc:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00d0:
            okhttp3.ResponseBody r1 = r10.d()     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x00ec
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00ec }
            r0.a()     // Catch:{ all -> 0x00ec }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00ec }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00ec }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00ec }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00ec }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00ec }
            r3 = r0
        L_0x00ec:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r10 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r10     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00f8:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r10 = kotlin.ResultKt.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
            goto L_0x0117
        L_0x0103:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r10)
            kotlin.Result$Companion r10 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r10 = new com.hansecom.abt.api.NoConnectionException
            r10.<init>()
            java.lang.Object r10 = kotlin.ResultKt.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
        L_0x0117:
            kotlin.Result r10 = kotlin.Result.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePayyxL6bBk$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
