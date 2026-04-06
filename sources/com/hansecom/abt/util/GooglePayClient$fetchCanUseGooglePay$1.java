package com.hansecom.abt.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.util.GooglePayClient", f = "GooglePayClient.kt", l = {95}, m = "fetchCanUseGooglePay")
public final class GooglePayClient$fetchCanUseGooglePay$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GooglePayClient D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GooglePayClient$fetchCanUseGooglePay$1(GooglePayClient googlePayClient, Continuation continuation) {
        super(continuation);
        this.D = googlePayClient;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(this);
    }
}
