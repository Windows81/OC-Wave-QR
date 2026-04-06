package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import kotlin.Metadata;

@Metadata
public final class ExtensionsKt {
    public static final PersistentMap a() {
        return PersistentHashMap.E.a();
    }

    public static final PersistentList b() {
        return UtilsKt.b();
    }

    public static final PersistentSet c() {
        return PersistentOrderedSet.D.a();
    }
}
