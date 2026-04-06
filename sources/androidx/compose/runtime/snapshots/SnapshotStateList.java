package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata
public final class SnapshotStateList<T> implements Parcelable, StateObject, List<T>, RandomAccess, KMutableList {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f15290A = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new SnapshotStateList$Companion$CREATOR$1();

    /* renamed from: z  reason: collision with root package name */
    public StateRecord f15291z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SnapshotStateList(PersistentList persistentList) {
        this.f15291z = SnapshotStateListKt.l(this, persistentList);
    }

    public static final boolean o(int i2, Collection collection, List list) {
        return list.addAll(i2, collection);
    }

    public static final boolean u(Collection collection, List list) {
        return list.retainAll(collection);
    }

    public boolean add(Object obj) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList add = j2.add(obj);
            if (Intrinsics.d(add, j2)) {
                return false;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, add, true);
            }
            SnapshotKt.X(c2, this);
        } while (!f2);
        return true;
    }

    public boolean addAll(int i2, Collection collection) {
        return SnapshotStateListKt.k(this, new i(i2, collection));
    }

    public void clear() {
        Snapshot c2;
        StateRecord h2 = h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) h2;
        synchronized (SnapshotKt.O()) {
            c2 = Snapshot.f15255e.c();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.p0(stateListStateRecord, this, c2);
            synchronized (SnapshotStateListKt.f15292a) {
                stateListStateRecord2.m(ExtensionsKt.b());
                stateListStateRecord2.n(stateListStateRecord2.k() + 1);
                stateListStateRecord2.o(stateListStateRecord2.l() + 1);
            }
        }
        SnapshotKt.X(c2, this);
    }

    public boolean contains(Object obj) {
        return SnapshotStateListKt.g(this).j().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return SnapshotStateListKt.g(this).j().containsAll(collection);
    }

    public int describeContents() {
        return 0;
    }

    public void g(StateRecord stateRecord) {
        stateRecord.h(h());
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f15291z = (StateListStateRecord) stateRecord;
    }

    public Object get(int i2) {
        return SnapshotStateListKt.g(this).j().get(i2);
    }

    public StateRecord h() {
        return this.f15291z;
    }

    public int indexOf(Object obj) {
        return SnapshotStateListKt.g(this).j().indexOf(obj);
    }

    public boolean isEmpty() {
        return SnapshotStateListKt.g(this).j().isEmpty();
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        return SnapshotStateListKt.g(this).j().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    public int p() {
        return SnapshotStateListKt.g(this).j().size();
    }

    public Object q(int i2) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        Object obj = get(i2);
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList w0 = j2.w0(i2);
            if (Intrinsics.d(w0, j2)) {
                break;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, w0, true);
            }
            SnapshotKt.X(c2, this);
        } while (!f2);
        return obj;
    }

    public final /* bridge */ Object remove(int i2) {
        return q(i2);
    }

    public boolean removeAll(Collection collection) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList removeAll = j2.removeAll(collection);
            if (Intrinsics.d(removeAll, j2)) {
                return false;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, removeAll, true);
            }
            SnapshotKt.X(c2, this);
        } while (!f2);
        return true;
    }

    public boolean retainAll(Collection collection) {
        return SnapshotStateListKt.k(this, new h(collection));
    }

    public final void s(int i2, int i3) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList.Builder l2 = j2.l();
            l2.subList(i2, i3).clear();
            PersistentList d2 = l2.d();
            if (!Intrinsics.d(d2, j2)) {
                StateRecord h3 = h();
                Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
                synchronized (SnapshotKt.O()) {
                    c2 = Snapshot.f15255e.c();
                    f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, d2, true);
                }
                SnapshotKt.X(c2, this);
            } else {
                return;
            }
        } while (!f2);
    }

    public Object set(int i2, Object obj) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        Object obj2 = get(i2);
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList persistentList = j2.set(i2, obj);
            if (Intrinsics.d(persistentList, j2)) {
                break;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, persistentList, false);
            }
            SnapshotKt.X(c2, this);
        } while (!f2);
        return obj2;
    }

    public final /* bridge */ int size() {
        return p();
    }

    public List subList(int i2, int i3) {
        if (!(i2 >= 0 && i2 <= i3 && i3 <= size())) {
            PreconditionsKt.a("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, i2, i3);
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        StateRecord h2 = h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2)).j() + ")@" + hashCode();
    }

    public final int v(Collection collection, int i2, int i3) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        int size = size();
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList.Builder l2 = j2.l();
            l2.subList(i2, i3).retainAll(collection);
            PersistentList d2 = l2.d();
            if (Intrinsics.d(d2, j2)) {
                break;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, d2, true);
            }
            SnapshotKt.X(c2, this);
        } while (!f2);
        return size - size();
    }

    public final List w() {
        return SnapshotStateListKt.g(this).j();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        List w2 = w();
        int size = w2.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeValue(w2.get(i3));
        }
    }

    public boolean addAll(Collection collection) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList addAll = j2.addAll(collection);
            if (Intrinsics.d(addAll, j2)) {
                return false;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, addAll, true);
            }
            SnapshotKt.X(c2, this);
        } while (!f2);
        return true;
    }

    public ListIterator listIterator(int i2) {
        return new StateListIterator(this, i2);
    }

    public boolean remove(Object obj) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList remove = j2.remove(obj);
            if (Intrinsics.d(remove, j2)) {
                return false;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, remove, true);
            }
            SnapshotKt.X(c2, this);
        } while (!f2);
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }

    public SnapshotStateList() {
        this(ExtensionsKt.b());
    }

    public void add(int i2, Object obj) {
        int k2;
        PersistentList j2;
        Snapshot c2;
        boolean f2;
        do {
            synchronized (SnapshotStateListKt.f15292a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList add = j2.add(i2, obj);
            if (!Intrinsics.d(add, j2)) {
                StateRecord h3 = h();
                Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
                synchronized (SnapshotKt.O()) {
                    c2 = Snapshot.f15255e.c();
                    f2 = SnapshotStateListKt.f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, this, c2), k2, add, true);
                }
                SnapshotKt.X(c2, this);
            } else {
                return;
            }
        } while (!f2);
    }
}
