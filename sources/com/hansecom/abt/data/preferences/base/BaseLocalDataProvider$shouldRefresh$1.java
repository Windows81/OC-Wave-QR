package com.hansecom.abt.data.preferences.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.BaseLocalDataProvider", f = "BaseLocalDataProvider.kt", l = {18}, m = "shouldRefresh")
public final class BaseLocalDataProvider$shouldRefresh$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ BaseLocalDataProvider D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseLocalDataProvider$shouldRefresh$1(BaseLocalDataProvider baseLocalDataProvider, Continuation continuation) {
        super(continuation);
        this.D = baseLocalDataProvider;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.l(this);
    }
}
