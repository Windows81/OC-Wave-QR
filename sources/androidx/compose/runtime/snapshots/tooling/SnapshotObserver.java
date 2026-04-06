package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.Metadata;

@Metadata
public interface SnapshotObserver {
    SnapshotInstanceObservers a(Snapshot snapshot, boolean z2) {
        return null;
    }

    void b(Snapshot snapshot, Snapshot snapshot2, SnapshotInstanceObservers snapshotInstanceObservers) {
    }

    void c(Snapshot snapshot) {
    }

    void d(Snapshot snapshot, Set set) {
    }
}
