package kotlinx.collections.immutable;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlinx.collections.immutable.PersistentCollection;

@Metadata
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    @Metadata
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, KMutableSet {
    }
}
