package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Segment;

@Metadata
@JvmInline
public final class SegmentOrClosed<S extends Segment<S>> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41865a;

    public static Object a(Object obj) {
        return obj;
    }

    public static boolean b(Object obj, Object obj2) {
        return (obj2 instanceof SegmentOrClosed) && Intrinsics.d(obj, ((SegmentOrClosed) obj2).g());
    }

    public static final Segment c(Object obj) {
        if (obj != ConcurrentLinkedListKt.f41826a) {
            Intrinsics.g(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (Segment) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static int d(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean e(Object obj) {
        return obj == ConcurrentLinkedListKt.f41826a;
    }

    public static String f(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return b(this.f41865a, obj);
    }

    public final /* synthetic */ Object g() {
        return this.f41865a;
    }

    public int hashCode() {
        return d(this.f41865a);
    }

    public String toString() {
        return f(this.f41865a);
    }
}
