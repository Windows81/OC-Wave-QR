package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;

@Metadata
public final class PersistentHashMap$equals$1 extends Lambda implements Function2<V, ?, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final PersistentHashMap$equals$1 f41262z = new PersistentHashMap$equals$1();

    public PersistentHashMap$equals$1() {
        super(2);
    }

    /* renamed from: b */
    public final Boolean m(Object obj, LinkedValue linkedValue) {
        Intrinsics.i(linkedValue, "b");
        return Boolean.valueOf(Intrinsics.d(obj, linkedValue.e()));
    }
}
