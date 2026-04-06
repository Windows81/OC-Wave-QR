package com.hansecom.abt.data.preferences.base;

import java.io.InputStream;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializationException;
import timber.log.Timber;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$readFromCatchingExceptions$2", f = "HashMapLocalDataProvider.kt", l = {}, m = "invokeSuspend")
public final class HashMapLocalDataProvider$readFromCatchingExceptions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends CacheValue<Object>>>, Object> {
    public int D;
    public final /* synthetic */ HashMapLocalDataProvider E;
    public final /* synthetic */ InputStream F;
    public final /* synthetic */ String G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashMapLocalDataProvider$readFromCatchingExceptions$2(HashMapLocalDataProvider hashMapLocalDataProvider, InputStream inputStream, String str, Continuation continuation) {
        super(2, continuation);
        this.E = hashMapLocalDataProvider;
        this.F = inputStream;
        this.G = str;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HashMapLocalDataProvider$readFromCatchingExceptions$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new HashMapLocalDataProvider$readFromCatchingExceptions$2(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            try {
                Map d2 = this.E.i(this.F);
                return d2 == null ? MapsKt.h() : d2;
            } catch (SerializationException e2) {
                Timber.Forest forest = Timber.f44337a;
                String str = this.G;
                forest.b("> getObject, Object stored with Key " + str + " not able to instance", new Object[0]);
                throw e2;
            } catch (IllegalArgumentException e3) {
                Timber.Forest forest2 = Timber.f44337a;
                String str2 = this.G;
                forest2.b("> getObject, Object stored with Key " + str2 + " not able to instance decoded input is not a valid instance of Type", new Object[0]);
                throw e3;
            } catch (Exception e4) {
                Timber.Forest forest3 = Timber.f44337a;
                String str3 = this.G;
                forest3.b("> getObject, Object stored with Key " + str3 + " not able to instance unpredicted exception", new Object[0]);
                throw e4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
