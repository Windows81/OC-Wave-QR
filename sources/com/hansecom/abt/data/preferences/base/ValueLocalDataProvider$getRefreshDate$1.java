package com.hansecom.abt.data.preferences.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.ValueLocalDataProvider", f = "ValueLocalDataProvider.kt", l = {33}, m = "getRefreshDate")
public final class ValueLocalDataProvider$getRefreshDate$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ ValueLocalDataProvider D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValueLocalDataProvider$getRefreshDate$1(ValueLocalDataProvider valueLocalDataProvider, Continuation continuation) {
        super(continuation);
        this.D = valueLocalDataProvider;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.f(this);
    }
}
