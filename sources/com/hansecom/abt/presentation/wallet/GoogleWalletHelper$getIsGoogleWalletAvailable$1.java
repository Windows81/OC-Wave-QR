package com.hansecom.abt.presentation.wallet;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.wallet.GoogleWalletHelper", f = "GoogleWalletHelper.kt", l = {35}, m = "getIsGoogleWalletAvailable")
public final class GoogleWalletHelper$getIsGoogleWalletAvailable$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ GoogleWalletHelper E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleWalletHelper$getIsGoogleWalletAvailable$1(GoogleWalletHelper googleWalletHelper, Continuation continuation) {
        super(continuation);
        this.E = googleWalletHelper;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.e(this);
    }
}
