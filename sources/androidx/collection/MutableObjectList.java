package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata
public final class MutableObjectList<E> extends ObjectList<E> {

    /* renamed from: c  reason: collision with root package name */
    public ObjectListMutableList f1899c;

    @Metadata
    public static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {

        /* renamed from: A  reason: collision with root package name */
        public int f1900A;

        /* renamed from: z  reason: collision with root package name */
        public final List f1901z;

        public MutableObjectListIterator(List list, int i2) {
            Intrinsics.i(list, "list");
            this.f1901z = list;
            this.f1900A = i2 - 1;
        }

        public void add(Object obj) {
            List list = this.f1901z;
            int i2 = this.f1900A + 1;
            this.f1900A = i2;
            list.add(i2, obj);
        }

        public boolean hasNext() {
            return this.f1900A < this.f1901z.size() - 1;
        }

        public boolean hasPrevious() {
            return this.f1900A >= 0;
        }

        public Object next() {
            List list = this.f1901z;
            int i2 = this.f1900A + 1;
            this.f1900A = i2;
            return list.get(i2);
        }

        public int nextIndex() {
            return this.f1900A + 1;
        }

        public Object previous() {
            List list = this.f1901z;
            int i2 = this.f1900A;
            this.f1900A = i2 - 1;
            return list.get(i2);
        }

        public int previousIndex() {
            return this.f1900A;
        }

        public void remove() {
            this.f1901z.remove(this.f1900A);
            this.f1900A--;
        }

        public void set(Object obj) {
            this.f1901z.set(this.f1900A, obj);
        }
    }

    @Metadata
    public static final class ObjectListMutableList<T> implements List<T>, KMutableList {

        /* renamed from: z  reason: collision with root package name */
        public final MutableObjectList f1902z;

        public ObjectListMutableList(MutableObjectList mutableObjectList) {
            Intrinsics.i(mutableObjectList, "objectList");
            this.f1902z = mutableObjectList;
        }

        public boolean add(Object obj) {
            return this.f1902z.n(obj);
        }

        public boolean addAll(int i2, Collection collection) {
            Intrinsics.i(collection, "elements");
            return this.f1902z.o(i2, collection);
        }

        public void clear() {
            this.f1902z.t();
        }

        public boolean contains(Object obj) {
            return this.f1902z.a(obj);
        }

        public boolean containsAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            return this.f1902z.b(collection);
        }

        public int e() {
            return this.f1902z.e();
        }

        public Object g(int i2) {
            ObjectListKt.d(this, i2);
            return this.f1902z.A(i2);
        }

        public Object get(int i2) {
            ObjectListKt.d(this, i2);
            return this.f1902z.d(i2);
        }

        public int indexOf(Object obj) {
            return this.f1902z.f(obj);
        }

        public boolean isEmpty() {
            return this.f1902z.g();
        }

        public Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        public int lastIndexOf(Object obj) {
            return this.f1902z.k(obj);
        }

        public ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        public final /* bridge */ Object remove(int i2) {
            return g(i2);
        }

        public boolean removeAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            return this.f1902z.z(collection);
        }

        public boolean retainAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            return this.f1902z.D(collection);
        }

        public Object set(int i2, Object obj) {
            ObjectListKt.d(this, i2);
            return this.f1902z.E(i2, obj);
        }

        public final /* bridge */ int size() {
            return e();
        }

        public List subList(int i2, int i3) {
            ObjectListKt.e(this, i2, i3);
            return new SubList(this, i2, i3);
        }

        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public void add(int i2, Object obj) {
            this.f1902z.m(i2, obj);
        }

        public boolean addAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            return this.f1902z.q(collection);
        }

        public ListIterator listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        public boolean remove(Object obj) {
            return this.f1902z.y(obj);
        }

        public Object[] toArray(Object[] objArr) {
            Intrinsics.i(objArr, "array");
            return CollectionToArray.b(this, objArr);
        }
    }

    @Metadata
    public static final class SubList<T> implements List<T>, KMutableList {

        /* renamed from: A  reason: collision with root package name */
        public final int f1903A;

        /* renamed from: B  reason: collision with root package name */
        public int f1904B;

        /* renamed from: z  reason: collision with root package name */
        public final List f1905z;

        public SubList(List list, int i2, int i3) {
            Intrinsics.i(list, "list");
            this.f1905z = list;
            this.f1903A = i2;
            this.f1904B = i3;
        }

        public boolean add(Object obj) {
            List list = this.f1905z;
            int i2 = this.f1904B;
            this.f1904B = i2 + 1;
            list.add(i2, obj);
            return true;
        }

        public boolean addAll(int i2, Collection collection) {
            Intrinsics.i(collection, "elements");
            this.f1905z.addAll(i2 + this.f1903A, collection);
            this.f1904B += collection.size();
            return collection.size() > 0;
        }

        public void clear() {
            int i2 = this.f1904B - 1;
            int i3 = this.f1903A;
            if (i3 <= i2) {
                while (true) {
                    this.f1905z.remove(i2);
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            this.f1904B = this.f1903A;
        }

        public boolean contains(Object obj) {
            int i2 = this.f1904B;
            for (int i3 = this.f1903A; i3 < i2; i3++) {
                if (Intrinsics.d(this.f1905z.get(i3), obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public int e() {
            return this.f1904B - this.f1903A;
        }

        public Object g(int i2) {
            ObjectListKt.d(this, i2);
            this.f1904B--;
            return this.f1905z.remove(i2 + this.f1903A);
        }

        public Object get(int i2) {
            ObjectListKt.d(this, i2);
            return this.f1905z.get(i2 + this.f1903A);
        }

        public int indexOf(Object obj) {
            int i2 = this.f1904B;
            for (int i3 = this.f1903A; i3 < i2; i3++) {
                if (Intrinsics.d(this.f1905z.get(i3), obj)) {
                    return i3 - this.f1903A;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f1904B == this.f1903A;
        }

        public Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i2 = this.f1904B - 1;
            int i3 = this.f1903A;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.d(this.f1905z.get(i2), obj)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.f1903A;
        }

        public ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        public final /* bridge */ Object remove(int i2) {
            return g(i2);
        }

        public boolean removeAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            int i2 = this.f1904B;
            for (Object remove : collection) {
                remove(remove);
            }
            return i2 != this.f1904B;
        }

        public boolean retainAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            int i2 = this.f1904B;
            int i3 = i2 - 1;
            int i4 = this.f1903A;
            if (i4 <= i3) {
                while (true) {
                    if (!collection.contains(this.f1905z.get(i3))) {
                        this.f1905z.remove(i3);
                        this.f1904B--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.f1904B;
        }

        public Object set(int i2, Object obj) {
            ObjectListKt.d(this, i2);
            return this.f1905z.set(i2 + this.f1903A, obj);
        }

        public final /* bridge */ int size() {
            return e();
        }

        public List subList(int i2, int i3) {
            ObjectListKt.e(this, i2, i3);
            return new SubList(this, i2, i3);
        }

        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public void add(int i2, Object obj) {
            this.f1905z.add(i2 + this.f1903A, obj);
            this.f1904B++;
        }

        public ListIterator listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        public boolean remove(Object obj) {
            int i2 = this.f1904B;
            for (int i3 = this.f1903A; i3 < i2; i3++) {
                if (Intrinsics.d(this.f1905z.get(i3), obj)) {
                    this.f1905z.remove(i3);
                    this.f1904B--;
                    return true;
                }
            }
            return false;
        }

        public Object[] toArray(Object[] objArr) {
            Intrinsics.i(objArr, "array");
            return CollectionToArray.b(this, objArr);
        }

        public boolean addAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            this.f1905z.addAll(this.f1904B, collection);
            this.f1904B += collection.size();
            return collection.size() > 0;
        }
    }

    public MutableObjectList(int i2) {
        super(i2, (DefaultConstructorMarker) null);
    }

    public final Object A(int i2) {
        if (i2 < 0 || i2 >= this.f1938b) {
            l(i2);
        }
        Object[] objArr = this.f1937a;
        Object obj = objArr[i2];
        int i3 = this.f1938b;
        if (i2 != i3 - 1) {
            ArraysKt.l(objArr, objArr, i2, i2 + 1, i3);
        }
        int i4 = this.f1938b - 1;
        this.f1938b = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void B(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > (i4 = this.f1938b) || i3 < 0 || i3 > i4) {
            RuntimeHelpersKt.c("Start (" + i2 + ") and end (" + i3 + ") must be in 0.." + this.f1938b);
        }
        if (i3 < i2) {
            RuntimeHelpersKt.a("Start (" + i2 + ") is more than end (" + i3 + ')');
        }
        if (i3 != i2) {
            int i5 = this.f1938b;
            if (i3 < i5) {
                Object[] objArr = this.f1937a;
                ArraysKt.l(objArr, objArr, i2, i3, i5);
            }
            int i6 = this.f1938b;
            int i7 = i6 - (i3 - i2);
            ArraysKt.w(this.f1937a, (Object) null, i7, i6);
            this.f1938b = i7;
        }
    }

    public final void C(int i2, Object[] objArr) {
        Intrinsics.i(objArr, "oldContent");
        int length = objArr.length;
        this.f1937a = ArraysKt.l(objArr, new Object[Math.max(i2, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean D(Collection collection) {
        Intrinsics.i(collection, "elements");
        int i2 = this.f1938b;
        Object[] objArr = this.f1937a;
        for (int i3 = i2 - 1; -1 < i3; i3--) {
            if (!collection.contains(objArr[i3])) {
                A(i3);
            }
        }
        return i2 != this.f1938b;
    }

    public final Object E(int i2, Object obj) {
        if (i2 < 0 || i2 >= this.f1938b) {
            l(i2);
        }
        Object[] objArr = this.f1937a;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final void F(int i2) {
        RuntimeHelpersKt.c("Index " + i2 + " must be in 0.." + this.f1938b);
    }

    public final void m(int i2, Object obj) {
        if (i2 < 0 || i2 > this.f1938b) {
            F(i2);
        }
        int i3 = this.f1938b + 1;
        Object[] objArr = this.f1937a;
        if (objArr.length < i3) {
            C(i3, objArr);
        }
        Object[] objArr2 = this.f1937a;
        int i4 = this.f1938b;
        if (i2 != i4) {
            ArraysKt.l(objArr2, objArr2, i2 + 1, i2, i4);
        }
        objArr2[i2] = obj;
        this.f1938b++;
    }

    public final boolean n(Object obj) {
        int i2 = this.f1938b + 1;
        Object[] objArr = this.f1937a;
        if (objArr.length < i2) {
            C(i2, objArr);
        }
        Object[] objArr2 = this.f1937a;
        int i3 = this.f1938b;
        objArr2[i3] = obj;
        this.f1938b = i3 + 1;
        return true;
    }

    public final boolean o(int i2, Collection collection) {
        Intrinsics.i(collection, "elements");
        if (i2 < 0 || i2 > this.f1938b) {
            F(i2);
        }
        int i3 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = this.f1938b + collection.size();
        Object[] objArr = this.f1937a;
        if (objArr.length < size) {
            C(size, objArr);
        }
        Object[] objArr2 = this.f1937a;
        if (i2 != this.f1938b) {
            ArraysKt.l(objArr2, objArr2, collection.size() + i2, i2, this.f1938b);
        }
        for (Object next : collection) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.w();
            }
            objArr2[i3 + i2] = next;
            i3 = i4;
        }
        this.f1938b += collection.size();
        return true;
    }

    public final boolean p(ObjectList objectList) {
        Intrinsics.i(objectList, "elements");
        int i2 = this.f1938b;
        v(objectList);
        return i2 != this.f1938b;
    }

    public final boolean q(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        int i2 = this.f1938b;
        w(iterable);
        return i2 != this.f1938b;
    }

    public final boolean r(List list) {
        Intrinsics.i(list, "elements");
        int i2 = this.f1938b;
        x(list);
        return i2 != this.f1938b;
    }

    public final List s() {
        ObjectListMutableList objectListMutableList = this.f1899c;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList objectListMutableList2 = new ObjectListMutableList(this);
        this.f1899c = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void t() {
        ArraysKt.w(this.f1937a, (Object) null, 0, this.f1938b);
        this.f1938b = 0;
    }

    public final void u(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        for (Object y2 : iterable) {
            y(y2);
        }
    }

    public final void v(ObjectList objectList) {
        Intrinsics.i(objectList, "elements");
        if (!objectList.g()) {
            int i2 = this.f1938b + objectList.f1938b;
            Object[] objArr = this.f1937a;
            if (objArr.length < i2) {
                C(i2, objArr);
            }
            ArraysKt.l(objectList.f1937a, this.f1937a, this.f1938b, 0, objectList.f1938b);
            this.f1938b += objectList.f1938b;
        }
    }

    public final void w(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        for (Object n2 : iterable) {
            n(n2);
        }
    }

    public final void x(List list) {
        Intrinsics.i(list, "elements");
        if (!list.isEmpty()) {
            int i2 = this.f1938b;
            int size = list.size() + i2;
            Object[] objArr = this.f1937a;
            if (objArr.length < size) {
                C(size, objArr);
            }
            Object[] objArr2 = this.f1937a;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                objArr2[i3 + i2] = list.get(i3);
            }
            this.f1938b += list.size();
        }
    }

    public final boolean y(Object obj) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        A(f2);
        return true;
    }

    public final boolean z(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        int i2 = this.f1938b;
        u(iterable);
        return i2 != this.f1938b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableObjectList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }
}
