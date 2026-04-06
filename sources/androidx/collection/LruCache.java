package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class LruCache<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public int f1849a;

    /* renamed from: b  reason: collision with root package name */
    public final LruHashMap f1850b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f1851c;

    /* renamed from: d  reason: collision with root package name */
    public int f1852d;

    /* renamed from: e  reason: collision with root package name */
    public int f1853e;

    /* renamed from: f  reason: collision with root package name */
    public int f1854f;

    /* renamed from: g  reason: collision with root package name */
    public int f1855g;

    /* renamed from: h  reason: collision with root package name */
    public int f1856h;

    /* renamed from: i  reason: collision with root package name */
    public int f1857i;

    public LruCache(int i2) {
        this.f1849a = i2;
        if (!(i2 > 0)) {
            RuntimeHelpersKt.a("maxSize <= 0");
        }
        this.f1850b = new LruHashMap(0, 0.75f);
        this.f1851c = new Lock();
    }

    public Object a(Object obj) {
        Intrinsics.i(obj, "key");
        return null;
    }

    public void b(boolean z2, Object obj, Object obj2, Object obj3) {
        Intrinsics.i(obj, "key");
        Intrinsics.i(obj2, "oldValue");
    }

    public final void c() {
        l(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r1 = r5.f1851c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.f1854f++;
        r2 = r5.f1850b.d(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r2 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r5.f1850b.d(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r5.f1852d += h(r6, r0);
        r3 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        b(false, r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        l(r5.f1849a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            androidx.collection.internal.Lock r0 = r5.f1851c
            monitor-enter(r0)
            androidx.collection.internal.LruHashMap r1 = r5.f1850b     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.a(r6)     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            int r6 = r5.f1856h     // Catch:{ all -> 0x0018 }
            int r6 = r6 + 1
            r5.f1856h = r6     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r1
        L_0x0018:
            r6 = move-exception
            goto L_0x005e
        L_0x001a:
            int r1 = r5.f1857i     // Catch:{ all -> 0x0018 }
            int r1 = r1 + 1
            r5.f1857i = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            java.lang.Object r0 = r5.a(r6)
            if (r0 != 0) goto L_0x0029
            r6 = 0
            return r6
        L_0x0029:
            androidx.collection.internal.Lock r1 = r5.f1851c
            monitor-enter(r1)
            int r2 = r5.f1854f     // Catch:{ all -> 0x0040 }
            int r2 = r2 + 1
            r5.f1854f = r2     // Catch:{ all -> 0x0040 }
            androidx.collection.internal.LruHashMap r2 = r5.f1850b     // Catch:{ all -> 0x0040 }
            java.lang.Object r2 = r2.d(r6, r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0042
            androidx.collection.internal.LruHashMap r3 = r5.f1850b     // Catch:{ all -> 0x0040 }
            r3.d(r6, r2)     // Catch:{ all -> 0x0040 }
            goto L_0x004d
        L_0x0040:
            r6 = move-exception
            goto L_0x005c
        L_0x0042:
            int r3 = r5.f1852d     // Catch:{ all -> 0x0040 }
            int r4 = r5.h(r6, r0)     // Catch:{ all -> 0x0040 }
            int r3 = r3 + r4
            r5.f1852d = r3     // Catch:{ all -> 0x0040 }
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0040 }
        L_0x004d:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0056
            r1 = 0
            r5.b(r1, r6, r0, r2)
            r0 = r2
            goto L_0x005b
        L_0x0056:
            int r6 = r5.f1849a
            r5.l(r6)
        L_0x005b:
            return r0
        L_0x005c:
            monitor-exit(r1)
            throw r6
        L_0x005e:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.d(java.lang.Object):java.lang.Object");
    }

    public final int e() {
        int i2;
        synchronized (this.f1851c) {
            i2 = this.f1849a;
        }
        return i2;
    }

    public final Object f(Object obj, Object obj2) {
        Object d2;
        Intrinsics.i(obj, "key");
        Intrinsics.i(obj2, "value");
        synchronized (this.f1851c) {
            try {
                this.f1853e++;
                this.f1852d += h(obj, obj2);
                d2 = this.f1850b.d(obj, obj2);
                if (d2 != null) {
                    this.f1852d -= h(obj, d2);
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d2 != null) {
            b(false, obj, d2, obj2);
        }
        l(this.f1849a);
        return d2;
    }

    public final Object g(Object obj) {
        Object e2;
        Intrinsics.i(obj, "key");
        synchronized (this.f1851c) {
            try {
                e2 = this.f1850b.e(obj);
                if (e2 != null) {
                    this.f1852d -= h(obj, e2);
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e2 != null) {
            b(false, obj, e2, (Object) null);
        }
        return e2;
    }

    public final int h(Object obj, Object obj2) {
        int j2 = j(obj, obj2);
        if (!(j2 >= 0)) {
            RuntimeHelpersKt.b("Negative size: " + obj + '=' + obj2);
        }
        return j2;
    }

    public final int i() {
        int i2;
        synchronized (this.f1851c) {
            i2 = this.f1852d;
        }
        return i2;
    }

    public int j(Object obj, Object obj2) {
        Intrinsics.i(obj, "key");
        Intrinsics.i(obj2, "value");
        return 1;
    }

    public final Map k() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f1851c) {
            linkedHashMap = new LinkedHashMap(this.f1850b.b().size());
            for (Map.Entry entry : this.f1850b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001c A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:29:0x0061 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(int r7) {
        /*
            r6 = this;
        L_0x0000:
            androidx.collection.internal.Lock r0 = r6.f1851c
            monitor-enter(r0)
            int r1 = r6.f1852d     // Catch:{ all -> 0x0015 }
            r2 = 1
            if (r1 < 0) goto L_0x0019
            androidx.collection.internal.LruHashMap r1 = r6.f1850b     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0017
            int r1 = r6.f1852d     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0019
            goto L_0x0017
        L_0x0015:
            r7 = move-exception
            goto L_0x0063
        L_0x0017:
            r1 = r2
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r1 != 0) goto L_0x0021
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            androidx.collection.internal.RuntimeHelpersKt.b(r1)     // Catch:{ all -> 0x0015 }
        L_0x0021:
            int r1 = r6.f1852d     // Catch:{ all -> 0x0015 }
            if (r1 <= r7) goto L_0x0061
            androidx.collection.internal.LruHashMap r1 = r6.f1850b     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            androidx.collection.internal.LruHashMap r1 = r6.f1850b     // Catch:{ all -> 0x0015 }
            java.util.Set r1 = r1.b()     // Catch:{ all -> 0x0015 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = kotlin.collections.CollectionsKt.f0(r1)     // Catch:{ all -> 0x0015 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0040
            monitor-exit(r0)
            return
        L_0x0040:
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0015 }
            androidx.collection.internal.LruHashMap r4 = r6.f1850b     // Catch:{ all -> 0x0015 }
            r4.e(r3)     // Catch:{ all -> 0x0015 }
            int r4 = r6.f1852d     // Catch:{ all -> 0x0015 }
            int r5 = r6.h(r3, r1)     // Catch:{ all -> 0x0015 }
            int r4 = r4 - r5
            r6.f1852d = r4     // Catch:{ all -> 0x0015 }
            int r4 = r6.f1855g     // Catch:{ all -> 0x0015 }
            int r4 = r4 + r2
            r6.f1855g = r4     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            r0 = 0
            r6.b(r2, r3, r1, r0)
            goto L_0x0000
        L_0x0061:
            monitor-exit(r0)
            return
        L_0x0063:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.l(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f1851c) {
            try {
                int i2 = this.f1856h;
                int i3 = this.f1857i + i2;
                str = "LruCache[maxSize=" + this.f1849a + ",hits=" + this.f1856h + ",misses=" + this.f1857i + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
