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
@DebugMetadata(c = "com.hansecom.abt.data.managers.FareMediaManager$transferBalance-BWLJW6A$$inlined$retrofit$default$1", f = "FareMediaManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.FareMediaManager$transferBalance-BWLJW6A$$inlined$retrofit$default$1  reason: invalid class name */
public final class FareMediaManager$transferBalanceBWLJW6A$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ FareMediaManager F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ BigDecimal I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaManager$transferBalanceBWLJW6A$$inlined$retrofit$default$1(Json json, Continuation continuation, FareMediaManager fareMediaManager, String str, String str2, BigDecimal bigDecimal) {
        super(2, continuation);
        this.E = json;
        this.F = fareMediaManager;
        this.G = str;
        this.H = str2;
        this.I = bigDecimal;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaManager$transferBalanceBWLJW6A$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaManager$transferBalanceBWLJW6A$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00d4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00a4=Splitter:B:34:0x00a4, B:48:0x00d4=Splitter:B:48:0x00d4} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0046
        L_0x000f:
            r7 = move-exception
            goto L_0x00e0
        L_0x0012:
            r7 = move-exception
            goto L_0x00eb
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001d:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.data.managers.FareMediaManager r7 = r6.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.UserFareMediaApi r7 = r7.f33293b     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r1 = r6.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.BalanceTransferRequest r3 = new com.hansecom.mapi.models.BalanceTransferRequest     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r4 = r6.H     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.math.BigDecimal r5 = r6.I     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.math.BigDecimal r5 = com.hansecom.abt.util.BigDecimalExtKt.f(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r5 = r5.intValue()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.c(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r6.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r7 = r7.p(r1, r3, r6)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r7 != r0) goto L_0x0046
            return r0
        L_0x0046:
            retrofit2.Response r7 = (retrofit2.Response) r7     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r7.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x007c
            int r0 = r7.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x0059
            kotlin.Unit r7 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0060
        L_0x0059:
            java.lang.Object r0 = r7.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0069
            r7 = r0
        L_0x0060:
            kotlin.jvm.internal.Intrinsics.f(r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00ff
        L_0x0069:
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x007c:
            kotlinx.serialization.json.Json r0 = r6.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r7.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00b8
            okhttp3.ResponseBody r7 = r7.d()     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x00a3
            java.lang.String r7 = r7.k()     // Catch:{ all -> 0x00a3 }
            r0.a()     // Catch:{ all -> 0x00a3 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00a3 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00a3 }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00a3 }
            java.lang.Object r7 = r0.b(r1, r7)     // Catch:{ all -> 0x00a3 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r7 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r7     // Catch:{ all -> 0x00a3 }
            goto L_0x00a4
        L_0x00a3:
            r7 = r3
        L_0x00a4:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r7 == 0) goto L_0x00ad
            java.lang.String r1 = r7.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00ae
        L_0x00ad:
            r1 = r3
        L_0x00ae:
            if (r7 == 0) goto L_0x00b4
            java.lang.String r3 = r7.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00b4:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00b8:
            okhttp3.ResponseBody r1 = r7.d()     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00d4
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00d4 }
            r0.a()     // Catch:{ all -> 0x00d4 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00d4 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00d4 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00d4 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00d4 }
            r3 = r0
        L_0x00d4:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r7 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r7     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00e0:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
            goto L_0x00ff
        L_0x00eb:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r7)
            kotlin.Result$Companion r7 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r7 = new com.hansecom.abt.api.NoConnectionException
            r7.<init>()
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L_0x00ff:
            kotlin.Result r7 = kotlin.Result.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager$transferBalanceBWLJW6A$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
