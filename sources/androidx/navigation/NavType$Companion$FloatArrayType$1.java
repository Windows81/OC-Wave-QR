package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$FloatArrayType$1 extends CollectionNavType<float[]> {
    public NavType$Companion$FloatArrayType$1() {
        super(true);
    }

    public String b() {
        return "float[]";
    }

    /* renamed from: m */
    public float[] k() {
        return new float[0];
    }

    /* renamed from: n */
    public float[] a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return (float[]) bundle.get(str);
    }

    /* renamed from: o */
    public float[] f(String str) {
        Intrinsics.i(str, "value");
        return new float[]{((Number) NavType.f22407k.f(str)).floatValue()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = kotlin.collections.ArraysKt.B(r3, o(r2));
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float[] g(java.lang.String r2, float[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            if (r3 == 0) goto L_0x0011
            float[] r0 = r1.f(r2)
            float[] r3 = kotlin.collections.ArraysKt.B(r3, r0)
            if (r3 != 0) goto L_0x0015
        L_0x0011:
            float[] r3 = r1.f(r2)
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$FloatArrayType$1.g(java.lang.String, float[]):float[]");
    }

    /* renamed from: q */
    public void h(Bundle bundle, String str, float[] fArr) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putFloatArray(str, fArr);
    }

    /* renamed from: r */
    public List l(float[] fArr) {
        List X0;
        if (fArr == null || (X0 = ArraysKt.X0(fArr)) == null) {
            return CollectionsKt.m();
        }
        Iterable<Number> iterable = X0;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (Number floatValue : iterable) {
            arrayList.add(String.valueOf(floatValue.floatValue()));
        }
        return arrayList;
    }

    /* renamed from: s */
    public boolean j(float[] fArr, float[] fArr2) {
        Float[] fArr3 = null;
        Float[] O = fArr != null ? ArraysKt.O(fArr) : null;
        if (fArr2 != null) {
            fArr3 = ArraysKt.O(fArr2);
        }
        return ArraysKt.c(O, fArr3);
    }
}
