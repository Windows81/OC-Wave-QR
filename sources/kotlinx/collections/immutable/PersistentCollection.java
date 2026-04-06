package kotlinx.collections.immutable;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableCollection;

@Metadata
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    @Metadata
    public interface Builder<E> extends Collection<E>, KMutableCollection {
    }
}
