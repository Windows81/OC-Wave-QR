package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
abstract class StateMapMutableIterator<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public final Iterator f15339A;

    /* renamed from: B  reason: collision with root package name */
    public int f15340B;
    public Map.Entry C;
    public Map.Entry D;

    /* renamed from: z  reason: collision with root package name */
    public final SnapshotStateMap f15341z;

    public StateMapMutableIterator(SnapshotStateMap snapshotStateMap, Iterator it) {
        this.f15341z = snapshotStateMap;
        this.f15339A = it;
        this.f15340B = snapshotStateMap.j();
        e();
    }

    public final void e() {
        this.C = this.D;
        this.D = this.f15339A.hasNext() ? (Map.Entry) this.f15339A.next() : null;
    }

    public final Map.Entry f() {
        return this.C;
    }

    public final SnapshotStateMap g() {
        return this.f15341z;
    }

    public final Map.Entry h() {
        return this.D;
    }

    public final boolean hasNext() {
        return this.D != null;
    }

    public final void remove() {
        if (g().j() == this.f15340B) {
            Map.Entry entry = this.C;
            if (entry != null) {
                this.f15341z.remove(entry.getKey());
                this.C = null;
                Unit unit = Unit.f40552a;
                this.f15340B = g().j();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
