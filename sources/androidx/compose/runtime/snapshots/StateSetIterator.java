package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class StateSetIterator<T> implements Iterator<T>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public final Iterator f15345A;

    /* renamed from: B  reason: collision with root package name */
    public Object f15346B;
    public Object C;
    public int D;

    /* renamed from: z  reason: collision with root package name */
    public final SnapshotStateSet f15347z;

    public StateSetIterator(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.f15347z = snapshotStateSet;
        this.f15345A = it;
        this.D = SnapshotStateSetKt.c(snapshotStateSet);
        b();
    }

    private final void b() {
        this.f15346B = this.C;
        this.C = this.f15345A.hasNext() ? this.f15345A.next() : null;
    }

    private final void c() {
        if (SnapshotStateSetKt.c(this.f15347z) != this.D) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return this.C != null;
    }

    public Object next() {
        c();
        b();
        Object obj = this.f15346B;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public void remove() {
        c();
        Object obj = this.f15346B;
        if (obj != null) {
            this.f15347z.remove(obj);
            this.f15346B = null;
            Unit unit = Unit.f40552a;
            this.D = SnapshotStateSetKt.c(this.f15347z);
            return;
        }
        throw new IllegalStateException();
    }
}
