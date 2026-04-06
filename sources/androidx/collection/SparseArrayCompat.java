package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ int[] f1996A;

    /* renamed from: B  reason: collision with root package name */
    public /* synthetic */ Object[] f1997B;
    public /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ boolean f1998z;

    public SparseArrayCompat() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public void b(int i2, Object obj) {
        int i3 = this.C;
        if (i3 == 0 || i2 > this.f1996A[i3 - 1]) {
            if (this.f1998z && i3 >= this.f1996A.length) {
                SparseArrayCompatKt.e(this);
            }
            int i4 = this.C;
            if (i4 >= this.f1996A.length) {
                int e2 = ContainerHelpersKt.e(i4 + 1);
                int[] copyOf = Arrays.copyOf(this.f1996A, e2);
                Intrinsics.h(copyOf, "copyOf(...)");
                this.f1996A = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f1997B, e2);
                Intrinsics.h(copyOf2, "copyOf(...)");
                this.f1997B = copyOf2;
            }
            this.f1996A[i4] = i2;
            this.f1997B[i4] = obj;
            this.C = i4 + 1;
            return;
        }
        k(i2, obj);
    }

    public void c() {
        int i2 = this.C;
        Object[] objArr = this.f1997B;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.C = 0;
        this.f1998z = false;
    }

    /* renamed from: e */
    public SparseArrayCompat clone() {
        Object clone = super.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.f1996A = (int[]) this.f1996A.clone();
        sparseArrayCompat.f1997B = (Object[]) this.f1997B.clone();
        return sparseArrayCompat;
    }

    public boolean f(int i2) {
        return i(i2) >= 0;
    }

    public Object g(int i2) {
        return SparseArrayCompatKt.c(this, i2);
    }

    public Object h(int i2, Object obj) {
        return SparseArrayCompatKt.d(this, i2, obj);
    }

    public int i(int i2) {
        if (this.f1998z) {
            SparseArrayCompatKt.e(this);
        }
        return ContainerHelpersKt.a(this.f1996A, this.C, i2);
    }

    public int j(int i2) {
        if (this.f1998z) {
            SparseArrayCompatKt.e(this);
        }
        return this.f1996A[i2];
    }

    public void k(int i2, Object obj) {
        int a2 = ContainerHelpersKt.a(this.f1996A, this.C, i2);
        if (a2 >= 0) {
            this.f1997B[a2] = obj;
            return;
        }
        int i3 = ~a2;
        if (i3 >= this.C || this.f1997B[i3] != SparseArrayCompatKt.f1999a) {
            if (this.f1998z && this.C >= this.f1996A.length) {
                SparseArrayCompatKt.e(this);
                i3 = ~ContainerHelpersKt.a(this.f1996A, this.C, i2);
            }
            int i4 = this.C;
            if (i4 >= this.f1996A.length) {
                int e2 = ContainerHelpersKt.e(i4 + 1);
                int[] copyOf = Arrays.copyOf(this.f1996A, e2);
                Intrinsics.h(copyOf, "copyOf(...)");
                this.f1996A = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f1997B, e2);
                Intrinsics.h(copyOf2, "copyOf(...)");
                this.f1997B = copyOf2;
            }
            int i5 = this.C;
            if (i5 - i3 != 0) {
                int[] iArr = this.f1996A;
                int i6 = i3 + 1;
                ArraysKt.j(iArr, iArr, i6, i3, i5);
                Object[] objArr = this.f1997B;
                ArraysKt.l(objArr, objArr, i6, i3, this.C);
            }
            this.f1996A[i3] = i2;
            this.f1997B[i3] = obj;
            this.C++;
            return;
        }
        this.f1996A[i3] = i2;
        this.f1997B[i3] = obj;
    }

    public void l(int i2) {
        if (this.f1997B[i2] != SparseArrayCompatKt.f1999a) {
            this.f1997B[i2] = SparseArrayCompatKt.f1999a;
            this.f1998z = true;
        }
    }

    public Object n(int i2, Object obj) {
        int i3 = i(i2);
        if (i3 < 0) {
            return null;
        }
        Object[] objArr = this.f1997B;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public int o() {
        if (this.f1998z) {
            SparseArrayCompatKt.e(this);
        }
        return this.C;
    }

    public Object p(int i2) {
        if (this.f1998z) {
            SparseArrayCompatKt.e(this);
        }
        Object[] objArr = this.f1997B;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.f1726a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.C * 28);
        sb.append('{');
        int i2 = this.C;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(j(i3));
            sb.append('=');
            Object p2 = p(i3);
            if (p2 != this) {
                sb.append(p2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public SparseArrayCompat(int i2) {
        if (i2 == 0) {
            this.f1996A = ContainerHelpersKt.f2006a;
            this.f1997B = ContainerHelpersKt.f2008c;
            return;
        }
        int e2 = ContainerHelpersKt.e(i2);
        this.f1996A = new int[e2];
        this.f1997B = new Object[e2];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SparseArrayCompat(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i2);
    }
}
