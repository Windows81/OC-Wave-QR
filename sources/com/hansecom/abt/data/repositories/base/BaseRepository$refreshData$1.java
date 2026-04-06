package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.BaseRepository", f = "BaseRepository.kt", l = {56, 56}, m = "refreshData$app_octaRelease")
public final class BaseRepository$refreshData$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ BaseRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRepository$refreshData$1(BaseRepository baseRepository, Continuation continuation) {
        super(continuation);
        this.D = baseRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.G(this);
    }
}
