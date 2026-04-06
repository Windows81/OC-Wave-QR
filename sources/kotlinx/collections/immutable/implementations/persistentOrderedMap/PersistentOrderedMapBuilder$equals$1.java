package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PersistentOrderedMapBuilder$equals$1 extends Lambda implements Function2<LinkedValue<V>, ?, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final PersistentOrderedMapBuilder$equals$1 f41319z = new PersistentOrderedMapBuilder$equals$1();

    public PersistentOrderedMapBuilder$equals$1() {
        super(2);
    }

    /* renamed from: b */
    public final Boolean m(LinkedValue linkedValue, LinkedValue linkedValue2) {
        Intrinsics.i(linkedValue, "a");
        Intrinsics.i(linkedValue2, "b");
        return Boolean.valueOf(Intrinsics.d(linkedValue.e(), linkedValue2.e()));
    }
}
