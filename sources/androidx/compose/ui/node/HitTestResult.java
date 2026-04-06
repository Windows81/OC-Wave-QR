package androidx.compose.ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public MutableLongList f17254A = new MutableLongList(16);

    /* renamed from: B  reason: collision with root package name */
    public int f17255B = -1;

    /* renamed from: z  reason: collision with root package name */
    public MutableObjectList f17256z = new MutableObjectList(16);

    @Metadata
    public final class SubList implements List<Modifier.Node>, KMappedMarker {

        /* renamed from: A  reason: collision with root package name */
        public final int f17260A;

        /* renamed from: z  reason: collision with root package name */
        public final int f17262z;

        public SubList(int i2, int i3) {
            this.f17262z = i2;
            this.f17260A = i3;
        }

        public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i2, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return false;
            }
            return e((Modifier.Node) obj);
        }

        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((Modifier.Node) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean e(Modifier.Node node) {
            return indexOf(node) != -1;
        }

        /* renamed from: g */
        public Modifier.Node get(int i2) {
            Object d2 = HitTestResult.this.f17256z.d(i2 + this.f17262z);
            Intrinsics.g(d2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) d2;
        }

        public int h() {
            return this.f17260A - this.f17262z;
        }

        public int i(Modifier.Node node) {
            int i2 = this.f17262z;
            int i3 = this.f17260A;
            if (i2 > i3) {
                return -1;
            }
            while (!Intrinsics.d(HitTestResult.this.f17256z.d(i2), node)) {
                if (i2 == i3) {
                    return -1;
                }
                i2++;
            }
            return i2 - this.f17262z;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            return i((Modifier.Node) obj);
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public Iterator iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.f17262z;
            return new HitTestResultIterator(i2, i2, this.f17260A);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            return m((Modifier.Node) obj);
        }

        public ListIterator listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.f17262z;
            return new HitTestResultIterator(i2, i2, this.f17260A);
        }

        public int m(Modifier.Node node) {
            int i2 = this.f17260A;
            int i3 = this.f17262z;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.d(HitTestResult.this.f17256z.d(i2), node)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.f17262z;
        }

        public /* bridge */ /* synthetic */ Object remove(int i2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return h();
        }

        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List subList(int i2, int i3) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i4 = this.f17262z;
            return new SubList(i2 + i4, i4 + i3);
        }

        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public ListIterator listIterator(int i2) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i3 = this.f17262z;
            return new HitTestResultIterator(i2 + i3, i3, this.f17260A);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.b(this, objArr);
        }
    }

    public int A(Modifier.Node node) {
        for (int o2 = CollectionsKt.o(this); -1 < o2; o2--) {
            if (Intrinsics.d(this.f17256z.d(o2), node)) {
                return o2;
            }
        }
        return -1;
    }

    public final void B(int i2) {
        this.f17256z.A(i2);
        this.f17254A.h(i2);
    }

    public final void C(int i2, int i3) {
        if (i2 < i3) {
            this.f17256z.B(i2, i3);
            this.f17254A.i(i2, i3);
        }
    }

    public final void D(Modifier.Node node, float f2, boolean z2, Function0 function0) {
        if (this.f17255B == CollectionsKt.o(this)) {
            int h2 = this.f17255B;
            C(this.f17255B + 1, size());
            this.f17255B = this.f17255B + 1;
            this.f17256z.n(node);
            this.f17254A.d(HitTestResultKt.a(f2, z2, false));
            function0.invoke();
            this.f17255B = h2;
            if (this.f17255B + 1 == CollectionsKt.o(this) || DistanceAndFlags.f(p())) {
                B(this.f17255B + 1);
                return;
            }
            return;
        }
        long p2 = p();
        int i2 = this.f17255B;
        this.f17255B = CollectionsKt.o(this);
        int h3 = this.f17255B;
        C(this.f17255B + 1, size());
        this.f17255B = this.f17255B + 1;
        this.f17256z.n(node);
        this.f17254A.d(HitTestResultKt.a(f2, z2, false));
        function0.invoke();
        this.f17255B = h3;
        long p3 = p();
        if (this.f17255B + 1 >= CollectionsKt.o(this) || DistanceAndFlags.a(p2, p3) <= 0) {
            C(this.f17255B + 1, size());
        } else {
            C(i2 + 1, DistanceAndFlags.f(p3) ? this.f17255B + 2 : this.f17255B + 1);
        }
        this.f17255B = i2;
    }

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.f17255B = -1;
        this.f17256z.t();
        this.f17254A.f();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Modifier.Node)) {
            return false;
        }
        return o((Modifier.Node) obj);
    }

    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Modifier.Node) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        this.f17255B = size() - 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Modifier.Node)) {
            return -1;
        }
        return w((Modifier.Node) obj);
    }

    public boolean isEmpty() {
        return this.f17256z.g();
    }

    public Iterator iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Modifier.Node)) {
            return -1;
        }
        return A((Modifier.Node) obj);
    }

    public ListIterator listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public boolean o(Modifier.Node node) {
        return indexOf(node) != -1;
    }

    public final long p() {
        long b2 = HitTestResultKt.b(Float.POSITIVE_INFINITY, false, false, 4, (Object) null);
        int i2 = this.f17255B + 1;
        int o2 = CollectionsKt.o(this);
        if (i2 <= o2) {
            while (true) {
                long b3 = DistanceAndFlags.b(this.f17254A.a(i2));
                if (DistanceAndFlags.a(b3, b2) < 0) {
                    b2 = b3;
                }
                if (DistanceAndFlags.d(b2) >= 0.0f || !DistanceAndFlags.g(b2)) {
                    if (i2 == o2) {
                        break;
                    }
                    i2++;
                } else {
                    return b2;
                }
            }
        }
        return b2;
    }

    /* renamed from: q */
    public Modifier.Node get(int i2) {
        Object d2 = this.f17256z.d(i2);
        Intrinsics.g(d2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) d2;
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s() {
        return this.f17256z.e();
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return s();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i2, int i3) {
        return new SubList(i2, i3);
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public final boolean u() {
        long p2 = p();
        return DistanceAndFlags.d(p2) < 0.0f && DistanceAndFlags.g(p2) && !DistanceAndFlags.f(p2);
    }

    public final void v(Modifier.Node node, boolean z2, Function0 function0) {
        if (this.f17255B == CollectionsKt.o(this)) {
            int h2 = this.f17255B;
            C(this.f17255B + 1, size());
            this.f17255B = this.f17255B + 1;
            this.f17256z.n(node);
            this.f17254A.d(HitTestResultKt.a(0.0f, z2, true));
            function0.invoke();
            this.f17255B = h2;
            return;
        }
        long p2 = p();
        int i2 = this.f17255B;
        if (DistanceAndFlags.f(p2)) {
            this.f17255B = CollectionsKt.o(this);
            int h3 = this.f17255B;
            C(this.f17255B + 1, size());
            this.f17255B = this.f17255B + 1;
            this.f17256z.n(node);
            this.f17254A.d(HitTestResultKt.a(0.0f, z2, true));
            function0.invoke();
            this.f17255B = h3;
            if (DistanceAndFlags.d(p()) < 0.0f) {
                C(i2 + 1, this.f17255B + 1);
            }
            this.f17255B = i2;
        } else if (DistanceAndFlags.d(p2) > 0.0f) {
            int h4 = this.f17255B;
            C(this.f17255B + 1, size());
            this.f17255B = this.f17255B + 1;
            this.f17256z.n(node);
            this.f17254A.d(HitTestResultKt.a(0.0f, z2, true));
            function0.invoke();
            this.f17255B = h4;
        }
    }

    public int w(Modifier.Node node) {
        int o2 = CollectionsKt.o(this);
        if (o2 < 0) {
            return -1;
        }
        int i2 = 0;
        while (!Intrinsics.d(this.f17256z.d(i2), node)) {
            if (i2 == o2) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    public final boolean z(float f2, boolean z2) {
        if (this.f17255B == CollectionsKt.o(this)) {
            return true;
        }
        return DistanceAndFlags.a(p(), HitTestResultKt.b(f2, z2, false, 4, (Object) null)) > 0;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i2) {
        return new HitTestResultIterator(this, i2, 0, 0, 6, (DefaultConstructorMarker) null);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }

    @Metadata
    public final class HitTestResultIterator implements ListIterator<Modifier.Node>, KMappedMarker {

        /* renamed from: A  reason: collision with root package name */
        public final int f17257A;

        /* renamed from: B  reason: collision with root package name */
        public final int f17258B;

        /* renamed from: z  reason: collision with root package name */
        public int f17259z;

        public HitTestResultIterator(int i2, int i3, int i4) {
            this.f17259z = i2;
            this.f17257A = i3;
            this.f17258B = i4;
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public Modifier.Node next() {
            MutableObjectList i2 = HitTestResult.this.f17256z;
            int i3 = this.f17259z;
            this.f17259z = i3 + 1;
            Object d2 = i2.d(i3);
            Intrinsics.g(d2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) d2;
        }

        /* renamed from: c */
        public Modifier.Node previous() {
            MutableObjectList i2 = HitTestResult.this.f17256z;
            int i3 = this.f17259z - 1;
            this.f17259z = i3;
            Object d2 = i2.d(i3);
            Intrinsics.g(d2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) d2;
        }

        public boolean hasNext() {
            return this.f17259z < this.f17258B;
        }

        public boolean hasPrevious() {
            return this.f17259z > this.f17257A;
        }

        public int nextIndex() {
            return this.f17259z - this.f17257A;
        }

        public int previousIndex() {
            return (this.f17259z - this.f17257A) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? hitTestResult.size() : i4);
        }
    }
}
