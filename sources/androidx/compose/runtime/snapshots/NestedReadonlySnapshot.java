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
public final class NestedReadonlySnapshot extends Snapshot {

    /* renamed from: g  reason: collision with root package name */
    public final Function1 f15249g;

    /* renamed from: h  reason: collision with root package name */
    public final Snapshot f15250h;

    public NestedReadonlySnapshot(long j2, SnapshotIdSet snapshotIdSet, Function1 function1, Snapshot snapshot) {
        super(j2, snapshotIdSet, (DefaultConstructorMarker) null);
        this.f15249g = function1;
        this.f15250h = snapshot;
        snapshot.m(this);
    }

    public final Snapshot C() {
        return this.f15250h;
    }

    /* renamed from: D */
    public Function1 g() {
        return this.f15249g;
    }

    /* renamed from: E */
    public Void m(Snapshot snapshot) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: F */
    public Void n(Snapshot snapshot) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: G */
    public Void p(StateObject stateObject) {
        Void unused = SnapshotKt.g0();
        throw new KotlinNothingValueException();
    }

    /* renamed from: H */
    public NestedReadonlySnapshot x(Function1 function1) {
        Map map;
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
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(i(), f(), SnapshotKt.Q(function1, g(), false, 4, (Object) null), C());
        if (b2 != null) {
            SnapshotObserverKt.c(b2, this, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    public void d() {
        if (!e()) {
            if (i() != this.f15250h.i()) {
                b();
            }
            this.f15250h.n(this);
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

    public void o() {
    }
}
