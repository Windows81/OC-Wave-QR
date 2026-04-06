package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PersistentOrderedSet$equals$1 extends Lambda implements Function2<Links, Links, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final PersistentOrderedSet$equals$1 f41345z = new PersistentOrderedSet$equals$1();

    public PersistentOrderedSet$equals$1() {
        super(2);
    }

    /* renamed from: b */
    public final Boolean m(Links links, Links links2) {
        Intrinsics.i(links, "<anonymous parameter 0>");
        Intrinsics.i(links2, "<anonymous parameter 1>");
        return Boolean.TRUE;
    }
}
