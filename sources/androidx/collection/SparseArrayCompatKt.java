package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SparseArrayCompatKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1999a = new Object();

    public static final Object c(SparseArrayCompat sparseArrayCompat, int i2) {
        Object obj;
        Intrinsics.i(sparseArrayCompat, "<this>");
        int a2 = ContainerHelpersKt.a(sparseArrayCompat.f1996A, sparseArrayCompat.C, i2);
        if (a2 < 0 || (obj = sparseArrayCompat.f1997B[a2]) == f1999a) {
            return null;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r2 = r2.f1997B[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(androidx.collection.SparseArrayCompat r2, int r3, java.lang.Object r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            int[] r0 = r2.f1996A
            int r1 = r2.C
            int r3 = androidx.collection.internal.ContainerHelpersKt.a(r0, r1, r3)
            if (r3 < 0) goto L_0x0019
            java.lang.Object[] r2 = r2.f1997B
            r2 = r2[r3]
            java.lang.Object r3 = f1999a
            if (r2 != r3) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r4 = r2
        L_0x0019:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SparseArrayCompatKt.d(androidx.collection.SparseArrayCompat, int, java.lang.Object):java.lang.Object");
    }

    public static final void e(SparseArrayCompat sparseArrayCompat) {
        int i2 = sparseArrayCompat.C;
        int[] iArr = sparseArrayCompat.f1996A;
        Object[] objArr = sparseArrayCompat.f1997B;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1999a) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        sparseArrayCompat.f1998z = false;
        sparseArrayCompat.C = i3;
    }
}
