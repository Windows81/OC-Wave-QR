package com.hansecom.abt.data.managers;

import com.hansecom.mapi.models.FareMedium;
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
@DebugMetadata(c = "com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard-yxL6bBk$$inlined$retrofit$default$1", f = "FareMediaManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard-yxL6bBk$$inlined$retrofit$default$1  reason: invalid class name */
public final class FareMediaManager$purchaseVirtualCardyxL6bBk$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends FareMedium>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ FareMediaManager F;
    public final /* synthetic */ BigDecimal G;
    public final /* synthetic */ Integer H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Long J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaManager$purchaseVirtualCardyxL6bBk$$inlined$retrofit$default$1(Json json, Continuation continuation, FareMediaManager fareMediaManager, BigDecimal bigDecimal, Integer num, String str, Long l2) {
        super(2, continuation);
        this.E = json;
        this.F = fareMediaManager;
        this.G = bigDecimal;
        this.H = num;
        this.I = str;
        this.J = l2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaManager$purchaseVirtualCardyxL6bBk$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaManager$purchaseVirtualCardyxL6bBk$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I, this.J);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:47|48|(2:50|51)|52|53|54) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0125 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9 A[Catch:{ IOException -> 0x0013, all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fe A[Catch:{ IOException -> 0x0013, all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0101 A[Catch:{ IOException -> 0x0013, all -> 0x0010 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x00f5=Splitter:B:38:0x00f5, B:52:0x0125=Splitter:B:52:0x0125} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r13.D
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.ResultKt.b(r14)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            goto L_0x0079
        L_0x0010:
            r14 = move-exception
            goto L_0x0131
        L_0x0013:
            r14 = move-exception
            goto L_0x013c
        L_0x0016:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001e:
            kotlin.ResultKt.b(r14)
            com.hansecom.abt.data.managers.FareMediaManager r14 = r13.F     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.mapi.apis.UserFareMediaApi r4 = r14.f33293b     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.abt.data.managers.FareMediaManager r14 = r13.F     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.abt.data.deviceInfo.DeviceInfo r14 = r14.f33292a     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r5 = r14.b()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.abt.data.managers.FareMediaManager r14 = r13.F     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.abt.data.deviceInfo.DeviceInfo r14 = r14.f33292a     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r6 = r14.a()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.mapi.models.FareMediumPurchaseCreateRequest$WalletType r10 = com.hansecom.mapi.models.FareMediumPurchaseCreateRequest.WalletType.GOOGLE     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.math.BigDecimal r14 = r13.G     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            int r14 = r14.compareTo(r1)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r14 <= 0) goto L_0x005c
            com.hansecom.mapi.models.TopUpReference r14 = new com.hansecom.mapi.models.TopUpReference     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.math.BigDecimal r1 = r13.G     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.math.BigDecimal r1 = com.hansecom.abt.util.BigDecimalExtKt.f(r1)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            long r7 = r1.longValue()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.d(r7)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r14.<init>((java.lang.String) r3, (java.lang.Long) r1, (int) r2, (kotlin.jvm.internal.DefaultConstructorMarker) r3)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r12 = r14
            goto L_0x005d
        L_0x005c:
            r12 = r3
        L_0x005d:
            com.hansecom.mapi.models.FareMediumPurchaseCreateRequest r14 = new com.hansecom.mapi.models.FareMediumPurchaseCreateRequest     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.Integer r8 = r13.H     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r9 = r13.I     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.Long r11 = r13.J     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r13.D = r2     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r7 = 0
            r8 = 0
            r11 = 12
            r12 = 0
            r9 = r14
            r10 = r13
            java.lang.Object r14 = com.hansecom.mapi.apis.UserFareMediaApi.DefaultImpls.c(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r14 != r0) goto L_0x0079
            return r0
        L_0x0079:
            retrofit2.Response r14 = (retrofit2.Response) r14     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            boolean r0 = r14.e()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r0 == 0) goto L_0x00ce
            int r0 = r14.b()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x00ab
            java.lang.Object r0 = r14.a()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r0 == 0) goto L_0x0098
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.Object r14 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            goto L_0x0150
        L_0x0098:
            java.lang.String r14 = r14.toString()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r14, r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r14 = r14.toString()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            throw r0     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x00ab:
            kotlin.Unit r14 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.Class<com.hansecom.mapi.models.FareMedium> r0 = com.hansecom.mapi.models.FareMedium.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.<init>()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.append(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r14.<init>(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            throw r14     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x00ce:
            kotlinx.serialization.json.Json r0 = r13.E     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            int r1 = r14.b()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r2 = 401(0x191, float:5.62E-43)
            if (r1 != r2) goto L_0x0109
            okhttp3.ResponseBody r14 = r14.d()     // Catch:{ all -> 0x00f4 }
            if (r14 == 0) goto L_0x00f4
            java.lang.String r14 = r14.k()     // Catch:{ all -> 0x00f4 }
            r0.a()     // Catch:{ all -> 0x00f4 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00f4 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00f4 }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00f4 }
            java.lang.Object r14 = r0.b(r1, r14)     // Catch:{ all -> 0x00f4 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r14 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r14     // Catch:{ all -> 0x00f4 }
            goto L_0x00f5
        L_0x00f4:
            r14 = r3
        L_0x00f5:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            if (r14 == 0) goto L_0x00fe
            java.lang.String r1 = r14.a()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            goto L_0x00ff
        L_0x00fe:
            r1 = r3
        L_0x00ff:
            if (r14 == 0) goto L_0x0105
            java.lang.String r3 = r14.b()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x0105:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            throw r0     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x0109:
            okhttp3.ResponseBody r1 = r14.d()     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x0125 }
            r0.a()     // Catch:{ all -> 0x0125 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x0125 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x0125 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x0125 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x0125 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x0125 }
            r3 = r0
        L_0x0125:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.<init>(r14)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            com.hansecom.abt.api.ApiException r14 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            throw r14     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
        L_0x0131:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r14 = kotlin.ResultKt.a(r14)
            java.lang.Object r14 = kotlin.Result.b(r14)
            goto L_0x0150
        L_0x013c:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r14)
            kotlin.Result$Companion r14 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r14 = new com.hansecom.abt.api.NoConnectionException
            r14.<init>()
            java.lang.Object r14 = kotlin.ResultKt.a(r14)
            java.lang.Object r14 = kotlin.Result.b(r14)
        L_0x0150:
            kotlin.Result r14 = kotlin.Result.a(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCardyxL6bBk$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
