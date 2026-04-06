package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RememberSaveableKt$mutableStateSaver$1$2 implements Function1<MutableState<Object>, MutableState<Object>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Saver f15195z;

    public RememberSaveableKt$mutableStateSaver$1$2(Saver saver) {
        this.f15195z = saver;
    }

    /* renamed from: b */
    public final MutableState invoke(MutableState mutableState) {
        Object obj;
        if (mutableState instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
            if (snapshotMutableState.getValue() != null) {
                Saver saver = this.f15195z;
                Object value = snapshotMutableState.getValue();
                Intrinsics.f(value);
                obj = saver.a(value);
            } else {
                obj = null;
            }
            SnapshotMutationPolicy d2 = snapshotMutableState.d();
            Intrinsics.g(d2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
            MutableState i2 = SnapshotStateKt.i(obj, d2);
            Intrinsics.g(i2, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver>");
            return i2;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
