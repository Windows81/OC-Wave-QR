package com.hansecom.abt.data.repositories;

import com.hansecom.mapi.models.PaymentMethod;
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
@DebugMetadata(c = "com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod-BWLJW6A$$inlined$retrofit$default$1", f = "PaymentMethodsRepository.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod-BWLJW6A$$inlined$retrofit$default$1  reason: invalid class name */
public final class PaymentMethodsRepository$editPaymentMethodBWLJW6A$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PaymentMethod>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ PaymentMethodsRepository F;
    public final /* synthetic */ long G;
    public final /* synthetic */ String H;
    public final /* synthetic */ boolean I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepository$editPaymentMethodBWLJW6A$$inlined$retrofit$default$1(Json json, Continuation continuation, PaymentMethodsRepository paymentMethodsRepository, long j2, String str, boolean z2) {
        super(2, continuation);
        this.E = json;
        this.F = paymentMethodsRepository;
        this.G = j2;
        this.H = str;
        this.I = z2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PaymentMethodsRepository$editPaymentMethodBWLJW6A$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PaymentMethodsRepository$editPaymentMethodBWLJW6A$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:44|45|(2:47|48)|49|50|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0104 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0 A[Catch:{ IOException -> 0x0016, all -> 0x0013 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00d4=Splitter:B:35:0x00d4, B:49:0x0104=Splitter:B:49:0x0104} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.D
            r3 = 1
            if (r2 == 0) goto L_0x0021
            if (r2 != r3) goto L_0x0019
            kotlin.ResultKt.b(r19)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r2 = r19
            goto L_0x0057
        L_0x0013:
            r0 = move-exception
            goto L_0x0110
        L_0x0016:
            r0 = move-exception
            goto L_0x011b
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0021:
            kotlin.ResultKt.b(r19)
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r2 = r1.F     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.mapi.apis.UserDataApi r2 = r2.f33527k     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            long r4 = r1.G     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.mapi.models.PaymentMethod r15 = new com.hansecom.mapi.models.PaymentMethod     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            long r6 = r1.G     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.d(r6)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r8 = r1.H     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            boolean r6 = r1.I     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.a(r6)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r14 = 120(0x78, float:1.68E-43)
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r15
            r17 = r15
            r15 = r16
            r6.<init>((java.lang.Long) r7, (java.lang.String) r8, (java.lang.Boolean) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14, (kotlin.jvm.internal.DefaultConstructorMarker) r15)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.D = r3     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3 = r17
            java.lang.Object r2 = r2.e(r4, r3, r1)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r2 != r0) goto L_0x0057
            return r0
        L_0x0057:
            retrofit2.Response r2 = (retrofit2.Response) r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            boolean r0 = r2.e()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x00ac
            int r0 = r2.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3 = 204(0xcc, float:2.86E-43)
            if (r0 == r3) goto L_0x0089
            java.lang.Object r0 = r2.a()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x0076
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x012f
        L_0x0076:
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x0089:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.Class<com.hansecom.mapi.models.PaymentMethod> r2 = com.hansecom.mapi.models.PaymentMethod.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.b(r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3.<init>()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r4 = "No content was expected with 204 but app expected "
            r3.append(r4)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3.append(r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r0     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00ac:
            kotlinx.serialization.json.Json r0 = r1.E     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            int r3 = r2.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r4 = 401(0x191, float:5.62E-43)
            r5 = 0
            if (r3 != r4) goto L_0x00e8
            okhttp3.ResponseBody r2 = r2.d()     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x00d3
            java.lang.String r2 = r2.k()     // Catch:{ all -> 0x00d3 }
            r0.a()     // Catch:{ all -> 0x00d3 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r3 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00d3 }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ all -> 0x00d3 }
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3     // Catch:{ all -> 0x00d3 }
            java.lang.Object r0 = r0.b(r3, r2)     // Catch:{ all -> 0x00d3 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r0 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r0     // Catch:{ all -> 0x00d3 }
            goto L_0x00d4
        L_0x00d3:
            r0 = r5
        L_0x00d4:
            com.hansecom.abt.api.NotAuthorizedException r2 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r3 = r0.a()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            goto L_0x00de
        L_0x00dd:
            r3 = r5
        L_0x00de:
            if (r0 == 0) goto L_0x00e4
            java.lang.String r5 = r0.b()     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00e4:
            r2.<init>(r3, r5)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r2     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x00e8:
            okhttp3.ResponseBody r3 = r2.d()     // Catch:{ all -> 0x0104 }
            if (r3 == 0) goto L_0x0104
            java.lang.String r3 = r3.k()     // Catch:{ all -> 0x0104 }
            r0.a()     // Catch:{ all -> 0x0104 }
            com.hansecom.mapi.models.ErrorResponse$Companion r4 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x0104 }
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch:{ all -> 0x0104 }
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4     // Catch:{ all -> 0x0104 }
            java.lang.Object r0 = r0.b(r4, r3)     // Catch:{ all -> 0x0104 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x0104 }
            r5 = r0
        L_0x0104:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            retrofit2.HttpException r3 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            com.hansecom.abt.api.ApiException r0 = r0.a(r5, r3)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            throw r0     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
        L_0x0110:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            goto L_0x012f
        L_0x011b:
            timber.log.Timber$Forest r2 = timber.log.Timber.f44337a
            r2.c(r0)
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r0 = new com.hansecom.abt.api.NoConnectionException
            r0.<init>()
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x012f:
            kotlin.Result r0 = kotlin.Result.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethodBWLJW6A$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
