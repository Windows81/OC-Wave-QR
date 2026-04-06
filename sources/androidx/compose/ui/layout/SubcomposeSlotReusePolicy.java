package androidx.compose.ui.layout;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.OrderedScatterSetKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public interface SubcomposeSlotReusePolicy {

    @Metadata
    public static final class SlotIdsSet implements Collection<Object>, KMappedMarker {

        /* renamed from: z  reason: collision with root package name */
        public final MutableOrderedScatterSet f17173z;

        public SlotIdsSet(MutableOrderedScatterSet mutableOrderedScatterSet) {
            this.f17173z = mutableOrderedScatterSet;
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void clear() {
            this.f17173z.k();
        }

        public boolean contains(Object obj) {
            return this.f17173z.a(obj);
        }

        public boolean containsAll(Collection collection) {
            for (Object a2 : collection) {
                if (!this.f17173z.a(a2)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final boolean add(Object obj) {
            return this.f17173z.g(obj);
        }

        public int g() {
            return this.f17173z.c();
        }

        public final void h(int i2) {
            this.f17173z.C(i2);
        }

        public boolean isEmpty() {
            return this.f17173z.d();
        }

        public Iterator iterator() {
            return this.f17173z.j().iterator();
        }

        public final boolean remove(Object obj) {
            return this.f17173z.x(obj);
        }

        public final boolean removeAll(Collection collection) {
            return this.f17173z.x(collection);
        }

        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection collection) {
            return this.f17173z.B(collection);
        }

        public final /* bridge */ int size() {
            return g();
        }

        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.b(this, objArr);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SlotIdsSet(MutableOrderedScatterSet mutableOrderedScatterSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? OrderedScatterSetKt.a() : mutableOrderedScatterSet);
        }
    }

    void a(SlotIdsSet slotIdsSet);

    boolean b(Object obj, Object obj2);
}
