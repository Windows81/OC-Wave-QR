package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

@Metadata
public final class Http2Connection implements Closeable {
    public static final Companion b0 = new Companion((DefaultConstructorMarker) null);
    public static final Settings c0;

    /* renamed from: A  reason: collision with root package name */
    public final Listener f43065A;

    /* renamed from: B  reason: collision with root package name */
    public final Map f43066B = new LinkedHashMap();
    public final String C;
    public int D;
    public int E;
    public boolean F;
    public final TaskRunner G;
    public final TaskQueue H;
    public final TaskQueue I;
    public final TaskQueue J;
    public final PushObserver K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public final Settings R;
    public Settings S;
    public long T;
    public long U;
    public long V;
    public long W;
    public final Socket X;
    public final Http2Writer Y;
    public final ReaderRunnable Z;
    public final Set a0;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f43067z;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f43102a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskRunner f43103b;

        /* renamed from: c  reason: collision with root package name */
        public Socket f43104c;

        /* renamed from: d  reason: collision with root package name */
        public String f43105d;

        /* renamed from: e  reason: collision with root package name */
        public BufferedSource f43106e;

        /* renamed from: f  reason: collision with root package name */
        public BufferedSink f43107f;

        /* renamed from: g  reason: collision with root package name */
        public Listener f43108g = Listener.f43112b;

        /* renamed from: h  reason: collision with root package name */
        public PushObserver f43109h = PushObserver.f43163b;

        /* renamed from: i  reason: collision with root package name */
        public int f43110i;

        public Builder(boolean z2, TaskRunner taskRunner) {
            Intrinsics.i(taskRunner, "taskRunner");
            this.f43102a = z2;
            this.f43103b = taskRunner;
        }

        public final Http2Connection a() {
            return new Http2Connection(this);
        }

        public final boolean b() {
            return this.f43102a;
        }

        public final String c() {
            String str = this.f43105d;
            if (str != null) {
                return str;
            }
            Intrinsics.y("connectionName");
            return null;
        }

        public final Listener d() {
            return this.f43108g;
        }

        public final int e() {
            return this.f43110i;
        }

        public final PushObserver f() {
            return this.f43109h;
        }

        public final BufferedSink g() {
            BufferedSink bufferedSink = this.f43107f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.y("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f43104c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.y("socket");
            return null;
        }

        public final BufferedSource i() {
            BufferedSource bufferedSource = this.f43106e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.y("source");
            return null;
        }

        public final TaskRunner j() {
            return this.f43103b;
        }

        public final Builder k(Listener listener) {
            Intrinsics.i(listener, "listener");
            this.f43108g = listener;
            return this;
        }

        public final Builder l(int i2) {
            this.f43110i = i2;
            return this;
        }

        public final void m(String str) {
            Intrinsics.i(str, "<set-?>");
            this.f43105d = str;
        }

        public final void n(BufferedSink bufferedSink) {
            Intrinsics.i(bufferedSink, "<set-?>");
            this.f43107f = bufferedSink;
        }

        public final void o(Socket socket) {
            Intrinsics.i(socket, "<set-?>");
            this.f43104c = socket;
        }

        public final void p(BufferedSource bufferedSource) {
            Intrinsics.i(bufferedSource, "<set-?>");
            this.f43106e = bufferedSource;
        }

        public final Builder q(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            String str2;
            Intrinsics.i(socket, "socket");
            Intrinsics.i(str, "peerName");
            Intrinsics.i(bufferedSource, "source");
            Intrinsics.i(bufferedSink, "sink");
            o(socket);
            if (this.f43102a) {
                str2 = Util.f42806i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            m(str2);
            p(bufferedSource);
            n(bufferedSink);
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Settings a() {
            return Http2Connection.c0;
        }

        public Companion() {
        }
    }

    @Metadata
    public static abstract class Listener {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f43111a = new Companion((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        public static final Listener f43112b = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public void b(Http2Connection http2Connection, Settings settings) {
            Intrinsics.i(http2Connection, "connection");
            Intrinsics.i(settings, "settings");
        }

        public abstract void c(Http2Stream http2Stream);
    }

    @Metadata
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Http2Connection f43113A;

        /* renamed from: z  reason: collision with root package name */
        public final Http2Reader f43114z;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            Intrinsics.i(http2Reader, "reader");
            this.f43113A = http2Connection;
            this.f43114z = http2Reader;
        }

        public void b() {
        }

        public void c(boolean z2, Settings settings) {
            Intrinsics.i(settings, "settings");
            TaskQueue r2 = this.f43113A.H;
            r2.i(new Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(this.f43113A.I() + " applyAndAckSettings", true, this, z2, settings), 0);
        }

        public void e(boolean z2, int i2, int i3, List list) {
            Intrinsics.i(list, "headerBlock");
            if (this.f43113A.A0(i2)) {
                this.f43113A.s0(i2, list, z2);
                return;
            }
            Http2Connection http2Connection = this.f43113A;
            synchronized (http2Connection) {
                Http2Stream X = http2Connection.X(i2);
                if (X != null) {
                    Unit unit = Unit.f40552a;
                    X.x(Util.Q(list), z2);
                } else if (!http2Connection.F) {
                    if (i2 > http2Connection.N()) {
                        if (i2 % 2 != http2Connection.Q() % 2) {
                            Http2Stream http2Stream = new Http2Stream(i2, http2Connection, false, z2, Util.Q(list));
                            http2Connection.H0(i2);
                            http2Connection.c0().put(Integer.valueOf(i2), http2Stream);
                            TaskQueue i4 = http2Connection.G.i();
                            i4.i(new Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1(http2Connection.I() + '[' + i2 + "] onStream", true, http2Connection, http2Stream), 0);
                        }
                    }
                }
            }
        }

        public void f(int i2, long j2) {
            if (i2 == 0) {
                Http2Connection http2Connection = this.f43113A;
                synchronized (http2Connection) {
                    http2Connection.W = http2Connection.e0() + j2;
                    Intrinsics.g(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    Unit unit = Unit.f40552a;
                }
                return;
            }
            Http2Stream X = this.f43113A.X(i2);
            if (X != null) {
                synchronized (X) {
                    X.a(j2);
                    Unit unit2 = Unit.f40552a;
                }
            }
        }

        public void g(boolean z2, int i2, BufferedSource bufferedSource, int i3) {
            Intrinsics.i(bufferedSource, "source");
            if (this.f43113A.A0(i2)) {
                this.f43113A.o0(i2, bufferedSource, i3, z2);
                return;
            }
            Http2Stream X = this.f43113A.X(i2);
            if (X == null) {
                this.f43113A.E1(i2, ErrorCode.PROTOCOL_ERROR);
                long j2 = (long) i3;
                this.f43113A.W0(j2);
                bufferedSource.skip(j2);
                return;
            }
            X.w(bufferedSource, i3);
            if (z2) {
                X.x(Util.f42799b, true);
            }
        }

        public void h(boolean z2, int i2, int i3) {
            if (z2) {
                Http2Connection http2Connection = this.f43113A;
                synchronized (http2Connection) {
                    if (i2 == 1) {
                        http2Connection.M = http2Connection.M + 1;
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            http2Connection.P = http2Connection.P + 1;
                            Intrinsics.g(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection.notifyAll();
                        }
                        try {
                            Unit unit = Unit.f40552a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        http2Connection.O = http2Connection.O + 1;
                    }
                }
                return;
            }
            TaskQueue r2 = this.f43113A.H;
            r2.i(new Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1(this.f43113A.I() + " ping", true, this.f43113A, i2, i3), 0);
        }

        public void i(int i2, int i3, int i4, boolean z2) {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return Unit.f40552a;
        }

        public void k(int i2, ErrorCode errorCode) {
            Intrinsics.i(errorCode, "errorCode");
            if (this.f43113A.A0(i2)) {
                this.f43113A.w0(i2, errorCode);
                return;
            }
            Http2Stream E0 = this.f43113A.E0(i2);
            if (E0 != null) {
                E0.y(errorCode);
            }
        }

        public void p(int i2, int i3, List list) {
            Intrinsics.i(list, "requestHeaders");
            this.f43113A.t0(i3, list);
        }

        public void q(int i2, ErrorCode errorCode, ByteString byteString) {
            int i3;
            Object[] array;
            Intrinsics.i(errorCode, "errorCode");
            Intrinsics.i(byteString, "debugData");
            byteString.N();
            Http2Connection http2Connection = this.f43113A;
            synchronized (http2Connection) {
                array = http2Connection.c0().values().toArray(new Http2Stream[0]);
                http2Connection.F = true;
                Unit unit = Unit.f40552a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.j() > i2 && http2Stream.t()) {
                    http2Stream.y(ErrorCode.REFUSED_STREAM);
                    this.f43113A.E0(http2Stream.j());
                }
            }
        }

        public final void s(boolean z2, Settings settings) {
            long c2;
            int i2;
            Http2Stream[] http2StreamArr;
            Intrinsics.i(settings, "settings");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Http2Writer f0 = this.f43113A.f0();
            Http2Connection http2Connection = this.f43113A;
            synchronized (f0) {
                synchronized (http2Connection) {
                    try {
                        Settings T = http2Connection.T();
                        if (!z2) {
                            Settings settings2 = new Settings();
                            settings2.g(T);
                            settings2.g(settings);
                            settings = settings2;
                        }
                        objectRef.f40908z = settings;
                        c2 = ((long) settings.c()) - ((long) T.c());
                        if (c2 != 0) {
                            if (!http2Connection.c0().isEmpty()) {
                                http2StreamArr = (Http2Stream[]) http2Connection.c0().values().toArray(new Http2Stream[0]);
                                http2Connection.J0((Settings) objectRef.f40908z);
                                http2Connection.J.i(new Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1(http2Connection.I() + " onSettings", true, http2Connection, objectRef), 0);
                                Unit unit = Unit.f40552a;
                            }
                        }
                        http2StreamArr = null;
                        http2Connection.J0((Settings) objectRef.f40908z);
                        http2Connection.J.i(new Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1(http2Connection.I() + " onSettings", true, http2Connection, objectRef), 0);
                        Unit unit2 = Unit.f40552a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.f0().a((Settings) objectRef.f40908z);
                } catch (IOException e2) {
                    http2Connection.G(e2);
                }
                Unit unit3 = Unit.f40552a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.a(c2);
                        Unit unit4 = Unit.f40552a;
                    }
                }
            }
        }

        public void t() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.f43114z.c(this);
                do {
                } while (this.f43114z.b(false, this));
                errorCode = ErrorCode.NO_ERROR;
                try {
                    this.f43113A.F(errorCode, ErrorCode.CANCEL, (IOException) null);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        this.f43113A.F(errorCode3, errorCode3, e);
                        Util.m(this.f43114z);
                    } catch (Throwable th) {
                        th = th;
                        this.f43113A.F(errorCode, errorCode2, e);
                        Util.m(this.f43114z);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                errorCode = errorCode2;
                ErrorCode errorCode32 = ErrorCode.PROTOCOL_ERROR;
                this.f43113A.F(errorCode32, errorCode32, e);
                Util.m(this.f43114z);
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.f43113A.F(errorCode, errorCode2, e);
                Util.m(this.f43114z);
                throw th;
            }
            Util.m(this.f43114z);
        }
    }

    static {
        Settings settings = new Settings();
        settings.h(7, 65535);
        settings.h(5, 16384);
        c0 = settings;
    }

    public Http2Connection(Builder builder) {
        Intrinsics.i(builder, "builder");
        boolean b2 = builder.b();
        this.f43067z = b2;
        this.f43065A = builder.d();
        String c2 = builder.c();
        this.C = c2;
        this.E = builder.b() ? 3 : 2;
        TaskRunner j2 = builder.j();
        this.G = j2;
        TaskQueue i2 = j2.i();
        this.H = i2;
        this.I = j2.i();
        this.J = j2.i();
        this.K = builder.f();
        Settings settings = new Settings();
        if (builder.b()) {
            settings.h(7, 16777216);
        }
        this.R = settings;
        Settings settings2 = c0;
        this.S = settings2;
        this.W = (long) settings2.c();
        this.X = builder.h();
        this.Y = new Http2Writer(builder.g(), b2);
        this.Z = new ReaderRunnable(this, new Http2Reader(builder.i(), b2));
        this.a0 = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) builder.e());
            i2.i(new Http2Connection$special$$inlined$schedule$1(c2 + " ping", this, nanos), nanos);
        }
    }

    public static /* synthetic */ void U0(Http2Connection http2Connection, boolean z2, TaskRunner taskRunner, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            taskRunner = TaskRunner.f42891i;
        }
        http2Connection.S0(z2, taskRunner);
    }

    public final boolean A0(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized Http2Stream E0(int i2) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f43066B.remove(Integer.valueOf(i2));
        Intrinsics.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2Stream;
    }

    public final void E1(int i2, ErrorCode errorCode) {
        Intrinsics.i(errorCode, "errorCode");
        TaskQueue taskQueue = this.H;
        taskQueue.i(new Http2Connection$writeSynResetLater$$inlined$execute$default$1(this.C + '[' + i2 + "] writeSynReset", true, this, i2, errorCode), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:(2:6|7)|3f|19|(2:21|(5:23|24|25|37|26))|28|29|30|31|32|34) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            boolean r0 = okhttp3.internal.Util.f42805h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x003c
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x003c:
            r3.L0(r4)     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            monitor-enter(r3)
            java.util.Map r4 = r3.f43066B     // Catch:{ all -> 0x005b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x005b }
            r0 = 0
            if (r4 != 0) goto L_0x005d
            java.util.Map r4 = r3.f43066B     // Catch:{ all -> 0x005b }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x005b }
            okhttp3.internal.http2.Http2Stream[] r1 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch:{ all -> 0x005b }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x005b }
            java.util.Map r1 = r3.f43066B     // Catch:{ all -> 0x005b }
            r1.clear()     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r4 = move-exception
            goto L_0x008a
        L_0x005d:
            r4 = 0
        L_0x005e:
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4
            if (r4 == 0) goto L_0x0070
            int r1 = r4.length
        L_0x0066:
            if (r0 >= r1) goto L_0x0070
            r2 = r4[r0]
            r2.d(r5, r6)     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            int r0 = r0 + 1
            goto L_0x0066
        L_0x0070:
            okhttp3.internal.http2.Http2Writer r4 = r3.Y     // Catch:{ IOException -> 0x0075 }
            r4.close()     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            java.net.Socket r4 = r3.X     // Catch:{ IOException -> 0x007a }
            r4.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            okhttp3.internal.concurrent.TaskQueue r4 = r3.H
            r4.n()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.I
            r4.n()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.J
            r4.n()
            return
        L_0x008a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.F(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    public final void F1(int i2, long j2) {
        TaskQueue taskQueue = this.H;
        taskQueue.i(new Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(this.C + '[' + i2 + "] windowUpdate", true, this, i2, j2), 0);
    }

    public final void G(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        F(errorCode, errorCode, iOException);
    }

    public final void G0() {
        synchronized (this) {
            long j2 = this.O;
            long j3 = this.N;
            if (j2 >= j3) {
                this.N = j3 + 1;
                this.Q = System.nanoTime() + ((long) 1000000000);
                Unit unit = Unit.f40552a;
                TaskQueue taskQueue = this.H;
                taskQueue.i(new Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(this.C + " ping", true, this), 0);
            }
        }
    }

    public final boolean H() {
        return this.f43067z;
    }

    public final void H0(int i2) {
        this.D = i2;
    }

    public final String I() {
        return this.C;
    }

    public final void J0(Settings settings) {
        Intrinsics.i(settings, "<set-?>");
        this.S = settings;
    }

    public final void L0(ErrorCode errorCode) {
        Intrinsics.i(errorCode, "statusCode");
        synchronized (this.Y) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (!this.F) {
                    this.F = true;
                    int i2 = this.D;
                    intRef.f40906z = i2;
                    Unit unit = Unit.f40552a;
                    this.Y.g(i2, errorCode, Util.f42798a);
                }
            }
        }
    }

    public final int N() {
        return this.D;
    }

    public final Listener O() {
        return this.f43065A;
    }

    public final int Q() {
        return this.E;
    }

    public final Settings S() {
        return this.R;
    }

    public final void S0(boolean z2, TaskRunner taskRunner) {
        Intrinsics.i(taskRunner, "taskRunner");
        if (z2) {
            this.Y.b();
            this.Y.t(this.R);
            int c2 = this.R.c();
            if (c2 != 65535) {
                this.Y.x(0, (long) (c2 - 65535));
            }
        }
        taskRunner.i().i(new TaskQueue$execute$1(this.C, true, this.Z), 0);
    }

    public final Settings T() {
        return this.S;
    }

    public final synchronized void W0(long j2) {
        long j3 = this.T + j2;
        this.T = j3;
        long j4 = j3 - this.U;
        if (j4 >= ((long) (this.R.c() / 2))) {
            F1(0, j4);
            this.U += j4;
        }
    }

    public final synchronized Http2Stream X(int i2) {
        return (Http2Stream) this.f43066B.get(Integer.valueOf(i2));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.Y.k());
        r6 = (long) r2;
        r8.V += r6;
        r4 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b1(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            okhttp3.internal.http2.Http2Writer r12 = r8.Y
            r12.c(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0071
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.V     // Catch:{ InterruptedException -> 0x0062 }
            long r6 = r8.W     // Catch:{ InterruptedException -> 0x0062 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0039
            java.util.Map r2 = r8.f43066B     // Catch:{ InterruptedException -> 0x0062 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0062 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0062 }
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.g(r8, r2)     // Catch:{ InterruptedException -> 0x0062 }
            r8.wait()     // Catch:{ InterruptedException -> 0x0062 }
            goto L_0x0012
        L_0x002f:
            r9 = move-exception
            goto L_0x006f
        L_0x0031:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0062 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0062 }
            throw r9     // Catch:{ InterruptedException -> 0x0062 }
        L_0x0039:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x002f }
            int r2 = (int) r4     // Catch:{ all -> 0x002f }
            okhttp3.internal.http2.Http2Writer r4 = r8.Y     // Catch:{ all -> 0x002f }
            int r4 = r4.k()     // Catch:{ all -> 0x002f }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x002f }
            long r4 = r8.V     // Catch:{ all -> 0x002f }
            long r6 = (long) r2     // Catch:{ all -> 0x002f }
            long r4 = r4 + r6
            r8.V = r4     // Catch:{ all -> 0x002f }
            kotlin.Unit r4 = kotlin.Unit.f40552a     // Catch:{ all -> 0x002f }
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.Y
            if (r10 == 0) goto L_0x005d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x005d
            r5 = 1
            goto L_0x005e
        L_0x005d:
            r5 = r3
        L_0x005e:
            r4.c(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0062:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002f }
            r9.interrupt()     // Catch:{ all -> 0x002f }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002f }
            r9.<init>()     // Catch:{ all -> 0x002f }
            throw r9     // Catch:{ all -> 0x002f }
        L_0x006f:
            monitor-exit(r8)
            throw r9
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.b1(int, boolean, okio.Buffer, long):void");
    }

    public final Map c0() {
        return this.f43066B;
    }

    public void close() {
        F(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    public final long e0() {
        return this.W;
    }

    public final Http2Writer f0() {
        return this.Y;
    }

    public final void flush() {
        this.Y.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean g0(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.F     // Catch:{ all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            long r2 = r6.O     // Catch:{ all -> 0x0018 }
            long r4 = r6.N     // Catch:{ all -> 0x0018 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            long r2 = r6.Q     // Catch:{ all -> 0x0018 }
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x001a
            monitor-exit(r6)
            return r1
        L_0x0018:
            r7 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x001d:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.g0(long):boolean");
    }

    public final void j1(int i2, boolean z2, List list) {
        Intrinsics.i(list, "alternating");
        this.Y.j(z2, i2, list);
    }

    public final Http2Stream m0(int i2, List list, boolean z2) {
        int i3;
        Http2Stream http2Stream;
        boolean z3 = true;
        boolean z4 = !z2;
        synchronized (this.Y) {
            try {
                synchronized (this) {
                    if (this.E > 1073741823) {
                        L0(ErrorCode.REFUSED_STREAM);
                    }
                    if (!this.F) {
                        i3 = this.E;
                        this.E = i3 + 2;
                        http2Stream = new Http2Stream(i3, this, z4, false, (Headers) null);
                        if (z2 && this.V < this.W) {
                            if (http2Stream.r() < http2Stream.q()) {
                                z3 = false;
                            }
                        }
                        if (http2Stream.u()) {
                            this.f43066B.put(Integer.valueOf(i3), http2Stream);
                        }
                        Unit unit = Unit.f40552a;
                    } else {
                        throw new ConnectionShutdownException();
                    }
                }
                if (i2 == 0) {
                    this.Y.j(z4, i3, list);
                } else if (!this.f43067z) {
                    this.Y.m(i2, i3, list);
                } else {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (z3) {
            this.Y.flush();
        }
        return http2Stream;
    }

    public final Http2Stream n0(List list, boolean z2) {
        Intrinsics.i(list, "requestHeaders");
        return m0(0, list, z2);
    }

    public final void o0(int i2, BufferedSource bufferedSource, int i3, boolean z2) {
        Intrinsics.i(bufferedSource, "source");
        Buffer buffer = new Buffer();
        long j2 = (long) i3;
        bufferedSource.v1(j2);
        bufferedSource.o1(buffer, j2);
        TaskQueue taskQueue = this.I;
        taskQueue.i(new Http2Connection$pushDataLater$$inlined$execute$default$1(this.C + '[' + i2 + "] onData", true, this, i2, buffer, i3, z2), 0);
    }

    public final void q1(boolean z2, int i2, int i3) {
        try {
            this.Y.l(z2, i2, i3);
        } catch (IOException e2) {
            G(e2);
        }
    }

    public final void s0(int i2, List list, boolean z2) {
        Intrinsics.i(list, "requestHeaders");
        TaskQueue taskQueue = this.I;
        taskQueue.i(new Http2Connection$pushHeadersLater$$inlined$execute$default$1(this.C + '[' + i2 + "] onHeaders", true, this, i2, list, z2), 0);
    }

    public final void t0(int i2, List list) {
        Intrinsics.i(list, "requestHeaders");
        synchronized (this) {
            if (this.a0.contains(Integer.valueOf(i2))) {
                E1(i2, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.a0.add(Integer.valueOf(i2));
            TaskQueue taskQueue = this.I;
            taskQueue.i(new Http2Connection$pushRequestLater$$inlined$execute$default$1(this.C + '[' + i2 + "] onRequest", true, this, i2, list), 0);
        }
    }

    public final void w0(int i2, ErrorCode errorCode) {
        Intrinsics.i(errorCode, "errorCode");
        TaskQueue taskQueue = this.I;
        taskQueue.i(new Http2Connection$pushResetLater$$inlined$execute$default$1(this.C + '[' + i2 + "] onReset", true, this, i2, errorCode), 0);
    }

    public final void w1(int i2, ErrorCode errorCode) {
        Intrinsics.i(errorCode, "statusCode");
        this.Y.r(i2, errorCode);
    }
}
