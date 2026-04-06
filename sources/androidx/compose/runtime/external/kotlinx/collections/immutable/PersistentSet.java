package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    @Metadata
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, KMutableSet {
        PersistentSet d();
    }

    PersistentSet add(Object obj);

    PersistentSet addAll(Collection collection);

    Builder l();

    PersistentSet remove(Object obj);

    PersistentSet removeAll(Collection collection);
}
