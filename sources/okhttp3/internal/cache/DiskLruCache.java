package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

@Metadata
public final class DiskLruCache implements Closeable, Flushable {
    public static final Companion U = new Companion((DefaultConstructorMarker) null);
    public static final String V = "journal";
    public static final String W = "journal.tmp";
    public static final String X = "journal.bkp";
    public static final String Y = "libcore.io.DiskLruCache";
    public static final String Z = "1";
    public static final long a0 = -1;
    public static final Regex b0 = new Regex("[a-z0-9_-]{1,120}");
    public static final String c0 = "CLEAN";
    public static final String d0 = "DIRTY";
    public static final String e0 = "REMOVE";
    public static final String f0 = "READ";

    /* renamed from: A  reason: collision with root package name */
    public final File f42829A;

    /* renamed from: B  reason: collision with root package name */
    public final int f42830B;
    public final int C;
    public long D;
    public final File E;
    public final File F;
    public final File G;
    public long H;
    public BufferedSink I;
    public final LinkedHashMap J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public final TaskQueue S;
    public final DiskLruCache$cleanupTask$1 T;

    /* renamed from: z  reason: collision with root package name */
    public final FileSystem f42831z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class Editor {

        /* renamed from: a  reason: collision with root package name */
        public final Entry f42832a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f42833b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f42834c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f42835d;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            Intrinsics.i(entry, "entry");
            this.f42835d = diskLruCache;
            this.f42832a = entry;
            this.f42833b = entry.g() ? null : new boolean[diskLruCache.E()];
        }

        public final void a() {
            DiskLruCache diskLruCache = this.f42835d;
            synchronized (diskLruCache) {
                try {
                    if (!this.f42834c) {
                        if (Intrinsics.d(this.f42832a.b(), this)) {
                            diskLruCache.m(this, false);
                        }
                        this.f42834c = true;
                        Unit unit = Unit.f40552a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = this.f42835d;
            synchronized (diskLruCache) {
                try {
                    if (!this.f42834c) {
                        if (Intrinsics.d(this.f42832a.b(), this)) {
                            diskLruCache.m(this, true);
                        }
                        this.f42834c = true;
                        Unit unit = Unit.f40552a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (!Intrinsics.d(this.f42832a.b(), this)) {
                return;
            }
            if (this.f42835d.M) {
                this.f42835d.m(this, false);
            } else {
                this.f42832a.q(true);
            }
        }

        public final Entry d() {
            return this.f42832a;
        }

        public final boolean[] e() {
            return this.f42833b;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:22|23|24|25) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r4 = okio.Okio.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
            return r4;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.Sink f(int r4) {
            /*
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.f42835d
                monitor-enter(r0)
                boolean r1 = r3.f42834c     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x0051
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.f42832a     // Catch:{ all -> 0x0019 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.b()     // Catch:{ all -> 0x0019 }
                boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r3)     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x001b
                okio.Sink r4 = okio.Okio.b()     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r4
            L_0x0019:
                r4 = move-exception
                goto L_0x0059
            L_0x001b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.f42832a     // Catch:{ all -> 0x0019 }
                boolean r1 = r1.g()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x002b
                boolean[] r1 = r3.f42833b     // Catch:{ all -> 0x0019 }
                kotlin.jvm.internal.Intrinsics.f(r1)     // Catch:{ all -> 0x0019 }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x0019 }
            L_0x002b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.f42832a     // Catch:{ all -> 0x0019 }
                java.util.List r1 = r1.c()     // Catch:{ all -> 0x0019 }
                java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0019 }
                java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0019 }
                okhttp3.internal.io.FileSystem r1 = r0.D()     // Catch:{ FileNotFoundException -> 0x004b }
                okio.Sink r4 = r1.b(r4)     // Catch:{ FileNotFoundException -> 0x004b }
                okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink     // Catch:{ all -> 0x0019 }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1 r2 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1     // Catch:{ all -> 0x0019 }
                r2.<init>(r0, r3)     // Catch:{ all -> 0x0019 }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r1
            L_0x004b:
                okio.Sink r4 = okio.Okio.b()     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r4
            L_0x0051:
                java.lang.String r4 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0019 }
                r1.<init>(r4)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ all -> 0x0019 }
            L_0x0059:
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.f(int):okio.Sink");
        }
    }

    @Metadata
    public final class Entry {

        /* renamed from: a  reason: collision with root package name */
        public final String f42838a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f42839b;

        /* renamed from: c  reason: collision with root package name */
        public final List f42840c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List f42841d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public boolean f42842e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f42843f;

        /* renamed from: g  reason: collision with root package name */
        public Editor f42844g;

        /* renamed from: h  reason: collision with root package name */
        public int f42845h;

        /* renamed from: i  reason: collision with root package name */
        public long f42846i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f42847j;

        public Entry(DiskLruCache diskLruCache, String str) {
            Intrinsics.i(str, "key");
            this.f42847j = diskLruCache;
            this.f42838a = str;
            this.f42839b = new long[diskLruCache.E()];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int E = diskLruCache.E();
            for (int i2 = 0; i2 < E; i2++) {
                sb.append(i2);
                this.f42840c.add(new File(this.f42847j.C(), sb.toString()));
                sb.append(".tmp");
                this.f42841d.add(new File(this.f42847j.C(), sb.toString()));
                sb.setLength(length);
            }
        }

        public final List a() {
            return this.f42840c;
        }

        public final Editor b() {
            return this.f42844g;
        }

        public final List c() {
            return this.f42841d;
        }

        public final String d() {
            return this.f42838a;
        }

        public final long[] e() {
            return this.f42839b;
        }

        public final int f() {
            return this.f42845h;
        }

        public final boolean g() {
            return this.f42842e;
        }

        public final long h() {
            return this.f42846i;
        }

        public final boolean i() {
            return this.f42843f;
        }

        public final Void j(List list) {
            throw new IOException("unexpected journal line: " + list);
        }

        public final Source k(int i2) {
            Source a2 = this.f42847j.D().a((File) this.f42840c.get(i2));
            if (this.f42847j.M) {
                return a2;
            }
            this.f42845h++;
            return new DiskLruCache$Entry$newSource$1(a2, this.f42847j, this);
        }

        public final void l(Editor editor) {
            this.f42844g = editor;
        }

        public final void m(List list) {
            Intrinsics.i(list, "strings");
            if (list.size() == this.f42847j.E()) {
                try {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.f42839b[i2] = Long.parseLong((String) list.get(i2));
                    }
                } catch (NumberFormatException unused) {
                    j(list);
                    throw new KotlinNothingValueException();
                }
            } else {
                j(list);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i2) {
            this.f42845h = i2;
        }

        public final void o(boolean z2) {
            this.f42842e = z2;
        }

        public final void p(long j2) {
            this.f42846i = j2;
        }

        public final void q(boolean z2) {
            this.f42843f = z2;
        }

        public final Snapshot r() {
            DiskLruCache diskLruCache = this.f42847j;
            if (Util.f42805h && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            } else if (!this.f42842e) {
                return null;
            } else {
                if (!this.f42847j.M && (this.f42844g != null || this.f42843f)) {
                    return null;
                }
                ArrayList<Source> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.f42839b.clone();
                try {
                    int E = this.f42847j.E();
                    for (int i2 = 0; i2 < E; i2++) {
                        arrayList.add(k(i2));
                    }
                    return new Snapshot(this.f42847j, this.f42838a, this.f42846i, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (Source m2 : arrayList) {
                        Util.m(m2);
                    }
                    try {
                        this.f42847j.T(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void s(BufferedSink bufferedSink) {
            Intrinsics.i(bufferedSink, "writer");
            for (long x1 : this.f42839b) {
                bufferedSink.writeByte(32).x1(x1);
            }
        }
    }

    @Metadata
    public final class Snapshot implements Closeable {

        /* renamed from: A  reason: collision with root package name */
        public final long f42850A;

        /* renamed from: B  reason: collision with root package name */
        public final List f42851B;
        public final long[] C;
        public final /* synthetic */ DiskLruCache D;

        /* renamed from: z  reason: collision with root package name */
        public final String f42852z;

        public Snapshot(DiskLruCache diskLruCache, String str, long j2, List list, long[] jArr) {
            Intrinsics.i(str, "key");
            Intrinsics.i(list, "sources");
            Intrinsics.i(jArr, "lengths");
            this.D = diskLruCache;
            this.f42852z = str;
            this.f42850A = j2;
            this.f42851B = list;
            this.C = jArr;
        }

        public final Editor a() {
            return this.D.t(this.f42852z, this.f42850A);
        }

        public final Source b(int i2) {
            return (Source) this.f42851B.get(i2);
        }

        public final String c() {
            return this.f42852z;
        }

        public void close() {
            for (Source m2 : this.f42851B) {
                Util.m(m2);
            }
        }
    }

    public static /* synthetic */ Editor x(DiskLruCache diskLruCache, String str, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = a0;
        }
        return diskLruCache.t(str, j2);
    }

    public final boolean A() {
        return this.O;
    }

    public final File C() {
        return this.f42829A;
    }

    public final FileSystem D() {
        return this.f42831z;
    }

    public final int E() {
        return this.C;
    }

    public final synchronized void F() {
        try {
            if (Util.f42805h) {
                if (!Thread.holdsLock(this)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
                }
            }
            if (!this.N) {
                if (this.f42831z.d(this.G)) {
                    if (this.f42831z.d(this.E)) {
                        this.f42831z.f(this.G);
                    } else {
                        this.f42831z.e(this.G, this.E);
                    }
                }
                this.M = Util.F(this.f42831z, this.G);
                if (this.f42831z.d(this.E)) {
                    N();
                    I();
                    this.N = true;
                    return;
                }
                Q();
                this.N = true;
            }
        } catch (IOException e2) {
            Platform g2 = Platform.f43200a.g();
            g2.k("DiskLruCache " + this.f42829A + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
            r();
            this.O = false;
        } catch (Throwable th) {
            this.O = false;
            throw th;
        }
    }

    public final boolean G() {
        int i2 = this.K;
        return i2 >= 2000 && i2 >= this.J.size();
    }

    public final BufferedSink H() {
        return Okio.c(new FaultHidingSink(this.f42831z.g(this.E), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    public final void I() {
        this.f42831z.f(this.F);
        Iterator it = this.J.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.h(next, "i.next()");
            Entry entry = (Entry) next;
            int i2 = 0;
            if (entry.b() == null) {
                int i3 = this.C;
                while (i2 < i3) {
                    this.H += entry.e()[i2];
                    i2++;
                }
            } else {
                entry.l((Editor) null);
                int i4 = this.C;
                while (i2 < i4) {
                    this.f42831z.f((File) entry.a().get(i2));
                    this.f42831z.f((File) entry.c().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|(1:20)(1:21)|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.K = r0 - r9.J.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1.l0() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r9.I = H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        kotlin.io.CloseableKt.a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        kotlin.io.CloseableKt.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x005d=Splitter:B:17:0x005d, B:25:0x007d=Splitter:B:25:0x007d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.f42831z
            java.io.File r2 = r9.E
            okio.Source r1 = r1.a(r2)
            okio.BufferedSource r1 = okio.Okio.d(r1)
            java.lang.String r2 = r1.a1()     // Catch:{ all -> 0x005b }
            java.lang.String r3 = r1.a1()     // Catch:{ all -> 0x005b }
            java.lang.String r4 = r1.a1()     // Catch:{ all -> 0x005b }
            java.lang.String r5 = r1.a1()     // Catch:{ all -> 0x005b }
            java.lang.String r6 = r1.a1()     // Catch:{ all -> 0x005b }
            java.lang.String r7 = Y     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r2)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = Z     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r3)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x007d
            int r7 = r9.f42830B     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r7, r4)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x007d
            int r4 = r9.C     // Catch:{ all -> 0x005b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005b }
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x007d
            int r4 = r6.length()     // Catch:{ all -> 0x005b }
            if (r4 > 0) goto L_0x007d
            r0 = 0
        L_0x0051:
            java.lang.String r2 = r1.a1()     // Catch:{ EOFException -> 0x005d }
            r9.O(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0051
        L_0x005b:
            r0 = move-exception
            goto L_0x00ab
        L_0x005d:
            java.util.LinkedHashMap r2 = r9.J     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            int r0 = r0 - r2
            r9.K = r0     // Catch:{ all -> 0x005b }
            boolean r0 = r1.l0()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0070
            r9.Q()     // Catch:{ all -> 0x005b }
            goto L_0x0076
        L_0x0070:
            okio.BufferedSink r0 = r9.H()     // Catch:{ all -> 0x005b }
            r9.I = r0     // Catch:{ all -> 0x005b }
        L_0x0076:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x005b }
            r0 = 0
            kotlin.io.CloseableKt.a(r1, r0)
            return
        L_0x007d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r7.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x005b }
            r7.append(r2)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r3)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r5)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r6)     // Catch:{ all -> 0x005b }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x005b }
            r4.<init>(r0)     // Catch:{ all -> 0x005b }
            throw r4     // Catch:{ all -> 0x005b }
        L_0x00ab:
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r2 = move-exception
            kotlin.io.CloseableKt.a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.N():void");
    }

    public final void O(String str) {
        String str2;
        String str3 = str;
        int i0 = StringsKt.i0(str, ' ', 0, false, 6, (Object) null);
        if (i0 != -1) {
            int i2 = i0 + 1;
            int i02 = StringsKt.i0(str, ' ', i2, false, 4, (Object) null);
            if (i02 == -1) {
                str2 = str3.substring(i2);
                Intrinsics.h(str2, "this as java.lang.String).substring(startIndex)");
                String str4 = e0;
                if (i0 == str4.length() && StringsKt.Q(str3, str4, false, 2, (Object) null)) {
                    this.J.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i2, i02);
                Intrinsics.h(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Entry entry = (Entry) this.J.get(str2);
            if (entry == null) {
                entry = new Entry(this, str2);
                this.J.put(str2, entry);
            }
            if (i02 != -1) {
                String str5 = c0;
                if (i0 == str5.length() && StringsKt.Q(str3, str5, false, 2, (Object) null)) {
                    String substring = str3.substring(i02 + 1);
                    Intrinsics.h(substring, "this as java.lang.String).substring(startIndex)");
                    List M0 = StringsKt.M0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                    entry.o(true);
                    entry.l((Editor) null);
                    entry.m(M0);
                    return;
                }
            }
            if (i02 == -1) {
                String str6 = d0;
                if (i0 == str6.length() && StringsKt.Q(str3, str6, false, 2, (Object) null)) {
                    entry.l(new Editor(this, entry));
                    return;
                }
            }
            if (i02 == -1) {
                String str7 = f0;
                if (i0 == str7.length() && StringsKt.Q(str3, str7, false, 2, (Object) null)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str3);
        }
        throw new IOException("unexpected journal line: " + str3);
    }

    public final synchronized void Q() {
        try {
            BufferedSink bufferedSink = this.I;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink c2 = Okio.c(this.f42831z.b(this.F));
            try {
                c2.K0(Y).writeByte(10);
                c2.K0(Z).writeByte(10);
                c2.x1((long) this.f42830B).writeByte(10);
                c2.x1((long) this.C).writeByte(10);
                c2.writeByte(10);
                for (Entry entry : this.J.values()) {
                    if (entry.b() != null) {
                        c2.K0(d0).writeByte(32);
                        c2.K0(entry.d());
                        c2.writeByte(10);
                    } else {
                        c2.K0(c0).writeByte(32);
                        c2.K0(entry.d());
                        entry.s(c2);
                        c2.writeByte(10);
                    }
                }
                Unit unit = Unit.f40552a;
                CloseableKt.a(c2, (Throwable) null);
                if (this.f42831z.d(this.E)) {
                    this.f42831z.e(this.E, this.G);
                }
                this.f42831z.e(this.F, this.E);
                this.f42831z.f(this.G);
                this.I = H();
                this.L = false;
                this.Q = false;
            } catch (Throwable th) {
                CloseableKt.a(c2, th);
                throw th;
            }
        } finally {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean S(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)     // Catch:{ all -> 0x002d }
            r5.F()     // Catch:{ all -> 0x002d }
            r5.l()     // Catch:{ all -> 0x002d }
            r5.e0(r6)     // Catch:{ all -> 0x002d }
            java.util.LinkedHashMap r0 = r5.J     // Catch:{ all -> 0x002d }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x002d }
            okhttp3.internal.cache.DiskLruCache$Entry r6 = (okhttp3.internal.cache.DiskLruCache.Entry) r6     // Catch:{ all -> 0x002d }
            r0 = 0
            if (r6 != 0) goto L_0x001c
            monitor-exit(r5)
            return r0
        L_0x001c:
            boolean r6 = r5.T(r6)     // Catch:{ all -> 0x002d }
            if (r6 == 0) goto L_0x002f
            long r1 = r5.H     // Catch:{ all -> 0x002d }
            long r3 = r5.D     // Catch:{ all -> 0x002d }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002f
            r5.P = r0     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r6 = move-exception
            goto L_0x0031
        L_0x002f:
            monitor-exit(r5)
            return r6
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.S(java.lang.String):boolean");
    }

    public final boolean T(Entry entry) {
        BufferedSink bufferedSink;
        Intrinsics.i(entry, "entry");
        if (!this.M) {
            if (entry.f() > 0 && (bufferedSink = this.I) != null) {
                bufferedSink.K0(d0);
                bufferedSink.writeByte(32);
                bufferedSink.K0(entry.d());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        Editor b2 = entry.b();
        if (b2 != null) {
            b2.c();
        }
        int i2 = this.C;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f42831z.f((File) entry.a().get(i3));
            this.H -= entry.e()[i3];
            entry.e()[i3] = 0;
        }
        this.K++;
        BufferedSink bufferedSink2 = this.I;
        if (bufferedSink2 != null) {
            bufferedSink2.K0(e0);
            bufferedSink2.writeByte(32);
            bufferedSink2.K0(entry.d());
            bufferedSink2.writeByte(10);
        }
        this.J.remove(entry.d());
        if (G()) {
            TaskQueue.j(this.S, this.T, 0, 2, (Object) null);
        }
        return true;
    }

    public final boolean X() {
        for (Entry entry : this.J.values()) {
            if (!entry.i()) {
                Intrinsics.h(entry, "toEvict");
                T(entry);
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        while (this.H > this.D) {
            if (!X()) {
                return;
            }
        }
        this.P = false;
    }

    public synchronized void close() {
        Editor b2;
        try {
            if (this.N) {
                if (!this.O) {
                    Collection values = this.J.values();
                    Intrinsics.h(values, "lruEntries.values");
                    for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                        if (!(entry.b() == null || (b2 = entry.b()) == null)) {
                            b2.c();
                        }
                    }
                    c0();
                    BufferedSink bufferedSink = this.I;
                    Intrinsics.f(bufferedSink);
                    bufferedSink.close();
                    this.I = null;
                    this.O = true;
                    return;
                }
            }
            this.O = true;
        } finally {
            while (true) {
            }
        }
    }

    public final void e0(String str) {
        if (!b0.d(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    public synchronized void flush() {
        if (this.N) {
            l();
            c0();
            BufferedSink bufferedSink = this.I;
            Intrinsics.f(bufferedSink);
            bufferedSink.flush();
        }
    }

    public final synchronized void l() {
        if (this.O) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m(okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)     // Catch:{ all -> 0x0044 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r9.d()     // Catch:{ all -> 0x0044 }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.b()     // Catch:{ all -> 0x0044 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r9)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0139
            r1 = 0
            if (r10 == 0) goto L_0x0064
            boolean r2 = r0.g()     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0064
            int r2 = r8.C     // Catch:{ all -> 0x0044 }
            r3 = r1
        L_0x0020:
            if (r3 >= r2) goto L_0x0064
            boolean[] r4 = r9.e()     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.Intrinsics.f(r4)     // Catch:{ all -> 0x0044 }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x004a
            okhttp3.internal.io.FileSystem r4 = r8.f42831z     // Catch:{ all -> 0x0044 }
            java.util.List r5 = r0.c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0044 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0044 }
            boolean r4 = r4.d(r5)     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x0047
            r9.a()     // Catch:{ all -> 0x0044 }
            monitor-exit(r8)
            return
        L_0x0044:
            r9 = move-exception
            goto L_0x0141
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x004a:
            r9.a()     // Catch:{ all -> 0x0044 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r10.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0044 }
            r10.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0044 }
            r9.<init>(r10)     // Catch:{ all -> 0x0044 }
            throw r9     // Catch:{ all -> 0x0044 }
        L_0x0064:
            int r9 = r8.C     // Catch:{ all -> 0x0044 }
        L_0x0066:
            if (r1 >= r9) goto L_0x00b2
            java.util.List r2 = r0.c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0044 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x00aa
            boolean r3 = r0.i()     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x00aa
            okhttp3.internal.io.FileSystem r3 = r8.f42831z     // Catch:{ all -> 0x0044 }
            boolean r3 = r3.d(r2)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x00af
            java.util.List r3 = r0.a()     // Catch:{ all -> 0x0044 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0044 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0044 }
            okhttp3.internal.io.FileSystem r4 = r8.f42831z     // Catch:{ all -> 0x0044 }
            r4.e(r2, r3)     // Catch:{ all -> 0x0044 }
            long[] r2 = r0.e()     // Catch:{ all -> 0x0044 }
            r4 = r2[r1]     // Catch:{ all -> 0x0044 }
            okhttp3.internal.io.FileSystem r2 = r8.f42831z     // Catch:{ all -> 0x0044 }
            long r2 = r2.h(r3)     // Catch:{ all -> 0x0044 }
            long[] r6 = r0.e()     // Catch:{ all -> 0x0044 }
            r6[r1] = r2     // Catch:{ all -> 0x0044 }
            long r6 = r8.H     // Catch:{ all -> 0x0044 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.H = r6     // Catch:{ all -> 0x0044 }
            goto L_0x00af
        L_0x00aa:
            okhttp3.internal.io.FileSystem r3 = r8.f42831z     // Catch:{ all -> 0x0044 }
            r3.f(r2)     // Catch:{ all -> 0x0044 }
        L_0x00af:
            int r1 = r1 + 1
            goto L_0x0066
        L_0x00b2:
            r9 = 0
            r0.l(r9)     // Catch:{ all -> 0x0044 }
            boolean r9 = r0.i()     // Catch:{ all -> 0x0044 }
            if (r9 == 0) goto L_0x00c1
            r8.T(r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r8)
            return
        L_0x00c1:
            int r9 = r8.K     // Catch:{ all -> 0x0044 }
            r1 = 1
            int r9 = r9 + r1
            r8.K = r9     // Catch:{ all -> 0x0044 }
            okio.BufferedSink r9 = r8.I     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.Intrinsics.f(r9)     // Catch:{ all -> 0x0044 }
            boolean r2 = r0.g()     // Catch:{ all -> 0x0044 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f6
            if (r10 == 0) goto L_0x00d9
            goto L_0x00f6
        L_0x00d9:
            java.util.LinkedHashMap r10 = r8.J     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0044 }
            r10.remove(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = e0     // Catch:{ all -> 0x0044 }
            okio.BufferedSink r10 = r9.K0(r10)     // Catch:{ all -> 0x0044 }
            r10.writeByte(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x0044 }
            r9.K0(r10)     // Catch:{ all -> 0x0044 }
            r9.writeByte(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x011b
        L_0x00f6:
            r0.o(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = c0     // Catch:{ all -> 0x0044 }
            okio.BufferedSink r1 = r9.K0(r1)     // Catch:{ all -> 0x0044 }
            r1.writeByte(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0044 }
            r9.K0(r1)     // Catch:{ all -> 0x0044 }
            r0.s(r9)     // Catch:{ all -> 0x0044 }
            r9.writeByte(r3)     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x011b
            long r1 = r8.R     // Catch:{ all -> 0x0044 }
            r3 = 1
            long r3 = r3 + r1
            r8.R = r3     // Catch:{ all -> 0x0044 }
            r0.p(r1)     // Catch:{ all -> 0x0044 }
        L_0x011b:
            r9.flush()     // Catch:{ all -> 0x0044 }
            long r9 = r8.H     // Catch:{ all -> 0x0044 }
            long r0 = r8.D     // Catch:{ all -> 0x0044 }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x012c
            boolean r9 = r8.G()     // Catch:{ all -> 0x0044 }
            if (r9 == 0) goto L_0x0137
        L_0x012c:
            okhttp3.internal.concurrent.TaskQueue r0 = r8.S     // Catch:{ all -> 0x0044 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r8.T     // Catch:{ all -> 0x0044 }
            r4 = 2
            r5 = 0
            r2 = 0
            okhttp3.internal.concurrent.TaskQueue.j(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x0044 }
        L_0x0137:
            monitor-exit(r8)
            return
        L_0x0139:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0044 }
            r10.<init>(r9)     // Catch:{ all -> 0x0044 }
            throw r10     // Catch:{ all -> 0x0044 }
        L_0x0141:
            monitor-exit(r8)     // Catch:{ all -> 0x0044 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.m(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public final void r() {
        close();
        this.f42831z.c(this.f42829A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor t(java.lang.String r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)     // Catch:{ all -> 0x0029 }
            r9.F()     // Catch:{ all -> 0x0029 }
            r9.l()     // Catch:{ all -> 0x0029 }
            r9.e0(r10)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap r0 = r9.J     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0029 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0029 }
            long r1 = a0     // Catch:{ all -> 0x0029 }
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x002d
            if (r0 == 0) goto L_0x002b
            long r3 = r0.h()     // Catch:{ all -> 0x0029 }
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x002d
            goto L_0x002b
        L_0x0029:
            r10 = move-exception
            goto L_0x0092
        L_0x002b:
            monitor-exit(r9)
            return r2
        L_0x002d:
            if (r0 == 0) goto L_0x0034
            okhttp3.internal.cache.DiskLruCache$Editor r11 = r0.b()     // Catch:{ all -> 0x0029 }
            goto L_0x0035
        L_0x0034:
            r11 = r2
        L_0x0035:
            if (r11 == 0) goto L_0x0039
            monitor-exit(r9)
            return r2
        L_0x0039:
            if (r0 == 0) goto L_0x0043
            int r11 = r0.f()     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x0043
            monitor-exit(r9)
            return r2
        L_0x0043:
            boolean r11 = r9.P     // Catch:{ all -> 0x0029 }
            if (r11 != 0) goto L_0x0085
            boolean r11 = r9.Q     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x004c
            goto L_0x0085
        L_0x004c:
            okio.BufferedSink r11 = r9.I     // Catch:{ all -> 0x0029 }
            kotlin.jvm.internal.Intrinsics.f(r11)     // Catch:{ all -> 0x0029 }
            java.lang.String r12 = d0     // Catch:{ all -> 0x0029 }
            okio.BufferedSink r12 = r11.K0(r12)     // Catch:{ all -> 0x0029 }
            r1 = 32
            okio.BufferedSink r12 = r12.writeByte(r1)     // Catch:{ all -> 0x0029 }
            okio.BufferedSink r12 = r12.K0(r10)     // Catch:{ all -> 0x0029 }
            r1 = 10
            r12.writeByte(r1)     // Catch:{ all -> 0x0029 }
            r11.flush()     // Catch:{ all -> 0x0029 }
            boolean r11 = r9.L     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x006f
            monitor-exit(r9)
            return r2
        L_0x006f:
            if (r0 != 0) goto L_0x007b
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x0029 }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap r11 = r9.J     // Catch:{ all -> 0x0029 }
            r11.put(r10, r0)     // Catch:{ all -> 0x0029 }
        L_0x007b:
            okhttp3.internal.cache.DiskLruCache$Editor r10 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x0029 }
            r10.<init>(r9, r0)     // Catch:{ all -> 0x0029 }
            r0.l(r10)     // Catch:{ all -> 0x0029 }
            monitor-exit(r9)
            return r10
        L_0x0085:
            okhttp3.internal.concurrent.TaskQueue r3 = r9.S     // Catch:{ all -> 0x0029 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r4 = r9.T     // Catch:{ all -> 0x0029 }
            r7 = 2
            r8 = 0
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.j(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0029 }
            monitor-exit(r9)
            return r2
        L_0x0092:
            monitor-exit(r9)     // Catch:{ all -> 0x0029 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.t(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot y(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)     // Catch:{ all -> 0x0056 }
            r7.F()     // Catch:{ all -> 0x0056 }
            r7.l()     // Catch:{ all -> 0x0056 }
            r7.e0(r8)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashMap r0 = r7.J     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0056 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            monitor-exit(r7)
            return r1
        L_0x001c:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.r()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r7)
            return r1
        L_0x0024:
            int r1 = r7.K     // Catch:{ all -> 0x0056 }
            int r1 = r1 + 1
            r7.K = r1     // Catch:{ all -> 0x0056 }
            okio.BufferedSink r1 = r7.I     // Catch:{ all -> 0x0056 }
            kotlin.jvm.internal.Intrinsics.f(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = f0     // Catch:{ all -> 0x0056 }
            okio.BufferedSink r1 = r1.K0(r2)     // Catch:{ all -> 0x0056 }
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0056 }
            okio.BufferedSink r8 = r1.K0(r8)     // Catch:{ all -> 0x0056 }
            r1 = 10
            r8.writeByte(r1)     // Catch:{ all -> 0x0056 }
            boolean r8 = r7.G()     // Catch:{ all -> 0x0056 }
            if (r8 == 0) goto L_0x0058
            okhttp3.internal.concurrent.TaskQueue r1 = r7.S     // Catch:{ all -> 0x0056 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.T     // Catch:{ all -> 0x0056 }
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.j(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x0056 }
            goto L_0x0058
        L_0x0056:
            r8 = move-exception
            goto L_0x005a
        L_0x0058:
            monitor-exit(r7)
            return r0
        L_0x005a:
            monitor-exit(r7)     // Catch:{ all -> 0x0056 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.y(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }
}
