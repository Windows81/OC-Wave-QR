package kotlin;

import java.io.Serializable;

@Metadata
public final class InitializedLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Object f40505z;

    public boolean b() {
        return true;
    }

    public Object getValue() {
        return this.f40505z;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
