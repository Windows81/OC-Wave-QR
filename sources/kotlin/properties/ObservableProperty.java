package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@Metadata
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {

    /* renamed from: a  reason: collision with root package name */
    public Object f40933a;

    public Object a(Object obj, KProperty kProperty) {
        Intrinsics.i(kProperty, "property");
        return this.f40933a;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f40933a + ')';
    }
}
