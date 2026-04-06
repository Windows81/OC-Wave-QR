package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$DoubleArrayType$1 extends CollectionNavType<double[]> {
    public InternalNavType$DoubleArrayType$1() {
        super(true);
    }

    public String b() {
        return "double[]";
    }

    /* renamed from: m */
    public double[] k() {
        return new double[0];
    }

    /* renamed from: n */
    public double[] a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return (double[]) bundle.get(str);
    }

    /* renamed from: o */
    public double[] f(String str) {
        Intrinsics.i(str, "value");
        return new double[]{((Number) InternalNavType.f22587a.d().f(str)).doubleValue()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = kotlin.collections.ArraysKt.A(r3, o(r2));
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double[] g(java.lang.String r2, double[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            if (r3 == 0) goto L_0x0011
            double[] r0 = r1.f(r2)
            double[] r3 = kotlin.collections.ArraysKt.A(r3, r0)
            if (r3 != 0) goto L_0x0015
        L_0x0011:
            double[] r3 = r1.f(r2)
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1.g(java.lang.String, double[]):double[]");
    }

    /* renamed from: q */
    public void h(Bundle bundle, String str, double[] dArr) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putDoubleArray(str, dArr);
    }

    /* renamed from: r */
    public List l(double[] dArr) {
        List W0;
        if (dArr == null || (W0 = ArraysKt.W0(dArr)) == null) {
            return CollectionsKt.m();
        }
        Iterable<Number> iterable = W0;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (Number doubleValue : iterable) {
            arrayList.add(String.valueOf(doubleValue.doubleValue()));
        }
        return arrayList;
    }

    /* renamed from: s */
    public boolean j(double[] dArr, double[] dArr2) {
        Double[] dArr3 = null;
        Double[] N = dArr != null ? ArraysKt.N(dArr) : null;
        if (dArr2 != null) {
            dArr3 = ArraysKt.N(dArr2);
        }
        return ArraysKt.c(N, dArr3);
    }
}
