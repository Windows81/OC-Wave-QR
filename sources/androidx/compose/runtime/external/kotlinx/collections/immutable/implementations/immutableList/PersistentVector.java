package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {

    /* renamed from: A  reason: collision with root package name */
    public final Object[] f15029A;

    /* renamed from: B  reason: collision with root package name */
    public final Object[] f15030B;
    public final int C;
    public final int D;

    public PersistentVector(Object[] objArr, Object[] objArr2, int i2, int i3) {
        this.f15029A = objArr;
        this.f15030B = objArr2;
        this.C = i2;
        this.D = i3;
        boolean z2 = false;
        if (!(size() > 32)) {
            PreconditionsKt.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        CommonFunctionsKt.a(size() - UtilsKt.d(size()) <= RangesKt.j(objArr2.length, 32) ? true : z2);
    }

    public final PersistentList A(Object[] objArr, int i2, int i3, int i4) {
        int size = size() - i2;
        CommonFunctionsKt.a(i4 < size);
        if (size == 1) {
            return u(objArr, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(this.f15030B, 32);
        Intrinsics.h(copyOf, "copyOf(...)");
        int i5 = size - 1;
        if (i4 < i5) {
            ArraysKt.l(this.f15030B, copyOf, i4, i4 + 1, size);
        }
        copyOf[i5] = null;
        return new PersistentVector(objArr, copyOf, (i2 + size) - 1, i3);
    }

    public final int B() {
        return UtilsKt.d(size());
    }

    public final Object[] C(Object[] objArr, int i2, int i3, Object obj) {
        int a2 = UtilsKt.a(i3, i2);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.h(copyOf, "copyOf(...)");
        if (i2 == 0) {
            copyOf[a2] = obj;
        } else {
            Object obj2 = copyOf[a2];
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a2] = C((Object[]) obj2, i2 - 5, i3, obj);
        }
        return copyOf;
    }

    public PersistentList H0(Function1 function1) {
        PersistentVectorBuilder o2 = l();
        o2.W(function1);
        return o2.d();
    }

    public PersistentList add(Object obj) {
        int size = size() - B();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f15030B, 32);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[size] = obj;
            return new PersistentVector(this.f15029A, copyOf, size() + 1, this.D);
        }
        return v(this.f15029A, this.f15030B, UtilsKt.c(obj));
    }

    public int g() {
        return this.C;
    }

    public Object get(int i2) {
        ListImplementation.a(i2, size());
        return n(i2)[i2 & 31];
    }

    public ListIterator listIterator(int i2) {
        ListImplementation.b(i2, size());
        return new PersistentVectorIterator(this.f15029A, this.f15030B, i2, size(), (this.D / 5) + 1);
    }

    public final Object[] n(int i2) {
        if (B() <= i2) {
            return this.f15030B;
        }
        Object[] objArr = this.f15029A;
        for (int i3 = this.D; i3 > 0; i3 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.a(i2, i3)];
            Intrinsics.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    /* renamed from: o */
    public PersistentVectorBuilder l() {
        return new PersistentVectorBuilder(this, this.f15029A, this.f15030B, this.D);
    }

    public final Object[] p(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object[] objArr2;
        Object[] objArr3 = objArr;
        int i4 = i2;
        int a2 = UtilsKt.a(i3, i4);
        if (i4 == 0) {
            if (a2 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr3, 32);
                Intrinsics.h(objArr2, "copyOf(...)");
            }
            ArraysKt.l(objArr3, objArr2, a2 + 1, a2, 31);
            objectRef.b(objArr3[31]);
            objArr2[a2] = obj;
            return objArr2;
        }
        ObjectRef objectRef2 = objectRef;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        Intrinsics.h(copyOf, "copyOf(...)");
        int i5 = i4 - 5;
        Object obj2 = objArr3[a2];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Intrinsics.g(obj2, str);
        copyOf[a2] = p((Object[]) obj2, i5, i3, obj, objectRef);
        int i6 = a2 + 1;
        while (i6 < 32 && copyOf[i6] != null) {
            Object obj3 = objArr3[i6];
            Intrinsics.g(obj3, str);
            Object[] objArr4 = copyOf;
            objArr4[i6] = p((Object[]) obj3, i5, 0, objectRef.a(), objectRef);
            i6++;
            copyOf = objArr4;
            str = str;
        }
        return copyOf;
    }

    public final PersistentVector q(Object[] objArr, int i2, Object obj) {
        int size = size() - B();
        Object[] copyOf = Arrays.copyOf(this.f15030B, 32);
        Intrinsics.h(copyOf, "copyOf(...)");
        if (size < 32) {
            ArraysKt.l(this.f15030B, copyOf, i2 + 1, i2, size);
            copyOf[i2] = obj;
            return new PersistentVector(objArr, copyOf, size() + 1, this.D);
        }
        Object[] objArr2 = this.f15030B;
        Object obj2 = objArr2[31];
        ArraysKt.l(objArr2, copyOf, i2 + 1, i2, size - 1);
        copyOf[i2] = obj;
        return v(objArr, copyOf, UtilsKt.c(obj2));
    }

    public final Object[] s(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArr2;
        int a2 = UtilsKt.a(i3, i2);
        if (i2 == 5) {
            objectRef.b(objArr[a2]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a2];
            Intrinsics.g(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = s(objArr3, i2 - 5, i3, objectRef);
        }
        if (objArr2 == null && a2 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.h(copyOf, "copyOf(...)");
        copyOf[a2] = objArr2;
        return copyOf;
    }

    public PersistentList set(int i2, Object obj) {
        ListImplementation.a(i2, size());
        if (B() > i2) {
            return new PersistentVector(C(this.f15029A, this.D, i2, obj), this.f15030B, size(), this.D);
        }
        Object[] copyOf = Arrays.copyOf(this.f15030B, 32);
        Intrinsics.h(copyOf, "copyOf(...)");
        copyOf[i2 & 31] = obj;
        return new PersistentVector(this.f15029A, copyOf, size(), this.D);
    }

    public final PersistentList u(Object[] objArr, int i2, int i3) {
        if (i3 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.h(objArr, "copyOf(...)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Object[] s2 = s(objArr, i3, i2 - 1, objectRef);
        Intrinsics.f(s2);
        Object a2 = objectRef.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a2;
        if (s2[1] != null) {
            return new PersistentVector(s2, objArr2, i2, i3);
        }
        Object obj = s2[0];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new PersistentVector((Object[]) obj, objArr2, i2, i3 - 5);
    }

    public final PersistentVector v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i2 = this.D;
        if (size <= (1 << i2)) {
            return new PersistentVector(w(objArr, i2, objArr2), objArr3, size() + 1, this.D);
        }
        Object[] c2 = UtilsKt.c(objArr);
        int i3 = this.D + 5;
        return new PersistentVector(w(c2, i3, objArr2), objArr3, size() + 1, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] w(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + -1
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L_0x0019
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.h(r4, r2)
            if (r4 != 0) goto L_0x001b
        L_0x0019:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L_0x001b:
            r1 = 5
            if (r5 != r1) goto L_0x0021
            r4[r0] = r6
            goto L_0x002c
        L_0x0021:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.w(r2, r5, r6)
            r4[r0] = r5
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector.w(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    public PersistentList w0(int i2) {
        ListImplementation.a(i2, size());
        int B2 = B();
        return i2 >= B2 ? A(this.f15029A, B2, this.D, i2 - B2) : A(z(this.f15029A, this.D, i2, new ObjectRef(this.f15030B[0])), B2, this.D, 0);
    }

    public final Object[] z(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArr2;
        int a2 = UtilsKt.a(i3, i2);
        int i4 = 31;
        if (i2 == 0) {
            if (a2 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                Intrinsics.h(objArr2, "copyOf(...)");
            }
            ArraysKt.l(objArr, objArr2, a2, a2 + 1, 32);
            objArr2[31] = objectRef.a();
            objectRef.b(objArr[a2]);
            return objArr2;
        }
        if (objArr[31] == null) {
            i4 = UtilsKt.a(B() - 1, i2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.h(copyOf, "copyOf(...)");
        int i5 = i2 - 5;
        int i6 = a2 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = copyOf[i4];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf[i4] = z((Object[]) obj, i5, 0, objectRef);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = copyOf[a2];
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[a2] = z((Object[]) obj2, i5, i3, objectRef);
        return copyOf;
    }

    public PersistentList add(int i2, Object obj) {
        ListImplementation.b(i2, size());
        if (i2 == size()) {
            return add(obj);
        }
        int B2 = B();
        if (i2 >= B2) {
            return q(this.f15029A, i2 - B2, obj);
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        return q(p(this.f15029A, this.D, i2, obj, objectRef), 0, objectRef.a());
    }
}
