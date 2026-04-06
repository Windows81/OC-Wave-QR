package com.hansecom.abt.data.preferences.base;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$buildCacheValueSerializer$1", f = "ValueLocalDataProvider.kt", l = {140}, m = "readFrom")
public final class ValueLocalDataProvider$buildCacheValueSerializer$1$readFrom$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ValueLocalDataProvider$buildCacheValueSerializer$1 E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValueLocalDataProvider$buildCacheValueSerializer$1$readFrom$1(ValueLocalDataProvider$buildCacheValueSerializer$1 valueLocalDataProvider$buildCacheValueSerializer$1, Continuation continuation) {
        super(continuation);
        this.E = valueLocalDataProvider$buildCacheValueSerializer$1;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.c((InputStream) null, this);
    }
}
