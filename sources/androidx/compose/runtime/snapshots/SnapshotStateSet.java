package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public final class SnapshotStateSet<T> implements Parcelable, StateObject, Set<T>, RandomAccess, KMutableSet {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f15324A = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new SnapshotStateSet$Companion$CREATOR$1();

    /* renamed from: z  reason: collision with root package name */
    public StateRecord f15325z = SnapshotStateSetKt.f(this, ExtensionsKt.c());

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static final boolean o(Collection collection, Set set) {
        return set.retainAll(CollectionsKt.R0(collection));
    }

    public boolean add(Object obj) {
        int j2;
        PersistentSet k2;
        Snapshot c2;
        boolean b2;
        do {
            synchronized (SnapshotStateSetKt.f15326a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.K((StateSetStateRecord) h2);
                j2 = stateSetStateRecord.j();
                k2 = stateSetStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(k2);
            PersistentSet add = k2.add(obj);
            if (Intrinsics.d(add, k2)) {
                return false;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                b2 = SnapshotStateSetKt.b((StateSetStateRecord) SnapshotKt.p0(stateSetStateRecord2, this, c2), j2, add);
            }
            SnapshotKt.X(c2, this);
        } while (!b2);
        return true;
    }

    public boolean addAll(Collection collection) {
        int j2;
        PersistentSet k2;
        Snapshot c2;
        boolean b2;
        do {
            synchronized (SnapshotStateSetKt.f15326a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.K((StateSetStateRecord) h2);
                j2 = stateSetStateRecord.j();
                k2 = stateSetStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(k2);
            PersistentSet addAll = k2.addAll(collection);
            if (Intrinsics.d(addAll, k2)) {
                return false;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                b2 = SnapshotStateSetKt.b((StateSetStateRecord) SnapshotKt.p0(stateSetStateRecord2, this, c2), j2, addAll);
            }
            SnapshotKt.X(c2, this);
        } while (!b2);
        return true;
    }

    public void clear() {
        Snapshot c2;
        StateRecord h2 = h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) h2;
        synchronized (SnapshotKt.O()) {
            c2 = Snapshot.f15255e.c();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.p0(stateSetStateRecord, this, c2);
            synchronized (SnapshotStateSetKt.f15326a) {
                stateSetStateRecord2.m(ExtensionsKt.c());
                stateSetStateRecord2.l(stateSetStateRecord2.j() + 1);
            }
        }
        SnapshotKt.X(c2, this);
    }

    public boolean contains(Object obj) {
        return SnapshotStateSetKt.d(this).k().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return SnapshotStateSetKt.d(this).k().containsAll(collection);
    }

    public int describeContents() {
        return 0;
    }

    public void g(StateRecord stateRecord) {
        stateRecord.h(h());
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.f15325z = (StateSetStateRecord) stateRecord;
    }

    public StateRecord h() {
        return this.f15325z;
    }

    public boolean isEmpty() {
        return SnapshotStateSetKt.d(this).k().isEmpty();
    }

    public Iterator iterator() {
        return new StateSetIterator(this, SnapshotStateSetKt.d(this).k().iterator());
    }

    public int n() {
        return SnapshotStateSetKt.d(this).k().size();
    }

    public final Set p() {
        return SnapshotStateSetKt.d(this).k();
    }

    public boolean remove(Object obj) {
        int j2;
        PersistentSet k2;
        Snapshot c2;
        boolean b2;
        do {
            synchronized (SnapshotStateSetKt.f15326a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.K((StateSetStateRecord) h2);
                j2 = stateSetStateRecord.j();
                k2 = stateSetStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(k2);
            PersistentSet remove = k2.remove(obj);
            if (Intrinsics.d(remove, k2)) {
                return false;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                b2 = SnapshotStateSetKt.b((StateSetStateRecord) SnapshotKt.p0(stateSetStateRecord2, this, c2), j2, remove);
            }
            SnapshotKt.X(c2, this);
        } while (!b2);
        return true;
    }

    public boolean removeAll(Collection collection) {
        int j2;
        PersistentSet k2;
        Snapshot c2;
        boolean b2;
        do {
            synchronized (SnapshotStateSetKt.f15326a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.K((StateSetStateRecord) h2);
                j2 = stateSetStateRecord.j();
                k2 = stateSetStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(k2);
            PersistentSet removeAll = k2.removeAll(collection);
            if (Intrinsics.d(removeAll, k2)) {
                return false;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                b2 = SnapshotStateSetKt.b((StateSetStateRecord) SnapshotKt.p0(stateSetStateRecord2, this, c2), j2, removeAll);
            }
            SnapshotKt.X(c2, this);
        } while (!b2);
        return true;
    }

    public boolean retainAll(Collection collection) {
        return SnapshotStateSetKt.e(this, new n(collection));
    }

    public final /* bridge */ int size() {
        return n();
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        StateRecord h2 = h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.K((StateSetStateRecord) h2)).k() + ")@" + hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Set p2 = p();
        parcel.writeInt(size());
        Iterator it = p2.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
