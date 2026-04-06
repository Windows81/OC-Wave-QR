package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    @Metadata
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, KMutableList {
        PersistentList d();
    }

    PersistentList H0(Function1 function1);

    PersistentList add(int i2, Object obj);

    PersistentList add(Object obj);

    PersistentList addAll(Collection collection);

    Builder l();

    PersistentList remove(Object obj);

    PersistentList removeAll(Collection collection);

    PersistentList set(int i2, Object obj);

    PersistentList w0(int i2);
}
