package coil.disk;

import coil.util.FileSystems;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okio.BufferedSink;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

@Metadata
public final class DiskLruCache implements Closeable, Flushable {
    public static final Companion R = new Companion((DefaultConstructorMarker) null);
    public static final Regex S = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: A  reason: collision with root package name */
    public final long f23399A;

    /* renamed from: B  reason: collision with root package name */
    public final int f23400B;
    public final int C;
    public final Path D;
    public final Path E;
    public final Path F;
    public final LinkedHashMap G;
    public final CoroutineScope H;
    public long I;
    public int J;
    public BufferedSink K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final DiskLruCache$fileSystem$1 Q;

    /* renamed from: z  reason: collision with root package name */
    public final Path f23401z;

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
        public final Entry f23402a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f23403b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f23404c;

        public Editor(Entry entry) {
            this.f23402a = entry;
            this.f23404c = new boolean[DiskLruCache.this.C];
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final Snapshot c() {
            Snapshot F;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                b();
                F = diskLruCache.F(this.f23402a.d());
            }
            return F;
        }

        public final void d(boolean z2) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (!this.f23403b) {
                        if (Intrinsics.d(this.f23402a.b(), this)) {
                            diskLruCache.C(this, z2);
                        }
                        this.f23403b = true;
                        Unit unit = Unit.f40552a;
                    } else {
                        throw new IllegalStateException("editor is closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void e() {
            if (Intrinsics.d(this.f23402a.b(), this)) {
                this.f23402a.m(true);
            }
        }

        public final Path f(int i2) {
            Path path;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!this.f23403b) {
                    this.f23404c[i2] = true;
                    Object obj = this.f23402a.c().get(i2);
                    FileSystems.a(diskLruCache.Q, (Path) obj);
                    path = (Path) obj;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            }
            return path;
        }

        public final Entry g() {
            return this.f23402a;
        }

        public final boolean[] h() {
            return this.f23404c;
        }
    }

    @Metadata
    public final class Entry {

        /* renamed from: a  reason: collision with root package name */
        public final String f23406a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f23407b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f23408c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f23409d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f23410e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f23411f;

        /* renamed from: g  reason: collision with root package name */
        public Editor f23412g;

        /* renamed from: h  reason: collision with root package name */
        public int f23413h;

        public Entry(String str) {
            this.f23406a = str;
            this.f23407b = new long[DiskLruCache.this.C];
            this.f23408c = new ArrayList(DiskLruCache.this.C);
            this.f23409d = new ArrayList(DiskLruCache.this.C);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int g2 = DiskLruCache.this.C;
            for (int i2 = 0; i2 < g2; i2++) {
                sb.append(i2);
                this.f23408c.add(DiskLruCache.this.f23401z.r(sb.toString()));
                sb.append(".tmp");
                this.f23409d.add(DiskLruCache.this.f23401z.r(sb.toString()));
                sb.setLength(length);
            }
        }

        public final ArrayList a() {
            return this.f23408c;
        }

        public final Editor b() {
            return this.f23412g;
        }

        public final ArrayList c() {
            return this.f23409d;
        }

        public final String d() {
            return this.f23406a;
        }

        public final long[] e() {
            return this.f23407b;
        }

        public final int f() {
            return this.f23413h;
        }

        public final boolean g() {
            return this.f23410e;
        }

        public final boolean h() {
            return this.f23411f;
        }

        public final void i(Editor editor) {
            this.f23412g = editor;
        }

        public final void j(List list) {
            if (list.size() == DiskLruCache.this.C) {
                try {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.f23407b[i2] = Long.parseLong((String) list.get(i2));
                    }
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            } else {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i2) {
            this.f23413h = i2;
        }

        public final void l(boolean z2) {
            this.f23410e = z2;
        }

        public final void m(boolean z2) {
            this.f23411f = z2;
        }

        public final Snapshot n() {
            if (!this.f23410e || this.f23412g != null || this.f23411f) {
                return null;
            }
            ArrayList arrayList = this.f23408c;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!diskLruCache.Q.j((Path) arrayList.get(i2))) {
                    try {
                        boolean unused = diskLruCache.T(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            this.f23413h++;
            return new Snapshot(this);
        }

        public final void o(BufferedSink bufferedSink) {
            for (long x1 : this.f23407b) {
                bufferedSink.writeByte(32).x1(x1);
            }
        }
    }

    @Metadata
    public final class Snapshot implements Closeable {

        /* renamed from: A  reason: collision with root package name */
        public boolean f23415A;

        /* renamed from: z  reason: collision with root package name */
        public final Entry f23417z;

        public Snapshot(Entry entry) {
            this.f23417z = entry;
        }

        public final Editor a() {
            Editor E;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                close();
                E = diskLruCache.E(this.f23417z.d());
            }
            return E;
        }

        public final Path b(int i2) {
            if (!this.f23415A) {
                return (Path) this.f23417z.a().get(i2);
            }
            throw new IllegalStateException("snapshot is closed");
        }

        public void close() {
            if (!this.f23415A) {
                this.f23415A = true;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    try {
                        Entry entry = this.f23417z;
                        entry.k(entry.f() - 1);
                        if (this.f23417z.f() == 0 && this.f23417z.h()) {
                            boolean unused = diskLruCache.T(this.f23417z);
                        }
                        Unit unit = Unit.f40552a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public DiskLruCache(FileSystem fileSystem, Path path, CoroutineDispatcher coroutineDispatcher, long j2, int i2, int i3) {
        this.f23401z = path;
        this.f23399A = j2;
        this.f23400B = i2;
        this.C = i3;
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            this.D = path.r("journal");
            this.E = path.r("journal.tmp");
            this.F = path.r("journal.bkp");
            this.G = new LinkedHashMap(0, 0.75f, true);
            this.H = CoroutineScopeKt.a(SupervisorKt.b((Job) null, 1, (Object) null).y(coroutineDispatcher.A0(1)));
            this.Q = new DiskLruCache$fileSystem$1(fileSystem);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public final void A() {
        if (this.N) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0125, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void C(coil.disk.DiskLruCache.Editor r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            coil.disk.DiskLruCache$Entry r0 = r9.g()     // Catch:{ all -> 0x003c }
            coil.disk.DiskLruCache$Editor r1 = r0.b()     // Catch:{ all -> 0x003c }
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r9)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0126
            r1 = 0
            if (r10 == 0) goto L_0x009f
            boolean r2 = r0.h()     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x009f
            int r2 = r8.C     // Catch:{ all -> 0x003c }
            r3 = r1
        L_0x001b:
            if (r3 >= r2) goto L_0x0042
            boolean[] r4 = r9.h()     // Catch:{ all -> 0x003c }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x003f
            coil.disk.DiskLruCache$fileSystem$1 r4 = r8.Q     // Catch:{ all -> 0x003c }
            java.util.ArrayList r5 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x003c }
            okio.Path r5 = (okio.Path) r5     // Catch:{ all -> 0x003c }
            boolean r4 = r4.j(r5)     // Catch:{ all -> 0x003c }
            if (r4 != 0) goto L_0x003f
            r9.a()     // Catch:{ all -> 0x003c }
            monitor-exit(r8)
            return
        L_0x003c:
            r9 = move-exception
            goto L_0x012e
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0042:
            int r9 = r8.C     // Catch:{ all -> 0x003c }
        L_0x0044:
            if (r1 >= r9) goto L_0x00b5
            java.util.ArrayList r2 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x003c }
            okio.Path r2 = (okio.Path) r2     // Catch:{ all -> 0x003c }
            java.util.ArrayList r3 = r0.a()     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            okio.Path r3 = (okio.Path) r3     // Catch:{ all -> 0x003c }
            coil.disk.DiskLruCache$fileSystem$1 r4 = r8.Q     // Catch:{ all -> 0x003c }
            boolean r4 = r4.j(r2)     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x0068
            coil.disk.DiskLruCache$fileSystem$1 r4 = r8.Q     // Catch:{ all -> 0x003c }
            r4.c(r2, r3)     // Catch:{ all -> 0x003c }
            goto L_0x0077
        L_0x0068:
            coil.disk.DiskLruCache$fileSystem$1 r2 = r8.Q     // Catch:{ all -> 0x003c }
            java.util.ArrayList r4 = r0.a()     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x003c }
            okio.Path r4 = (okio.Path) r4     // Catch:{ all -> 0x003c }
            coil.util.FileSystems.a(r2, r4)     // Catch:{ all -> 0x003c }
        L_0x0077:
            long[] r2 = r0.e()     // Catch:{ all -> 0x003c }
            r4 = r2[r1]     // Catch:{ all -> 0x003c }
            coil.disk.DiskLruCache$fileSystem$1 r2 = r8.Q     // Catch:{ all -> 0x003c }
            okio.FileMetadata r2 = r2.m(r3)     // Catch:{ all -> 0x003c }
            java.lang.Long r2 = r2.d()     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x008e
            long r2 = r2.longValue()     // Catch:{ all -> 0x003c }
            goto L_0x0090
        L_0x008e:
            r2 = 0
        L_0x0090:
            long[] r6 = r0.e()     // Catch:{ all -> 0x003c }
            r6[r1] = r2     // Catch:{ all -> 0x003c }
            long r6 = r8.I     // Catch:{ all -> 0x003c }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.I = r6     // Catch:{ all -> 0x003c }
            int r1 = r1 + 1
            goto L_0x0044
        L_0x009f:
            int r9 = r8.C     // Catch:{ all -> 0x003c }
        L_0x00a1:
            if (r1 >= r9) goto L_0x00b5
            coil.disk.DiskLruCache$fileSystem$1 r2 = r8.Q     // Catch:{ all -> 0x003c }
            java.util.ArrayList r3 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            okio.Path r3 = (okio.Path) r3     // Catch:{ all -> 0x003c }
            r2.h(r3)     // Catch:{ all -> 0x003c }
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00b5:
            r9 = 0
            r0.i(r9)     // Catch:{ all -> 0x003c }
            boolean r9 = r0.h()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x00c4
            r8.T(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)
            return
        L_0x00c4:
            int r9 = r8.J     // Catch:{ all -> 0x003c }
            r1 = 1
            int r9 = r9 + r1
            r8.J = r9     // Catch:{ all -> 0x003c }
            okio.BufferedSink r9 = r8.K     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.Intrinsics.f(r9)     // Catch:{ all -> 0x003c }
            r2 = 10
            r3 = 32
            if (r10 != 0) goto L_0x00f8
            boolean r10 = r0.g()     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            java.util.LinkedHashMap r10 = r8.G     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x003c }
            r10.remove(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = "REMOVE"
            r9.K0(r10)     // Catch:{ all -> 0x003c }
            r9.writeByte(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x003c }
            r9.K0(r10)     // Catch:{ all -> 0x003c }
            r9.writeByte(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0110
        L_0x00f8:
            r0.l(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = "CLEAN"
            r9.K0(r10)     // Catch:{ all -> 0x003c }
            r9.writeByte(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x003c }
            r9.K0(r10)     // Catch:{ all -> 0x003c }
            r0.o(r9)     // Catch:{ all -> 0x003c }
            r9.writeByte(r2)     // Catch:{ all -> 0x003c }
        L_0x0110:
            r9.flush()     // Catch:{ all -> 0x003c }
            long r9 = r8.I     // Catch:{ all -> 0x003c }
            long r0 = r8.f23399A     // Catch:{ all -> 0x003c }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0121
            boolean r9 = r8.H()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x0124
        L_0x0121:
            r8.I()     // Catch:{ all -> 0x003c }
        L_0x0124:
            monitor-exit(r8)
            return
        L_0x0126:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003c }
            r10.<init>(r9)     // Catch:{ all -> 0x003c }
            throw r10     // Catch:{ all -> 0x003c }
        L_0x012e:
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.C(coil.disk.DiskLruCache$Editor, boolean):void");
    }

    public final void D() {
        close();
        FileSystems.b(this.Q, this.f23401z);
    }

    public final synchronized Editor E(String str) {
        A();
        e0(str);
        G();
        Entry entry = (Entry) this.G.get(str);
        if ((entry != null ? entry.b() : null) != null) {
            return null;
        }
        if (entry != null) {
            if (entry.f() != 0) {
                return null;
            }
        }
        if (!this.O) {
            if (!this.P) {
                BufferedSink bufferedSink = this.K;
                Intrinsics.f(bufferedSink);
                bufferedSink.K0("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.K0(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.L) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(str);
                    this.G.put(str, entry);
                }
                Editor editor = new Editor(entry);
                entry.i(editor);
                return editor;
            }
        }
        I();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized coil.disk.DiskLruCache.Snapshot F(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.A()     // Catch:{ all -> 0x0042 }
            r3.e0(r4)     // Catch:{ all -> 0x0042 }
            r3.G()     // Catch:{ all -> 0x0042 }
            java.util.LinkedHashMap r0 = r3.G     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0042 }
            coil.disk.DiskLruCache$Entry r0 = (coil.disk.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0046
            coil.disk.DiskLruCache$Snapshot r0 = r0.n()     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x001b
            goto L_0x0046
        L_0x001b:
            int r1 = r3.J     // Catch:{ all -> 0x0042 }
            int r1 = r1 + 1
            r3.J = r1     // Catch:{ all -> 0x0042 }
            okio.BufferedSink r1 = r3.K     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.Intrinsics.f(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "READ"
            r1.K0(r2)     // Catch:{ all -> 0x0042 }
            r2 = 32
            r1.writeByte(r2)     // Catch:{ all -> 0x0042 }
            r1.K0(r4)     // Catch:{ all -> 0x0042 }
            r4 = 10
            r1.writeByte(r4)     // Catch:{ all -> 0x0042 }
            boolean r4 = r3.H()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0044
            r3.I()     // Catch:{ all -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r4 = move-exception
            goto L_0x0049
        L_0x0044:
            monitor-exit(r3)
            return r0
        L_0x0046:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0049:
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.F(java.lang.String):coil.disk.DiskLruCache$Snapshot");
    }

    public final synchronized void G() {
        try {
            if (!this.M) {
                this.Q.h(this.E);
                if (this.Q.j(this.F)) {
                    if (this.Q.j(this.D)) {
                        this.Q.h(this.F);
                    } else {
                        this.Q.c(this.F, this.D);
                    }
                }
                if (this.Q.j(this.D)) {
                    Q();
                    O();
                    this.M = true;
                    return;
                }
                f0();
                this.M = true;
            }
        } catch (IOException unused) {
            D();
            this.N = false;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final boolean H() {
        return this.J >= 2000;
    }

    public final void I() {
        Job unused = BuildersKt__Builders_commonKt.d(this.H, (CoroutineContext) null, (CoroutineStart) null, new DiskLruCache$launchCleanup$1(this, (Continuation) null), 3, (Object) null);
    }

    public final BufferedSink N() {
        return Okio.c(new FaultHidingSink(this.Q.a(this.D), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    public final void O() {
        Iterator it = this.G.values().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int i2 = 0;
            if (entry.b() == null) {
                int i3 = this.C;
                while (i2 < i3) {
                    j2 += entry.e()[i2];
                    i2++;
                }
            } else {
                entry.i((Editor) null);
                int i4 = this.C;
                while (i2 < i4) {
                    this.Q.h((Path) entry.a().get(i2));
                    this.Q.h((Path) entry.c().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
        this.I = j2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|(1:20)(1:21)|22|(2:24|25)) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r12.J = r0 - r12.G.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r1.l0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        f0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r12.K = N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r0 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r1 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        r2 = th;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005e */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0081=Splitter:B:27:0x0081, B:17:0x005e=Splitter:B:17:0x005e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            coil.disk.DiskLruCache$fileSystem$1 r1 = r12.Q
            okio.Path r2 = r12.D
            okio.Source r1 = r1.t(r2)
            okio.BufferedSource r1 = okio.Okio.d(r1)
            r2 = 0
            java.lang.String r3 = r1.a1()     // Catch:{ all -> 0x005c }
            java.lang.String r4 = r1.a1()     // Catch:{ all -> 0x005c }
            java.lang.String r5 = r1.a1()     // Catch:{ all -> 0x005c }
            java.lang.String r6 = r1.a1()     // Catch:{ all -> 0x005c }
            java.lang.String r7 = r1.a1()     // Catch:{ all -> 0x005c }
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r3)     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0081
            java.lang.String r8 = "1"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r4)     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0081
            int r8 = r12.f23400B     // Catch:{ all -> 0x005c }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x005c }
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r5)     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0081
            int r8 = r12.C     // Catch:{ all -> 0x005c }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x005c }
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r6)     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0081
            int r8 = r7.length()     // Catch:{ all -> 0x005c }
            if (r8 > 0) goto L_0x0081
            r0 = 0
        L_0x0052:
            java.lang.String r3 = r1.a1()     // Catch:{ EOFException -> 0x005e }
            r12.S(r3)     // Catch:{ EOFException -> 0x005e }
            int r0 = r0 + 1
            goto L_0x0052
        L_0x005c:
            r0 = move-exception
            goto L_0x00b5
        L_0x005e:
            java.util.LinkedHashMap r3 = r12.G     // Catch:{ all -> 0x005c }
            int r3 = r3.size()     // Catch:{ all -> 0x005c }
            int r0 = r0 - r3
            r12.J = r0     // Catch:{ all -> 0x005c }
            boolean r0 = r1.l0()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0071
            r12.f0()     // Catch:{ all -> 0x005c }
            goto L_0x0077
        L_0x0071:
            okio.BufferedSink r0 = r12.N()     // Catch:{ all -> 0x005c }
            r12.K = r0     // Catch:{ all -> 0x005c }
        L_0x0077:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x00c2
            r1.close()     // Catch:{ all -> 0x007f }
            goto L_0x00c2
        L_0x007f:
            r2 = move-exception
            goto L_0x00c2
        L_0x0081:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r9.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r10 = "unexpected journal header: ["
            r9.append(r10)     // Catch:{ all -> 0x005c }
            r9.append(r3)     // Catch:{ all -> 0x005c }
            r9.append(r0)     // Catch:{ all -> 0x005c }
            r9.append(r4)     // Catch:{ all -> 0x005c }
            r9.append(r0)     // Catch:{ all -> 0x005c }
            r9.append(r5)     // Catch:{ all -> 0x005c }
            r9.append(r0)     // Catch:{ all -> 0x005c }
            r9.append(r6)     // Catch:{ all -> 0x005c }
            r9.append(r0)     // Catch:{ all -> 0x005c }
            r9.append(r7)     // Catch:{ all -> 0x005c }
            r0 = 93
            r9.append(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x005c }
            r8.<init>(r0)     // Catch:{ all -> 0x005c }
            throw r8     // Catch:{ all -> 0x005c }
        L_0x00b5:
            if (r1 == 0) goto L_0x00bf
            r1.close()     // Catch:{ all -> 0x00bb }
            goto L_0x00bf
        L_0x00bb:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r0, r1)
        L_0x00bf:
            r11 = r2
            r2 = r0
            r0 = r11
        L_0x00c2:
            if (r2 != 0) goto L_0x00c8
            kotlin.jvm.internal.Intrinsics.f(r0)
            return
        L_0x00c8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.Q():void");
    }

    public final void S(String str) {
        String str2;
        String str3 = str;
        int i0 = StringsKt.i0(str, ' ', 0, false, 6, (Object) null);
        if (i0 != -1) {
            int i2 = i0 + 1;
            int i02 = StringsKt.i0(str, ' ', i2, false, 4, (Object) null);
            if (i02 == -1) {
                str2 = str3.substring(i2);
                Intrinsics.h(str2, "substring(...)");
                if (i0 == 6 && StringsKt.Q(str3, "REMOVE", false, 2, (Object) null)) {
                    this.G.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i2, i02);
                Intrinsics.h(str2, "substring(...)");
            }
            LinkedHashMap linkedHashMap = this.G;
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = new Entry(str2);
                linkedHashMap.put(str2, obj);
            }
            Entry entry = (Entry) obj;
            if (i02 != -1 && i0 == 5 && StringsKt.Q(str3, "CLEAN", false, 2, (Object) null)) {
                String substring = str3.substring(i02 + 1);
                Intrinsics.h(substring, "substring(...)");
                List M0 = StringsKt.M0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                entry.l(true);
                entry.i((Editor) null);
                entry.j(M0);
            } else if (i02 == -1 && i0 == 5 && StringsKt.Q(str3, "DIRTY", false, 2, (Object) null)) {
                entry.i(new Editor(entry));
            } else if (i02 != -1 || i0 != 4 || !StringsKt.Q(str3, "READ", false, 2, (Object) null)) {
                throw new IOException("unexpected journal line: " + str3);
            }
        } else {
            throw new IOException("unexpected journal line: " + str3);
        }
    }

    public final boolean T(Entry entry) {
        BufferedSink bufferedSink;
        if (entry.f() > 0 && (bufferedSink = this.K) != null) {
            bufferedSink.K0("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.K0(entry.d());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (entry.f() > 0 || entry.b() != null) {
            entry.m(true);
            return true;
        }
        int i2 = this.C;
        for (int i3 = 0; i3 < i2; i3++) {
            this.Q.h((Path) entry.a().get(i3));
            this.I -= entry.e()[i3];
            entry.e()[i3] = 0;
        }
        this.J++;
        BufferedSink bufferedSink2 = this.K;
        if (bufferedSink2 != null) {
            bufferedSink2.K0("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.K0(entry.d());
            bufferedSink2.writeByte(10);
        }
        this.G.remove(entry.d());
        if (H()) {
            I();
        }
        return true;
    }

    public final boolean X() {
        for (Entry entry : this.G.values()) {
            if (!entry.h()) {
                T(entry);
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        while (this.I > this.f23399A) {
            if (!X()) {
                return;
            }
        }
        this.O = false;
    }

    public synchronized void close() {
        try {
            if (this.M) {
                if (!this.N) {
                    for (Entry b2 : (Entry[]) this.G.values().toArray(new Entry[0])) {
                        Editor b3 = b2.b();
                        if (b3 != null) {
                            b3.e();
                        }
                    }
                    c0();
                    CoroutineScopeKt.e(this.H, (CancellationException) null, 1, (Object) null);
                    BufferedSink bufferedSink = this.K;
                    Intrinsics.f(bufferedSink);
                    bufferedSink.close();
                    this.K = null;
                    this.N = true;
                    return;
                }
            }
            this.N = true;
        } finally {
            while (true) {
            }
        }
    }

    public final void e0(String str) {
        if (!S.d(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7 A[Catch:{ all -> 0x0076, all -> 0x009e, all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5 A[SYNTHETIC, Splitter:B:39:0x00e5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f0() {
        /*
            r9 = this;
            monitor-enter(r9)
            okio.BufferedSink r0 = r9.K     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x000c
            r0.close()     // Catch:{ all -> 0x0009 }
            goto L_0x000c
        L_0x0009:
            r0 = move-exception
            goto L_0x00e6
        L_0x000c:
            coil.disk.DiskLruCache$fileSystem$1 r0 = r9.Q     // Catch:{ all -> 0x0009 }
            okio.Path r1 = r9.E     // Catch:{ all -> 0x0009 }
            r2 = 0
            okio.Sink r0 = r0.s(r1, r2)     // Catch:{ all -> 0x0009 }
            okio.BufferedSink r0 = okio.Okio.c(r0)     // Catch:{ all -> 0x0009 }
            r1 = 0
            java.lang.String r3 = "libcore.io.DiskLruCache"
            okio.BufferedSink r3 = r0.K0(r3)     // Catch:{ all -> 0x0076 }
            r4 = 10
            r3.writeByte(r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "1"
            okio.BufferedSink r3 = r0.K0(r3)     // Catch:{ all -> 0x0076 }
            r3.writeByte(r4)     // Catch:{ all -> 0x0076 }
            int r3 = r9.f23400B     // Catch:{ all -> 0x0076 }
            long r5 = (long) r3     // Catch:{ all -> 0x0076 }
            okio.BufferedSink r3 = r0.x1(r5)     // Catch:{ all -> 0x0076 }
            r3.writeByte(r4)     // Catch:{ all -> 0x0076 }
            int r3 = r9.C     // Catch:{ all -> 0x0076 }
            long r5 = (long) r3     // Catch:{ all -> 0x0076 }
            okio.BufferedSink r3 = r0.x1(r5)     // Catch:{ all -> 0x0076 }
            r3.writeByte(r4)     // Catch:{ all -> 0x0076 }
            r0.writeByte(r4)     // Catch:{ all -> 0x0076 }
            java.util.LinkedHashMap r3 = r9.G     // Catch:{ all -> 0x0076 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0076 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0076 }
        L_0x004f:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0076 }
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0076 }
            coil.disk.DiskLruCache$Entry r5 = (coil.disk.DiskLruCache.Entry) r5     // Catch:{ all -> 0x0076 }
            coil.disk.DiskLruCache$Editor r6 = r5.b()     // Catch:{ all -> 0x0076 }
            r7 = 32
            if (r6 == 0) goto L_0x0078
            java.lang.String r6 = "DIRTY"
            r0.K0(r6)     // Catch:{ all -> 0x0076 }
            r0.writeByte(r7)     // Catch:{ all -> 0x0076 }
            java.lang.String r5 = r5.d()     // Catch:{ all -> 0x0076 }
            r0.K0(r5)     // Catch:{ all -> 0x0076 }
            r0.writeByte(r4)     // Catch:{ all -> 0x0076 }
            goto L_0x004f
        L_0x0076:
            r3 = move-exception
            goto L_0x0098
        L_0x0078:
            java.lang.String r6 = "CLEAN"
            r0.K0(r6)     // Catch:{ all -> 0x0076 }
            r0.writeByte(r7)     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = r5.d()     // Catch:{ all -> 0x0076 }
            r0.K0(r6)     // Catch:{ all -> 0x0076 }
            r5.o(r0)     // Catch:{ all -> 0x0076 }
            r0.writeByte(r4)     // Catch:{ all -> 0x0076 }
            goto L_0x004f
        L_0x008e:
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x00a5
            r0.close()     // Catch:{ all -> 0x0096 }
            goto L_0x00a5
        L_0x0096:
            r1 = move-exception
            goto L_0x00a5
        L_0x0098:
            if (r0 == 0) goto L_0x00a2
            r0.close()     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            kotlin.ExceptionsKt.a(r3, r0)     // Catch:{ all -> 0x0009 }
        L_0x00a2:
            r8 = r3
            r3 = r1
            r1 = r8
        L_0x00a5:
            if (r1 != 0) goto L_0x00e5
            kotlin.jvm.internal.Intrinsics.f(r3)     // Catch:{ all -> 0x0009 }
            coil.disk.DiskLruCache$fileSystem$1 r0 = r9.Q     // Catch:{ all -> 0x0009 }
            okio.Path r1 = r9.D     // Catch:{ all -> 0x0009 }
            boolean r0 = r0.j(r1)     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x00ce
            coil.disk.DiskLruCache$fileSystem$1 r0 = r9.Q     // Catch:{ all -> 0x0009 }
            okio.Path r1 = r9.D     // Catch:{ all -> 0x0009 }
            okio.Path r3 = r9.F     // Catch:{ all -> 0x0009 }
            r0.c(r1, r3)     // Catch:{ all -> 0x0009 }
            coil.disk.DiskLruCache$fileSystem$1 r0 = r9.Q     // Catch:{ all -> 0x0009 }
            okio.Path r1 = r9.E     // Catch:{ all -> 0x0009 }
            okio.Path r3 = r9.D     // Catch:{ all -> 0x0009 }
            r0.c(r1, r3)     // Catch:{ all -> 0x0009 }
            coil.disk.DiskLruCache$fileSystem$1 r0 = r9.Q     // Catch:{ all -> 0x0009 }
            okio.Path r1 = r9.F     // Catch:{ all -> 0x0009 }
            r0.h(r1)     // Catch:{ all -> 0x0009 }
            goto L_0x00d7
        L_0x00ce:
            coil.disk.DiskLruCache$fileSystem$1 r0 = r9.Q     // Catch:{ all -> 0x0009 }
            okio.Path r1 = r9.E     // Catch:{ all -> 0x0009 }
            okio.Path r3 = r9.D     // Catch:{ all -> 0x0009 }
            r0.c(r1, r3)     // Catch:{ all -> 0x0009 }
        L_0x00d7:
            okio.BufferedSink r0 = r9.N()     // Catch:{ all -> 0x0009 }
            r9.K = r0     // Catch:{ all -> 0x0009 }
            r9.J = r2     // Catch:{ all -> 0x0009 }
            r9.L = r2     // Catch:{ all -> 0x0009 }
            r9.P = r2     // Catch:{ all -> 0x0009 }
            monitor-exit(r9)
            return
        L_0x00e5:
            throw r1     // Catch:{ all -> 0x0009 }
        L_0x00e6:
            monitor-exit(r9)     // Catch:{ all -> 0x0009 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.f0():void");
    }

    public synchronized void flush() {
        if (this.M) {
            A();
            c0();
            BufferedSink bufferedSink = this.K;
            Intrinsics.f(bufferedSink);
            bufferedSink.flush();
        }
    }
}
