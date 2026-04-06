package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.WebSocketReader;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

@Metadata
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* renamed from: y  reason: collision with root package name */
    public static final Companion f43253y = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public static final List f43254z = CollectionsKt.e(Protocol.HTTP_1_1);

    /* renamed from: a  reason: collision with root package name */
    public final WebSocketListener f43255a;

    /* renamed from: b  reason: collision with root package name */
    public final Random f43256b;

    /* renamed from: c  reason: collision with root package name */
    public final long f43257c;

    /* renamed from: d  reason: collision with root package name */
    public WebSocketExtensions f43258d;

    /* renamed from: e  reason: collision with root package name */
    public long f43259e;

    /* renamed from: f  reason: collision with root package name */
    public final String f43260f;

    /* renamed from: g  reason: collision with root package name */
    public Call f43261g;

    /* renamed from: h  reason: collision with root package name */
    public Task f43262h;

    /* renamed from: i  reason: collision with root package name */
    public WebSocketReader f43263i;

    /* renamed from: j  reason: collision with root package name */
    public WebSocketWriter f43264j;

    /* renamed from: k  reason: collision with root package name */
    public TaskQueue f43265k;

    /* renamed from: l  reason: collision with root package name */
    public String f43266l;

    /* renamed from: m  reason: collision with root package name */
    public Streams f43267m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayDeque f43268n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayDeque f43269o;

    /* renamed from: p  reason: collision with root package name */
    public long f43270p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f43271q;

    /* renamed from: r  reason: collision with root package name */
    public int f43272r;

    /* renamed from: s  reason: collision with root package name */
    public String f43273s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f43274t;

    /* renamed from: u  reason: collision with root package name */
    public int f43275u;

    /* renamed from: v  reason: collision with root package name */
    public int f43276v;

    /* renamed from: w  reason: collision with root package name */
    public int f43277w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f43278x;

    @Metadata
    public static final class Close {

        /* renamed from: a  reason: collision with root package name */
        public final int f43282a;

        /* renamed from: b  reason: collision with root package name */
        public final ByteString f43283b;

        /* renamed from: c  reason: collision with root package name */
        public final long f43284c;

        public Close(int i2, ByteString byteString, long j2) {
            this.f43282a = i2;
            this.f43283b = byteString;
            this.f43284c = j2;
        }

        public final long a() {
            return this.f43284c;
        }

        public final int b() {
            return this.f43282a;
        }

        public final ByteString c() {
            return this.f43283b;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Message {

        /* renamed from: a  reason: collision with root package name */
        public final int f43285a;

        /* renamed from: b  reason: collision with root package name */
        public final ByteString f43286b;

        public final ByteString a() {
            return this.f43286b;
        }

        public final int b() {
            return this.f43285a;
        }
    }

    @Metadata
    public static abstract class Streams implements Closeable {

        /* renamed from: A  reason: collision with root package name */
        public final BufferedSource f43287A;

        /* renamed from: B  reason: collision with root package name */
        public final BufferedSink f43288B;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f43289z;

        public Streams(boolean z2, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            Intrinsics.i(bufferedSource, "source");
            Intrinsics.i(bufferedSink, "sink");
            this.f43289z = z2;
            this.f43287A = bufferedSource;
            this.f43288B = bufferedSink;
        }

        public final boolean a() {
            return this.f43289z;
        }

        public final BufferedSink b() {
            return this.f43288B;
        }

        public final BufferedSource c() {
            return this.f43287A;
        }
    }

    @Metadata
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.f43266l + " writer", false, 2, (DefaultConstructorMarker) null);
        }

        public long f() {
            try {
                return RealWebSocket.this.t() ? 0 : -1;
            } catch (IOException e2) {
                RealWebSocket.this.n(e2, (Response) null);
                return -1;
            }
        }
    }

    public void a(ByteString byteString) {
        Intrinsics.i(byteString, "bytes");
        this.f43255a.e(this, byteString);
    }

    public void b(String str) {
        Intrinsics.i(str, "text");
        this.f43255a.d(this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)     // Catch:{ all -> 0x0017 }
            boolean r0 = r1.f43274t     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0029
            boolean r0 = r1.f43271q     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0019
            java.util.ArrayDeque r0 = r1.f43269o     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0019
            goto L_0x0029
        L_0x0017:
            r2 = move-exception
            goto L_0x002b
        L_0x0019:
            java.util.ArrayDeque r0 = r1.f43268n     // Catch:{ all -> 0x0017 }
            r0.add(r2)     // Catch:{ all -> 0x0017 }
            r1.s()     // Catch:{ all -> 0x0017 }
            int r2 = r1.f43276v     // Catch:{ all -> 0x0017 }
            int r2 = r2 + 1
            r1.f43276v = r2     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            return
        L_0x0029:
            monitor-exit(r1)
            return
        L_0x002b:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.c(okio.ByteString):void");
    }

    public synchronized void d(ByteString byteString) {
        Intrinsics.i(byteString, "payload");
        this.f43277w++;
        this.f43278x = false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [okhttp3.internal.ws.WebSocketWriter, okhttp3.internal.ws.WebSocketReader, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            r0 = -1
            if (r5 == r0) goto L_0x0071
            monitor-enter(r4)
            int r1 = r4.f43272r     // Catch:{ all -> 0x0031 }
            if (r1 != r0) goto L_0x0067
            r4.f43272r = r5     // Catch:{ all -> 0x0031 }
            r4.f43273s = r6     // Catch:{ all -> 0x0031 }
            boolean r0 = r4.f43271q     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0033
            java.util.ArrayDeque r0 = r4.f43269o     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.f43267m     // Catch:{ all -> 0x0031 }
            r4.f43267m = r1     // Catch:{ all -> 0x0031 }
            okhttp3.internal.ws.WebSocketReader r2 = r4.f43263i     // Catch:{ all -> 0x0031 }
            r4.f43263i = r1     // Catch:{ all -> 0x0031 }
            okhttp3.internal.ws.WebSocketWriter r3 = r4.f43264j     // Catch:{ all -> 0x0031 }
            r4.f43264j = r1     // Catch:{ all -> 0x0031 }
            okhttp3.internal.concurrent.TaskQueue r1 = r4.f43265k     // Catch:{ all -> 0x0031 }
            r1.n()     // Catch:{ all -> 0x0031 }
            r1 = r0
            goto L_0x0035
        L_0x0031:
            r5 = move-exception
            goto L_0x006f
        L_0x0033:
            r2 = r1
            r3 = r2
        L_0x0035:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0031 }
            monitor-exit(r4)
            okhttp3.WebSocketListener r0 = r4.f43255a     // Catch:{ all -> 0x0045 }
            r0.b(r4, r5, r6)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0047
            okhttp3.WebSocketListener r0 = r4.f43255a     // Catch:{ all -> 0x0045 }
            r0.a(r4, r5, r6)     // Catch:{ all -> 0x0045 }
            goto L_0x0047
        L_0x0045:
            r5 = move-exception
            goto L_0x0057
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            okhttp3.internal.Util.m(r1)
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            okhttp3.internal.Util.m(r2)
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            okhttp3.internal.Util.m(r3)
        L_0x0056:
            return
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            okhttp3.internal.Util.m(r1)
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            okhttp3.internal.Util.m(r2)
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            okhttp3.internal.Util.m(r3)
        L_0x0066:
            throw r5
        L_0x0067:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0031 }
            r6.<init>(r5)     // Catch:{ all -> 0x0031 }
            throw r6     // Catch:{ all -> 0x0031 }
        L_0x006f:
            monitor-exit(r4)
            throw r5
        L_0x0071:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.e(int, java.lang.String):void");
    }

    public void j() {
        Call call = this.f43261g;
        Intrinsics.f(call);
        call.cancel();
    }

    public final void k(Response response, Exchange exchange) {
        Intrinsics.i(response, "response");
        if (response.f() == 101) {
            String l2 = Response.l(response, "Connection", (String) null, 2, (Object) null);
            if (StringsKt.B("Upgrade", l2, true)) {
                String l3 = Response.l(response, "Upgrade", (String) null, 2, (Object) null);
                if (StringsKt.B("websocket", l3, true)) {
                    String l4 = Response.l(response, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    ByteString.Companion companion = ByteString.C;
                    String d2 = companion.d(this.f43260f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").I().d();
                    if (!Intrinsics.d(d2, l4)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + d2 + "' but was '" + l4 + '\'');
                    } else if (exchange == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + l3 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + l2 + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.f() + ' ' + response.t() + '\'');
        }
    }

    public boolean l(int i2, String str) {
        return m(i2, str, 60000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m(int r6, java.lang.String r7, long r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.f43300a     // Catch:{ all -> 0x0035 }
            r0.c(r6)     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x0037
            okio.ByteString$Companion r0 = okio.ByteString.C     // Catch:{ all -> 0x0035 }
            okio.ByteString r0 = r0.d(r7)     // Catch:{ all -> 0x0035 }
            int r1 = r0.N()     // Catch:{ all -> 0x0035 }
            long r1 = (long) r1     // Catch:{ all -> 0x0035 }
            r3 = 123(0x7b, double:6.1E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0035 }
            r6.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r8 = "reason.size() > 123: "
            r6.append(r8)     // Catch:{ all -> 0x0035 }
            r6.append(r7)     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0035 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0035 }
            r7.<init>(r6)     // Catch:{ all -> 0x0035 }
            throw r7     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r6 = move-exception
            goto L_0x0056
        L_0x0037:
            r0 = 0
        L_0x0038:
            boolean r7 = r5.f43274t     // Catch:{ all -> 0x0035 }
            if (r7 != 0) goto L_0x0053
            boolean r7 = r5.f43271q     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            r7 = 1
            r5.f43271q = r7     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque r1 = r5.f43269o     // Catch:{ all -> 0x0035 }
            okhttp3.internal.ws.RealWebSocket$Close r2 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch:{ all -> 0x0035 }
            r2.<init>(r6, r0, r8)     // Catch:{ all -> 0x0035 }
            r1.add(r2)     // Catch:{ all -> 0x0035 }
            r5.s()     // Catch:{ all -> 0x0035 }
            monitor-exit(r5)
            return r7
        L_0x0053:
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x0056:
            monitor-exit(r5)     // Catch:{ all -> 0x0035 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.m(int, java.lang.String, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.f43255a.c(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        okhttp3.internal.Util.m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r2 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        okhttp3.internal.Util.m(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r3 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        okhttp3.internal.Util.m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.lang.Exception r5, okhttp3.Response r6) {
        /*
            r4 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.f43274t     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return
        L_0x000c:
            r0 = 1
            r4.f43274t = r0     // Catch:{ all -> 0x004a }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.f43267m     // Catch:{ all -> 0x004a }
            r1 = 0
            r4.f43267m = r1     // Catch:{ all -> 0x004a }
            okhttp3.internal.ws.WebSocketReader r2 = r4.f43263i     // Catch:{ all -> 0x004a }
            r4.f43263i = r1     // Catch:{ all -> 0x004a }
            okhttp3.internal.ws.WebSocketWriter r3 = r4.f43264j     // Catch:{ all -> 0x004a }
            r4.f43264j = r1     // Catch:{ all -> 0x004a }
            okhttp3.internal.concurrent.TaskQueue r1 = r4.f43265k     // Catch:{ all -> 0x004a }
            r1.n()     // Catch:{ all -> 0x004a }
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x004a }
            monitor-exit(r4)
            okhttp3.WebSocketListener r1 = r4.f43255a     // Catch:{ all -> 0x0039 }
            r1.c(r4, r5, r6)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x002e
            okhttp3.internal.Util.m(r0)
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            okhttp3.internal.Util.m(r2)
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            okhttp3.internal.Util.m(r3)
        L_0x0038:
            return
        L_0x0039:
            r5 = move-exception
            if (r0 == 0) goto L_0x003f
            okhttp3.internal.Util.m(r0)
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            okhttp3.internal.Util.m(r2)
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            okhttp3.internal.Util.m(r3)
        L_0x0049:
            throw r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.n(java.lang.Exception, okhttp3.Response):void");
    }

    public final WebSocketListener o() {
        return this.f43255a;
    }

    public final void p(String str, Streams streams) {
        Intrinsics.i(str, "name");
        Intrinsics.i(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.f43258d;
        Intrinsics.f(webSocketExtensions);
        synchronized (this) {
            try {
                this.f43266l = str;
                this.f43267m = streams;
                this.f43264j = new WebSocketWriter(streams.a(), streams.b(), this.f43256b, webSocketExtensions.f43294a, webSocketExtensions.a(streams.a()), this.f43259e);
                this.f43262h = new WriterTask();
                long j2 = this.f43257c;
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                    TaskQueue taskQueue = this.f43265k;
                    taskQueue.i(new RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1(str + " ping", this, nanos), nanos);
                }
                if (!this.f43269o.isEmpty()) {
                    s();
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f43263i = new WebSocketReader(streams.a(), streams.c(), this, webSocketExtensions.f43294a, webSocketExtensions.a(!streams.a()));
    }

    public final boolean q(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.f43299f && webSocketExtensions.f43295b == null) {
            return webSocketExtensions.f43297d == null || new IntRange(8, 15).u(webSocketExtensions.f43297d.intValue());
        }
        return false;
    }

    public final void r() {
        while (this.f43272r == -1) {
            WebSocketReader webSocketReader = this.f43263i;
            Intrinsics.f(webSocketReader);
            webSocketReader.a();
        }
    }

    public final void s() {
        if (!Util.f42805h || Thread.holdsLock(this)) {
            Task task = this.f43262h;
            if (task != null) {
                TaskQueue.j(this.f43265k, task, 0, 2, (Object) null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r2 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        kotlin.jvm.internal.Intrinsics.f(r0);
        r0.f((okio.ByteString) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if ((r4 instanceof okhttp3.internal.ws.RealWebSocket.Message) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        r4 = (okhttp3.internal.ws.RealWebSocket.Message) r4;
        kotlin.jvm.internal.Intrinsics.f(r0);
        r0.c(r4.b(), r4.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r12.f43270p -= (long) r4.a().N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if ((r4 instanceof okhttp3.internal.ws.RealWebSocket.Close) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        r4 = (okhttp3.internal.ws.RealWebSocket.Close) r4;
        kotlin.jvm.internal.Intrinsics.f(r0);
        r0.a(r4.b(), r4.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r5 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r0 = r12.f43255a;
        kotlin.jvm.internal.Intrinsics.f(r7);
        r0.a(r12, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        if (r5 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        okhttp3.internal.Util.m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        if (r8 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        okhttp3.internal.Util.m(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r9 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        okhttp3.internal.Util.m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e3, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
        if (r5 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        okhttp3.internal.Util.m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        if (r8 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        okhttp3.internal.Util.m(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (r9 != null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f0, code lost:
        okhttp3.internal.Util.m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f3, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t() {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f43274t     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)
            return r1
        L_0x0008:
            okhttp3.internal.ws.WebSocketWriter r0 = r12.f43264j     // Catch:{ all -> 0x0038 }
            java.util.ArrayDeque r2 = r12.f43268n     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0038 }
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 != 0) goto L_0x0073
            java.util.ArrayDeque r6 = r12.f43269o     // Catch:{ all -> 0x0038 }
            java.lang.Object r6 = r6.poll()     // Catch:{ all -> 0x0038 }
            boolean r7 = r6 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch:{ all -> 0x0038 }
            if (r7 == 0) goto L_0x0069
            int r1 = r12.f43272r     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = r12.f43273s     // Catch:{ all -> 0x0038 }
            if (r1 == r5) goto L_0x003b
            okhttp3.internal.ws.RealWebSocket$Streams r5 = r12.f43267m     // Catch:{ all -> 0x0038 }
            r12.f43267m = r4     // Catch:{ all -> 0x0038 }
            okhttp3.internal.ws.WebSocketReader r8 = r12.f43263i     // Catch:{ all -> 0x0038 }
            r12.f43263i = r4     // Catch:{ all -> 0x0038 }
            okhttp3.internal.ws.WebSocketWriter r9 = r12.f43264j     // Catch:{ all -> 0x0038 }
            r12.f43264j = r4     // Catch:{ all -> 0x0038 }
            okhttp3.internal.concurrent.TaskQueue r4 = r12.f43265k     // Catch:{ all -> 0x0038 }
            r4.n()     // Catch:{ all -> 0x0038 }
        L_0x0036:
            r4 = r6
            goto L_0x0078
        L_0x0038:
            r0 = move-exception
            goto L_0x00f4
        L_0x003b:
            r5 = r6
            okhttp3.internal.ws.RealWebSocket$Close r5 = (okhttp3.internal.ws.RealWebSocket.Close) r5     // Catch:{ all -> 0x0038 }
            long r8 = r5.a()     // Catch:{ all -> 0x0038 }
            okhttp3.internal.concurrent.TaskQueue r5 = r12.f43265k     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r10.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.String r11 = r12.f43266l     // Catch:{ all -> 0x0038 }
            r10.append(r11)     // Catch:{ all -> 0x0038 }
            java.lang.String r11 = " cancel"
            r10.append(r11)     // Catch:{ all -> 0x0038 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0038 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0038 }
            long r8 = r11.toNanos(r8)     // Catch:{ all -> 0x0038 }
            okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1 r11 = new okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1     // Catch:{ all -> 0x0038 }
            r11.<init>(r10, r3, r12)     // Catch:{ all -> 0x0038 }
            r5.i(r11, r8)     // Catch:{ all -> 0x0038 }
            r5 = r4
            r8 = r5
            r9 = r8
            goto L_0x0036
        L_0x0069:
            if (r6 != 0) goto L_0x006d
            monitor-exit(r12)
            return r1
        L_0x006d:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
            goto L_0x0036
        L_0x0073:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
        L_0x0078:
            kotlin.Unit r6 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0038 }
            monitor-exit(r12)
            if (r2 == 0) goto L_0x0088
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ all -> 0x0086 }
            okio.ByteString r2 = (okio.ByteString) r2     // Catch:{ all -> 0x0086 }
            r0.f(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x00ce
        L_0x0086:
            r0 = move-exception
            goto L_0x00e4
        L_0x0088:
            boolean r2 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x00b0
            okhttp3.internal.ws.RealWebSocket$Message r4 = (okhttp3.internal.ws.RealWebSocket.Message) r4     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ all -> 0x0086 }
            int r1 = r4.b()     // Catch:{ all -> 0x0086 }
            okio.ByteString r2 = r4.a()     // Catch:{ all -> 0x0086 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0086 }
            monitor-enter(r12)     // Catch:{ all -> 0x0086 }
            long r0 = r12.f43270p     // Catch:{ all -> 0x00ad }
            okio.ByteString r2 = r4.a()     // Catch:{ all -> 0x00ad }
            int r2 = r2.N()     // Catch:{ all -> 0x00ad }
            long r6 = (long) r2     // Catch:{ all -> 0x00ad }
            long r0 = r0 - r6
            r12.f43270p = r0     // Catch:{ all -> 0x00ad }
            monitor-exit(r12)     // Catch:{ all -> 0x0086 }
            goto L_0x00ce
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x00b0:
            boolean r2 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x00de
            okhttp3.internal.ws.RealWebSocket$Close r4 = (okhttp3.internal.ws.RealWebSocket.Close) r4     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ all -> 0x0086 }
            int r2 = r4.b()     // Catch:{ all -> 0x0086 }
            okio.ByteString r4 = r4.c()     // Catch:{ all -> 0x0086 }
            r0.a(r2, r4)     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x00ce
            okhttp3.WebSocketListener r0 = r12.f43255a     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.Intrinsics.f(r7)     // Catch:{ all -> 0x0086 }
            r0.a(r12, r1, r7)     // Catch:{ all -> 0x0086 }
        L_0x00ce:
            if (r5 == 0) goto L_0x00d3
            okhttp3.internal.Util.m(r5)
        L_0x00d3:
            if (r8 == 0) goto L_0x00d8
            okhttp3.internal.Util.m(r8)
        L_0x00d8:
            if (r9 == 0) goto L_0x00dd
            okhttp3.internal.Util.m(r9)
        L_0x00dd:
            return r3
        L_0x00de:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0086 }
            r0.<init>()     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x00e4:
            if (r5 == 0) goto L_0x00e9
            okhttp3.internal.Util.m(r5)
        L_0x00e9:
            if (r8 == 0) goto L_0x00ee
            okhttp3.internal.Util.m(r8)
        L_0x00ee:
            if (r9 == 0) goto L_0x00f3
            okhttp3.internal.Util.m(r9)
        L_0x00f3:
            throw r0
        L_0x00f4:
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.t():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0024, code lost:
        if (r1 == -1) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        n(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.f43257c + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.d(okio.ByteString.D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        n(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f43274t     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.f43264j     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r1 = r7.f43278x     // Catch:{ all -> 0x0015 }
            r2 = -1
            if (r1 == 0) goto L_0x0017
            int r1 = r7.f43275u     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r0 = move-exception
            goto L_0x005b
        L_0x0017:
            r1 = r2
        L_0x0018:
            int r3 = r7.f43275u     // Catch:{ all -> 0x0015 }
            r4 = 1
            int r3 = r3 + r4
            r7.f43275u = r3     // Catch:{ all -> 0x0015 }
            r7.f43278x = r4     // Catch:{ all -> 0x0015 }
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0015 }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x0050
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.f43257c
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.n(r0, r3)
            return
        L_0x0050:
            okio.ByteString r1 = okio.ByteString.D     // Catch:{ IOException -> 0x0056 }
            r0.d(r1)     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            r7.n(r0, r3)
        L_0x005a:
            return
        L_0x005b:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.u():void");
    }
}
