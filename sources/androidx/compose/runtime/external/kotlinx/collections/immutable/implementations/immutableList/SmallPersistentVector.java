package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f15037B = new Companion((DefaultConstructorMarker) null);
    public static final int C = 8;
    public static final SmallPersistentVector D = new SmallPersistentVector(new Object[0]);

    /* renamed from: A  reason: collision with root package name */
    public final Object[] f15038A;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SmallPersistentVector a() {
            return SmallPersistentVector.D;
        }

        public Companion() {
        }
    }

    public SmallPersistentVector(Object[] objArr) {
        this.f15038A = objArr;
        CommonFunctionsKt.a(objArr.length <= 32);
    }

    public PersistentList H0(Function1 function1) {
        Object[] objArr = this.f15038A;
        int size = size();
        int size2 = size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = this.f15038A[i2];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z2) {
                    Object[] objArr2 = this.f15038A;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    Intrinsics.h(objArr, "copyOf(...)");
                    z2 = true;
                    size = i2;
                }
            } else if (z2) {
                objArr[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? D : new SmallPersistentVector(ArraysKt.t(objArr, 0, size));
    }

    public PersistentList add(Object obj) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f15038A, size() + 1);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[size()] = obj;
            return new SmallPersistentVector(copyOf);
        }
        return new PersistentVector(this.f15038A, UtilsKt.c(obj), size() + 1, 0);
    }

    public PersistentList addAll(Collection collection) {
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f15038A, size() + collection.size());
            Intrinsics.h(copyOf, "copyOf(...)");
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new SmallPersistentVector(copyOf);
        }
        PersistentList.Builder l2 = l();
        l2.addAll(collection);
        return l2.d();
    }

    public int g() {
        return this.f15038A.length;
    }

    public Object get(int i2) {
        ListImplementation.a(i2, size());
        return this.f15038A[i2];
    }

    public int indexOf(Object obj) {
        return ArraysKt.t0(this.f15038A, obj);
    }

    public PersistentList.Builder l() {
        return new PersistentVectorBuilder(this, (Object[]) null, this.f15038A, 0);
    }

    public int lastIndexOf(Object obj) {
        return ArraysKt.I0(this.f15038A, obj);
    }

    public ListIterator listIterator(int i2) {
        ListImplementation.b(i2, size());
        return new BufferIterator(this.f15038A, i2, size());
    }

    public final Object[] o(int i2) {
        return new Object[i2];
    }

    public PersistentList set(int i2, Object obj) {
        ListImplementation.a(i2, size());
        Object[] objArr = this.f15038A;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        copyOf[i2] = obj;
        return new SmallPersistentVector(copyOf);
    }

    public PersistentList w0(int i2) {
        ListImplementation.a(i2, size());
        if (size() == 1) {
            return D;
        }
        Object[] copyOf = Arrays.copyOf(this.f15038A, size() - 1);
        Intrinsics.h(copyOf, "copyOf(...)");
        ArraysKt.l(this.f15038A, copyOf, i2, i2 + 1, size());
        return new SmallPersistentVector(copyOf);
    }

    public PersistentList add(int i2, Object obj) {
        ListImplementation.b(i2, size());
        if (i2 == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] o2 = o(size() + 1);
            ArraysKt.q(this.f15038A, o2, 0, 0, i2, 6, (Object) null);
            ArraysKt.l(this.f15038A, o2, i2 + 1, i2, size());
            o2[i2] = obj;
            return new SmallPersistentVector(o2);
        }
        Object[] objArr = this.f15038A;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        ArraysKt.l(this.f15038A, copyOf, i2 + 1, i2, size() - 1);
        copyOf[i2] = obj;
        return new PersistentVector(copyOf, UtilsKt.c(this.f15038A[31]), size() + 1, 0);
    }
}
