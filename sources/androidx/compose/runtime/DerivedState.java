package androidx.compose.runtime;

import androidx.collection.ObjectIntMap;
import kotlin.Metadata;

@Metadata
public interface DerivedState<T> extends State<T> {

    @Metadata
    public interface Record<T> {
        Object a();

        ObjectIntMap b();
    }

    SnapshotMutationPolicy d();

    Record s();
}
