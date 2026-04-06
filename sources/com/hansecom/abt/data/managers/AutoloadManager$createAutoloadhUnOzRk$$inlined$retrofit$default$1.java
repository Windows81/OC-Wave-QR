package com.hansecom.abt.data.managers;

import com.hansecom.mapi.models.FareMediaAutoload;
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
@DebugMetadata(c = "com.hansecom.abt.data.managers.AutoloadManager$createAutoload-hUnOzRk$$inlined$retrofit$default$1", f = "AutoloadManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.AutoloadManager$createAutoload-hUnOzRk$$inlined$retrofit$default$1  reason: invalid class name */
public final class AutoloadManager$createAutoloadhUnOzRk$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends FareMediaAutoload>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ AutoloadManager F;
    public final /* synthetic */ String G;
    public final /* synthetic */ BigDecimal H;
    public final /* synthetic */ BigDecimal I;
    public final /* synthetic */ long J;
    public final /* synthetic */ Long K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadManager$createAutoloadhUnOzRk$$inlined$retrofit$default$1(Json json, Continuation continuation, AutoloadManager autoloadManager, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j2, Long l2) {
        super(2, continuation);
        this.E = json;
        this.F = autoloadManager;
        this.G = str;
        this.H = bigDecimal;
        this.I = bigDecimal2;
        this.J = j2;
        this.K = l2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AutoloadManager$createAutoloadhUnOzRk$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AutoloadManager$createAutoloadhUnOzRk$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:48|49|(2:51|52)|53|54|55) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0144 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0118 A[Catch:{ IOException -> 0x0018, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011d A[Catch:{ IOException -> 0x0018, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0120 A[Catch:{ IOException -> 0x0018, all -> 0x0015 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0114=Splitter:B:39:0x0114, B:53:0x0144=Splitter:B:53:0x0144} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.D
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            kotlin.ResultKt.b(r23)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r2 = r23
            goto L_0x0098
        L_0x0015:
            r0 = move-exception
            goto L_0x0150
        L_0x0018:
            r0 = move-exception
            goto L_0x015b
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0023:
            kotlin.ResultKt.b(r23)
            com.hansecom.abt.data.managers.AutoloadManager r2 = r1.F     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            com.hansecom.mapi.apis.AutoloadsApi r2 = r2.f33290a     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r5 = r1.G     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.math.BigDecimal r6 = r1.H     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.math.BigDecimal r6 = com.hansecom.abt.util.BigDecimalExtKt.f(r6)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            int r6 = r6.intValue()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.math.BigDecimal r7 = r1.I     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.math.BigDecimal r7 = com.hansecom.abt.util.BigDecimalExtKt.f(r7)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            int r7 = r7.intValue()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            com.hansecom.mapi.models.PaymentMethodShortened r15 = new com.hansecom.mapi.models.PaymentMethodShortened     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            long r8 = r1.J     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.d(r8)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            r8 = r15
            r8.<init>((java.lang.Long) r9, (java.lang.Boolean) r10, (java.lang.String) r11, (int) r12, (kotlin.jvm.internal.DefaultConstructorMarker) r13)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Long r8 = r1.K     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r8 == 0) goto L_0x0070
            long r8 = r8.longValue()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            com.hansecom.mapi.models.PaymentMethodShortened r10 = new com.hansecom.mapi.models.PaymentMethodShortened     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Long r17 = kotlin.coroutines.jvm.internal.Boxing.d(r8)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r20 = 6
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r10
            r16.<init>((java.lang.Long) r17, (java.lang.Boolean) r18, (java.lang.String) r19, (int) r20, (kotlin.jvm.internal.DefaultConstructorMarker) r21)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r16 = r10
            goto L_0x0072
        L_0x0070:
            r16 = r4
        L_0x0072:
            com.hansecom.mapi.models.FareMediaAutoloadRequest r14 = new com.hansecom.mapi.models.FareMediaAutoloadRequest     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r9 = r1.G     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r8 = 0
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.a(r8)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.c(r7)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.Boxing.c(r6)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r17 = 40
            r18 = 0
            r12 = 0
            r6 = 0
            r8 = r14
            r7 = r14
            r14 = r6
            r8.<init>((java.lang.String) r9, (java.lang.Boolean) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (java.util.List) r14, (com.hansecom.mapi.models.PaymentMethodShortened) r15, (com.hansecom.mapi.models.PaymentMethodShortened) r16, (int) r17, (kotlin.jvm.internal.DefaultConstructorMarker) r18)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r1.D = r3     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Object r2 = r2.b(r5, r7, r1)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r2 != r0) goto L_0x0098
            return r0
        L_0x0098:
            retrofit2.Response r2 = (retrofit2.Response) r2     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            boolean r0 = r2.e()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r0 == 0) goto L_0x00ed
            int r0 = r2.b()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r3 = 204(0xcc, float:2.86E-43)
            if (r0 == r3) goto L_0x00ca
            java.lang.Object r0 = r2.a()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r0 == 0) goto L_0x00b7
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            goto L_0x016f
        L_0x00b7:
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            throw r2     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x00ca:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Class<com.hansecom.mapi.models.FareMediaAutoload> r2 = com.hansecom.mapi.models.FareMediaAutoload.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.b(r2)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r3.<init>()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r4 = "No content was expected with 204 but app expected "
            r3.append(r4)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r3.append(r2)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            throw r0     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x00ed:
            kotlinx.serialization.json.Json r0 = r1.E     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            int r3 = r2.b()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r5 = 401(0x191, float:5.62E-43)
            if (r3 != r5) goto L_0x0128
            okhttp3.ResponseBody r2 = r2.d()     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x0113
            java.lang.String r2 = r2.k()     // Catch:{ all -> 0x0113 }
            r0.a()     // Catch:{ all -> 0x0113 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r3 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x0113 }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ all -> 0x0113 }
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3     // Catch:{ all -> 0x0113 }
            java.lang.Object r0 = r0.b(r3, r2)     // Catch:{ all -> 0x0113 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r0 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r0     // Catch:{ all -> 0x0113 }
            goto L_0x0114
        L_0x0113:
            r0 = r4
        L_0x0114:
            com.hansecom.abt.api.NotAuthorizedException r2 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r0 == 0) goto L_0x011d
            java.lang.String r3 = r0.a()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            goto L_0x011e
        L_0x011d:
            r3 = r4
        L_0x011e:
            if (r0 == 0) goto L_0x0124
            java.lang.String r4 = r0.b()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x0124:
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            throw r2     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x0128:
            okhttp3.ResponseBody r3 = r2.d()     // Catch:{ all -> 0x0144 }
            if (r3 == 0) goto L_0x0144
            java.lang.String r3 = r3.k()     // Catch:{ all -> 0x0144 }
            r0.a()     // Catch:{ all -> 0x0144 }
            com.hansecom.mapi.models.ErrorResponse$Companion r5 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x0144 }
            kotlinx.serialization.KSerializer r5 = r5.serializer()     // Catch:{ all -> 0x0144 }
            kotlinx.serialization.DeserializationStrategy r5 = (kotlinx.serialization.DeserializationStrategy) r5     // Catch:{ all -> 0x0144 }
            java.lang.Object r0 = r0.b(r5, r3)     // Catch:{ all -> 0x0144 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x0144 }
            r4 = r0
        L_0x0144:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            retrofit2.HttpException r3 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            com.hansecom.abt.api.ApiException r0 = r0.a(r4, r3)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            throw r0     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x0150:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            goto L_0x016f
        L_0x015b:
            timber.log.Timber$Forest r2 = timber.log.Timber.f44337a
            r2.c(r0)
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r0 = new com.hansecom.abt.api.NoConnectionException
            r0.<init>()
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x016f:
            kotlin.Result r0 = kotlin.Result.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.AutoloadManager$createAutoloadhUnOzRk$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
