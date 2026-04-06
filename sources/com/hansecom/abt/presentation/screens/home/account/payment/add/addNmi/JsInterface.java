package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.google.firebase.Firebase;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import com.hansecom.abt.R;
import com.hansecom.abt.api.JsonParser;
import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import timber.log.Timber;

@Metadata
final class JsInterface {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f35667a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f35668b;

    /* renamed from: c  reason: collision with root package name */
    public final Json f35669c = JsonParser.f33114a.c();

    public JsInterface(Function1 function1, Function1 function12) {
        Intrinsics.i(function1, "onCardAdded");
        Intrinsics.i(function12, "onError");
        this.f35667a = function1;
        this.f35668b = function12;
    }

    public static final void b(JsInterface jsInterface, CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse) {
        jsInterface.f35667a.invoke(creditCardInfoNetworkMerchantResponse);
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        Intrinsics.i(str, "value");
        try {
            Json json = this.f35669c;
            json.a();
            new Handler(Looper.getMainLooper()).post(new T(this, (CreditCardInfoNetworkMerchantResponse) json.b(CreditCardInfoNetworkMerchantResponse.Companion.serializer(), str)));
        } catch (Throwable th) {
            Timber.f44337a.c(th);
            FirebaseCrashlyticsKt.a(Firebase.f29632a).c(th);
            this.f35668b.invoke(StringValueKt.c(R.string.N3));
        }
    }
}
