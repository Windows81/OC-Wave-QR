package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$BoolArrayType$1 extends CollectionNavType<boolean[]> {
    public NavType$Companion$BoolArrayType$1() {
        super(true);
    }

    public String b() {
        return "boolean[]";
    }

    /* renamed from: m */
    public boolean[] k() {
        return new boolean[0];
    }

    /* renamed from: n */
    public boolean[] a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return (boolean[]) bundle.get(str);
    }

    /* renamed from: o */
    public boolean[] f(String str) {
        Intrinsics.i(str, "value");
        return new boolean[]{((Boolean) NavType.f22410n.f(str)).booleanValue()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = kotlin.collections.ArraysKt.H(r3, o(r2));
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] g(java.lang.String r2, boolean[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            if (r3 == 0) goto L_0x0011
            boolean[] r0 = r1.f(r2)
            boolean[] r3 = kotlin.collections.ArraysKt.H(r3, r0)
            if (r3 != 0) goto L_0x0015
        L_0x0011:
            boolean[] r3 = r1.f(r2)
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$BoolArrayType$1.g(java.lang.String, boolean[]):boolean[]");
    }

    /* renamed from: q */
    public void h(Bundle bundle, String str, boolean[] zArr) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putBooleanArray(str, zArr);
    }

    /* renamed from: r */
    public List l(boolean[] zArr) {
        List b1;
        if (zArr == null || (b1 = ArraysKt.b1(zArr)) == null) {
            return CollectionsKt.m();
        }
        Iterable<Boolean> iterable = b1;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (Boolean booleanValue : iterable) {
            arrayList.add(String.valueOf(booleanValue.booleanValue()));
        }
        return arrayList;
    }

    /* renamed from: s */
    public boolean j(boolean[] zArr, boolean[] zArr2) {
        Boolean[] boolArr = null;
        Boolean[] M = zArr != null ? ArraysKt.M(zArr) : null;
        if (zArr2 != null) {
            boolArr = ArraysKt.M(zArr2);
        }
        return ArraysKt.c(M, boolArr);
    }
}
