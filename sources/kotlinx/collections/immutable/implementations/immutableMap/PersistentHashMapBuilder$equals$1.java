package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PersistentHashMapBuilder$equals$1 extends Lambda implements Function2<V, ?, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final PersistentHashMapBuilder$equals$1 f41272z = new PersistentHashMapBuilder$equals$1();

    public PersistentHashMapBuilder$equals$1() {
        super(2);
    }

    /* renamed from: b */
    public final Boolean m(Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.d(obj, obj2));
    }
}
