package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$FloatListType$1 extends CollectionNavType<List<? extends Float>> {
    public NavType$Companion$FloatListType$1() {
        super(true);
    }

    public String b() {
        return "List<Float>";
    }

    /* renamed from: m */
    public List k() {
        return CollectionsKt.m();
    }

    /* renamed from: n */
    public List a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        float[] fArr = (float[]) bundle.get(str);
        if (fArr != null) {
            return ArraysKt.X0(fArr);
        }
        return null;
    }

    /* renamed from: o */
    public List f(String str) {
        Intrinsics.i(str, "value");
        return CollectionsKt.e(NavType.f22407k.f(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = kotlin.collections.CollectionsKt.x0(r3, o(r2));
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List g(java.lang.String r2, java.util.List r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            if (r3 == 0) goto L_0x0015
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r0 = r1.f(r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r3 = kotlin.collections.CollectionsKt.x0(r3, r0)
            if (r3 != 0) goto L_0x0019
        L_0x0015:
            java.util.List r3 = r1.f(r2)
        L_0x0019:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$FloatListType$1.g(java.lang.String, java.util.List):java.util.List");
    }

    /* renamed from: q */
    public void h(Bundle bundle, String str, List list) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putFloatArray(str, list != null ? CollectionsKt.J0(list) : null);
    }

    /* renamed from: r */
    public List l(List list) {
        if (list == null) {
            return CollectionsKt.m();
        }
        Iterable<Number> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (Number floatValue : iterable) {
            arrayList.add(String.valueOf(floatValue.floatValue()));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(java.util.List r4, java.util.List r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L_0x000f
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Float[] r2 = new java.lang.Float[r1]
            java.lang.Object[] r4 = r4.toArray(r2)
            java.lang.Float[] r4 = (java.lang.Float[]) r4
            goto L_0x0010
        L_0x000f:
            r4 = r0
        L_0x0010:
            if (r5 == 0) goto L_0x001d
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Float[] r0 = new java.lang.Float[r1]
            java.lang.Object[] r5 = r5.toArray(r0)
            r0 = r5
            java.lang.Float[] r0 = (java.lang.Float[]) r0
        L_0x001d:
            boolean r4 = kotlin.collections.ArraysKt.c(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$FloatListType$1.j(java.util.List, java.util.List):boolean");
    }
}
