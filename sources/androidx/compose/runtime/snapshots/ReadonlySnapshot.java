package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ReadonlySnapshot extends Snapshot {

    /* renamed from: g  reason: collision with root package name */
    public final Function1 f15253g;

    /* renamed from: h  reason: collision with root package name */
    public int f15254h = 1;

    public ReadonlySnapshot(long j2, SnapshotIdSet snapshotIdSet, Function1 function1) {
        super(j2, snapshotIdSet, (DefaultConstructorMarker) null);
        this.f15253g = function1;
    }

    /* renamed from: C */
    public Function1 g() {
        return this.f15253g;
    }

    public void d() {
        if (!e()) {
            n(this);
            super.d();
            SnapshotObserverKt.e(this);
        }
    }

    public boolean h() {
        return true;
    }

    public Function1 k() {
        return null;
    }

    public void m(Snapshot snapshot) {
        this.f15254h++;
    }

    public void n(Snapshot snapshot) {
        int i2 = this.f15254h - 1;
        this.f15254h = i2;
        if (i2 == 0) {
            b();
        }
    }

    public void o() {
    }

    public void p(StateObject stateObject) {
        Void unused = SnapshotKt.g0();
        throw new KotlinNothingValueException();
    }

    public Snapshot x(Function1 function1) {
        Map map;
        SnapshotKt.o0(this);
        PersistentList b2 = SnapshotObserverKt.f15386a;
        if (b2 != null) {
            Pair f2 = SnapshotObserverKt.f(b2, this, true, function1, (Function1) null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) f2.e();
            Function1 a2 = snapshotInstanceObservers.a();
            snapshotInstanceObservers.b();
            map = (Map) f2.f();
            function1 = a2;
        } else {
            map = null;
        }
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(i(), f(), SnapshotKt.Q(function1, g(), false, 4, (Object) null), this);
        if (b2 != null) {
            SnapshotObserverKt.c(b2, this, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }
}
