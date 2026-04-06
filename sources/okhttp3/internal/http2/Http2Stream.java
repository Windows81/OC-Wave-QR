package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

@Metadata
public final class Http2Stream {

    /* renamed from: o  reason: collision with root package name */
    public static final Companion f43130o = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f43131a;

    /* renamed from: b  reason: collision with root package name */
    public final Http2Connection f43132b;

    /* renamed from: c  reason: collision with root package name */
    public long f43133c;

    /* renamed from: d  reason: collision with root package name */
    public long f43134d;

    /* renamed from: e  reason: collision with root package name */
    public long f43135e;

    /* renamed from: f  reason: collision with root package name */
    public long f43136f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f43137g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f43138h;

    /* renamed from: i  reason: collision with root package name */
    public final FramingSource f43139i;

    /* renamed from: j  reason: collision with root package name */
    public final FramingSink f43140j;

    /* renamed from: k  reason: collision with root package name */
    public final StreamTimeout f43141k = new StreamTimeout();

    /* renamed from: l  reason: collision with root package name */
    public final StreamTimeout f43142l = new StreamTimeout();

    /* renamed from: m  reason: collision with root package name */
    public ErrorCode f43143m;

    /* renamed from: n  reason: collision with root package name */
    public IOException f43144n;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class FramingSink implements Sink {

        /* renamed from: A  reason: collision with root package name */
        public final Buffer f43145A = new Buffer();

        /* renamed from: B  reason: collision with root package name */
        public Headers f43146B;
        public boolean C;

        /* renamed from: z  reason: collision with root package name */
        public boolean f43147z;

        public FramingSink(boolean z2) {
            this.f43147z = z2;
        }

        public void N0(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f42805h || !Thread.holdsLock(http2Stream)) {
                this.f43145A.N0(buffer, j2);
                while (this.f43145A.n0() >= 16384) {
                    a(false);
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public final void a(boolean z2) {
            long min;
            boolean z3;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.s().x();
                    while (http2Stream.r() >= http2Stream.q() && !this.f43147z && !this.C && http2Stream.h() == null) {
                        http2Stream.D();
                    }
                    http2Stream.s().E();
                    http2Stream.c();
                    min = Math.min(http2Stream.q() - http2Stream.r(), this.f43145A.n0());
                    http2Stream.B(http2Stream.r() + min);
                    z3 = z2 && min == this.f43145A.n0();
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Http2Stream.this.s().x();
            try {
                Http2Stream.this.g().b1(Http2Stream.this.j(), z3, this.f43145A, min);
            } finally {
                Http2Stream.this.s().E();
            }
        }

        public final boolean b() {
            return this.C;
        }

        public final boolean c() {
            return this.f43147z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
            if (r10.D.o().f43147z != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
            if (r10.f43145A.n0() <= 0) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
            if (r10.f43146B == null) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
            if (r10.f43145A.n0() <= 0) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
            r0 = r10.D.g();
            r2 = r10.D.j();
            r4 = r10.f43146B;
            kotlin.jvm.internal.Intrinsics.f(r4);
            r0.j1(r2, r1, okhttp3.internal.Util.P(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
            if (r0 == false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
            if (r10.f43145A.n0() <= 0) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
            if (r1 == false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
            r10.D.g().b1(r10.D.j(), true, (okio.Buffer) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
            r0 = r10.D;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r10.C = true;
            r1 = kotlin.Unit.f40552a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
            r10.D.g().flush();
            r10.D.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                boolean r1 = okhttp3.internal.Util.f42805h
                if (r1 == 0) goto L_0x0034
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0034
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0034:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r10.C     // Catch:{ all -> 0x00ce }
                if (r1 == 0) goto L_0x003d
                monitor-exit(r0)
                return
            L_0x003d:
                okhttp3.internal.http2.ErrorCode r1 = r0.h()     // Catch:{ all -> 0x00ce }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0047
                r1 = r3
                goto L_0x0048
            L_0x0047:
                r1 = r2
            L_0x0048:
                kotlin.Unit r4 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00ce }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.o()
                boolean r0 = r0.f43147z
                if (r0 != 0) goto L_0x00b4
                okio.Buffer r0 = r10.f43145A
                long r4 = r0.n0()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0063
                r0 = r3
                goto L_0x0064
            L_0x0063:
                r0 = r2
            L_0x0064:
                okhttp3.Headers r4 = r10.f43146B
                if (r4 == 0) goto L_0x008f
            L_0x0068:
                okio.Buffer r0 = r10.f43145A
                long r4 = r0.n0()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0076
                r10.a(r2)
                goto L_0x0068
            L_0x0076:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.g()
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                int r2 = r2.j()
                okhttp3.Headers r4 = r10.f43146B
                kotlin.jvm.internal.Intrinsics.f(r4)
                java.util.List r4 = okhttp3.internal.Util.P(r4)
                r0.j1(r2, r1, r4)
                goto L_0x00b4
            L_0x008f:
                if (r0 == 0) goto L_0x009f
            L_0x0091:
                okio.Buffer r0 = r10.f43145A
                long r0 = r0.n0()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00b4
                r10.a(r3)
                goto L_0x0091
            L_0x009f:
                if (r1 == 0) goto L_0x00b4
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r4 = r0.g()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r5 = r0.j()
                r7 = 0
                r8 = 0
                r6 = 1
                r4.b1(r5, r6, r7, r8)
            L_0x00b4:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                r10.C = r3     // Catch:{ all -> 0x00cb }
                kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00cb }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.g()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.b()
                return
            L_0x00cb:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00ce:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        public void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f42805h || !Thread.holdsLock(http2Stream)) {
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    http2Stream2.c();
                    Unit unit = Unit.f40552a;
                }
                while (this.f43145A.n0() > 0) {
                    a(false);
                    Http2Stream.this.g().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public Timeout u() {
            return Http2Stream.this.s();
        }
    }

    @Metadata
    public final class FramingSource implements Source {

        /* renamed from: A  reason: collision with root package name */
        public boolean f43148A;

        /* renamed from: B  reason: collision with root package name */
        public final Buffer f43149B = new Buffer();
        public final Buffer C = new Buffer();
        public Headers D;
        public boolean E;

        /* renamed from: z  reason: collision with root package name */
        public final long f43150z;

        public FramingSource(long j2, boolean z2) {
            this.f43150z = j2;
            this.f43148A = z2;
        }

        public final boolean a() {
            return this.E;
        }

        public final boolean b() {
            return this.f43148A;
        }

        public final void c(BufferedSource bufferedSource, long j2) {
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.i(bufferedSource, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f42805h || !Thread.holdsLock(http2Stream)) {
                long j3 = j2;
                while (j3 > 0) {
                    synchronized (Http2Stream.this) {
                        z2 = this.f43148A;
                        z3 = false;
                        z4 = this.C.n0() + j3 > this.f43150z;
                        Unit unit = Unit.f40552a;
                    }
                    if (z4) {
                        bufferedSource.skip(j3);
                        Http2Stream.this.f(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z2) {
                        bufferedSource.skip(j3);
                        return;
                    } else {
                        long o1 = bufferedSource.o1(this.f43149B, j3);
                        if (o1 != -1) {
                            j3 -= o1;
                            Http2Stream http2Stream2 = Http2Stream.this;
                            synchronized (http2Stream2) {
                                try {
                                    if (this.E) {
                                        this.f43149B.b();
                                    } else {
                                        if (this.C.n0() == 0) {
                                            z3 = true;
                                        }
                                        this.C.P0(this.f43149B);
                                        if (z3) {
                                            Intrinsics.g(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                            http2Stream2.notifyAll();
                                        }
                                    }
                                } finally {
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                g(j2);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public void close() {
            long n0;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.E = true;
                n0 = this.C.n0();
                this.C.b();
                Intrinsics.g(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                Unit unit = Unit.f40552a;
            }
            if (n0 > 0) {
                g(n0);
            }
            Http2Stream.this.b();
        }

        public final void d(boolean z2) {
            this.f43148A = z2;
        }

        public final void f(Headers headers) {
            this.D = headers;
        }

        public final void g(long j2) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f42805h || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.g().W0(j2);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        /* JADX INFO: finally extract failed */
        public long o1(Buffer buffer, long j2) {
            Throwable th;
            boolean z2;
            long j3;
            Buffer buffer2 = buffer;
            long j4 = j2;
            Intrinsics.i(buffer2, "sink");
            long j5 = 0;
            if (j4 >= 0) {
                while (true) {
                    Http2Stream http2Stream = Http2Stream.this;
                    synchronized (http2Stream) {
                        http2Stream.m().x();
                        try {
                            if (http2Stream.h() == null || this.f43148A) {
                                th = null;
                            } else {
                                th = http2Stream.i();
                                if (th == null) {
                                    ErrorCode h2 = http2Stream.h();
                                    Intrinsics.f(h2);
                                    th = new StreamResetException(h2);
                                }
                            }
                            if (!this.E) {
                                z2 = false;
                                if (this.C.n0() > j5) {
                                    Buffer buffer3 = this.C;
                                    j3 = buffer3.o1(buffer2, Math.min(j4, buffer3.n0()));
                                    http2Stream.A(http2Stream.l() + j3);
                                    long l2 = http2Stream.l() - http2Stream.k();
                                    if (th == null && l2 >= ((long) (http2Stream.g().S().c() / 2))) {
                                        http2Stream.g().F1(http2Stream.j(), l2);
                                        http2Stream.z(http2Stream.l());
                                    }
                                } else {
                                    if (!this.f43148A && th == null) {
                                        http2Stream.D();
                                        z2 = true;
                                    }
                                    j3 = -1;
                                }
                                http2Stream.m().E();
                                Unit unit = Unit.f40552a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            http2Stream.m().E();
                            throw th2;
                        }
                    }
                    if (z2) {
                        j5 = 0;
                    } else if (j3 != -1) {
                        return j3;
                    } else {
                        if (th == null) {
                            return -1;
                        }
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
        }

        public Timeout u() {
            return Http2Stream.this.m();
        }
    }

    @Metadata
    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public void D() {
            Http2Stream.this.f(ErrorCode.CANCEL);
            Http2Stream.this.g().G0();
        }

        public final void E() {
            if (y()) {
                throw z((IOException) null);
            }
        }

        public IOException z(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public Http2Stream(int i2, Http2Connection http2Connection, boolean z2, boolean z3, Headers headers) {
        Intrinsics.i(http2Connection, "connection");
        this.f43131a = i2;
        this.f43132b = http2Connection;
        this.f43136f = (long) http2Connection.T().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f43137g = arrayDeque;
        this.f43139i = new FramingSource((long) http2Connection.S().c(), z3);
        this.f43140j = new FramingSink(z2);
        if (headers != null) {
            if (!t()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void A(long j2) {
        this.f43133c = j2;
    }

    public final void B(long j2) {
        this.f43135e = j2;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized Headers C() {
        Object removeFirst;
        this.f43141k.x();
        while (this.f43137g.isEmpty() && this.f43143m == null) {
            try {
                D();
            } catch (Throwable th) {
                this.f43141k.E();
                throw th;
            }
        }
        this.f43141k.E();
        if (!this.f43137g.isEmpty()) {
            removeFirst = this.f43137g.removeFirst();
            Intrinsics.h(removeFirst, "headersQueue.removeFirst()");
        } else {
            Throwable th2 = this.f43144n;
            if (th2 == null) {
                ErrorCode errorCode = this.f43143m;
                Intrinsics.f(errorCode);
                th2 = new StreamResetException(errorCode);
            }
            throw th2;
        }
        return (Headers) removeFirst;
    }

    public final void D() {
        try {
            Intrinsics.g(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final Timeout E() {
        return this.f43142l;
    }

    public final void a(long j2) {
        this.f43136f += j2;
        if (j2 > 0) {
            Intrinsics.g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z2;
        boolean u2;
        if (!Util.f42805h || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (!this.f43139i.b() && this.f43139i.a()) {
                        if (!this.f43140j.c()) {
                            if (this.f43140j.b()) {
                            }
                        }
                        z2 = true;
                        u2 = u();
                        Unit unit = Unit.f40552a;
                    }
                    z2 = false;
                    u2 = u();
                    Unit unit2 = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                d(ErrorCode.CANCEL, (IOException) null);
            } else if (!u2) {
                this.f43132b.E0(this.f43131a);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    public final void c() {
        if (this.f43140j.b()) {
            throw new IOException("stream closed");
        } else if (this.f43140j.c()) {
            throw new IOException("stream finished");
        } else if (this.f43143m != null) {
            Throwable th = this.f43144n;
            if (th == null) {
                ErrorCode errorCode = this.f43143m;
                Intrinsics.f(errorCode);
                th = new StreamResetException(errorCode);
            }
            throw th;
        }
    }

    public final void d(ErrorCode errorCode, IOException iOException) {
        Intrinsics.i(errorCode, "rstStatusCode");
        if (e(errorCode, iOException)) {
            this.f43132b.w1(this.f43131a, errorCode);
        }
    }

    public final boolean e(ErrorCode errorCode, IOException iOException) {
        if (!Util.f42805h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f43143m != null) {
                    return false;
                }
                this.f43143m = errorCode;
                this.f43144n = iOException;
                Intrinsics.g(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                if (this.f43139i.b() && this.f43140j.c()) {
                    return false;
                }
                Unit unit = Unit.f40552a;
                this.f43132b.E0(this.f43131a);
                return true;
            }
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void f(ErrorCode errorCode) {
        Intrinsics.i(errorCode, "errorCode");
        if (e(errorCode, (IOException) null)) {
            this.f43132b.E1(this.f43131a, errorCode);
        }
    }

    public final Http2Connection g() {
        return this.f43132b;
    }

    public final synchronized ErrorCode h() {
        return this.f43143m;
    }

    public final IOException i() {
        return this.f43144n;
    }

    public final int j() {
        return this.f43131a;
    }

    public final long k() {
        return this.f43134d;
    }

    public final long l() {
        return this.f43133c;
    }

    public final StreamTimeout m() {
        return this.f43141k;
    }

    public final Sink n() {
        synchronized (this) {
            try {
                if (!this.f43138h) {
                    if (!t()) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f43140j;
    }

    public final FramingSink o() {
        return this.f43140j;
    }

    public final FramingSource p() {
        return this.f43139i;
    }

    public final long q() {
        return this.f43136f;
    }

    public final long r() {
        return this.f43135e;
    }

    public final StreamTimeout s() {
        return this.f43142l;
    }

    public final boolean t() {
        return this.f43132b.H() == ((this.f43131a & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean u() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.f43143m     // Catch:{ all -> 0x0019 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.f43139i     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x001b
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.f43139i     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            goto L_0x001b
        L_0x0019:
            r0 = move-exception
            goto L_0x0034
        L_0x001b:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.f43140j     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002b
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.f43140j     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
        L_0x002b:
            boolean r0 = r2.f43138h     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            monitor-exit(r2)
            return r1
        L_0x0031:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0034:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.u():boolean");
    }

    public final Timeout v() {
        return this.f43141k;
    }

    public final void w(BufferedSource bufferedSource, int i2) {
        Intrinsics.i(bufferedSource, "source");
        if (!Util.f42805h || !Thread.holdsLock(this)) {
            this.f43139i.c(bufferedSource, (long) i2);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[Catch:{ all -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            boolean r0 = okhttp3.internal.Util.f42805h
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0037:
            monitor-enter(r2)
            boolean r0 = r2.f43138h     // Catch:{ all -> 0x0046 }
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.f43139i     // Catch:{ all -> 0x0046 }
            r0.f(r3)     // Catch:{ all -> 0x0046 }
            goto L_0x004f
        L_0x0046:
            r3 = move-exception
            goto L_0x006f
        L_0x0048:
            r2.f43138h = r1     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r0 = r2.f43137g     // Catch:{ all -> 0x0046 }
            r0.add(r3)     // Catch:{ all -> 0x0046 }
        L_0x004f:
            if (r4 == 0) goto L_0x0056
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.f43139i     // Catch:{ all -> 0x0046 }
            r3.d(r1)     // Catch:{ all -> 0x0046 }
        L_0x0056:
            boolean r3 = r2.u()     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.g(r2, r4)     // Catch:{ all -> 0x0046 }
            r2.notifyAll()     // Catch:{ all -> 0x0046 }
            kotlin.Unit r4 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006e
            okhttp3.internal.http2.Http2Connection r3 = r2.f43132b
            int r4 = r2.f43131a
            r3.E0(r4)
        L_0x006e:
            return
        L_0x006f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.x(okhttp3.Headers, boolean):void");
    }

    public final synchronized void y(ErrorCode errorCode) {
        Intrinsics.i(errorCode, "errorCode");
        if (this.f43143m == null) {
            this.f43143m = errorCode;
            Intrinsics.g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j2) {
        this.f43134d = j2;
    }
}
