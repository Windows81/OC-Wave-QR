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
import okhttp3.internal.Util;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$put$2", f = "HashMapLocalDataProvider.kt", l = {}, m = "invokeSuspend")
public final class HashMapLocalDataProvider$put$2 extends SuspendLambda implements Function2<Map<String, ? extends CacheValue<T>>, Continuation<? super Map<String, ? extends CacheValue<T>>>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ HashMapLocalDataProvider F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ CacheValue H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashMapLocalDataProvider$put$2(HashMapLocalDataProvider hashMapLocalDataProvider, Object obj, CacheValue cacheValue, Continuation continuation) {
        super(2, continuation);
        this.F = hashMapLocalDataProvider;
        this.G = obj;
        this.H = cacheValue;
    }

    /* renamed from: A */
    public final Object m(Map map, Continuation continuation) {
        return ((HashMapLocalDataProvider$put$2) s(map, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        HashMapLocalDataProvider$put$2 hashMapLocalDataProvider$put$2 = new HashMapLocalDataProvider$put$2(this.F, this.G, this.H, continuation);
        hashMapLocalDataProvider$put$2.E = obj;
        return hashMapLocalDataProvider$put$2;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Map u2 = MapsKt.u((Map) this.E);
            u2.put(this.F.k(this.G), this.H);
            return Util.W(u2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
