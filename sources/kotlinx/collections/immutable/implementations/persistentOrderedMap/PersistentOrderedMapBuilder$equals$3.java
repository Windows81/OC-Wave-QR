package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PersistentOrderedMapBuilder$equals$3 extends Lambda implements Function2<LinkedValue<V>, ?, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final PersistentOrderedMapBuilder$equals$3 f41321z = new PersistentOrderedMapBuilder$equals$3();

    public PersistentOrderedMapBuilder$equals$3() {
        super(2);
    }

    /* renamed from: b */
    public final Boolean m(LinkedValue linkedValue, Object obj) {
        Intrinsics.i(linkedValue, "a");
        return Boolean.valueOf(Intrinsics.d(linkedValue.e(), obj));
    }
}
