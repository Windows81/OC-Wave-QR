package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;

@Metadata
public final class PersistentHashMapBuilder$equals$4 extends Lambda implements Function2<V, ?, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final PersistentHashMapBuilder$equals$4 f41275z = new PersistentHashMapBuilder$equals$4();

    public PersistentHashMapBuilder$equals$4() {
        super(2);
    }

    /* renamed from: b */
    public final Boolean m(Object obj, LinkedValue linkedValue) {
        Intrinsics.i(linkedValue, "b");
        return Boolean.valueOf(Intrinsics.d(obj, linkedValue.e()));
    }
}
