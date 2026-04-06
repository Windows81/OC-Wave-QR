package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$LongArrayType$1 extends CollectionNavType<long[]> {
    public NavType$Companion$LongArrayType$1() {
        super(true);
    }

    public String b() {
        return "long[]";
    }

    /* renamed from: m */
    public long[] k() {
        return new long[0];
    }

    /* renamed from: n */
    public long[] a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return (long[]) bundle.get(str);
    }

    /* renamed from: o */
    public long[] f(String str) {
        Intrinsics.i(str, "value");
        return new long[]{((Number) NavType.f22404h.f(str)).longValue()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = kotlin.collections.ArraysKt.E(r3, o(r2));
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long[] g(java.lang.String r2, long[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            if (r3 == 0) goto L_0x0011
            long[] r0 = r1.f(r2)
            long[] r3 = kotlin.collections.ArraysKt.E(r3, r0)
            if (r3 != 0) goto L_0x0015
        L_0x0011:
            long[] r3 = r1.f(r2)
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$LongArrayType$1.g(java.lang.String, long[]):long[]");
    }

    /* renamed from: q */
    public void h(Bundle bundle, String str, long[] jArr) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putLongArray(str, jArr);
    }

    /* renamed from: r */
    public List l(long[] jArr) {
        List Z0;
        if (jArr == null || (Z0 = ArraysKt.Z0(jArr)) == null) {
            return CollectionsKt.m();
        }
        Iterable<Number> iterable = Z0;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (Number longValue : iterable) {
            arrayList.add(String.valueOf(longValue.longValue()));
        }
        return arrayList;
    }

    /* renamed from: s */
    public boolean j(long[] jArr, long[] jArr2) {
        Long[] lArr = null;
        Long[] Q = jArr != null ? ArraysKt.Q(jArr) : null;
        if (jArr2 != null) {
            lArr = ArraysKt.Q(jArr2);
        }
        return ArraysKt.c(Q, lArr);
    }
}
