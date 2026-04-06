package com.hansecom.abt.data.managers;

import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;
import com.hansecom.mapi.models.BillingAddress;
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
@DebugMetadata(c = "com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod-BWLJW6A$$inlined$retrofit$default$1", f = "PaymentMethodsManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod-BWLJW6A$$inlined$retrofit$default$1  reason: invalid class name */
public final class PaymentMethodsManager$addPaymentMethodBWLJW6A$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ PaymentMethodsManager F;
    public final /* synthetic */ CreditCardInfoNetworkMerchantResponse G;
    public final /* synthetic */ BillingAddress H;
    public final /* synthetic */ String I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsManager$addPaymentMethodBWLJW6A$$inlined$retrofit$default$1(Json json, Continuation continuation, PaymentMethodsManager paymentMethodsManager, CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse, BillingAddress billingAddress, String str) {
        super(2, continuation);
        this.E = json;
        this.F = paymentMethodsManager;
        this.G = creditCardInfoNetworkMerchantResponse;
        this.H = billingAddress;
        this.I = str;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PaymentMethodsManager$addPaymentMethodBWLJW6A$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PaymentMethodsManager$addPaymentMethodBWLJW6A$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00ff */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00db A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00cf=Splitter:B:34:0x00cf, B:48:0x00ff=Splitter:B:48:0x00ff} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0071
        L_0x000f:
            r13 = move-exception
            goto L_0x010b
        L_0x0012:
            r13 = move-exception
            goto L_0x0116
        L_0x0015:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001d:
            kotlin.ResultKt.b(r13)
            com.hansecom.abt.data.managers.PaymentMethodsManager r13 = r12.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.UserDataApi r13 = r13.f33300a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r1 = r12.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r4 = r1.c()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r1 = r12.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Card r1 = r1.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r5 = r1.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r1 = r12.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Card r1 = r1.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r8 = r1.c()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r1 = r12.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Card r1 = r1.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r9 = r1.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r1 = r12.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Check r1 = r1.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r10 = r1.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r1 = r12.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Check r1 = r1.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r11 = r1.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.AddPaymentMethodRequest r1 = new com.hansecom.mapi.models.AddPaymentMethodRequest     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.BillingAddress r6 = r12.H     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r7 = r12.I     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r12.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r13 = r13.c(r1, r12)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r13 != r0) goto L_0x0071
            return r0
        L_0x0071:
            retrofit2.Response r13 = (retrofit2.Response) r13     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r13.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x00a7
            int r0 = r13.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x0084
            kotlin.Unit r13 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x008b
        L_0x0084:
            java.lang.Object r0 = r13.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0094
            r13 = r0
        L_0x008b:
            kotlin.jvm.internal.Intrinsics.f(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r13 = kotlin.Result.b(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x012a
        L_0x0094:
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r13, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00a7:
            kotlinx.serialization.json.Json r0 = r12.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r13.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00e3
            okhttp3.ResponseBody r13 = r13.d()     // Catch:{ all -> 0x00ce }
            if (r13 == 0) goto L_0x00ce
            java.lang.String r13 = r13.k()     // Catch:{ all -> 0x00ce }
            r0.a()     // Catch:{ all -> 0x00ce }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00ce }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00ce }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00ce }
            java.lang.Object r13 = r0.b(r1, r13)     // Catch:{ all -> 0x00ce }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r13 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r13     // Catch:{ all -> 0x00ce }
            goto L_0x00cf
        L_0x00ce:
            r13 = r3
        L_0x00cf:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r13 == 0) goto L_0x00d8
            java.lang.String r1 = r13.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00d9
        L_0x00d8:
            r1 = r3
        L_0x00d9:
            if (r13 == 0) goto L_0x00df
            java.lang.String r3 = r13.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00df:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00e3:
            okhttp3.ResponseBody r1 = r13.d()     // Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00ff }
            r0.a()     // Catch:{ all -> 0x00ff }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00ff }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00ff }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00ff }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00ff }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00ff }
            r3 = r0
        L_0x00ff:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r13 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r13     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x010b:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r13 = kotlin.ResultKt.a(r13)
            java.lang.Object r13 = kotlin.Result.b(r13)
            goto L_0x012a
        L_0x0116:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r13)
            kotlin.Result$Companion r13 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r13 = new com.hansecom.abt.api.NoConnectionException
            r13.<init>()
            java.lang.Object r13 = kotlin.ResultKt.a(r13)
            java.lang.Object r13 = kotlin.Result.b(r13)
        L_0x012a:
            kotlin.Result r13 = kotlin.Result.a(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethodBWLJW6A$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}
