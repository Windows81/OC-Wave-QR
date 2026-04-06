package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;

@Metadata
public final class SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 implements DerivedStateObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver.ObservedScopeMap f15323a;

    public SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1(SnapshotStateObserver.ObservedScopeMap observedScopeMap) {
        this.f15323a = observedScopeMap;
    }

    public void a(DerivedState derivedState) {
        this.f15323a.f15320j = this.f15323a.f15320j - 1;
    }

    public void b(DerivedState derivedState) {
        this.f15323a.f15320j = this.f15323a.f15320j + 1;
    }
}
