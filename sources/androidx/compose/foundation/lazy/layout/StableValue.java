package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
final class StableValue<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4988a;

    public static Object a(Object obj) {
        return obj;
    }

    public static boolean b(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && Intrinsics.d(obj, ((StableValue) obj2).e());
    }

    public static int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String d(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public final /* synthetic */ Object e() {
        return this.f4988a;
    }

    public boolean equals(Object obj) {
        return b(this.f4988a, obj);
    }

    public int hashCode() {
        return c(this.f4988a);
    }

    public String toString() {
        return d(this.f4988a);
    }
}
