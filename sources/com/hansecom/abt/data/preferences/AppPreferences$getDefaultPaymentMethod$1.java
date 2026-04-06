package com.hansecom.abt.data.preferences;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.AppPreferences", f = "AppPreferences.kt", l = {33}, m = "getDefaultPaymentMethod")
public final class AppPreferences$getDefaultPaymentMethod$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ AppPreferences D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppPreferences$getDefaultPaymentMethod$1(AppPreferences appPreferences, Continuation continuation) {
        super(continuation);
        this.D = appPreferences;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(this);
    }
}
