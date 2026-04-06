package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class CompositionLocal<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ValueHolder f14627a;

    public /* synthetic */ CompositionLocal(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public ValueHolder a() {
        return this.f14627a;
    }

    public abstract ValueHolder b(ProvidedValue providedValue, ValueHolder valueHolder);

    public CompositionLocal(Function0 function0) {
        this.f14627a = new LazyValueHolder(function0);
    }
}
