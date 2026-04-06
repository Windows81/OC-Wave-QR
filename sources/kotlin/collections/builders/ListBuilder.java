package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);
    public static final ListBuilder D;

    /* renamed from: A  reason: collision with root package name */
    public int f40647A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f40648B;

    /* renamed from: z  reason: collision with root package name */
    public Object[] f40649z;

    @Metadata
    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

        /* renamed from: A  reason: collision with root package name */
        public final int f40650A;

        /* renamed from: B  reason: collision with root package name */
        public int f40651B;
        public final BuilderSubList C;
        public final ListBuilder D;

        /* renamed from: z  reason: collision with root package name */
        public Object[] f40652z;

        @Metadata
        public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {

            /* renamed from: A  reason: collision with root package name */
            public int f40653A;

            /* renamed from: B  reason: collision with root package name */
            public int f40654B = -1;
            public int C;

            /* renamed from: z  reason: collision with root package name */
            public final BuilderSubList f40655z;

            public Itr(BuilderSubList builderSubList, int i2) {
                Intrinsics.i(builderSubList, "list");
                this.f40655z = builderSubList;
                this.f40653A = i2;
                this.C = builderSubList.modCount;
            }

            private final void b() {
                if (this.f40655z.D.modCount != this.C) {
                    throw new ConcurrentModificationException();
                }
            }

            public void add(Object obj) {
                b();
                BuilderSubList builderSubList = this.f40655z;
                int i2 = this.f40653A;
                this.f40653A = i2 + 1;
                builderSubList.add(i2, obj);
                this.f40654B = -1;
                this.C = this.f40655z.modCount;
            }

            public boolean hasNext() {
                return this.f40653A < this.f40655z.f40651B;
            }

            public boolean hasPrevious() {
                return this.f40653A > 0;
            }

            public Object next() {
                b();
                if (this.f40653A < this.f40655z.f40651B) {
                    int i2 = this.f40653A;
                    this.f40653A = i2 + 1;
                    this.f40654B = i2;
                    return this.f40655z.f40652z[this.f40655z.f40650A + this.f40654B];
                }
                throw new NoSuchElementException();
            }

            public int nextIndex() {
                return this.f40653A;
            }

            public Object previous() {
                b();
                int i2 = this.f40653A;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    this.f40653A = i3;
                    this.f40654B = i3;
                    return this.f40655z.f40652z[this.f40655z.f40650A + this.f40654B];
                }
                throw new NoSuchElementException();
            }

            public int previousIndex() {
                return this.f40653A - 1;
            }

            public void remove() {
                b();
                int i2 = this.f40654B;
                if (i2 != -1) {
                    this.f40655z.remove(i2);
                    this.f40653A = this.f40654B;
                    this.f40654B = -1;
                    this.C = this.f40655z.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            public void set(Object obj) {
                b();
                int i2 = this.f40654B;
                if (i2 != -1) {
                    this.f40655z.set(i2, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        public BuilderSubList(Object[] objArr, int i2, int i3, BuilderSubList builderSubList, ListBuilder listBuilder) {
            Intrinsics.i(objArr, "backing");
            Intrinsics.i(listBuilder, "root");
            this.f40652z = objArr;
            this.f40650A = i2;
            this.f40651B = i3;
            this.C = builderSubList;
            this.D = listBuilder;
            this.modCount = listBuilder.modCount;
        }

        private final void s() {
            if (this.D.modCount != this.modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void z() {
            this.modCount++;
        }

        public final Object A(int i2) {
            z();
            BuilderSubList builderSubList = this.C;
            this.f40651B--;
            return builderSubList != null ? builderSubList.A(i2) : this.D.J(i2);
        }

        public final void B(int i2, int i3) {
            if (i3 > 0) {
                z();
            }
            BuilderSubList builderSubList = this.C;
            if (builderSubList != null) {
                builderSubList.B(i2, i3);
            } else {
                this.D.K(i2, i3);
            }
            this.f40651B -= i3;
        }

        public final int C(int i2, int i3, Collection collection, boolean z2) {
            BuilderSubList builderSubList = this.C;
            int C2 = builderSubList != null ? builderSubList.C(i2, i3, collection, z2) : this.D.L(i2, i3, collection, z2);
            if (C2 > 0) {
                z();
            }
            this.f40651B -= C2;
            return C2;
        }

        public boolean add(Object obj) {
            u();
            s();
            q(this.f40650A + this.f40651B, obj);
            return true;
        }

        public boolean addAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            u();
            s();
            int size = collection.size();
            p(this.f40650A + this.f40651B, collection, size);
            return size > 0;
        }

        public void clear() {
            u();
            s();
            B(this.f40650A, this.f40651B);
        }

        public int e() {
            s();
            return this.f40651B;
        }

        public boolean equals(Object obj) {
            s();
            return obj == this || ((obj instanceof List) && v((List) obj));
        }

        public Object g(int i2) {
            u();
            s();
            AbstractList.f40564z.b(i2, this.f40651B);
            return A(this.f40650A + i2);
        }

        public Object get(int i2) {
            s();
            AbstractList.f40564z.b(i2, this.f40651B);
            return this.f40652z[this.f40650A + i2];
        }

        public int hashCode() {
            s();
            return ListBuilderKt.i(this.f40652z, this.f40650A, this.f40651B);
        }

        public int indexOf(Object obj) {
            s();
            for (int i2 = 0; i2 < this.f40651B; i2++) {
                if (Intrinsics.d(this.f40652z[this.f40650A + i2], obj)) {
                    return i2;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            s();
            return this.f40651B == 0;
        }

        public Iterator iterator() {
            return listIterator(0);
        }

        public int lastIndexOf(Object obj) {
            s();
            for (int i2 = this.f40651B - 1; i2 >= 0; i2--) {
                if (Intrinsics.d(this.f40652z[this.f40650A + i2], obj)) {
                    return i2;
                }
            }
            return -1;
        }

        public ListIterator listIterator() {
            return listIterator(0);
        }

        public final void p(int i2, Collection collection, int i3) {
            z();
            BuilderSubList builderSubList = this.C;
            if (builderSubList != null) {
                builderSubList.p(i2, collection, i3);
            } else {
                this.D.v(i2, collection, i3);
            }
            this.f40652z = this.D.f40649z;
            this.f40651B += i3;
        }

        public final void q(int i2, Object obj) {
            z();
            BuilderSubList builderSubList = this.C;
            if (builderSubList != null) {
                builderSubList.q(i2, obj);
            } else {
                this.D.w(i2, obj);
            }
            this.f40652z = this.D.f40649z;
            this.f40651B++;
        }

        public boolean remove(Object obj) {
            u();
            s();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            return indexOf >= 0;
        }

        public boolean removeAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            u();
            s();
            return C(this.f40650A, this.f40651B, collection, false) > 0;
        }

        public boolean retainAll(Collection collection) {
            Intrinsics.i(collection, "elements");
            u();
            s();
            return C(this.f40650A, this.f40651B, collection, true) > 0;
        }

        public Object set(int i2, Object obj) {
            u();
            s();
            AbstractList.f40564z.b(i2, this.f40651B);
            Object[] objArr = this.f40652z;
            int i3 = this.f40650A;
            Object obj2 = objArr[i3 + i2];
            objArr[i3 + i2] = obj;
            return obj2;
        }

        public List subList(int i2, int i3) {
            AbstractList.f40564z.d(i2, i3, this.f40651B);
            return new BuilderSubList(this.f40652z, this.f40650A + i2, i3 - i2, this, this.D);
        }

        public Object[] toArray(Object[] objArr) {
            Intrinsics.i(objArr, "array");
            s();
            int length = objArr.length;
            int i2 = this.f40651B;
            if (length < i2) {
                Object[] objArr2 = this.f40652z;
                int i3 = this.f40650A;
                Object[] copyOfRange = Arrays.copyOfRange(objArr2, i3, i2 + i3, objArr.getClass());
                Intrinsics.h(copyOfRange, "copyOfRange(...)");
                return copyOfRange;
            }
            Object[] objArr3 = this.f40652z;
            int i4 = this.f40650A;
            ArraysKt.l(objArr3, objArr, 0, i4, i2 + i4);
            return CollectionsKt.f(this.f40651B, objArr);
        }

        public String toString() {
            s();
            return ListBuilderKt.j(this.f40652z, this.f40650A, this.f40651B, this);
        }

        public final void u() {
            if (w()) {
                throw new UnsupportedOperationException();
            }
        }

        public final boolean v(List list) {
            return ListBuilderKt.h(this.f40652z, this.f40650A, this.f40651B, list);
        }

        public final boolean w() {
            return this.D.f40648B;
        }

        public ListIterator listIterator(int i2) {
            s();
            AbstractList.f40564z.c(i2, this.f40651B);
            return new Itr(this, i2);
        }

        public void add(int i2, Object obj) {
            u();
            s();
            AbstractList.f40564z.c(i2, this.f40651B);
            q(this.f40650A + i2, obj);
        }

        public boolean addAll(int i2, Collection collection) {
            Intrinsics.i(collection, "elements");
            u();
            s();
            AbstractList.f40564z.c(i2, this.f40651B);
            int size = collection.size();
            p(this.f40650A + i2, collection, size);
            return size > 0;
        }

        public Object[] toArray() {
            s();
            Object[] objArr = this.f40652z;
            int i2 = this.f40650A;
            return ArraysKt.t(objArr, i2, this.f40651B + i2);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {

        /* renamed from: A  reason: collision with root package name */
        public int f40656A;

        /* renamed from: B  reason: collision with root package name */
        public int f40657B = -1;
        public int C;

        /* renamed from: z  reason: collision with root package name */
        public final ListBuilder f40658z;

        public Itr(ListBuilder listBuilder, int i2) {
            Intrinsics.i(listBuilder, "list");
            this.f40658z = listBuilder;
            this.f40656A = i2;
            this.C = listBuilder.modCount;
        }

        private final void b() {
            if (this.f40658z.modCount != this.C) {
                throw new ConcurrentModificationException();
            }
        }

        public void add(Object obj) {
            b();
            ListBuilder listBuilder = this.f40658z;
            int i2 = this.f40656A;
            this.f40656A = i2 + 1;
            listBuilder.add(i2, obj);
            this.f40657B = -1;
            this.C = this.f40658z.modCount;
        }

        public boolean hasNext() {
            return this.f40656A < this.f40658z.f40647A;
        }

        public boolean hasPrevious() {
            return this.f40656A > 0;
        }

        public Object next() {
            b();
            if (this.f40656A < this.f40658z.f40647A) {
                int i2 = this.f40656A;
                this.f40656A = i2 + 1;
                this.f40657B = i2;
                return this.f40658z.f40649z[this.f40657B];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f40656A;
        }

        public Object previous() {
            b();
            int i2 = this.f40656A;
            if (i2 > 0) {
                int i3 = i2 - 1;
                this.f40656A = i3;
                this.f40657B = i3;
                return this.f40658z.f40649z[this.f40657B];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f40656A - 1;
        }

        public void remove() {
            b();
            int i2 = this.f40657B;
            if (i2 != -1) {
                this.f40658z.remove(i2);
                this.f40656A = this.f40657B;
                this.f40657B = -1;
                this.C = this.f40658z.modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        public void set(Object obj) {
            b();
            int i2 = this.f40657B;
            if (i2 != -1) {
                this.f40658z.set(i2, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f40648B = true;
        D = listBuilder;
    }

    public ListBuilder(int i2) {
        this.f40649z = ListBuilderKt.d(i2);
    }

    private final void A() {
        if (this.f40648B) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean B(List list) {
        return ListBuilderKt.h(this.f40649z, 0, this.f40647A, list);
    }

    private final void F() {
        this.modCount++;
    }

    /* access modifiers changed from: private */
    public final Object J(int i2) {
        F();
        Object[] objArr = this.f40649z;
        Object obj = objArr[i2];
        ArraysKt.l(objArr, objArr, i2, i2 + 1, this.f40647A);
        ListBuilderKt.f(this.f40649z, this.f40647A - 1);
        this.f40647A--;
        return obj;
    }

    /* access modifiers changed from: private */
    public final void K(int i2, int i3) {
        if (i3 > 0) {
            F();
        }
        Object[] objArr = this.f40649z;
        ArraysKt.l(objArr, objArr, i2, i2 + i3, this.f40647A);
        Object[] objArr2 = this.f40649z;
        int i4 = this.f40647A;
        ListBuilderKt.g(objArr2, i4 - i3, i4);
        this.f40647A -= i3;
    }

    /* access modifiers changed from: private */
    public final int L(int i2, int i3, Collection collection, boolean z2) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.f40649z[i6]) == z2) {
                Object[] objArr = this.f40649z;
                i4++;
                objArr[i5 + i2] = objArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        Object[] objArr2 = this.f40649z;
        ArraysKt.l(objArr2, objArr2, i2 + i5, i3 + i2, this.f40647A);
        Object[] objArr3 = this.f40649z;
        int i8 = this.f40647A;
        ListBuilderKt.g(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            F();
        }
        this.f40647A -= i7;
        return i7;
    }

    /* access modifiers changed from: private */
    public final void v(int i2, Collection collection, int i3) {
        F();
        E(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f40649z[i2 + i4] = it.next();
        }
    }

    /* access modifiers changed from: private */
    public final void w(int i2, Object obj) {
        F();
        E(i2, 1);
        this.f40649z[i2] = obj;
    }

    public final void C(int i2) {
        if (i2 >= 0) {
            Object[] objArr = this.f40649z;
            if (i2 > objArr.length) {
                this.f40649z = ListBuilderKt.e(this.f40649z, AbstractList.f40564z.e(objArr.length, i2));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final void D(int i2) {
        C(this.f40647A + i2);
    }

    public final void E(int i2, int i3) {
        D(i3);
        Object[] objArr = this.f40649z;
        ArraysKt.l(objArr, objArr, i2 + i3, i2, this.f40647A);
        this.f40647A += i3;
    }

    public boolean add(Object obj) {
        A();
        w(this.f40647A, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        A();
        int size = collection.size();
        v(this.f40647A, collection, size);
        return size > 0;
    }

    public void clear() {
        A();
        K(0, this.f40647A);
    }

    public int e() {
        return this.f40647A;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && B((List) obj));
    }

    public Object g(int i2) {
        A();
        AbstractList.f40564z.b(i2, this.f40647A);
        return J(i2);
    }

    public Object get(int i2) {
        AbstractList.f40564z.b(i2, this.f40647A);
        return this.f40649z[i2];
    }

    public int hashCode() {
        return ListBuilderKt.i(this.f40649z, 0, this.f40647A);
    }

    public int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f40647A; i2++) {
            if (Intrinsics.d(this.f40649z[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f40647A == 0;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        for (int i2 = this.f40647A - 1; i2 >= 0; i2--) {
            if (Intrinsics.d(this.f40649z[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public boolean remove(Object obj) {
        A();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        A();
        return L(0, this.f40647A, collection, false) > 0;
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        A();
        return L(0, this.f40647A, collection, true) > 0;
    }

    public Object set(int i2, Object obj) {
        A();
        AbstractList.f40564z.b(i2, this.f40647A);
        Object[] objArr = this.f40649z;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public List subList(int i2, int i3) {
        AbstractList.f40564z.d(i2, i3, this.f40647A);
        return new BuilderSubList(this.f40649z, i2, i3 - i2, (BuilderSubList) null, this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        int length = objArr.length;
        int i2 = this.f40647A;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f40649z, 0, i2, objArr.getClass());
            Intrinsics.h(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        ArraysKt.l(this.f40649z, objArr, 0, 0, i2);
        return CollectionsKt.f(this.f40647A, objArr);
    }

    public String toString() {
        return ListBuilderKt.j(this.f40649z, 0, this.f40647A, this);
    }

    public final List z() {
        A();
        this.f40648B = true;
        return this.f40647A > 0 ? this : D;
    }

    public ListIterator listIterator(int i2) {
        AbstractList.f40564z.c(i2, this.f40647A);
        return new Itr(this, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListBuilder(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i2);
    }

    public void add(int i2, Object obj) {
        A();
        AbstractList.f40564z.c(i2, this.f40647A);
        w(i2, obj);
    }

    public boolean addAll(int i2, Collection collection) {
        Intrinsics.i(collection, "elements");
        A();
        AbstractList.f40564z.c(i2, this.f40647A);
        int size = collection.size();
        v(i2, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        return ArraysKt.t(this.f40649z, 0, this.f40647A);
    }
}
