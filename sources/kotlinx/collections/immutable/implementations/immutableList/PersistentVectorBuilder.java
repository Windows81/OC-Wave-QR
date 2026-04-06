package kotlinx.collections.immutable.implementations.immutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.ListImplementation;
import kotlinx.collections.immutable.internal.MutabilityOwnership;

@Metadata
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {

    /* renamed from: A  reason: collision with root package name */
    public Object[] f41249A;

    /* renamed from: B  reason: collision with root package name */
    public Object[] f41250B;
    public int C;
    public MutabilityOwnership D = new MutabilityOwnership();
    public Object[] E = this.f41249A;
    public Object[] F = this.f41250B;
    public int G = this.f41251z.size();

    /* renamed from: z  reason: collision with root package name */
    public PersistentList f41251z;

    public PersistentVectorBuilder(PersistentList persistentList, Object[] objArr, Object[] objArr2, int i2) {
        Intrinsics.i(persistentList, "vector");
        Intrinsics.i(objArr2, "vectorTail");
        this.f41251z = persistentList;
        this.f41249A = objArr;
        this.f41250B = objArr2;
        this.C = i2;
    }

    private final Object[] A(Object[] objArr, int i2) {
        return v(objArr) ? ArraysKt.l(objArr, objArr, i2, 0, 32 - i2) : ArraysKt.l(objArr, B(), i2, 0, 32 - i2);
    }

    private final Object[] B() {
        Object[] objArr = new Object[33];
        objArr[32] = this.D;
        return objArr;
    }

    private final Object[] C(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.D;
        return objArr;
    }

    private final Object[] D(Object[] objArr, int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Check failed.");
        } else if (i3 == 0) {
            return objArr;
        } else {
            int a2 = UtilsKt.a(i2, i3);
            Object[] objArr2 = objArr[a2];
            Intrinsics.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object D2 = D(objArr2, i2, i3 - 5);
            if (a2 < 31) {
                int i4 = a2 + 1;
                if (objArr[i4] != null) {
                    if (v(objArr)) {
                        ArraysKt.w(objArr, (Object) null, i4, 32);
                    }
                    objArr = ArraysKt.l(objArr, B(), 0, 0, i4);
                }
            }
            if (D2 == objArr[a2]) {
                return objArr;
            }
            Object[] z2 = z(objArr);
            z2[a2] = D2;
            return z2;
        }
    }

    private final void F(Object[] objArr, int i2, int i3) {
        if (i3 == 0) {
            this.E = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.F = objArr;
            this.G = i2;
            this.C = i3;
            return;
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Intrinsics.f(objArr);
        Object[] E2 = E(objArr, i3, i2, objectRef);
        Intrinsics.f(E2);
        Object a2 = objectRef.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.F = (Object[]) a2;
        this.G = i2;
        if (E2[1] == null) {
            this.E = (Object[]) E2[0];
            this.C = i3 - 5;
            return;
        }
        this.E = E2;
        this.C = i3;
    }

    private final Object[] J(Object[] objArr, int i2, int i3, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        } else if (i3 < 0) {
            throw new IllegalStateException("Check failed.");
        } else if (i3 == 0) {
            return (Object[]) it.next();
        } else {
            Object[] z2 = z(objArr);
            int a2 = UtilsKt.a(i2, i3);
            int i4 = i3 - 5;
            z2[a2] = J((Object[]) z2[a2], i2, i4, it);
            while (true) {
                a2++;
                if (a2 >= 32 || !it.hasNext()) {
                    return z2;
                }
                z2[a2] = J((Object[]) z2[a2], 0, i4, it);
            }
            return z2;
        }
    }

    private final Object[] K(Object[] objArr, int i2, Object[][] objArr2) {
        Iterator a2 = ArrayIteratorKt.a(objArr2);
        int i3 = i2 >> 5;
        int i4 = this.C;
        Object[] J = i3 < (1 << i4) ? J(objArr, i2, i4, a2) : z(objArr);
        while (a2.hasNext()) {
            this.C += 5;
            J = C(J);
            int i5 = this.C;
            J(J, 1 << i5, i5, a2);
        }
        return J;
    }

    private final void L(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i2 = this.C;
        if (size > (1 << i2)) {
            this.E = M(C(objArr), objArr2, this.C + 5);
            this.F = objArr3;
            this.C += 5;
            this.G = size() + 1;
        } else if (objArr == null) {
            this.E = objArr2;
            this.F = objArr3;
            this.G = size() + 1;
        } else {
            this.E = M(objArr, objArr2, i2);
            this.F = objArr3;
            this.G = size() + 1;
        }
    }

    private final Object[] M(Object[] objArr, Object[] objArr2, int i2) {
        int a2 = UtilsKt.a(size() - 1, i2);
        Object[] z2 = z(objArr);
        if (i2 == 5) {
            z2[a2] = objArr2;
        } else {
            z2[a2] = M((Object[]) z2[a2], objArr2, i2 - 5);
        }
        return z2;
    }

    private final boolean R(Function1 function1) {
        Object[] objArr;
        Function1 function12 = function1;
        int f0 = f0();
        ObjectRef objectRef = new ObjectRef((Object) null);
        if (this.E == null) {
            return S(function12, f0, objectRef) != f0;
        }
        ListIterator w2 = w(0);
        int i2 = 32;
        while (i2 == 32 && w2.hasNext()) {
            i2 = Q(function12, (Object[]) w2.next(), 32, objectRef);
        }
        if (i2 == 32) {
            CommonFunctionsKt.a(!w2.hasNext());
            int S = S(function12, f0, objectRef);
            if (S == 0) {
                F(this.E, size(), this.C);
            }
            return S != f0;
        }
        int previousIndex = w2.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = i2;
        while (w2.hasNext()) {
            i3 = P(function1, (Object[]) w2.next(), 32, i3, objectRef, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i4 = previousIndex;
        int P = P(function1, this.F, f0, i3, objectRef, arrayList2, arrayList);
        Object a2 = objectRef.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a2;
        ArraysKt.w(objArr2, (Object) null, P, 32);
        if (arrayList.isEmpty()) {
            objArr = this.E;
            Intrinsics.f(objArr);
        } else {
            objArr = J(this.E, i4, this.C, arrayList.iterator());
        }
        int size = i4 + (arrayList.size() << 5);
        this.E = Y(objArr, size);
        this.F = objArr2;
        this.G = size + P;
        return true;
    }

    private final Object W(Object[] objArr, int i2, int i3, int i4) {
        int size = size() - i2;
        CommonFunctionsKt.a(i4 < size);
        if (size == 1) {
            Object obj = this.F[0];
            F(objArr, i2, i3);
            return obj;
        }
        Object[] objArr2 = this.F;
        Object obj2 = objArr2[i4];
        Object[] l2 = ArraysKt.l(objArr2, z(objArr2), i4, i4 + 1, size);
        l2[size - 1] = null;
        this.E = objArr;
        this.F = l2;
        this.G = (i2 + size) - 1;
        this.C = i3;
        return obj2;
    }

    private final Object[] Y(Object[] objArr, int i2) {
        if ((i2 & 31) != 0) {
            throw new IllegalStateException("Check failed.");
        } else if (i2 == 0) {
            this.C = 0;
            return null;
        } else {
            int i3 = i2 - 1;
            while (true) {
                int i4 = this.C;
                if ((i3 >> i4) != 0) {
                    return D(objArr, i3, i4);
                }
                this.C = i4 - 5;
                Object[] objArr2 = objArr[0];
                Intrinsics.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            }
        }
    }

    private final int Z() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.c(size());
    }

    private final Object[] b0(int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.E != null) {
            ListIterator w2 = w(Z() >> 5);
            while (w2.previousIndex() != i2) {
                Object[] objArr3 = (Object[]) w2.previous();
                ArraysKt.l(objArr3, objArr2, 0, 32 - i3, 32);
                objArr2 = A(objArr3, i3);
                i4--;
                objArr[i4] = objArr2;
            }
            return (Object[]) w2.previous();
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void d0(Collection collection, int i2, Object[] objArr, int i3, Object[][] objArr2, int i4, Object[] objArr3) {
        Object[] objArr4;
        if (i4 >= 1) {
            Object[] z2 = z(objArr);
            objArr2[0] = z2;
            int i5 = i2 & 31;
            int size = ((i2 + collection.size()) - 1) & 31;
            int i6 = (i3 - i5) + size;
            if (i6 < 32) {
                ArraysKt.l(z2, objArr3, size + 1, i5, i3);
            } else {
                int i7 = i6 - 31;
                if (i4 == 1) {
                    objArr4 = z2;
                } else {
                    objArr4 = B();
                    i4--;
                    objArr2[i4] = objArr4;
                }
                int i8 = i3 - i7;
                ArraysKt.l(z2, objArr3, 0, i8, i3);
                ArraysKt.l(z2, objArr4, size + 1, i5, i8);
                objArr3 = objArr4;
            }
            Iterator it = collection.iterator();
            i(z2, i5, it);
            for (int i9 = 1; i9 < i4; i9++) {
                objArr2[i9] = i(B(), 0, it);
            }
            i(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final int f0() {
        return h0(size());
    }

    private final Object[] h(int i2) {
        if (Z() <= i2) {
            return this.F;
        }
        Object[] objArr = this.E;
        Intrinsics.f(objArr);
        for (int i3 = this.C; i3 > 0; i3 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.a(i2, i3)];
            Intrinsics.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final int h0(int i2) {
        return i2 <= 32 ? i2 : i2 - UtilsKt.c(i2);
    }

    private final Object[] i(Object[] objArr, int i2, Iterator it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }

    private final void q(Collection collection, int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.E != null) {
            int i5 = i2 >> 5;
            Object[] b0 = b0(i5, i3, objArr, i4, objArr2);
            int Z = i4 - (((Z() >> 5) - 1) - i5);
            if (Z < i4) {
                objArr2 = objArr[Z];
                Intrinsics.f(objArr2);
            }
            d0(collection, i2, b0, 32, objArr, Z, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void u(Object[] objArr, int i2, Object obj) {
        int f0 = f0();
        Object[] z2 = z(this.F);
        if (f0 < 32) {
            ArraysKt.l(this.F, z2, i2 + 1, i2, f0);
            z2[i2] = obj;
            this.E = objArr;
            this.F = z2;
            this.G = size() + 1;
            return;
        }
        Object[] objArr2 = this.F;
        Object obj2 = objArr2[31];
        ArraysKt.l(objArr2, z2, i2 + 1, i2, 31);
        z2[i2] = obj;
        L(objArr, z2, C(obj2));
    }

    private final boolean v(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.D;
    }

    private final ListIterator w(int i2) {
        if (this.E != null) {
            int Z = Z() >> 5;
            ListImplementation.b(i2, Z);
            int i3 = this.C;
            if (i3 == 0) {
                Object[] objArr = this.E;
                Intrinsics.f(objArr);
                return new SingleElementListIterator(objArr, i2);
            }
            Object[] objArr2 = this.E;
            Intrinsics.f(objArr2);
            return new TrieIterator(objArr2, i2, Z, i3 / 5);
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Object[] z(Object[] objArr) {
        if (objArr == null) {
            return B();
        }
        if (v(objArr)) {
            return objArr;
        }
        return ArraysKt.q(objArr, B(), 0, 0, RangesKt.j(objArr.length, 32), 6, (Object) null);
    }

    public final Object[] E(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArr2;
        int a2 = UtilsKt.a(i3 - 1, i2);
        if (i2 == 5) {
            objectRef.b(objArr[a2]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a2];
            Intrinsics.g(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = E(objArr3, i2 - 5, i3, objectRef);
        }
        if (objArr2 == null && a2 == 0) {
            return null;
        }
        Object[] z2 = z(objArr);
        z2[a2] = objArr2;
        return z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int P(kotlin.jvm.functions.Function1 r7, java.lang.Object[] r8, int r9, int r10, kotlinx.collections.immutable.implementations.immutableList.ObjectRef r11, java.util.List r12, java.util.List r13) {
        /*
            r6 = this;
            boolean r0 = r6.v(r8)
            if (r0 == 0) goto L_0x0009
            r12.add(r8)
        L_0x0009:
            java.lang.Object r0 = r11.a()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0017:
            if (r2 >= r9) goto L_0x0050
            r4 = r8[r2]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x004d
            r5 = 32
            if (r10 != r5) goto L_0x0048
            r10 = r12
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0042
            int r10 = r12.size()
            int r10 = r10 + -1
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
        L_0x0040:
            r3 = r10
            goto L_0x0047
        L_0x0042:
            java.lang.Object[] r10 = r6.B()
            goto L_0x0040
        L_0x0047:
            r10 = r1
        L_0x0048:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0050:
            r11.b(r3)
            java.lang.Object r7 = r11.a()
            if (r0 == r7) goto L_0x005c
            r13.add(r0)
        L_0x005c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.P(kotlin.jvm.functions.Function1, java.lang.Object[], int, int, kotlinx.collections.immutable.implementations.immutableList.ObjectRef, java.util.List, java.util.List):int");
    }

    public final int Q(Function1 function1, Object[] objArr, int i2, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i3 = i2;
        boolean z2 = false;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArr2 = z(objArr);
                    z2 = true;
                    i3 = i4;
                }
            } else if (z2) {
                objArr2[i3] = obj;
                i3++;
            }
        }
        objectRef.b(objArr2);
        return i3;
    }

    public final int S(Function1 function1, int i2, ObjectRef objectRef) {
        int Q = Q(function1, this.F, i2, objectRef);
        if (Q == i2) {
            CommonFunctionsKt.a(objectRef.a() == this.F);
            return i2;
        }
        Object a2 = objectRef.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a2;
        ArraysKt.w(objArr, (Object) null, Q, i2);
        this.F = objArr;
        this.G = size() - (i2 - Q);
        return Q;
    }

    public final boolean U(Function1 function1) {
        Intrinsics.i(function1, "predicate");
        boolean R = R(function1);
        if (R) {
            this.modCount++;
        }
        return R;
    }

    public final Object[] V(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        int a2 = UtilsKt.a(i3, i2);
        int i4 = 31;
        if (i2 == 0) {
            Object obj = objArr[a2];
            Object[] l2 = ArraysKt.l(objArr, z(objArr), a2, a2 + 1, 32);
            l2[31] = objectRef.a();
            objectRef.b(obj);
            return l2;
        }
        if (objArr[31] == null) {
            i4 = UtilsKt.a(Z() - 1, i2);
        }
        Object[] z2 = z(objArr);
        int i5 = i2 - 5;
        int i6 = a2 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = z2[i4];
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                z2[i4] = V((Object[]) obj2, i5, 0, objectRef);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = z2[a2];
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        z2[a2] = V((Object[]) obj3, i5, i3, objectRef);
        return z2;
    }

    public final Object[] a0(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        int a2 = UtilsKt.a(i3, i2);
        Object[] z2 = z(objArr);
        if (i2 == 0) {
            if (z2 != objArr) {
                this.modCount++;
            }
            objectRef.b(z2[a2]);
            z2[a2] = obj;
            return z2;
        }
        Object obj2 = z2[a2];
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        z2[a2] = a0((Object[]) obj2, i2 - 5, i3, obj, objectRef);
        return z2;
    }

    public boolean add(Object obj) {
        this.modCount++;
        int f0 = f0();
        if (f0 < 32) {
            Object[] z2 = z(this.F);
            z2[f0] = obj;
            this.F = z2;
            this.G = size() + 1;
        } else {
            L(this.E, this.F, C(obj));
        }
        return true;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int f0 = f0();
        Iterator it = collection.iterator();
        if (32 - f0 >= collection.size()) {
            this.F = i(z(this.F), f0, it);
            this.G = size() + collection.size();
        } else {
            int size = ((collection.size() + f0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = i(z(this.F), f0, it);
            for (int i2 = 1; i2 < size; i2++) {
                objArr[i2] = i(B(), 0, it);
            }
            this.E = K(this.E, Z(), objArr);
            this.F = i(B(), 0, it);
            this.G = size() + collection.size();
        }
        return true;
    }

    public PersistentList d() {
        PersistentList persistentList;
        if (this.E == this.f41249A && this.F == this.f41250B) {
            persistentList = this.f41251z;
        } else {
            this.D = new MutabilityOwnership();
            Object[] objArr = this.E;
            this.f41249A = objArr;
            Object[] objArr2 = this.F;
            this.f41250B = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.E;
                Intrinsics.f(objArr3);
                persistentList = new PersistentVector(objArr3, this.F, size(), this.C);
            } else if (objArr2.length == 0) {
                persistentList = UtilsKt.b();
            } else {
                Object[] copyOf = Arrays.copyOf(this.F, size());
                Intrinsics.h(copyOf, "copyOf(...)");
                persistentList = new SmallPersistentVector(copyOf);
            }
        }
        this.f41251z = persistentList;
        return persistentList;
    }

    public int e() {
        return this.G;
    }

    public Object g(int i2) {
        ListImplementation.a(i2, size());
        this.modCount++;
        int Z = Z();
        if (i2 >= Z) {
            return W(this.E, Z, this.C, i2 - Z);
        }
        ObjectRef objectRef = new ObjectRef(this.F[0]);
        Object[] objArr = this.E;
        Intrinsics.f(objArr);
        W(V(objArr, this.C, i2, objectRef), Z, this.C, 0);
        return objectRef.a();
    }

    public Object get(int i2) {
        ListImplementation.a(i2, size());
        return h(i2)[i2 & 31];
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final int m() {
        return this.modCount;
    }

    public final Object[] n() {
        return this.E;
    }

    public final int o() {
        return this.C;
    }

    public final Object[] p() {
        return this.F;
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return U(new PersistentVectorBuilder$removeAll$1(collection));
    }

    public final Object[] s(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object obj2;
        int a2 = UtilsKt.a(i3, i2);
        if (i2 == 0) {
            objectRef.b(objArr[31]);
            Object[] l2 = ArraysKt.l(objArr, z(objArr), a2 + 1, a2, 31);
            l2[a2] = obj;
            return l2;
        }
        Object[] z2 = z(objArr);
        int i4 = i2 - 5;
        Object obj3 = z2[a2];
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        z2[a2] = s((Object[]) obj3, i4, i3, obj, objectRef);
        while (true) {
            a2++;
            if (a2 >= 32 || (obj2 = z2[a2]) == null) {
                return z2;
            }
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            z2[a2] = s((Object[]) obj2, i4, 0, objectRef.a(), objectRef);
        }
        return z2;
    }

    public Object set(int i2, Object obj) {
        ListImplementation.a(i2, size());
        if (Z() <= i2) {
            Object[] z2 = z(this.F);
            if (z2 != this.F) {
                this.modCount++;
            }
            int i3 = i2 & 31;
            Object obj2 = z2[i3];
            z2[i3] = obj;
            this.F = z2;
            return obj2;
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Object[] objArr = this.E;
        Intrinsics.f(objArr);
        this.E = a0(objArr, this.C, i2, obj, objectRef);
        return objectRef.a();
    }

    public ListIterator listIterator(int i2) {
        ListImplementation.b(i2, size());
        return new PersistentVectorMutableIterator(this, i2);
    }

    public void add(int i2, Object obj) {
        ListImplementation.b(i2, size());
        if (i2 == size()) {
            add(obj);
            return;
        }
        this.modCount++;
        int Z = Z();
        if (i2 >= Z) {
            u(this.E, i2 - Z, obj);
            return;
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Object[] objArr = this.E;
        Intrinsics.f(objArr);
        u(s(objArr, this.C, i2, obj, objectRef), 0, objectRef.a());
    }

    public boolean addAll(int i2, Collection collection) {
        Object[] objArr;
        Intrinsics.i(collection, "elements");
        ListImplementation.b(i2, size());
        if (i2 == size()) {
            return addAll(collection);
        }
        boolean z2 = false;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i3 = (i2 >> 5) << 5;
        int size = (((size() - i3) + collection.size()) - 1) / 32;
        if (size == 0) {
            if (i2 >= Z()) {
                z2 = true;
            }
            CommonFunctionsKt.a(z2);
            int i4 = i2 & 31;
            Object[] objArr2 = this.F;
            Object[] l2 = ArraysKt.l(objArr2, z(objArr2), (((i2 + collection.size()) - 1) & 31) + 1, i4, f0());
            i(l2, i4, collection.iterator());
            this.F = l2;
            this.G = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int f0 = f0();
        int h0 = h0(size() + collection.size());
        if (i2 >= Z()) {
            objArr = B();
            d0(collection, i2, this.F, f0, objArr3, size, objArr);
        } else if (h0 > f0) {
            int i5 = h0 - f0;
            objArr = A(this.F, i5);
            q(collection, i2, i5, objArr3, size, objArr);
        } else {
            int i6 = f0 - h0;
            objArr = ArraysKt.l(this.F, B(), 0, i6, f0);
            int i7 = 32 - i6;
            Object[] A2 = A(this.F, i7);
            int i8 = size - 1;
            objArr3[i8] = A2;
            q(collection, i2, i7, objArr3, i8, A2);
        }
        this.E = K(this.E, i3, objArr3);
        this.F = objArr;
        this.G = size() + collection.size();
        return true;
    }
}
