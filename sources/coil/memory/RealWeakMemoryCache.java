package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RealWeakMemoryCache implements WeakMemoryCache {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f23503c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f23504a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f23505b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class InternalValue {

        /* renamed from: a  reason: collision with root package name */
        public final int f23506a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f23507b;

        /* renamed from: c  reason: collision with root package name */
        public final Map f23508c;

        /* renamed from: d  reason: collision with root package name */
        public final int f23509d;

        public InternalValue(int i2, WeakReference weakReference, Map map, int i3) {
            this.f23506a = i2;
            this.f23507b = weakReference;
            this.f23508c = map;
            this.f23509d = i3;
        }

        public final WeakReference a() {
            return this.f23507b;
        }

        public final Map b() {
            return this.f23508c;
        }

        public final int c() {
            return this.f23506a;
        }

        public final int d() {
            return this.f23509d;
        }
    }

    public synchronized MemoryCache.Value a(MemoryCache.Key key) {
        try {
            ArrayList arrayList = (ArrayList) this.f23504a.get(key);
            MemoryCache.Value value = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                InternalValue internalValue = (InternalValue) arrayList.get(i2);
                Bitmap bitmap = (Bitmap) internalValue.a().get();
                MemoryCache.Value value2 = bitmap != null ? new MemoryCache.Value(bitmap, internalValue.b()) : null;
                if (value2 != null) {
                    value = value2;
                    break;
                }
                i2++;
            }
            e();
            return value;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void b(int i2) {
        if (i2 >= 10 && i2 != 20) {
            d();
        }
    }

    public synchronized void c(MemoryCache.Key key, Bitmap bitmap, Map map, int i2) {
        try {
            LinkedHashMap linkedHashMap = this.f23504a;
            Object obj = linkedHashMap.get(key);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(key, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            InternalValue internalValue = new InternalValue(identityHashCode, new WeakReference(bitmap), map, i2);
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    arrayList.add(internalValue);
                    break;
                }
                InternalValue internalValue2 = (InternalValue) arrayList.get(i3);
                if (i2 < internalValue2.d()) {
                    i3++;
                } else if (internalValue2.c() == identityHashCode && internalValue2.a().get() == bitmap) {
                    arrayList.set(i3, internalValue);
                } else {
                    arrayList.add(i3, internalValue);
                }
            }
            e();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r2 = r2.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
            r0 = 0
            r8.f23505b = r0
            java.util.LinkedHashMap r1 = r8.f23504a
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 1
            if (r3 > r4) goto L_0x003c
            java.lang.Object r2 = kotlin.collections.CollectionsKt.g0(r2)
            coil.memory.RealWeakMemoryCache$InternalValue r2 = (coil.memory.RealWeakMemoryCache.InternalValue) r2
            if (r2 == 0) goto L_0x0035
            java.lang.ref.WeakReference r2 = r2.a()
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 != 0) goto L_0x000d
            r1.remove()
            goto L_0x000d
        L_0x003c:
            int r3 = r2.size()
            r4 = r0
            r5 = r4
        L_0x0042:
            if (r4 >= r3) goto L_0x005e
            int r6 = r4 - r5
            java.lang.Object r7 = r2.get(r6)
            coil.memory.RealWeakMemoryCache$InternalValue r7 = (coil.memory.RealWeakMemoryCache.InternalValue) r7
            java.lang.ref.WeakReference r7 = r7.a()
            java.lang.Object r7 = r7.get()
            if (r7 != 0) goto L_0x005b
            r2.remove(r6)
            int r5 = r5 + 1
        L_0x005b:
            int r4 = r4 + 1
            goto L_0x0042
        L_0x005e:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x000d
            r1.remove()
            goto L_0x000d
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.memory.RealWeakMemoryCache.d():void");
    }

    public final void e() {
        int i2 = this.f23505b;
        this.f23505b = i2 + 1;
        if (i2 >= 10) {
            d();
        }
    }
}
