package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata
public final class StateListIterator<T> implements ListIterator<T>, KMutableListIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f15330A;

    /* renamed from: B  reason: collision with root package name */
    public int f15331B = -1;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public final SnapshotStateList f15332z;

    public StateListIterator(SnapshotStateList snapshotStateList, int i2) {
        this.f15332z = snapshotStateList;
        this.f15330A = i2 - 1;
        this.C = SnapshotStateListKt.h(snapshotStateList);
    }

    private final void b() {
        if (SnapshotStateListKt.h(this.f15332z) != this.C) {
            throw new ConcurrentModificationException();
        }
    }

    public void add(Object obj) {
        b();
        this.f15332z.add(this.f15330A + 1, obj);
        this.f15331B = -1;
        this.f15330A++;
        this.C = SnapshotStateListKt.h(this.f15332z);
    }

    public boolean hasNext() {
        return this.f15330A < this.f15332z.size() - 1;
    }

    public boolean hasPrevious() {
        return this.f15330A >= 0;
    }

    public Object next() {
        b();
        int i2 = this.f15330A + 1;
        this.f15331B = i2;
        SnapshotStateListKt.m(i2, this.f15332z.size());
        Object obj = this.f15332z.get(i2);
        this.f15330A = i2;
        return obj;
    }

    public int nextIndex() {
        return this.f15330A + 1;
    }

    public Object previous() {
        b();
        SnapshotStateListKt.m(this.f15330A, this.f15332z.size());
        int i2 = this.f15330A;
        this.f15331B = i2;
        this.f15330A--;
        return this.f15332z.get(i2);
    }

    public int previousIndex() {
        return this.f15330A;
    }

    public void remove() {
        b();
        this.f15332z.remove(this.f15331B);
        this.f15330A--;
        this.f15331B = -1;
        this.C = SnapshotStateListKt.h(this.f15332z);
    }

    public void set(Object obj) {
        b();
        int i2 = this.f15331B;
        if (i2 >= 0) {
            this.f15332z.set(i2, obj);
            this.C = SnapshotStateListKt.h(this.f15332z);
            return;
        }
        Void unused = SnapshotStateListKt.i();
        throw new KotlinNothingValueException();
    }
}
