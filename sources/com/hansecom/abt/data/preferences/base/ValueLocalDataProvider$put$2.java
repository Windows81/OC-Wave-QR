package com.hansecom.abt.data.preferences.base;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$put$2", f = "ValueLocalDataProvider.kt", l = {}, m = "invokeSuspend")
public final class ValueLocalDataProvider$put$2 extends SuspendLambda implements Function2<CacheValue<T>, Continuation<? super CacheValue<T>>, Object> {
    public int D;
    public final /* synthetic */ CacheValue E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValueLocalDataProvider$put$2(CacheValue cacheValue, Continuation continuation) {
        super(2, continuation);
        this.E = cacheValue;
    }

    /* renamed from: A */
    public final Object m(CacheValue cacheValue, Continuation continuation) {
        return ((ValueLocalDataProvider$put$2) s(cacheValue, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ValueLocalDataProvider$put$2(this.E, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            return this.E;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
