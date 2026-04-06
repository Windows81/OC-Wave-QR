package androidx.compose.material3.internal;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;

@Metadata
final class PredictiveBackStateImpl implements PredictiveBackState {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f12316a = SnapshotStateKt__SnapshotStateKt.e(BackEventProgress.NotRunning.f12156a, (SnapshotMutationPolicy) null, 2, (Object) null);

    public void a(BackEventProgress backEventProgress) {
        this.f12316a.setValue(backEventProgress);
    }

    public BackEventProgress getValue() {
        return (BackEventProgress) this.f12316a.getValue();
    }
}
