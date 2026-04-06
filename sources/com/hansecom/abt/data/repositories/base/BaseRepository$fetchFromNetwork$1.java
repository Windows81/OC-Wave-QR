package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.BaseRepository", f = "BaseRepository.kt", l = {177}, m = "fetchFromNetwork")
public final class BaseRepository$fetchFromNetwork$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ BaseRepository F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRepository$fetchFromNetwork$1(BaseRepository baseRepository, Continuation continuation) {
        super(continuation);
        this.F = baseRepository;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h(this);
    }
}
