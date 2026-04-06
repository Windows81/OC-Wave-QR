package com.hansecom.abt.data.managers;

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
@DebugMetadata(c = "com.hansecom.abt.data.managers.PurchaseManager$purchasePass-hUnOzRk$$inlined$retrofit$default$1", f = "PurchaseManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.PurchaseManager$purchasePass-hUnOzRk$$inlined$retrofit$default$1  reason: invalid class name */
public final class PurchaseManager$purchasePasshUnOzRk$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ PurchaseManager F;
    public final /* synthetic */ Long G;
    public final /* synthetic */ String H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ String J;
    public final /* synthetic */ Integer K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseManager$purchasePasshUnOzRk$$inlined$retrofit$default$1(Json json, Continuation continuation, PurchaseManager purchaseManager, Long l2, String str, boolean z2, String str2, Integer num) {
        super(2, continuation);
        this.E = json;
        this.F = purchaseManager;
        this.G = l2;
        this.H = str;
        this.I = z2;
        this.J = str2;
        this.K = num;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PurchaseManager$purchasePasshUnOzRk$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PurchaseManager$purchasePasshUnOzRk$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00ef */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00bf=Splitter:B:34:0x00bf, B:48:0x00ef=Splitter:B:48:0x00ef} */
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
            goto L_0x0062
        L_0x0013:
            r0 = move-exception
            goto L_0x00fb
        L_0x0016:
            r0 = move-exception
            goto L_0x0106
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
            java.lang.Long r8 = r1.G     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r9 = r1.H     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            boolean r4 = r1.I     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.a(r4)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.mapi.models.ProductConfiguration r4 = new com.hansecom.mapi.models.ProductConfiguration     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r5 = r1.J     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Integer r6 = r1.K     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r4.<init>(r5, r3, r6)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.util.List r13 = kotlin.collections.CollectionsKt.e(r4)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r16 = 679(0x2a7, float:9.51E-43)
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r4 = r15
            r18 = r15
            r15 = r16
            r16 = r17
            r4.<init>((java.util.List) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.Long) r8, (java.lang.String) r9, (com.hansecom.mapi.models.AdditionalPaymentInfo) r10, (java.lang.Boolean) r11, (java.util.List) r12, (java.util.List) r13, (com.hansecom.mapi.models.UserAddress) r14, (int) r15, (kotlin.jvm.internal.DefaultConstructorMarker) r16)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.D = r3     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3 = r18
            java.lang.Object r2 = r2.b(r3, r1)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r2 != r0) goto L_0x0062
            return r0
        L_0x0062:
            retrofit2.Response r2 = (retrofit2.Response) r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            boolean r0 = r2.e()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x0097
            int r0 = r2.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3 = 204(0xcc, float:2.86E-43)
            if (r0 != r3) goto L_0x0075
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x007b
        L_0x0075:
            java.lang.Object r0 = r2.a()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x0084
        L_0x007b:
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x011a
        L_0x0084:
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x0097:
            kotlinx.serialization.json.Json r0 = r1.E     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            int r3 = r2.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r4 = 401(0x191, float:5.62E-43)
            r5 = 0
            if (r3 != r4) goto L_0x00d3
            okhttp3.ResponseBody r2 = r2.d()     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = r2.k()     // Catch:{ all -> 0x00be }
            r0.a()     // Catch:{ all -> 0x00be }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r3 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00be }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ all -> 0x00be }
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = r0.b(r3, r2)     // Catch:{ all -> 0x00be }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r0 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r0     // Catch:{ all -> 0x00be }
            goto L_0x00bf
        L_0x00be:
            r0 = r5
        L_0x00bf:
            com.hansecom.abt.api.NotAuthorizedException r2 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x00c8
            java.lang.String r3 = r0.a()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x00c9
        L_0x00c8:
            r3 = r5
        L_0x00c9:
            if (r0 == 0) goto L_0x00cf
            java.lang.String r5 = r0.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00cf:
            r2.<init>(r3, r5)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00d3:
            okhttp3.ResponseBody r3 = r2.d()     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x00ef
            java.lang.String r3 = r3.k()     // Catch:{ all -> 0x00ef }
            r0.a()     // Catch:{ all -> 0x00ef }
            com.hansecom.mapi.models.ErrorResponse$Companion r4 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00ef }
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch:{ all -> 0x00ef }
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4     // Catch:{ all -> 0x00ef }
            java.lang.Object r0 = r0.b(r4, r3)     // Catch:{ all -> 0x00ef }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00ef }
            r5 = r0
        L_0x00ef:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            retrofit2.HttpException r3 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.api.ApiException r0 = r0.a(r5, r3)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r0     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00fb:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            goto L_0x011a
        L_0x0106:
            timber.log.Timber$Forest r2 = timber.log.Timber.f44337a
            r2.c(r0)
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r0 = new com.hansecom.abt.api.NoConnectionException
            r0.<init>()
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x011a:
            kotlin.Result r0 = kotlin.Result.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager$purchasePasshUnOzRk$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
