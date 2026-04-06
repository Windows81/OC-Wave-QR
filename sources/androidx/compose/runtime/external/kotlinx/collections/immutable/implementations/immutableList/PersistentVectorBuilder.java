package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import c.b;
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

@Metadata
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {

    /* renamed from: A  reason: collision with root package name */
    public Object[] f15031A;

    /* renamed from: B  reason: collision with root package name */
    public Object[] f15032B;
    public int C;
    public MutabilityOwnership D = new MutabilityOwnership();
    public Object[] E = this.f15031A;
    public Object[] F = this.f15032B;
    public int G = this.f15033z.size();

    /* renamed from: z  reason: collision with root package name */
    public PersistentList f15033z;

    public PersistentVectorBuilder(PersistentList persistentList, Object[] objArr, Object[] objArr2, int i2) {
        this.f15033z = persistentList;
        this.f15031A = objArr;
        this.f15032B = objArr2;
        this.C = i2;
    }

    private final Object[] F(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArr2;
        int a2 = UtilsKt.a(i3 - 1, i2);
        if (i2 == 5) {
            objectRef.b(objArr[a2]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a2];
            Intrinsics.g(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = F(objArr3, i2 - 5, i3, objectRef);
        }
        if (objArr2 == null && a2 == 0) {
            return null;
        }
        Object[] A2 = A(objArr);
        A2[a2] = objArr2;
        return A2;
    }

    public static final boolean U(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final Object[] Y(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        int a2 = UtilsKt.a(i3, i2);
        int i4 = 31;
        if (i2 == 0) {
            Object obj = objArr[a2];
            Object[] l2 = ArraysKt.l(objArr, A(objArr), a2, a2 + 1, 32);
            l2[31] = objectRef.a();
            objectRef.b(obj);
            return l2;
        }
        if (objArr[31] == null) {
            i4 = UtilsKt.a(b0() - 1, i2);
        }
        Object[] A2 = A(objArr);
        int i5 = i2 - 5;
        int i6 = a2 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = A2[i4];
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A2[i4] = Y((Object[]) obj2, i5, 0, objectRef);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = A2[a2];
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A2[a2] = Y((Object[]) obj3, i5, i3, objectRef);
        return A2;
    }

    private final int b0() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.d(size());
    }

    private final Object[] i(int i2) {
        if (b0() <= i2) {
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

    private final Object[] u(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object obj2;
        int a2 = UtilsKt.a(i3, i2);
        if (i2 == 0) {
            objectRef.b(objArr[31]);
            Object[] l2 = ArraysKt.l(objArr, A(objArr), a2 + 1, a2, 31);
            l2[a2] = obj;
            return l2;
        }
        Object[] A2 = A(objArr);
        int i4 = i2 - 5;
        Object obj3 = A2[a2];
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A2[a2] = u((Object[]) obj3, i4, i3, obj, objectRef);
        while (true) {
            a2++;
            if (a2 >= 32 || (obj2 = A2[a2]) == null) {
                return A2;
            }
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A2[a2] = u((Object[]) obj2, i4, 0, objectRef.a(), objectRef);
        }
        return A2;
    }

    public final Object[] A(Object[] objArr) {
        if (objArr == null) {
            return C();
        }
        if (w(objArr)) {
            return objArr;
        }
        return ArraysKt.q(objArr, C(), 0, 0, RangesKt.j(objArr.length, 32), 6, (Object) null);
    }

    public final Object[] B(Object[] objArr, int i2) {
        return w(objArr) ? ArraysKt.l(objArr, objArr, i2, 0, 32 - i2) : ArraysKt.l(objArr, C(), i2, 0, 32 - i2);
    }

    public final Object[] C() {
        Object[] objArr = new Object[33];
        objArr[32] = this.D;
        return objArr;
    }

    public final Object[] D(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.D;
        return objArr;
    }

    public final Object[] E(Object[] objArr, int i2, int i3) {
        if (!(i3 >= 0)) {
            PreconditionsKt.a("shift should be positive");
        }
        if (i3 == 0) {
            return objArr;
        }
        int a2 = UtilsKt.a(i2, i3);
        Object[] objArr2 = objArr[a2];
        Intrinsics.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object E2 = E(objArr2, i2, i3 - 5);
        if (a2 < 31) {
            int i4 = a2 + 1;
            if (objArr[i4] != null) {
                if (w(objArr)) {
                    ArraysKt.w(objArr, (Object) null, i4, 32);
                }
                objArr = ArraysKt.l(objArr, C(), 0, 0, i4);
            }
        }
        if (E2 == objArr[a2]) {
            return objArr;
        }
        Object[] A2 = A(objArr);
        A2[a2] = E2;
        return A2;
    }

    public final void J(Object[] objArr, int i2, int i3) {
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
        Object[] F2 = F(objArr, i3, i2, objectRef);
        Intrinsics.f(F2);
        Object a2 = objectRef.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.F = (Object[]) a2;
        this.G = i2;
        if (F2[1] == null) {
            this.E = (Object[]) F2[0];
            this.C = i3 - 5;
            return;
        }
        this.E = F2;
        this.C = i3;
    }

    public final Object[] K(Object[] objArr, int i2, int i3, Iterator it) {
        if (!it.hasNext()) {
            PreconditionsKt.a("invalid buffersIterator");
        }
        if (!(i3 >= 0)) {
            PreconditionsKt.a("negative shift");
        }
        if (i3 == 0) {
            return (Object[]) it.next();
        }
        Object[] A2 = A(objArr);
        int a2 = UtilsKt.a(i2, i3);
        int i4 = i3 - 5;
        A2[a2] = K((Object[]) A2[a2], i2, i4, it);
        while (true) {
            a2++;
            if (a2 >= 32 || !it.hasNext()) {
                return A2;
            }
            A2[a2] = K((Object[]) A2[a2], 0, i4, it);
        }
        return A2;
    }

    public final Object[] L(Object[] objArr, int i2, Object[][] objArr2) {
        Iterator a2 = ArrayIteratorKt.a(objArr2);
        int i3 = i2 >> 5;
        int i4 = this.C;
        Object[] K = i3 < (1 << i4) ? K(objArr, i2, i4, a2) : A(objArr);
        while (a2.hasNext()) {
            this.C += 5;
            K = D(K);
            int i5 = this.C;
            K(K, 1 << i5, i5, a2);
        }
        return K;
    }

    public final void M(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i2 = this.C;
        if (size > (1 << i2)) {
            this.E = P(D(objArr), objArr2, this.C + 5);
            this.F = objArr3;
            this.C += 5;
            this.G = size() + 1;
        } else if (objArr == null) {
            this.E = objArr2;
            this.F = objArr3;
            this.G = size() + 1;
        } else {
            this.E = P(objArr, objArr2, i2);
            this.F = objArr3;
            this.G = size() + 1;
        }
    }

    public final Object[] P(Object[] objArr, Object[] objArr2, int i2) {
        int a2 = UtilsKt.a(size() - 1, i2);
        Object[] A2 = A(objArr);
        if (i2 == 5) {
            A2[a2] = objArr2;
        } else {
            A2[a2] = P((Object[]) A2[a2], objArr2, i2 - 5);
        }
        return A2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Q(kotlin.jvm.functions.Function1 r7, java.lang.Object[] r8, int r9, int r10, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef r11, java.util.List r12, java.util.List r13) {
        /*
            r6 = this;
            boolean r0 = r6.w(r8)
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
            java.lang.Object[] r10 = r6.C()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.Q(kotlin.jvm.functions.Function1, java.lang.Object[], int, int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef, java.util.List, java.util.List):int");
    }

    public final int R(Function1 function1, Object[] objArr, int i2, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i3 = i2;
        boolean z2 = false;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArr2 = A(objArr);
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

    public final boolean S(Function1 function1) {
        Object[] objArr;
        Function1 function12 = function1;
        int i0 = i0();
        ObjectRef objectRef = new ObjectRef((Object) null);
        if (this.E == null) {
            return V(function12, i0, objectRef) != i0;
        }
        ListIterator z2 = z(0);
        int i2 = 32;
        while (i2 == 32 && z2.hasNext()) {
            i2 = R(function12, (Object[]) z2.next(), 32, objectRef);
        }
        if (i2 == 32) {
            CommonFunctionsKt.a(!z2.hasNext());
            int V = V(function12, i0, objectRef);
            if (V == 0) {
                J(this.E, size(), this.C);
            }
            return V != i0;
        }
        int previousIndex = z2.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = i2;
        while (z2.hasNext()) {
            i3 = Q(function1, (Object[]) z2.next(), 32, i3, objectRef, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i4 = previousIndex;
        int Q = Q(function1, this.F, i0, i3, objectRef, arrayList2, arrayList);
        Object a2 = objectRef.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a2;
        ArraysKt.w(objArr2, (Object) null, Q, 32);
        if (arrayList.isEmpty()) {
            objArr = this.E;
            Intrinsics.f(objArr);
        } else {
            objArr = K(this.E, i4, this.C, arrayList.iterator());
        }
        int size = i4 + (arrayList.size() << 5);
        this.E = a0(objArr, size);
        this.F = objArr2;
        this.G = size + Q;
        return true;
    }

    public final int V(Function1 function1, int i2, ObjectRef objectRef) {
        int R = R(function1, this.F, i2, objectRef);
        if (R == i2) {
            CommonFunctionsKt.a(objectRef.a() == this.F);
            return i2;
        }
        Object a2 = objectRef.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a2;
        ArraysKt.w(objArr, (Object) null, R, i2);
        this.F = objArr;
        this.G = size() - (i2 - R);
        return R;
    }

    public final boolean W(Function1 function1) {
        boolean S = S(function1);
        if (S) {
            this.modCount++;
        }
        return S;
    }

    public final Object Z(Object[] objArr, int i2, int i3, int i4) {
        int size = size() - i2;
        CommonFunctionsKt.a(i4 < size);
        if (size == 1) {
            Object obj = this.F[0];
            J(objArr, i2, i3);
            return obj;
        }
        Object[] objArr2 = this.F;
        Object obj2 = objArr2[i4];
        Object[] l2 = ArraysKt.l(objArr2, A(objArr2), i4, i4 + 1, size);
        l2[size - 1] = null;
        this.E = objArr;
        this.F = l2;
        this.G = (i2 + size) - 1;
        this.C = i3;
        return obj2;
    }

    public final Object[] a0(Object[] objArr, int i2) {
        if (!((i2 & 31) == 0)) {
            PreconditionsKt.a("invalid size");
        }
        if (i2 == 0) {
            this.C = 0;
            return null;
        }
        int i3 = i2 - 1;
        while (true) {
            int i4 = this.C;
            if ((i3 >> i4) != 0) {
                return E(objArr, i3, i4);
            }
            this.C = i4 - 5;
            Object[] objArr2 = objArr[0];
            Intrinsics.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    public boolean add(Object obj) {
        this.modCount++;
        int i0 = i0();
        if (i0 < 32) {
            Object[] A2 = A(this.F);
            A2[i0] = obj;
            this.F = A2;
            this.G = size() + 1;
        } else {
            M(this.E, this.F, D(obj));
        }
        return true;
    }

    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i0 = i0();
        Iterator it = collection.iterator();
        if (32 - i0 >= collection.size()) {
            this.F = m(A(this.F), i0, it);
            this.G = size() + collection.size();
        } else {
            int size = ((collection.size() + i0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = m(A(this.F), i0, it);
            for (int i2 = 1; i2 < size; i2++) {
                objArr[i2] = m(C(), 0, it);
            }
            this.E = L(this.E, b0(), objArr);
            this.F = m(C(), 0, it);
            this.G = size() + collection.size();
        }
        return true;
    }

    public PersistentList d() {
        PersistentList persistentList;
        if (this.E == this.f15031A && this.F == this.f15032B) {
            persistentList = this.f15033z;
        } else {
            this.D = new MutabilityOwnership();
            Object[] objArr = this.E;
            this.f15031A = objArr;
            Object[] objArr2 = this.F;
            this.f15032B = objArr2;
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
        this.f15033z = persistentList;
        return persistentList;
    }

    public final Object[] d0(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        int a2 = UtilsKt.a(i3, i2);
        Object[] A2 = A(objArr);
        if (i2 == 0) {
            if (A2 != objArr) {
                this.modCount++;
            }
            objectRef.b(A2[a2]);
            A2[a2] = obj;
            return A2;
        }
        Object obj2 = A2[a2];
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A2[a2] = d0((Object[]) obj2, i2 - 5, i3, obj, objectRef);
        return A2;
    }

    public int e() {
        return this.G;
    }

    public final Object[] f0(int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.E != null) {
            ListIterator z2 = z(b0() >> 5);
            while (z2.previousIndex() != i2) {
                Object[] objArr3 = (Object[]) z2.previous();
                ArraysKt.l(objArr3, objArr2, 0, 32 - i3, 32);
                objArr2 = B(objArr3, i3);
                i4--;
                objArr[i4] = objArr2;
            }
            return (Object[]) z2.previous();
        }
        throw new IllegalStateException("root is null");
    }

    public Object g(int i2) {
        ListImplementation.a(i2, size());
        this.modCount++;
        int b0 = b0();
        if (i2 >= b0) {
            return Z(this.E, b0, this.C, i2 - b0);
        }
        ObjectRef objectRef = new ObjectRef(this.F[0]);
        Object[] objArr = this.E;
        Intrinsics.f(objArr);
        Z(Y(objArr, this.C, i2, objectRef), b0, this.C, 0);
        return objectRef.a();
    }

    public Object get(int i2) {
        ListImplementation.a(i2, size());
        return i(i2)[i2 & 31];
    }

    public final void h0(Collection collection, int i2, Object[] objArr, int i3, Object[][] objArr2, int i4, Object[] objArr3) {
        Object[] objArr4;
        if (!(i4 >= 1)) {
            PreconditionsKt.a("requires at least one nullBuffer");
        }
        Object[] A2 = A(objArr);
        objArr2[0] = A2;
        int i5 = i2 & 31;
        int size = ((i2 + collection.size()) - 1) & 31;
        int i6 = (i3 - i5) + size;
        if (i6 < 32) {
            ArraysKt.l(A2, objArr3, size + 1, i5, i3);
        } else {
            int i7 = i6 - 31;
            if (i4 == 1) {
                objArr4 = A2;
            } else {
                objArr4 = C();
                i4--;
                objArr2[i4] = objArr4;
            }
            int i8 = i3 - i7;
            ArraysKt.l(A2, objArr3, 0, i8, i3);
            ArraysKt.l(A2, objArr4, size + 1, i5, i8);
            objArr3 = objArr4;
        }
        Iterator it = collection.iterator();
        m(A2, i5, it);
        for (int i9 = 1; i9 < i4; i9++) {
            objArr2[i9] = m(C(), 0, it);
        }
        m(objArr3, 0, it);
    }

    public final int i0() {
        return j0(size());
    }

    public Iterator iterator() {
        return listIterator();
    }

    public final int j0(int i2) {
        return i2 <= 32 ? i2 : i2 - UtilsKt.d(i2);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object[] m(Object[] objArr, int i2, Iterator it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }

    public final int n() {
        return this.modCount;
    }

    public final Object[] o() {
        return this.E;
    }

    public final int p() {
        return this.C;
    }

    public final Object[] q() {
        return this.F;
    }

    public boolean removeAll(Collection collection) {
        return W(new b(collection));
    }

    public final void s(Collection collection, int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.E != null) {
            int i5 = i2 >> 5;
            Object[] f0 = f0(i5, i3, objArr, i4, objArr2);
            int b0 = i4 - (((b0() >> 5) - 1) - i5);
            if (b0 < i4) {
                objArr2 = objArr[b0];
                Intrinsics.f(objArr2);
            }
            h0(collection, i2, f0, 32, objArr, b0, objArr2);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    public Object set(int i2, Object obj) {
        ListImplementation.a(i2, size());
        if (b0() <= i2) {
            Object[] A2 = A(this.F);
            if (A2 != this.F) {
                this.modCount++;
            }
            int i3 = i2 & 31;
            Object obj2 = A2[i3];
            A2[i3] = obj;
            this.F = A2;
            return obj2;
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Object[] objArr = this.E;
        Intrinsics.f(objArr);
        this.E = d0(objArr, this.C, i2, obj, objectRef);
        return objectRef.a();
    }

    public final void v(Object[] objArr, int i2, Object obj) {
        int i0 = i0();
        Object[] A2 = A(this.F);
        if (i0 < 32) {
            ArraysKt.l(this.F, A2, i2 + 1, i2, i0);
            A2[i2] = obj;
            this.E = objArr;
            this.F = A2;
            this.G = size() + 1;
            return;
        }
        Object[] objArr2 = this.F;
        Object obj2 = objArr2[31];
        ArraysKt.l(objArr2, A2, i2 + 1, i2, 31);
        A2[i2] = obj;
        M(objArr, A2, D(obj2));
    }

    public final boolean w(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.D;
    }

    public final ListIterator z(int i2) {
        Object[] objArr = this.E;
        if (objArr != null) {
            int b0 = b0() >> 5;
            ListImplementation.b(i2, b0);
            int i3 = this.C;
            return i3 == 0 ? new SingleElementListIterator(objArr, i2) : new TrieIterator(objArr, i2, b0, i3 / 5);
        }
        throw new IllegalStateException("Invalid root");
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
        int b0 = b0();
        if (i2 >= b0) {
            v(this.E, i2 - b0, obj);
            return;
        }
        ObjectRef objectRef = new ObjectRef((Object) null);
        Object[] objArr = this.E;
        Intrinsics.f(objArr);
        v(u(objArr, this.C, i2, obj, objectRef), 0, objectRef.a());
    }

    public boolean addAll(int i2, Collection collection) {
        Object[] objArr;
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
            if (i2 >= b0()) {
                z2 = true;
            }
            CommonFunctionsKt.a(z2);
            int i4 = i2 & 31;
            Object[] objArr2 = this.F;
            Object[] l2 = ArraysKt.l(objArr2, A(objArr2), (((i2 + collection.size()) - 1) & 31) + 1, i4, i0());
            m(l2, i4, collection.iterator());
            this.F = l2;
            this.G = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int i0 = i0();
        int j0 = j0(size() + collection.size());
        if (i2 >= b0()) {
            objArr = C();
            h0(collection, i2, this.F, i0, objArr3, size, objArr);
        } else if (j0 > i0) {
            int i5 = j0 - i0;
            objArr = B(this.F, i5);
            s(collection, i2, i5, objArr3, size, objArr);
        } else {
            int i6 = i0 - j0;
            objArr = ArraysKt.l(this.F, C(), 0, i6, i0);
            int i7 = 32 - i6;
            Object[] B2 = B(this.F, i7);
            int i8 = size - 1;
            objArr3[i8] = B2;
            s(collection, i2, i7, objArr3, i8, B2);
        }
        this.E = L(this.E, i3, objArr3);
        this.F = objArr;
        this.G = size() + collection.size();
        return true;
    }
}
