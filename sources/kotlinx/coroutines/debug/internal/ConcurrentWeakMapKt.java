package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public final class ConcurrentWeakMapKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Symbol f41532a = new Symbol("REHASH");

    /* renamed from: b  reason: collision with root package name */
    public static final Marked f41533b = new Marked((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Marked f41534c = new Marked(Boolean.TRUE);

    public static final Marked d(Object obj) {
        return obj == null ? f41533b : Intrinsics.d(obj, Boolean.TRUE) ? f41534c : new Marked(obj);
    }

    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
