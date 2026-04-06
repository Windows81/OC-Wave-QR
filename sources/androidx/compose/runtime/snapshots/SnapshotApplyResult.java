package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class SnapshotApplyResult {

    @Metadata
    public static final class Failure extends SnapshotApplyResult {

        /* renamed from: a  reason: collision with root package name */
        public final Snapshot f15261a;

        public Failure(Snapshot snapshot) {
            super((DefaultConstructorMarker) null);
            this.f15261a = snapshot;
        }
    }

    @Metadata
    public static final class Success extends SnapshotApplyResult {

        /* renamed from: a  reason: collision with root package name */
        public static final Success f15262a = new Success();

        public Success() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ SnapshotApplyResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public SnapshotApplyResult() {
    }
}
