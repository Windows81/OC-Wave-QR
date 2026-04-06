package com.hansecom.abt.data.preferences.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.BaseLocalDataProvider", f = "BaseLocalDataProvider.kt", l = {37, 38}, m = "markAsNotFresh")
public final class BaseLocalDataProvider$markAsNotFresh$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ BaseLocalDataProvider E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseLocalDataProvider$markAsNotFresh$1(BaseLocalDataProvider baseLocalDataProvider, Continuation continuation) {
        super(continuation);
        this.E = baseLocalDataProvider;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.i(this);
    }
}
