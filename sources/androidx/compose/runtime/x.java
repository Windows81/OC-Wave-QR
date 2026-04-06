package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class x implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Recomposer f15429z;

    public /* synthetic */ x(Recomposer recomposer) {
        this.f15429z = recomposer;
    }

    public final Object m(Object obj, Object obj2) {
        return Recomposer$recompositionRunner$2.C(this.f15429z, (Set) obj, (Snapshot) obj2);
    }
}
