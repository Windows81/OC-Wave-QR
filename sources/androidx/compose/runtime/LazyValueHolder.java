package androidx.compose.runtime;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class LazyValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f14705a;

    public LazyValueHolder(Function0 function0) {
        this.f14705a = LazyKt.b(function0);
    }

    public Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return b();
    }

    public final Object b() {
        return this.f14705a.getValue();
    }
}
