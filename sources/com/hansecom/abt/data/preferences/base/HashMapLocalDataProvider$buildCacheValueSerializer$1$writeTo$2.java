package com.hansecom.abt.data.preferences.base;

import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1$writeTo$2", f = "HashMapLocalDataProvider.kt", l = {}, m = "invokeSuspend")
public final class HashMapLocalDataProvider$buildCacheValueSerializer$1$writeTo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ HashMapLocalDataProvider E;
    public final /* synthetic */ Map F;
    public final /* synthetic */ OutputStream G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashMapLocalDataProvider$buildCacheValueSerializer$1$writeTo$2(HashMapLocalDataProvider hashMapLocalDataProvider, Map map, OutputStream outputStream, Continuation continuation) {
        super(2, continuation);
        this.E = hashMapLocalDataProvider;
        this.F = map;
        this.G = outputStream;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HashMapLocalDataProvider$buildCacheValueSerializer$1$writeTo$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new HashMapLocalDataProvider$buildCacheValueSerializer$1$writeTo$2(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            String e2 = this.E.j(this.F);
            Timber.Forest forest = Timber.f44337a;
            forest.a("writing " + e2, new Object[0]);
            OutputStream outputStream = this.G;
            byte[] bytes = e2.getBytes(Charsets.f41118b);
            Intrinsics.h(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
