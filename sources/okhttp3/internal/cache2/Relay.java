package okhttp3.internal.cache2;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

@Metadata
public final class Relay {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f42861k = new Companion((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final ByteString f42862l;

    /* renamed from: m  reason: collision with root package name */
    public static final ByteString f42863m;

    /* renamed from: a  reason: collision with root package name */
    public RandomAccessFile f42864a;

    /* renamed from: b  reason: collision with root package name */
    public Source f42865b;

    /* renamed from: c  reason: collision with root package name */
    public long f42866c;

    /* renamed from: d  reason: collision with root package name */
    public final ByteString f42867d;

    /* renamed from: e  reason: collision with root package name */
    public final long f42868e;

    /* renamed from: f  reason: collision with root package name */
    public Thread f42869f;

    /* renamed from: g  reason: collision with root package name */
    public final Buffer f42870g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f42871h;

    /* renamed from: i  reason: collision with root package name */
    public final Buffer f42872i;

    /* renamed from: j  reason: collision with root package name */
    public int f42873j;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class RelaySource implements Source {

        /* renamed from: A  reason: collision with root package name */
        public FileOperator f42874A;

        /* renamed from: B  reason: collision with root package name */
        public long f42875B;
        public final /* synthetic */ Relay C;

        /* renamed from: z  reason: collision with root package name */
        public final Timeout f42876z;

        public void close() {
            if (this.f42874A != null) {
                RandomAccessFile randomAccessFile = null;
                this.f42874A = null;
                Relay relay = this.C;
                synchronized (relay) {
                    try {
                        relay.l(relay.f() - 1);
                        if (relay.f() == 0) {
                            RandomAccessFile e2 = relay.e();
                            relay.k((RandomAccessFile) null);
                            randomAccessFile = e2;
                        }
                        Unit unit = Unit.f40552a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (randomAccessFile != null) {
                    Util.m(randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
            r9 = r8.i() - r8.b().n0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
            if (r1.f42875B >= r9) goto L_0x0158;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
            if (r0 != true) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
            r10 = java.lang.Math.min(r2, r1.C.i() - r1.f42875B);
            r2 = r1.f42874A;
            kotlin.jvm.internal.Intrinsics.f(r2);
            r2.a(r1.f42875B + 32, r22, r10);
            r1.f42875B += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
            return r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r0 = r1.C.g();
            kotlin.jvm.internal.Intrinsics.f(r0);
            r11 = r0.o1(r1.C.h(), r1.C.c());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
            if (r11 != -1) goto L_0x00b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
            r0 = r1.C;
            r0.a(r0.i());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
            r2 = r1.C;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            r2.n((java.lang.Thread) null);
            kotlin.jvm.internal.Intrinsics.g(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = kotlin.Unit.f40552a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r19 = java.lang.Math.min(r11, r2);
            r1.C.h().j(r22, 0, r19);
            r1.f42875B += r19;
            r13 = r1.f42874A;
            kotlin.jvm.internal.Intrinsics.f(r13);
            r13.b(r1.C.i() + 32, r1.C.h().clone(), r11);
            r2 = r1.C;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r2.b().N0(r2.h(), r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x010a, code lost:
            if (r2.b().n0() <= r2.c()) goto L_0x0123;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
            r2.b().skip(r2.b().n0() - r2.c());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0121, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
            r2.m(r2.i() + r11);
            r0 = kotlin.Unit.f40552a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
            r2 = r1.C;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            r2.n((java.lang.Thread) null);
            kotlin.jvm.internal.Intrinsics.g(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x013c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
            return r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0143, code lost:
            r2 = r1.C;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0145, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            r2.n((java.lang.Thread) null);
            kotlin.jvm.internal.Intrinsics.g(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = kotlin.Unit.f40552a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0154, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            r11 = java.lang.Math.min(r2, r8.i() - r1.f42875B);
            r8.b().j(r22, r1.f42875B - r9, r11);
            r1.f42875B += r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0178, code lost:
            return r11;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long o1(okio.Buffer r22, long r23) {
            /*
                r21 = this;
                r1 = r21
                r2 = r23
                java.lang.String r0 = "sink"
                r5 = r22
                kotlin.jvm.internal.Intrinsics.i(r5, r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.f42874A
                if (r0 == 0) goto L_0x017b
                okhttp3.internal.cache2.Relay r8 = r1.C
                monitor-enter(r8)
            L_0x0012:
                long r6 = r8.i()     // Catch:{ all -> 0x0033 }
                long r9 = r1.f42875B     // Catch:{ all -> 0x0033 }
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                r4 = 2
                r6 = -1
                if (r0 != 0) goto L_0x003f
                boolean r0 = r8.d()     // Catch:{ all -> 0x0033 }
                if (r0 == 0) goto L_0x0027
                monitor-exit(r8)
                return r6
            L_0x0027:
                java.lang.Thread r0 = r8.j()     // Catch:{ all -> 0x0033 }
                if (r0 == 0) goto L_0x0036
                okio.Timeout r0 = r1.f42876z     // Catch:{ all -> 0x0033 }
                r0.j(r8)     // Catch:{ all -> 0x0033 }
                goto L_0x0012
            L_0x0033:
                r0 = move-exception
                goto L_0x0179
            L_0x0036:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0033 }
                r8.n(r0)     // Catch:{ all -> 0x0033 }
                r0 = 1
                goto L_0x0053
            L_0x003f:
                long r9 = r8.i()     // Catch:{ all -> 0x0033 }
                okio.Buffer r0 = r8.b()     // Catch:{ all -> 0x0033 }
                long r11 = r0.n0()     // Catch:{ all -> 0x0033 }
                long r9 = r9 - r11
                long r11 = r1.f42875B     // Catch:{ all -> 0x0033 }
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 >= 0) goto L_0x0158
                r0 = r4
            L_0x0053:
                monitor-exit(r8)
                r8 = 32
                if (r0 != r4) goto L_0x0079
                okhttp3.internal.cache2.Relay r0 = r1.C
                long r6 = r0.i()
                long r10 = r1.f42875B
                long r6 = r6 - r10
                long r10 = java.lang.Math.min(r2, r6)
                okhttp3.internal.cache2.FileOperator r2 = r1.f42874A
                kotlin.jvm.internal.Intrinsics.f(r2)
                long r3 = r1.f42875B
                long r3 = r3 + r8
                r5 = r22
                r6 = r10
                r2.a(r3, r5, r6)
                long r2 = r1.f42875B
                long r2 = r2 + r10
                r1.f42875B = r2
                return r10
            L_0x0079:
                r10 = 0
                okhttp3.internal.cache2.Relay r0 = r1.C     // Catch:{ all -> 0x00b5 }
                okio.Source r0 = r0.g()     // Catch:{ all -> 0x00b5 }
                kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.cache2.Relay r4 = r1.C     // Catch:{ all -> 0x00b5 }
                okio.Buffer r4 = r4.h()     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.cache2.Relay r11 = r1.C     // Catch:{ all -> 0x00b5 }
                long r11 = r11.c()     // Catch:{ all -> 0x00b5 }
                long r11 = r0.o1(r4, r11)     // Catch:{ all -> 0x00b5 }
                int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x00b8
                okhttp3.internal.cache2.Relay r0 = r1.C     // Catch:{ all -> 0x00b5 }
                long r2 = r0.i()     // Catch:{ all -> 0x00b5 }
                r0.a(r2)     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.cache2.Relay r2 = r1.C
                monitor-enter(r2)
                r2.n(r10)     // Catch:{ all -> 0x00b2 }
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.g(r2, r0)     // Catch:{ all -> 0x00b2 }
                r2.notifyAll()     // Catch:{ all -> 0x00b2 }
                kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00b2 }
                monitor-exit(r2)
                return r6
            L_0x00b2:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00b5:
                r0 = move-exception
                goto L_0x0143
            L_0x00b8:
                long r19 = java.lang.Math.min(r11, r2)     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.cache2.Relay r0 = r1.C     // Catch:{ all -> 0x00b5 }
                okio.Buffer r2 = r0.h()     // Catch:{ all -> 0x00b5 }
                r6 = 0
                r3 = r22
                r4 = r6
                r6 = r19
                r2.j(r3, r4, r6)     // Catch:{ all -> 0x00b5 }
                long r2 = r1.f42875B     // Catch:{ all -> 0x00b5 }
                long r2 = r2 + r19
                r1.f42875B = r2     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.cache2.FileOperator r13 = r1.f42874A     // Catch:{ all -> 0x00b5 }
                kotlin.jvm.internal.Intrinsics.f(r13)     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.cache2.Relay r0 = r1.C     // Catch:{ all -> 0x00b5 }
                long r2 = r0.i()     // Catch:{ all -> 0x00b5 }
                long r14 = r2 + r8
                okhttp3.internal.cache2.Relay r0 = r1.C     // Catch:{ all -> 0x00b5 }
                okio.Buffer r0 = r0.h()     // Catch:{ all -> 0x00b5 }
                okio.Buffer r16 = r0.clone()     // Catch:{ all -> 0x00b5 }
                r17 = r11
                r13.b(r14, r16, r17)     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.cache2.Relay r2 = r1.C     // Catch:{ all -> 0x00b5 }
                monitor-enter(r2)     // Catch:{ all -> 0x00b5 }
                okio.Buffer r0 = r2.b()     // Catch:{ all -> 0x0121 }
                okio.Buffer r3 = r2.h()     // Catch:{ all -> 0x0121 }
                r0.N0(r3, r11)     // Catch:{ all -> 0x0121 }
                okio.Buffer r0 = r2.b()     // Catch:{ all -> 0x0121 }
                long r3 = r0.n0()     // Catch:{ all -> 0x0121 }
                long r5 = r2.c()     // Catch:{ all -> 0x0121 }
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 <= 0) goto L_0x0123
                okio.Buffer r0 = r2.b()     // Catch:{ all -> 0x0121 }
                okio.Buffer r3 = r2.b()     // Catch:{ all -> 0x0121 }
                long r3 = r3.n0()     // Catch:{ all -> 0x0121 }
                long r5 = r2.c()     // Catch:{ all -> 0x0121 }
                long r3 = r3 - r5
                r0.skip(r3)     // Catch:{ all -> 0x0121 }
                goto L_0x0123
            L_0x0121:
                r0 = move-exception
                goto L_0x0141
            L_0x0123:
                long r3 = r2.i()     // Catch:{ all -> 0x0121 }
                long r3 = r3 + r11
                r2.m(r3)     // Catch:{ all -> 0x0121 }
                kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0121 }
                monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.cache2.Relay r2 = r1.C
                monitor-enter(r2)
                r2.n(r10)     // Catch:{ all -> 0x013e }
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.g(r2, r0)     // Catch:{ all -> 0x013e }
                r2.notifyAll()     // Catch:{ all -> 0x013e }
                monitor-exit(r2)
                return r19
            L_0x013e:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0141:
                monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
                throw r0     // Catch:{ all -> 0x00b5 }
            L_0x0143:
                okhttp3.internal.cache2.Relay r2 = r1.C
                monitor-enter(r2)
                r2.n(r10)     // Catch:{ all -> 0x0155 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.g(r2, r3)     // Catch:{ all -> 0x0155 }
                r2.notifyAll()     // Catch:{ all -> 0x0155 }
                kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0155 }
                monitor-exit(r2)
                throw r0
            L_0x0155:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0158:
                long r6 = r8.i()     // Catch:{ all -> 0x0033 }
                long r11 = r1.f42875B     // Catch:{ all -> 0x0033 }
                long r6 = r6 - r11
                long r11 = java.lang.Math.min(r2, r6)     // Catch:{ all -> 0x0033 }
                okio.Buffer r2 = r8.b()     // Catch:{ all -> 0x0033 }
                long r3 = r1.f42875B     // Catch:{ all -> 0x0033 }
                long r6 = r3 - r9
                r3 = r22
                r4 = r6
                r6 = r11
                r2.j(r3, r4, r6)     // Catch:{ all -> 0x0033 }
                long r2 = r1.f42875B     // Catch:{ all -> 0x0033 }
                long r2 = r2 + r11
                r1.f42875B = r2     // Catch:{ all -> 0x0033 }
                monitor-exit(r8)
                return r11
            L_0x0179:
                monitor-exit(r8)
                throw r0
            L_0x017b:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.o1(okio.Buffer, long):long");
        }

        public Timeout u() {
            return this.f42876z;
        }
    }

    static {
        ByteString.Companion companion = ByteString.C;
        f42862l = companion.d("OkHttp cache v1\n");
        f42863m = companion.d("OkHttp DIRTY :(\n");
    }

    public final void a(long j2) {
        p(j2);
        RandomAccessFile randomAccessFile = this.f42864a;
        Intrinsics.f(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        o(f42862l, j2, (long) this.f42867d.N());
        RandomAccessFile randomAccessFile2 = this.f42864a;
        Intrinsics.f(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.f42871h = true;
            Unit unit = Unit.f40552a;
        }
        Source source = this.f42865b;
        if (source != null) {
            Util.m(source);
        }
        this.f42865b = null;
    }

    public final Buffer b() {
        return this.f42872i;
    }

    public final long c() {
        return this.f42868e;
    }

    public final boolean d() {
        return this.f42871h;
    }

    public final RandomAccessFile e() {
        return this.f42864a;
    }

    public final int f() {
        return this.f42873j;
    }

    public final Source g() {
        return this.f42865b;
    }

    public final Buffer h() {
        return this.f42870g;
    }

    public final long i() {
        return this.f42866c;
    }

    public final Thread j() {
        return this.f42869f;
    }

    public final void k(RandomAccessFile randomAccessFile) {
        this.f42864a = randomAccessFile;
    }

    public final void l(int i2) {
        this.f42873j = i2;
    }

    public final void m(long j2) {
        this.f42866c = j2;
    }

    public final void n(Thread thread) {
        this.f42869f = thread;
    }

    public final void o(ByteString byteString, long j2, long j3) {
        Buffer buffer = new Buffer();
        buffer.k1(byteString);
        buffer.w1(j2);
        buffer.w1(j3);
        if (buffer.n0() == 32) {
            RandomAccessFile randomAccessFile = this.f42864a;
            Intrinsics.f(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.h(channel, "file!!.channel");
            new FileOperator(channel).b(0, buffer, 32);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final void p(long j2) {
        Buffer buffer = new Buffer();
        buffer.k1(this.f42867d);
        RandomAccessFile randomAccessFile = this.f42864a;
        Intrinsics.f(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.h(channel, "file!!.channel");
        new FileOperator(channel).b(32 + j2, buffer, (long) this.f42867d.N());
    }
}
