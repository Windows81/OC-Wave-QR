package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {

    /* renamed from: a  reason: collision with root package name */
    public CoroutineLiveData f21940a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineContext f21941b;

    public LiveDataScopeImpl(CoroutineLiveData coroutineLiveData, CoroutineContext coroutineContext) {
        Intrinsics.i(coroutineLiveData, "target");
        Intrinsics.i(coroutineContext, "context");
        this.f21940a = coroutineLiveData;
        this.f21941b = coroutineContext.y(Dispatchers.c().H0());
    }

    public final CoroutineLiveData a() {
        return this.f21940a;
    }

    public Object c(Object obj, Continuation continuation) {
        Object g2 = BuildersKt.g(this.f21941b, new LiveDataScopeImpl$emit$2(this, obj, (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }
}
