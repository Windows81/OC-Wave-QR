package com.hansecom.abt.util;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.hansecom.abt.GooglePayConfig;
import com.hansecom.abt.api.RealmPreferences;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
public final class GooglePayClient {

    /* renamed from: a  reason: collision with root package name */
    public final GooglePayConfig f39006a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f39007b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f39008c = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("emailRequired", true);

    /* renamed from: d  reason: collision with root package name */
    public final JSONArray f39009d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONArray f39010e;

    /* renamed from: f  reason: collision with root package name */
    public final JSONObject f39011f;

    /* renamed from: g  reason: collision with root package name */
    public final JSONArray f39012g;

    /* renamed from: h  reason: collision with root package name */
    public final JSONObject f39013h;

    public GooglePayClient(Context context, RealmPreferences realmPreferences) {
        Intrinsics.i(context, "context");
        Intrinsics.i(realmPreferences, "realmPreferences");
        GooglePayConfig h2 = realmPreferences.h();
        this.f39006a = h2;
        this.f39007b = LazyKt.b(new e(this, context));
        this.f39009d = new JSONArray(h2.b());
        this.f39010e = new JSONArray(h2.f());
        JSONObject put = b().put("tokenizationSpecification", e());
        Intrinsics.h(put, "put(...)");
        this.f39011f = put;
        JSONArray put2 = new JSONArray().put(put);
        Intrinsics.h(put2, "put(...)");
        this.f39012g = put2;
        JSONObject put3 = new JSONObject().put("merchantName", h2.g());
        Intrinsics.h(put3, "put(...)");
        this.f39013h = put3;
    }

    public static final PaymentsClient c(GooglePayClient googlePayClient, Context context) {
        Wallet.WalletOptions a2 = new Wallet.WalletOptions.Builder().b(googlePayClient.f39006a.e()).a();
        Intrinsics.h(a2, "build(...)");
        return Wallet.a(context, a2);
    }

    public final JSONObject b() {
        JSONObject put = new JSONObject().put("type", "CARD").put("parameters", new JSONObject().put("allowedAuthMethods", this.f39010e).put("allowedCardNetworks", this.f39009d).put("billingAddressRequired", true).put("billingAddressParameters", new JSONObject().put("format", "FULL")));
        Intrinsics.h(put, "put(...)");
        return put;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.util.GooglePayClient$fetchCanUseGooglePay$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.util.GooglePayClient$fetchCanUseGooglePay$1 r0 = (com.hansecom.abt.util.GooglePayClient$fetchCanUseGooglePay$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.util.GooglePayClient$fetchCanUseGooglePay$1 r0 = new com.hansecom.abt.util.GooglePayClient$fetchCanUseGooglePay$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            org.json.JSONObject r5 = r4.k()     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.wallet.IsReadyToPayRequest r5 = com.google.android.gms.wallet.IsReadyToPayRequest.H(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "fromJson(...)"
            kotlin.jvm.internal.Intrinsics.h(r5, r2)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.wallet.PaymentsClient r2 = r4.g()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.tasks.Task r5 = r2.s(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "isReadyToPay(...)"
            kotlin.jvm.internal.Intrinsics.h(r5, r2)     // Catch:{ all -> 0x0061 }
            r0.E = r3     // Catch:{ all -> 0x0061 }
            java.lang.Object r5 = kotlinx.coroutines.tasks.TasksKt.a(r5, r0)     // Catch:{ all -> 0x0061 }
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x005b:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)     // Catch:{ all -> 0x0061 }
            return r5
        L_0x0061:
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.util.GooglePayClient.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final JSONObject e() {
        JSONObject put = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject(MapsKt.k(TuplesKt.a("gateway", this.f39006a.h()), TuplesKt.a("gatewayMerchantId", this.f39006a.a()))));
        Intrinsics.h(put, "put(...)");
        return put;
    }

    public final JSONArray f() {
        return this.f39012g;
    }

    public final PaymentsClient g() {
        return (PaymentsClient) this.f39007b.getValue();
    }

    public final Task h(String str) {
        Intrinsics.i(str, "priceLabel");
        PaymentDataRequest H = PaymentDataRequest.H(i(str).toString());
        Intrinsics.h(H, "fromJson(...)");
        Task t2 = g().t(H);
        Intrinsics.h(t2, "loadPaymentData(...)");
        return t2;
    }

    public final JSONObject i(String str) {
        JSONObject put = this.f39008c.put("allowedPaymentMethods", this.f39012g).put("transactionInfo", j(str)).put("merchantInfo", this.f39013h).put("shippingAddressRequired", false);
        Intrinsics.h(put, "put(...)");
        return put;
    }

    public final JSONObject j(String str) {
        JSONObject put = new JSONObject().put("totalPrice", str).put("totalPriceStatus", "FINAL").put("countryCode", this.f39006a.c()).put("currencyCode", this.f39006a.d());
        Intrinsics.h(put, "put(...)");
        return put;
    }

    public final JSONObject k() {
        JSONObject put = this.f39008c.put("allowedPaymentMethods", this.f39012g);
        Intrinsics.h(put, "put(...)");
        return put;
    }
}
