package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Collection f15376A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f15377z;

    public /* synthetic */ i(int i2, Collection collection) {
        this.f15377z = i2;
        this.f15376A = collection;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(SnapshotStateList.o(this.f15377z, this.f15376A, (List) obj));
    }
}
