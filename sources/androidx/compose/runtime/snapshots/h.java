package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class h implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Collection f15375z;

    public /* synthetic */ h(Collection collection) {
        this.f15375z = collection;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(SnapshotStateList.u(this.f15375z, (List) obj));
    }
}
