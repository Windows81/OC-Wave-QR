package androidx.compose.runtime.snapshots;

import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata
public final class SubList$listIterator$1 implements ListIterator<T>, KMutableListIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SubList f15353A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f15354z;

    public SubList$listIterator$1(Ref.IntRef intRef, SubList subList) {
        this.f15354z = intRef;
        this.f15353A = subList;
    }

    /* renamed from: b */
    public Void add(Object obj) {
        Void unused = SnapshotStateListKt.j();
        throw new KotlinNothingValueException();
    }

    /* renamed from: c */
    public Void remove() {
        Void unused = SnapshotStateListKt.j();
        throw new KotlinNothingValueException();
    }

    /* renamed from: e */
    public Void set(Object obj) {
        Void unused = SnapshotStateListKt.j();
        throw new KotlinNothingValueException();
    }

    public boolean hasNext() {
        return this.f15354z.f40906z < this.f15353A.size() - 1;
    }

    public boolean hasPrevious() {
        return this.f15354z.f40906z >= 0;
    }

    public Object next() {
        int i2 = this.f15354z.f40906z + 1;
        SnapshotStateListKt.m(i2, this.f15353A.size());
        this.f15354z.f40906z = i2;
        return this.f15353A.get(i2);
    }

    public int nextIndex() {
        return this.f15354z.f40906z + 1;
    }

    public Object previous() {
        int i2 = this.f15354z.f40906z;
        SnapshotStateListKt.m(i2, this.f15353A.size());
        this.f15354z.f40906z = i2 - 1;
        return this.f15353A.get(i2);
    }

    public int previousIndex() {
        return this.f15354z.f40906z;
    }
}
