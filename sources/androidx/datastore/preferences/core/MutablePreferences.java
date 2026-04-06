package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class MutablePreferences extends Preferences {

    /* renamed from: a  reason: collision with root package name */
    public final Map f20702a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f20703b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutablePreferences(Map map, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new LinkedHashMap() : map, (i2 & 2) != 0 ? true : z2);
    }

    public Map a() {
        Pair pair;
        Iterable<Map.Entry> entrySet = this.f20702a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.e(MapsKt.e(CollectionsKt.x(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.h(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.e(), pair.f());
        }
        return Actual_jvmAndroidKt.b(linkedHashMap);
    }

    public Object b(Preferences.Key key) {
        Intrinsics.i(key, "key");
        Object obj = this.f20702a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void e() {
        if (this.f20703b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.preferences.core.MutablePreferences
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.datastore.preferences.core.MutablePreferences r6 = (androidx.datastore.preferences.core.MutablePreferences) r6
            java.util.Map r0 = r6.f20702a
            java.util.Map r2 = r5.f20702a
            r3 = 1
            if (r0 != r2) goto L_0x0010
            return r3
        L_0x0010:
            int r0 = r0.size()
            java.util.Map r2 = r5.f20702a
            int r2 = r2.size()
            if (r0 == r2) goto L_0x001d
            return r1
        L_0x001d:
            java.util.Map r6 = r6.f20702a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0027
        L_0x0025:
            r1 = r3
            goto L_0x0067
        L_0x0027:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x002f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map r2 = r5.f20702a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L_0x0064
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L_0x005f
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L_0x0064
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L_0x0064
            r0 = r3
            goto L_0x0065
        L_0x005f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r2)
            goto L_0x0065
        L_0x0064:
            r0 = r1
        L_0x0065:
            if (r0 != 0) goto L_0x002f
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.core.MutablePreferences.equals(java.lang.Object):boolean");
    }

    public final void f() {
        e();
        this.f20702a.clear();
    }

    public final void g() {
        this.f20703b.b(true);
    }

    public final void h(Preferences.Pair... pairArr) {
        Intrinsics.i(pairArr, "pairs");
        e();
        for (Preferences.Pair pair : pairArr) {
            k(pair.a(), pair.b());
        }
    }

    public int hashCode() {
        int i2 = 0;
        for (Map.Entry value : this.f20702a.entrySet()) {
            Object value2 = value.getValue();
            i2 += value2 instanceof byte[] ? Arrays.hashCode((byte[]) value2) : value2.hashCode();
        }
        return i2;
    }

    public final Object i(Preferences.Key key) {
        Intrinsics.i(key, "key");
        e();
        return this.f20702a.remove(key);
    }

    public final void j(Preferences.Key key, Object obj) {
        Intrinsics.i(key, "key");
        k(key, obj);
    }

    public final void k(Preferences.Key key, Object obj) {
        Intrinsics.i(key, "key");
        e();
        if (obj == null) {
            i(key);
        } else if (obj instanceof Set) {
            this.f20702a.put(key, Actual_jvmAndroidKt.a((Set) obj));
        } else if (obj instanceof byte[]) {
            Map map = this.f20702a;
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.h(copyOf, "copyOf(this, size)");
            map.put(key, copyOf);
        } else {
            this.f20702a.put(key, obj);
        }
    }

    public String toString() {
        return CollectionsKt.n0(this.f20702a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, MutablePreferences$toString$1.f20704z, 24, (Object) null);
    }

    public MutablePreferences(Map map, boolean z2) {
        Intrinsics.i(map, "preferencesMap");
        this.f20702a = map;
        this.f20703b = new AtomicBoolean(z2);
    }
}
