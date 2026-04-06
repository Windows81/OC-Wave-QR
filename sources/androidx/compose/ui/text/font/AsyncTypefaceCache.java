package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AsyncTypefaceCache {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18677a = AsyncTypefaceResult.b((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final LruCache f18678b = new LruCache(16);

    /* renamed from: c  reason: collision with root package name */
    public final MutableScatterMap f18679c = ScatterMapKt.c();

    /* renamed from: d  reason: collision with root package name */
    public final SynchronizedObject f18680d = new SynchronizedObject();

    @JvmInline
    @Metadata
    public static final class AsyncTypefaceResult {

        /* renamed from: a  reason: collision with root package name */
        public final Object f18681a;

        public /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.f18681a = obj;
        }

        public static final /* synthetic */ AsyncTypefaceResult a(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        public static Object b(Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && Intrinsics.d(obj, ((AsyncTypefaceResult) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f18681a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.f18681a;
        }

        public int hashCode() {
            return d(this.f18681a);
        }

        public String toString() {
            return f(this.f18681a);
        }
    }

    @Metadata
    public static final class Key {

        /* renamed from: a  reason: collision with root package name */
        public final Font f18682a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f18683b;

        public Key(Font font, Object obj) {
            this.f18682a = font;
            this.f18683b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.d(this.f18682a, key.f18682a) && Intrinsics.d(this.f18683b, key.f18683b);
        }

        public int hashCode() {
            int hashCode = this.f18682a.hashCode() * 31;
            Object obj = this.f18683b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f18682a + ", loaderKey=" + this.f18683b + ')';
        }
    }

    public static /* synthetic */ void f(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z2, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        asyncTypefaceCache.e(font, platformFontLoader, obj, z2);
    }

    public final AsyncTypefaceResult d(Font font, PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.a());
        synchronized (this.f18680d) {
            asyncTypefaceResult = (AsyncTypefaceResult) this.f18678b.d(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = (AsyncTypefaceResult) this.f18679c.e(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void e(Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z2) {
        Key key = new Key(font, platformFontLoader.a());
        synchronized (this.f18680d) {
            if (obj == null) {
                try {
                    this.f18679c.x(key, AsyncTypefaceResult.a(this.f18677a));
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            } else if (z2) {
                this.f18679c.x(key, AsyncTypefaceResult.a(AsyncTypefaceResult.b(obj)));
                Unit unit2 = Unit.f40552a;
            } else {
                this.f18678b.f(key, AsyncTypefaceResult.a(AsyncTypefaceResult.b(obj)));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final java.lang.Object g(androidx.compose.ui.text.font.Font r6, androidx.compose.ui.text.font.PlatformFontLoader r7, boolean r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            boolean r8 = r0.E
            java.lang.Object r6 = r0.D
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) r6
            java.lang.Object r7 = r0.C
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r7
            kotlin.ResultKt.b(r10)
            goto L_0x007d
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.ResultKt.b(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r7 = r7.a()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.SynchronizedObject r6 = r5.f18680d
            monitor-enter(r6)
            androidx.collection.LruCache r7 = r5.f18678b     // Catch:{ all -> 0x005d }
            java.lang.Object r7 = r7.d(r10)     // Catch:{ all -> 0x005d }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch:{ all -> 0x005d }
            if (r7 != 0) goto L_0x005f
            androidx.collection.MutableScatterMap r7 = r5.f18679c     // Catch:{ all -> 0x005d }
            java.lang.Object r7 = r7.e(r10)     // Catch:{ all -> 0x005d }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch:{ all -> 0x005d }
            goto L_0x005f
        L_0x005d:
            r7 = move-exception
            goto L_0x00b3
        L_0x005f:
            if (r7 == 0) goto L_0x0067
            java.lang.Object r7 = r7.g()     // Catch:{ all -> 0x005d }
            monitor-exit(r6)
            return r7
        L_0x0067:
            kotlin.Unit r7 = kotlin.Unit.f40552a     // Catch:{ all -> 0x005d }
            monitor-exit(r6)
            r0.C = r5
            r0.D = r10
            r0.E = r8
            r0.H = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L_0x007d:
            androidx.compose.ui.text.platform.SynchronizedObject r9 = r7.f18680d
            monitor-enter(r9)
            if (r10 != 0) goto L_0x0090
            androidx.collection.MutableScatterMap r8 = r7.f18679c     // Catch:{ all -> 0x008e }
            java.lang.Object r7 = r7.f18677a     // Catch:{ all -> 0x008e }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.a(r7)     // Catch:{ all -> 0x008e }
            r8.x(r6, r7)     // Catch:{ all -> 0x008e }
            goto L_0x00ad
        L_0x008e:
            r6 = move-exception
            goto L_0x00b1
        L_0x0090:
            if (r8 == 0) goto L_0x00a0
            androidx.collection.MutableScatterMap r7 = r7.f18679c     // Catch:{ all -> 0x008e }
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.b(r10)     // Catch:{ all -> 0x008e }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.a(r8)     // Catch:{ all -> 0x008e }
            r7.x(r6, r8)     // Catch:{ all -> 0x008e }
            goto L_0x00ad
        L_0x00a0:
            androidx.collection.LruCache r7 = r7.f18678b     // Catch:{ all -> 0x008e }
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.b(r10)     // Catch:{ all -> 0x008e }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.a(r8)     // Catch:{ all -> 0x008e }
            r7.f(r6, r8)     // Catch:{ all -> 0x008e }
        L_0x00ad:
            kotlin.Unit r6 = kotlin.Unit.f40552a     // Catch:{ all -> 0x008e }
            monitor-exit(r9)
            return r10
        L_0x00b1:
            monitor-exit(r9)
            throw r6
        L_0x00b3:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.g(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
