package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class LongSparseArray<E> implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ long[] f1841A;

    /* renamed from: B  reason: collision with root package name */
    public /* synthetic */ Object[] f1842B;
    public /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ boolean f1843z;

    public LongSparseArray() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public void b(long j2, Object obj) {
        int i2 = this.C;
        if (i2 == 0 || j2 > this.f1841A[i2 - 1]) {
            if (this.f1843z) {
                long[] jArr = this.f1841A;
                if (i2 >= jArr.length) {
                    Object[] objArr = this.f1842B;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        Object obj2 = objArr[i4];
                        if (obj2 != LongSparseArrayKt.f1844a) {
                            if (i4 != i3) {
                                jArr[i3] = jArr[i4];
                                objArr[i3] = obj2;
                                objArr[i4] = null;
                            }
                            i3++;
                        }
                    }
                    this.f1843z = false;
                    this.C = i3;
                }
            }
            int i5 = this.C;
            if (i5 >= this.f1841A.length) {
                int f2 = ContainerHelpersKt.f(i5 + 1);
                long[] copyOf = Arrays.copyOf(this.f1841A, f2);
                Intrinsics.h(copyOf, "copyOf(...)");
                this.f1841A = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f1842B, f2);
                Intrinsics.h(copyOf2, "copyOf(...)");
                this.f1842B = copyOf2;
            }
            this.f1841A[i5] = j2;
            this.f1842B[i5] = obj;
            this.C = i5 + 1;
            return;
        }
        l(j2, obj);
    }

    public void c() {
        int i2 = this.C;
        Object[] objArr = this.f1842B;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.C = 0;
        this.f1843z = false;
    }

    /* renamed from: e */
    public LongSparseArray clone() {
        Object clone = super.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray longSparseArray = (LongSparseArray) clone;
        longSparseArray.f1841A = (long[]) this.f1841A.clone();
        longSparseArray.f1842B = (Object[]) this.f1842B.clone();
        return longSparseArray;
    }

    public boolean f(long j2) {
        return i(j2) >= 0;
    }

    public Object g(long j2) {
        int b2 = ContainerHelpersKt.b(this.f1841A, this.C, j2);
        if (b2 < 0 || this.f1842B[b2] == LongSparseArrayKt.f1844a) {
            return null;
        }
        return this.f1842B[b2];
    }

    public Object h(long j2, Object obj) {
        int b2 = ContainerHelpersKt.b(this.f1841A, this.C, j2);
        return (b2 < 0 || this.f1842B[b2] == LongSparseArrayKt.f1844a) ? obj : this.f1842B[b2];
    }

    public int i(long j2) {
        if (this.f1843z) {
            int i2 = this.C;
            long[] jArr = this.f1841A;
            Object[] objArr = this.f1842B;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f1844a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1843z = false;
            this.C = i3;
        }
        return ContainerHelpersKt.b(this.f1841A, this.C, j2);
    }

    public boolean j() {
        return o() == 0;
    }

    public long k(int i2) {
        if (!(i2 >= 0 && i2 < this.C)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (this.f1843z) {
            int i3 = this.C;
            long[] jArr = this.f1841A;
            Object[] objArr = this.f1842B;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f1844a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f1843z = false;
            this.C = i4;
        }
        return this.f1841A[i2];
    }

    public void l(long j2, Object obj) {
        int b2 = ContainerHelpersKt.b(this.f1841A, this.C, j2);
        if (b2 >= 0) {
            this.f1842B[b2] = obj;
            return;
        }
        int i2 = ~b2;
        if (i2 >= this.C || this.f1842B[i2] != LongSparseArrayKt.f1844a) {
            if (this.f1843z) {
                int i3 = this.C;
                long[] jArr = this.f1841A;
                if (i3 >= jArr.length) {
                    Object[] objArr = this.f1842B;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        Object obj2 = objArr[i5];
                        if (obj2 != LongSparseArrayKt.f1844a) {
                            if (i5 != i4) {
                                jArr[i4] = jArr[i5];
                                objArr[i4] = obj2;
                                objArr[i5] = null;
                            }
                            i4++;
                        }
                    }
                    this.f1843z = false;
                    this.C = i4;
                    i2 = ~ContainerHelpersKt.b(this.f1841A, i4, j2);
                }
            }
            int i6 = this.C;
            if (i6 >= this.f1841A.length) {
                int f2 = ContainerHelpersKt.f(i6 + 1);
                long[] copyOf = Arrays.copyOf(this.f1841A, f2);
                Intrinsics.h(copyOf, "copyOf(...)");
                this.f1841A = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f1842B, f2);
                Intrinsics.h(copyOf2, "copyOf(...)");
                this.f1842B = copyOf2;
            }
            int i7 = this.C;
            if (i7 - i2 != 0) {
                long[] jArr2 = this.f1841A;
                int i8 = i2 + 1;
                ArraysKt.k(jArr2, jArr2, i8, i2, i7);
                Object[] objArr2 = this.f1842B;
                ArraysKt.l(objArr2, objArr2, i8, i2, this.C);
            }
            this.f1841A[i2] = j2;
            this.f1842B[i2] = obj;
            this.C++;
            return;
        }
        this.f1841A[i2] = j2;
        this.f1842B[i2] = obj;
    }

    public void n(long j2) {
        int b2 = ContainerHelpersKt.b(this.f1841A, this.C, j2);
        if (b2 >= 0 && this.f1842B[b2] != LongSparseArrayKt.f1844a) {
            this.f1842B[b2] = LongSparseArrayKt.f1844a;
            this.f1843z = true;
        }
    }

    public int o() {
        if (this.f1843z) {
            int i2 = this.C;
            long[] jArr = this.f1841A;
            Object[] objArr = this.f1842B;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f1844a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1843z = false;
            this.C = i3;
        }
        return this.C;
    }

    public Object p(int i2) {
        if (!(i2 >= 0 && i2 < this.C)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (this.f1843z) {
            int i3 = this.C;
            long[] jArr = this.f1841A;
            Object[] objArr = this.f1842B;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f1844a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f1843z = false;
            this.C = i4;
        }
        return this.f1842B[i2];
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
            sb.append(k(i3));
            sb.append('=');
            Object p2 = p(i3);
            if (p2 != sb) {
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

    public LongSparseArray(int i2) {
        if (i2 == 0) {
            this.f1841A = ContainerHelpersKt.f2007b;
            this.f1842B = ContainerHelpersKt.f2008c;
            return;
        }
        int f2 = ContainerHelpersKt.f(i2);
        this.f1841A = new long[f2];
        this.f1842B = new Object[f2];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LongSparseArray(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i2);
    }
}
