package com.hansecom.abt.data.managers;

import com.google.android.gms.wallet.PaymentData;
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
@DebugMetadata(c = "com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay-yxL6bBk$$inlined$retrofit$default$1", f = "PurchaseManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay-yxL6bBk$$inlined$retrofit$default$1  reason: invalid class name */
public final class PurchaseManager$purchasePassWithGooglePayyxL6bBk$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ PurchaseManager F;
    public final /* synthetic */ PaymentData G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Integer J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseManager$purchasePassWithGooglePayyxL6bBk$$inlined$retrofit$default$1(Json json, Continuation continuation, PurchaseManager purchaseManager, PaymentData paymentData, String str, String str2, Integer num) {
        super(2, continuation);
        this.E = json;
        this.F = purchaseManager;
        this.G = paymentData;
        this.H = str;
        this.I = str2;
        this.J = num;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PurchaseManager$purchasePassWithGooglePayyxL6bBk$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PurchaseManager$purchasePassWithGooglePayyxL6bBk$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I, this.J);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00e0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00b0=Splitter:B:34:0x00b0, B:48:0x00e0=Splitter:B:48:0x00e0} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r10.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0052
        L_0x000f:
            r11 = move-exception
            goto L_0x00ec
        L_0x0012:
            r11 = move-exception
            goto L_0x00f7
        L_0x0015:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001d:
            kotlin.ResultKt.b(r11)
            com.hansecom.abt.data.managers.PurchaseManager r11 = r10.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.PurchaseOperationsApi r11 = r11.f33302a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.CombinedProductOrderGooglePayRequest r1 = new com.hansecom.mapi.models.CombinedProductOrderGooglePayRequest     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.google.android.gms.wallet.PaymentData r3 = r10.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r4 = r3.Q()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r3 = "toJson(...)"
            kotlin.jvm.internal.Intrinsics.h(r4, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r5 = r10.H     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.ProductConfiguration r3 = new com.hansecom.mapi.models.ProductConfiguration     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r6 = r10.I     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Integer r7 = r10.J     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r3.<init>(r6, r2, r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.util.List r7 = kotlin.collections.CollectionsKt.e(r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r8 = 4
            r9 = 0
            r6 = 0
            r3 = r1
            r3.<init>((java.lang.String) r4, (java.lang.String) r5, (java.util.List) r6, (java.util.List) r7, (int) r8, (kotlin.jvm.internal.DefaultConstructorMarker) r9)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r10.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r11 = r11.a(r1, r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r11 != r0) goto L_0x0052
            return r0
        L_0x0052:
            retrofit2.Response r11 = (retrofit2.Response) r11     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r11.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0088
            int r0 = r11.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x0065
            kotlin.Unit r11 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x006c
        L_0x0065:
            java.lang.Object r0 = r11.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0075
            r11 = r0
        L_0x006c:
            kotlin.jvm.internal.Intrinsics.f(r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r11 = kotlin.Result.b(r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x010b
        L_0x0075:
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r11, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0088:
            kotlinx.serialization.json.Json r0 = r10.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r11.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00c4
            okhttp3.ResponseBody r11 = r11.d()     // Catch:{ all -> 0x00af }
            if (r11 == 0) goto L_0x00af
            java.lang.String r11 = r11.k()     // Catch:{ all -> 0x00af }
            r0.a()     // Catch:{ all -> 0x00af }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00af }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00af }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00af }
            java.lang.Object r11 = r0.b(r1, r11)     // Catch:{ all -> 0x00af }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r11 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r11     // Catch:{ all -> 0x00af }
            goto L_0x00b0
        L_0x00af:
            r11 = r3
        L_0x00b0:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r11 == 0) goto L_0x00b9
            java.lang.String r1 = r11.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00ba
        L_0x00b9:
            r1 = r3
        L_0x00ba:
            if (r11 == 0) goto L_0x00c0
            java.lang.String r3 = r11.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00c0:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00c4:
            okhttp3.ResponseBody r1 = r11.d()     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00e0 }
            r0.a()     // Catch:{ all -> 0x00e0 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00e0 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00e0 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00e0 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00e0 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00e0 }
            r3 = r0
        L_0x00e0:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r11 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r11     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00ec:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r11 = kotlin.ResultKt.a(r11)
            java.lang.Object r11 = kotlin.Result.b(r11)
            goto L_0x010b
        L_0x00f7:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r11)
            kotlin.Result$Companion r11 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r11 = new com.hansecom.abt.api.NoConnectionException
            r11.<init>()
            java.lang.Object r11 = kotlin.ResultKt.a(r11)
            java.lang.Object r11 = kotlin.Result.b(r11)
        L_0x010b:
            kotlin.Result r11 = kotlin.Result.a(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePayyxL6bBk$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
