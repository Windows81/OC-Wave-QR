package com.hansecom.abt.data.preferences.base;

import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$clearAll$2", f = "HashMapLocalDataProvider.kt", l = {}, m = "invokeSuspend")
final class HashMapLocalDataProvider$clearAll$2 extends SuspendLambda implements Function2<Map<String, ? extends CacheValue<Object>>, Continuation<? super Map<String, ? extends CacheValue<Object>>>, Object> {
    public int D;

    public HashMapLocalDataProvider$clearAll$2(Continuation continuation) {
        super(2, continuation);
    }

    /* renamed from: A */
    public final Object m(Map map, Continuation continuation) {
        return ((HashMapLocalDataProvider$clearAll$2) s(map, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new HashMapLocalDataProvider$clearAll$2(continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            return MapsKt.h();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
