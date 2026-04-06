package kotlinx.collections.immutable;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableList;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentCollection;

@Metadata
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    @Metadata
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, KMutableList {
        PersistentList d();
    }

    @Metadata
    public static final class DefaultImpls {
        public static ImmutableList a(PersistentList persistentList, int i2, int i3) {
            return ImmutableList.DefaultImpls.a(persistentList, i2, i3);
        }
    }

    PersistentList addAll(Collection collection);

    Builder l();
}
