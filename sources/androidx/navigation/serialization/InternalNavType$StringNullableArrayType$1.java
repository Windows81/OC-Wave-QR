package androidx.navigation.serialization;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$StringNullableArrayType$1 extends CollectionNavType<String[]> {
    public InternalNavType$StringNullableArrayType$1() {
        super(true);
    }

    public String b() {
        return "string_nullable[]";
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] f(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.navigation.NavType r1 = androidx.navigation.NavType.f22413q
            java.lang.Object r3 = r1.f(r3)
            r1 = 0
            r0[r1] = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1.f(java.lang.String):java.lang.String[]");
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1.g(java.lang.String, java.lang.String[]):java.lang.String[]");
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
