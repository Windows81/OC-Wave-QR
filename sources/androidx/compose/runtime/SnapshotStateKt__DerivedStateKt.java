package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SnapshotThreadLocal f14903a = new SnapshotThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final SnapshotThreadLocal f14904b = new SnapshotThreadLocal();

    public static final MutableVector b() {
        SnapshotThreadLocal snapshotThreadLocal = f14904b;
        MutableVector mutableVector = (MutableVector) snapshotThreadLocal.a();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector mutableVector2 = new MutableVector(new DerivedStateObserver[0], 0);
        snapshotThreadLocal.b(mutableVector2);
        return mutableVector2;
    }

    public static final State c(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        return new DerivedSnapshotState(function0, snapshotMutationPolicy);
    }

    public static final State d(Function0 function0) {
        return new DerivedSnapshotState(function0, (SnapshotMutationPolicy) null);
    }
}
