package com.hansecom.abt.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class Version implements Comparable<Version> {

    /* renamed from: A  reason: collision with root package name */
    public final List f39030A;

    /* renamed from: z  reason: collision with root package name */
    public final String f39031z;

    public Version(String str) {
        Intrinsics.i(str, "version");
        this.f39031z = str;
        Iterable<String> N0 = StringsKt.N0(str, new String[]{"."}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(N0, 10));
        for (String q2 : N0) {
            Integer q3 = StringsKt.q(q2);
            arrayList.add(Integer.valueOf(q3 != null ? q3.intValue() : 0));
        }
        this.f39030A = arrayList;
    }

    /* renamed from: d */
    public int compareTo(Version version) {
        Intrinsics.i(version, "other");
        int max = Math.max(this.f39030A.size(), version.f39030A.size());
        int i2 = 0;
        while (i2 < max) {
            List list = this.f39030A;
            int intValue = ((Number) ((i2 < 0 || i2 >= list.size()) ? 0 : list.get(i2))).intValue();
            List list2 = version.f39030A;
            int intValue2 = ((Number) ((i2 < 0 || i2 >= list2.size()) ? 0 : list2.get(i2))).intValue();
            if (intValue != intValue2) {
                return intValue - intValue2;
            }
            i2++;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Version)) {
            return false;
        }
        return compareTo((Version) obj) == 0;
    }

    public int hashCode() {
        List list = this.f39030A;
        Collection collection = list;
        int size = 3 - list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(0);
        }
        return CollectionsKt.x0(collection, arrayList).hashCode();
    }

    public String toString() {
        return this.f39031z;
    }
}
