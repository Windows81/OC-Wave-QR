package com.hansecom.abt.data.preferences.base;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1", f = "HashMapLocalDataProvider.kt", l = {150}, m = "readFrom")
public final class HashMapLocalDataProvider$buildCacheValueSerializer$1$readFrom$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ HashMapLocalDataProvider$buildCacheValueSerializer$1 E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashMapLocalDataProvider$buildCacheValueSerializer$1$readFrom$1(HashMapLocalDataProvider$buildCacheValueSerializer$1 hashMapLocalDataProvider$buildCacheValueSerializer$1, Continuation continuation) {
        super(continuation);
        this.E = hashMapLocalDataProvider$buildCacheValueSerializer$1;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.c((InputStream) null, this);
    }
}
