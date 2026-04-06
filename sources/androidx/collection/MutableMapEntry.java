package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

    /* renamed from: A  reason: collision with root package name */
    public final Object[] f1894A;

    /* renamed from: B  reason: collision with root package name */
    public final int f1895B;

    /* renamed from: z  reason: collision with root package name */
    public final Object[] f1896z;

    public MutableMapEntry(Object[] objArr, Object[] objArr2, int i2) {
        Intrinsics.i(objArr, "keys");
        Intrinsics.i(objArr2, "values");
        this.f1896z = objArr;
        this.f1894A = objArr2;
        this.f1895B = i2;
    }

    public Object getKey() {
        return this.f1896z[this.f1895B];
    }

    public Object getValue() {
        return this.f1894A[this.f1895B];
    }

    public Object setValue(Object obj) {
        Object[] objArr = this.f1894A;
        int i2 = this.f1895B;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
