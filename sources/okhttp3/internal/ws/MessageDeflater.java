package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import okio.Buffer;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Sink;

@Metadata
public final class MessageDeflater implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public final Buffer f43246A;

    /* renamed from: B  reason: collision with root package name */
    public final Deflater f43247B;
    public final DeflaterSink C;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f43248z;

    public MessageDeflater(boolean z2) {
        this.f43248z = z2;
        Buffer buffer = new Buffer();
        this.f43246A = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.f43247B = deflater;
        this.C = new DeflaterSink((Sink) buffer, deflater);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        kotlin.io.CloseableKt.a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(okio.Buffer r6) {
        /*
            r5 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            okio.Buffer r0 = r5.f43246A
            long r0 = r0.n0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            boolean r0 = r5.f43248z
            if (r0 == 0) goto L_0x001a
            java.util.zip.Deflater r0 = r5.f43247B
            r0.reset()
        L_0x001a:
            okio.DeflaterSink r0 = r5.C
            long r1 = r6.n0()
            r0.N0(r6, r1)
            okio.DeflaterSink r0 = r5.C
            r0.flush()
            okio.Buffer r0 = r5.f43246A
            okio.ByteString r1 = okhttp3.internal.ws.MessageDeflaterKt.f43249a
            boolean r0 = r5.b(r0, r1)
            if (r0 == 0) goto L_0x0053
            okio.Buffer r0 = r5.f43246A
            long r0 = r0.n0()
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 - r2
            okio.Buffer r2 = r5.f43246A
            r3 = 1
            r4 = 0
            okio.Buffer$UnsafeCursor r2 = okio.Buffer.T(r2, r4, r3, r4)
            r2.c(r0)     // Catch:{ all -> 0x004c }
            kotlin.io.CloseableKt.a(r2, r4)
            goto L_0x0059
        L_0x004c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r2, r6)
            throw r0
        L_0x0053:
            okio.Buffer r0 = r5.f43246A
            r1 = 0
            r0.writeByte(r1)
        L_0x0059:
            okio.Buffer r0 = r5.f43246A
            long r1 = r0.n0()
            r6.N0(r0, r1)
            return
        L_0x0063:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.MessageDeflater.a(okio.Buffer):void");
    }

    public final boolean b(Buffer buffer, ByteString byteString) {
        return buffer.I(buffer.n0() - ((long) byteString.N()), byteString);
    }

    public void close() {
        this.C.close();
    }
}
