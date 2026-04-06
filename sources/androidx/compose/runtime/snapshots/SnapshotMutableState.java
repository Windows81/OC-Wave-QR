package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;

@Metadata
public interface SnapshotMutableState<T> extends MutableState<T> {
    SnapshotMutationPolicy d();
}
