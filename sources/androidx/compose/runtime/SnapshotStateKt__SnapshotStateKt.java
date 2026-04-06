package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static final SnapshotStateList a() {
        return new SnapshotStateList();
    }

    public static final SnapshotStateList b(Object... objArr) {
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(ArraysKt.a1(objArr));
        return snapshotStateList;
    }

    public static final SnapshotStateMap c() {
        return new SnapshotStateMap();
    }

    public static final MutableState d(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        return SnapshotState_androidKt.a(obj, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState e(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.r();
        }
        return SnapshotStateKt.i(obj, snapshotMutationPolicy);
    }

    public static final State f(Object obj, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1058319986, i2, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:335)");
        }
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        mutableState.setValue(obj);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return mutableState;
    }
}
