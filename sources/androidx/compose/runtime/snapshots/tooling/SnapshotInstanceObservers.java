package androidx.compose.runtime.snapshots.tooling;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SnapshotInstanceObservers {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f15384a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f15385b;

    public SnapshotInstanceObservers(Function1 function1, Function1 function12) {
        this.f15384a = function1;
        this.f15385b = function12;
    }

    public final Function1 a() {
        return this.f15384a;
    }

    public final Function1 b() {
        return this.f15385b;
    }
}
