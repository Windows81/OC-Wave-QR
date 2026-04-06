package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class n implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Collection f15383z;

    public /* synthetic */ n(Collection collection) {
        this.f15383z = collection;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(SnapshotStateSet.o(this.f15383z, (Set) obj));
    }
}
