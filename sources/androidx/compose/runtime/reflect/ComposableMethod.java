package androidx.compose.runtime.reflect;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComposableMethod {

    /* renamed from: a  reason: collision with root package name */
    public final Method f15192a;

    public boolean equals(Object obj) {
        if (obj instanceof ComposableMethod) {
            return Intrinsics.d(this.f15192a, ((ComposableMethod) obj).f15192a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15192a.hashCode();
    }
}
