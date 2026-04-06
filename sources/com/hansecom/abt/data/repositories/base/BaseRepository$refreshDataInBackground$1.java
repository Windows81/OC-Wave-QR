package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.BaseRepository", f = "BaseRepository.kt", l = {60}, m = "refreshDataInBackground$app_octaRelease")
public final class BaseRepository$refreshDataInBackground$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ BaseRepository E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRepository$refreshDataInBackground$1(BaseRepository baseRepository, Continuation continuation) {
        super(continuation);
        this.E = baseRepository;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.H(this);
    }
}
