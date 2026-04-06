package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$IntArrayType$1 extends CollectionNavType<int[]> {
    public NavType$Companion$IntArrayType$1() {
        super(true);
    }

    public String b() {
        return "integer[]";
    }

    /* renamed from: m */
    public int[] k() {
        return new int[0];
    }

    /* renamed from: n */
    public int[] a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return (int[]) bundle.get(str);
    }

    /* renamed from: o */
    public int[] f(String str) {
        Intrinsics.i(str, "value");
        return new int[]{((Number) NavType.f22400d.f(str)).intValue()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = kotlin.collections.ArraysKt.D(r3, o(r2));
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] g(java.lang.String r2, int[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            if (r3 == 0) goto L_0x0011
            int[] r0 = r1.f(r2)
            int[] r3 = kotlin.collections.ArraysKt.D(r3, r0)
            if (r3 != 0) goto L_0x0015
        L_0x0011:
            int[] r3 = r1.f(r2)
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$IntArrayType$1.g(java.lang.String, int[]):int[]");
    }

    /* renamed from: q */
    public void h(Bundle bundle, String str, int[] iArr) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putIntArray(str, iArr);
    }

    /* renamed from: r */
    public List l(int[] iArr) {
        List Y0;
        if (iArr == null || (Y0 = ArraysKt.Y0(iArr)) == null) {
            return CollectionsKt.m();
        }
        Iterable<Number> iterable = Y0;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (Number intValue : iterable) {
            arrayList.add(String.valueOf(intValue.intValue()));
        }
        return arrayList;
    }

    /* renamed from: s */
    public boolean j(int[] iArr, int[] iArr2) {
        Integer[] numArr = null;
        Integer[] P = iArr != null ? ArraysKt.P(iArr) : null;
        if (iArr2 != null) {
            numArr = ArraysKt.P(iArr2);
        }
        return ArraysKt.c(P, numArr);
    }
}
