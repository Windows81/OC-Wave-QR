package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@Metadata
final class NotNullVar<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a  reason: collision with root package name */
    public Object f40932a;

    public Object a(Object obj, KProperty kProperty) {
        Intrinsics.i(kProperty, "property");
        Object obj2 = this.f40932a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + kProperty.getName() + " should be initialized before get.");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.f40932a != null) {
            str = "value=" + this.f40932a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
