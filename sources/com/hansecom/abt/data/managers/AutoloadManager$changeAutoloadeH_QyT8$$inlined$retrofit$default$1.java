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
@DebugMetadata(c = "com.hansecom.abt.data.managers.AutoloadManager$changeAutoload-eH_QyT8$$inlined$retrofit$default$1", f = "AutoloadManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.AutoloadManager$changeAutoload-eH_QyT8$$inlined$retrofit$default$1  reason: invalid class name */
public final class AutoloadManager$changeAutoloadeH_QyT8$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends FareMediaAutoload>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ AutoloadManager F;
    public final /* synthetic */ String G;
    public final /* synthetic */ long H;
    public final /* synthetic */ BigDecimal I;
    public final /* synthetic */ BigDecimal J;
    public final /* synthetic */ long K;
    public final /* synthetic */ Long L;
    public final /* synthetic */ boolean M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadManager$changeAutoloadeH_QyT8$$inlined$retrofit$default$1(Json json, Continuation continuation, AutoloadManager autoloadManager, String str, long j2, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j3, Long l2, boolean z2) {
        super(2, continuation);
        this.E = json;
        this.F = autoloadManager;
        this.G = str;
        this.H = j2;
        this.I = bigDecimal;
        this.J = bigDecimal2;
        this.K = j3;
        this.L = l2;
        this.M = z2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AutoloadManager$changeAutoloadeH_QyT8$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AutoloadManager$changeAutoloadeH_QyT8$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:48|49|(2:51|52)|53|54|55) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x014c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0120 A[Catch:{ IOException -> 0x0018, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125 A[Catch:{ IOException -> 0x0018, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128 A[Catch:{ IOException -> 0x0018, all -> 0x0015 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x011c=Splitter:B:39:0x011c, B:53:0x014c=Splitter:B:53:0x014c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.D
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            kotlin.ResultKt.b(r24)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r2 = r24
            goto L_0x00a0
        L_0x0015:
            r0 = move-exception
            goto L_0x0158
        L_0x0018:
            r0 = move-exception
            goto L_0x0163
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0023:
            kotlin.ResultKt.b(r24)
            com.hansecom.abt.data.managers.AutoloadManager r2 = r1.F     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            com.hansecom.mapi.apis.AutoloadsApi r2 = r2.f33290a     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r5 = r1.G     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            long r6 = r1.H     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.math.BigDecimal r7 = r1.I     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.math.BigDecimal r7 = com.hansecom.abt.util.BigDecimalExtKt.f(r7)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            int r7 = r7.intValue()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.math.BigDecimal r8 = r1.J     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.math.BigDecimal r8 = com.hansecom.abt.util.BigDecimalExtKt.f(r8)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            int r8 = r8.intValue()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            com.hansecom.mapi.models.PaymentMethodShortened r16 = new com.hansecom.mapi.models.PaymentMethodShortened     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            long r9 = r1.K     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.d(r9)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r13 = 6
            r14 = 0
            r11 = 0
            r12 = 0
            r9 = r16
            r9.<init>((java.lang.Long) r10, (java.lang.Boolean) r11, (java.lang.String) r12, (int) r13, (kotlin.jvm.internal.DefaultConstructorMarker) r14)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Long r9 = r1.L     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r9 == 0) goto L_0x0077
            long r9 = r9.longValue()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            com.hansecom.mapi.models.PaymentMethodShortened r11 = new com.hansecom.mapi.models.PaymentMethodShortened     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Long r18 = kotlin.coroutines.jvm.internal.Boxing.d(r9)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r21 = 6
            r22 = 0
            r19 = 0
            r20 = 0
            r17 = r11
            r17.<init>((java.lang.Long) r18, (java.lang.Boolean) r19, (java.lang.String) r20, (int) r21, (kotlin.jvm.internal.DefaultConstructorMarker) r22)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r17 = r11
            goto L_0x0079
        L_0x0077:
            r17 = r4
        L_0x0079:
            com.hansecom.mapi.models.FareMediaAutoloadRequest r15 = new com.hansecom.mapi.models.FareMediaAutoloadRequest     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r10 = r1.G     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            boolean r9 = r1.M     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.a(r9)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.c(r8)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.Boxing.c(r7)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r18 = 40
            r19 = 0
            r13 = 0
            r7 = 0
            r9 = r15
            r8 = r15
            r15 = r7
            r9.<init>((java.lang.String) r10, (java.lang.Boolean) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (java.util.List) r15, (com.hansecom.mapi.models.PaymentMethodShortened) r16, (com.hansecom.mapi.models.PaymentMethodShortened) r17, (int) r18, (kotlin.jvm.internal.DefaultConstructorMarker) r19)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r1.D = r3     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Object r2 = r2.a(r5, r6, r8, r1)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r2 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            retrofit2.Response r2 = (retrofit2.Response) r2     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            boolean r0 = r2.e()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r0 == 0) goto L_0x00f5
            int r0 = r2.b()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r3 = 204(0xcc, float:2.86E-43)
            if (r0 == r3) goto L_0x00d2
            java.lang.Object r0 = r2.a()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r0 == 0) goto L_0x00bf
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            goto L_0x0177
        L_0x00bf:
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            throw r2     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x00d2:
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
        L_0x00f5:
            kotlinx.serialization.json.Json r0 = r1.E     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            int r3 = r2.b()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r5 = 401(0x191, float:5.62E-43)
            if (r3 != r5) goto L_0x0130
            okhttp3.ResponseBody r2 = r2.d()     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x011b
            java.lang.String r2 = r2.k()     // Catch:{ all -> 0x011b }
            r0.a()     // Catch:{ all -> 0x011b }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r3 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x011b }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ all -> 0x011b }
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r0.b(r3, r2)     // Catch:{ all -> 0x011b }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r0 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r0     // Catch:{ all -> 0x011b }
            goto L_0x011c
        L_0x011b:
            r0 = r4
        L_0x011c:
            com.hansecom.abt.api.NotAuthorizedException r2 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            if (r0 == 0) goto L_0x0125
            java.lang.String r3 = r0.a()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            goto L_0x0126
        L_0x0125:
            r3 = r4
        L_0x0126:
            if (r0 == 0) goto L_0x012c
            java.lang.String r4 = r0.b()     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x012c:
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            throw r2     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x0130:
            okhttp3.ResponseBody r3 = r2.d()     // Catch:{ all -> 0x014c }
            if (r3 == 0) goto L_0x014c
            java.lang.String r3 = r3.k()     // Catch:{ all -> 0x014c }
            r0.a()     // Catch:{ all -> 0x014c }
            com.hansecom.mapi.models.ErrorResponse$Companion r5 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x014c }
            kotlinx.serialization.KSerializer r5 = r5.serializer()     // Catch:{ all -> 0x014c }
            kotlinx.serialization.DeserializationStrategy r5 = (kotlinx.serialization.DeserializationStrategy) r5     // Catch:{ all -> 0x014c }
            java.lang.Object r0 = r0.b(r5, r3)     // Catch:{ all -> 0x014c }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x014c }
            r4 = r0
        L_0x014c:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            retrofit2.HttpException r3 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            com.hansecom.abt.api.ApiException r0 = r0.a(r4, r3)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            throw r0     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
        L_0x0158:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            goto L_0x0177
        L_0x0163:
            timber.log.Timber$Forest r2 = timber.log.Timber.f44337a
            r2.c(r0)
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r0 = new com.hansecom.abt.api.NoConnectionException
            r0.<init>()
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x0177:
            kotlin.Result r0 = kotlin.Result.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.AutoloadManager$changeAutoloadeH_QyT8$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
