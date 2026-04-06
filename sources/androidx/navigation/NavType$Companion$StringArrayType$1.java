package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$StringArrayType$1 extends CollectionNavType<String[]> {
    public NavType$Companion$StringArrayType$1() {
        super(true);
    }

    public String b() {
        return "string[]";
    }

    /* renamed from: m */
    public String[] k() {
        return new String[0];
    }

    /* renamed from: n */
    public String[] a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return (String[]) bundle.get(str);
    }

    /* renamed from: o */
    public String[] f(String str) {
        Intrinsics.i(str, "value");
        return new String[]{str};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = (java.lang.String[]) kotlin.collections.ArraysKt.G(r3, o(r2));
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] g(java.lang.String r2, java.lang.String[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            if (r3 == 0) goto L_0x0013
            java.lang.String[] r0 = r1.f(r2)
            java.lang.Object[] r3 = kotlin.collections.ArraysKt.G(r3, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            if (r3 != 0) goto L_0x0017
        L_0x0013:
            java.lang.String[] r3 = r1.f(r2)
        L_0x0017:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$StringArrayType$1.g(java.lang.String, java.lang.String[]):java.lang.String[]");
    }

    /* renamed from: q */
    public void h(Bundle bundle, String str, String[] strArr) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putStringArray(str, strArr);
    }

    /* renamed from: r */
    public List l(String[] strArr) {
        if (strArr == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String encode : strArr) {
            arrayList.add(Uri.encode(encode));
        }
        return arrayList;
    }

    /* renamed from: s */
    public boolean j(String[] strArr, String[] strArr2) {
        return ArraysKt.c(strArr, strArr2);
    }
}
