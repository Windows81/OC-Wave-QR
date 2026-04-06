package androidx.compose.runtime.collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata
public final class MutableVector<T> implements RandomAccess {
    public static final int C = 8;

    /* renamed from: A  reason: collision with root package name */
    public List f15003A;

    /* renamed from: B  reason: collision with root package name */
    public int f15004B;

    /* renamed from: z  reason: collision with root package name */
    public Object[] f15005z;

    @Metadata
    public static final class MutableVectorList<T> implements List<T>, KMutableList {

        /* renamed from: z  reason: collision with root package name */
        public final MutableVector f15006z;

        public MutableVectorList(MutableVector mutableVector) {
            this.f15006z = mutableVector;
        }

        public boolean add(Object obj) {
            return this.f15006z.d(obj);
        }

        public boolean addAll(int i2, Collection collection) {
            return this.f15006z.g(i2, collection);
        }

        public void clear() {
            this.f15006z.l();
        }

        public boolean contains(Object obj) {
            return this.f15006z.m(obj);
        }

        public boolean containsAll(Collection collection) {
            return this.f15006z.n(collection);
        }

        public int e() {
            return this.f15006z.p();
        }

        public Object g(int i2) {
            MutableVectorKt.a(this, i2);
            return this.f15006z.y(i2);
        }

        public Object get(int i2) {
            MutableVectorKt.a(this, i2);
            return this.f15006z.f15005z[i2];
        }

        public int indexOf(Object obj) {
            return this.f15006z.q(obj);
        }

        public boolean isEmpty() {
            return this.f15006z.p() == 0;
        }

        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        public int lastIndexOf(Object obj) {
            return this.f15006z.u(obj);
        }

        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        public final /* bridge */ Object remove(int i2) {
            return g(i2);
        }

        public boolean removeAll(Collection collection) {
            return this.f15006z.w(collection);
        }

        public boolean retainAll(Collection collection) {
            return this.f15006z.B(collection);
        }

        public Object set(int i2, Object obj) {
            MutableVectorKt.a(this, i2);
            return this.f15006z.C(i2, obj);
        }

        public final /* bridge */ int size() {
            return e();
        }

        public List subList(int i2, int i3) {
            MutableVectorKt.b(this, i2, i3);
            return new SubList(this, i2, i3);
        }

        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public void add(int i2, Object obj) {
            this.f15006z.a(i2, obj);
        }

        public boolean addAll(Collection collection) {
            return this.f15006z.i(collection);
        }

        public ListIterator listIterator(int i2) {
            return new VectorListIterator(this, i2);
        }

        public boolean remove(Object obj) {
            return this.f15006z.v(obj);
        }

        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.b(this, objArr);
        }
    }

    @Metadata
    public static final class SubList<T> implements List<T>, KMutableList {

        /* renamed from: A  reason: collision with root package name */
        public final int f15007A;

        /* renamed from: B  reason: collision with root package name */
        public int f15008B;

        /* renamed from: z  reason: collision with root package name */
        public final List f15009z;

        public SubList(List list, int i2, int i3) {
            this.f15009z = list;
            this.f15007A = i2;
            this.f15008B = i3;
        }

        public boolean add(Object obj) {
            List list = this.f15009z;
            int i2 = this.f15008B;
            this.f15008B = i2 + 1;
            list.add(i2, obj);
            return true;
        }

        public boolean addAll(int i2, Collection collection) {
            this.f15009z.addAll(i2 + this.f15007A, collection);
            int size = collection.size();
            this.f15008B += size;
            return size > 0;
        }

        public void clear() {
            int i2 = this.f15008B - 1;
            int i3 = this.f15007A;
            if (i3 <= i2) {
                while (true) {
                    this.f15009z.remove(i2);
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            this.f15008B = this.f15007A;
        }

        public boolean contains(Object obj) {
            int i2 = this.f15008B;
            for (int i3 = this.f15007A; i3 < i2; i3++) {
                if (Intrinsics.d(this.f15009z.get(i3), obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public int e() {
            return this.f15008B - this.f15007A;
        }

        public Object g(int i2) {
            MutableVectorKt.a(this, i2);
            this.f15008B--;
            return this.f15009z.remove(i2 + this.f15007A);
        }

        public Object get(int i2) {
            MutableVectorKt.a(this, i2);
            return this.f15009z.get(i2 + this.f15007A);
        }

        public int indexOf(Object obj) {
            int i2 = this.f15008B;
            for (int i3 = this.f15007A; i3 < i2; i3++) {
                if (Intrinsics.d(this.f15009z.get(i3), obj)) {
                    return i3 - this.f15007A;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f15008B == this.f15007A;
        }

        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i2 = this.f15008B - 1;
            int i3 = this.f15007A;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.d(this.f15009z.get(i2), obj)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.f15007A;
        }

        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        public final /* bridge */ Object remove(int i2) {
            return g(i2);
        }

        public boolean removeAll(Collection collection) {
            int i2 = this.f15008B;
            for (Object remove : collection) {
                remove(remove);
            }
            return i2 != this.f15008B;
        }

        public boolean retainAll(Collection collection) {
            int i2 = this.f15008B;
            int i3 = i2 - 1;
            int i4 = this.f15007A;
            if (i4 <= i3) {
                while (true) {
                    if (!collection.contains(this.f15009z.get(i3))) {
                        this.f15009z.remove(i3);
                        this.f15008B--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.f15008B;
        }

        public Object set(int i2, Object obj) {
            MutableVectorKt.a(this, i2);
            return this.f15009z.set(i2 + this.f15007A, obj);
        }

        public final /* bridge */ int size() {
            return e();
        }

        public List subList(int i2, int i3) {
            MutableVectorKt.b(this, i2, i3);
            return new SubList(this, i2, i3);
        }

        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public void add(int i2, Object obj) {
            this.f15009z.add(i2 + this.f15007A, obj);
            this.f15008B++;
        }

        public ListIterator listIterator(int i2) {
            return new VectorListIterator(this, i2);
        }

        public boolean remove(Object obj) {
            int i2 = this.f15008B;
            for (int i3 = this.f15007A; i3 < i2; i3++) {
                if (Intrinsics.d(this.f15009z.get(i3), obj)) {
                    this.f15009z.remove(i3);
                    this.f15008B--;
                    return true;
                }
            }
            return false;
        }

        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.b(this, objArr);
        }

        public boolean addAll(Collection collection) {
            this.f15009z.addAll(this.f15008B, collection);
            int size = collection.size();
            this.f15008B += size;
            return size > 0;
        }
    }

    @Metadata
    public static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {

        /* renamed from: A  reason: collision with root package name */
        public int f15010A;

        /* renamed from: z  reason: collision with root package name */
        public final List f15011z;

        public VectorListIterator(List list, int i2) {
            this.f15011z = list;
            this.f15010A = i2;
        }

        public void add(Object obj) {
            this.f15011z.add(this.f15010A, obj);
            this.f15010A++;
        }

        public boolean hasNext() {
            return this.f15010A < this.f15011z.size();
        }

        public boolean hasPrevious() {
            return this.f15010A > 0;
        }

        public Object next() {
            List list = this.f15011z;
            int i2 = this.f15010A;
            this.f15010A = i2 + 1;
            return list.get(i2);
        }

        public int nextIndex() {
            return this.f15010A;
        }

        public Object previous() {
            int i2 = this.f15010A - 1;
            this.f15010A = i2;
            return this.f15011z.get(i2);
        }

        public int previousIndex() {
            return this.f15010A - 1;
        }

        public void remove() {
            int i2 = this.f15010A - 1;
            this.f15010A = i2;
            this.f15011z.remove(i2);
        }

        public void set(Object obj) {
            this.f15011z.set(this.f15010A, obj);
        }
    }

    public MutableVector(Object[] objArr, int i2) {
        this.f15005z = objArr;
        this.f15004B = i2;
    }

    public final void A(int i2) {
        Object[] objArr = this.f15005z;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f15005z = objArr2;
    }

    public final boolean B(Collection collection) {
        int i2 = this.f15004B;
        for (int p2 = p() - 1; -1 < p2; p2--) {
            if (!collection.contains(this.f15005z[p2])) {
                y(p2);
            }
        }
        return i2 != this.f15004B;
    }

    public final Object C(int i2, Object obj) {
        Object[] objArr = this.f15005z;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final void D(int i2) {
        this.f15004B = i2;
    }

    public final void E(Comparator comparator) {
        ArraysKt.L(this.f15005z, comparator, 0, this.f15004B);
    }

    public final Void F(String str) {
        throw new NoSuchElementException(str);
    }

    public final void a(int i2, Object obj) {
        int i3 = this.f15004B + 1;
        if (this.f15005z.length < i3) {
            A(i3);
        }
        Object[] objArr = this.f15005z;
        int i4 = this.f15004B;
        if (i2 != i4) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i4 - i2);
        }
        objArr[i2] = obj;
        this.f15004B++;
    }

    public final boolean d(Object obj) {
        int i2 = this.f15004B + 1;
        if (this.f15005z.length < i2) {
            A(i2);
        }
        Object[] objArr = this.f15005z;
        int i3 = this.f15004B;
        objArr[i3] = obj;
        this.f15004B = i3 + 1;
        return true;
    }

    public final boolean e(int i2, MutableVector mutableVector) {
        int i3 = mutableVector.f15004B;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.f15004B + i3;
        if (this.f15005z.length < i4) {
            A(i4);
        }
        Object[] objArr = this.f15005z;
        int i5 = this.f15004B;
        if (i2 != i5) {
            System.arraycopy(objArr, i2, objArr, i2 + i3, i5 - i2);
        }
        System.arraycopy(mutableVector.f15005z, 0, objArr, i2, i3);
        this.f15004B += i3;
        return true;
    }

    public final boolean g(int i2, Collection collection) {
        int i3 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i4 = this.f15004B + size;
        if (this.f15005z.length < i4) {
            A(i4);
        }
        Object[] objArr = this.f15005z;
        int i5 = this.f15004B;
        if (i2 != i5) {
            System.arraycopy(objArr, i2, objArr, i2 + size, i5 - i2);
        }
        for (Object next : collection) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.w();
            }
            objArr[i3 + i2] = next;
            i3 = i6;
        }
        this.f15004B += size;
        return true;
    }

    public final boolean h(int i2, List list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i3 = this.f15004B + size;
        if (this.f15005z.length < i3) {
            A(i3);
        }
        Object[] objArr = this.f15005z;
        int i4 = this.f15004B;
        if (i2 != i4) {
            System.arraycopy(objArr, i2, objArr, i2 + size, i4 - i2);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            objArr[i2 + i5] = list.get(i5);
        }
        this.f15004B += size;
        return true;
    }

    public final boolean i(Collection collection) {
        return g(this.f15004B, collection);
    }

    public final List k() {
        List list = this.f15003A;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.f15003A = mutableVectorList;
        return mutableVectorList;
    }

    public final void l() {
        Object[] objArr = this.f15005z;
        int i2 = this.f15004B;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f15004B = 0;
    }

    public final boolean m(Object obj) {
        int p2 = p() - 1;
        if (p2 >= 0) {
            int i2 = 0;
            while (!Intrinsics.d(this.f15005z[i2], obj)) {
                if (i2 != p2) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean n(Collection collection) {
        for (Object m2 : collection) {
            if (!m(m2)) {
                return false;
            }
        }
        return true;
    }

    public final Object o() {
        if (p() != 0) {
            return this.f15005z[0];
        }
        F("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final int p() {
        return this.f15004B;
    }

    public final int q(Object obj) {
        Object[] objArr = this.f15005z;
        int i2 = this.f15004B;
        for (int i3 = 0; i3 < i2; i3++) {
            if (Intrinsics.d(obj, objArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    public final Object s() {
        if (p() != 0) {
            return this.f15005z[p() - 1];
        }
        F("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final int u(Object obj) {
        Object[] objArr = this.f15005z;
        for (int i2 = this.f15004B - 1; i2 >= 0; i2--) {
            if (Intrinsics.d(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean v(Object obj) {
        int q2 = q(obj);
        if (q2 < 0) {
            return false;
        }
        y(q2);
        return true;
    }

    public final boolean w(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.f15004B;
        for (Object v2 : collection) {
            v(v2);
        }
        return i2 != this.f15004B;
    }

    public final Object y(int i2) {
        Object[] objArr = this.f15005z;
        Object obj = objArr[i2];
        if (i2 != p() - 1) {
            int i3 = i2 + 1;
            System.arraycopy(objArr, i3, objArr, i2, this.f15004B - i3);
        }
        int i4 = this.f15004B - 1;
        this.f15004B = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void z(int i2, int i3) {
        if (i3 > i2) {
            int i4 = this.f15004B;
            if (i3 < i4) {
                Object[] objArr = this.f15005z;
                System.arraycopy(objArr, i3, objArr, i2, i4 - i3);
            }
            int i5 = this.f15004B - (i3 - i2);
            int p2 = p() - 1;
            if (i5 <= p2) {
                int i6 = i5;
                while (true) {
                    this.f15005z[i6] = null;
                    if (i6 == p2) {
                        break;
                    }
                    i6++;
                }
            }
            this.f15004B = i5;
        }
    }
}
