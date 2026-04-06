package d;

import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f18209A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f18210z;

    public /* synthetic */ a(Function1 function1, Function1 function12) {
        this.f18210z = function1;
        this.f18209A = function12;
    }

    public final Object invoke(Object obj) {
        return SnapshotObserverKt.h(this.f18210z, this.f18209A, obj);
    }
}
