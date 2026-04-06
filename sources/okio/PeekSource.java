package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PeekSource implements Source {

    /* renamed from: A  reason: collision with root package name */
    public final Buffer f43407A;

    /* renamed from: B  reason: collision with root package name */
    public Segment f43408B;
    public int C;
    public boolean D;
    public long E;

    /* renamed from: z  reason: collision with root package name */
    public final BufferedSource f43409z;

    public PeekSource(BufferedSource bufferedSource) {
        Intrinsics.i(bufferedSource, "upstream");
        this.f43409z = bufferedSource;
        Buffer s2 = bufferedSource.s();
        this.f43407A = s2;
        Segment segment = s2.f43339z;
        this.f43408B = segment;
        this.C = segment != null ? segment.f43433b : -1;
    }

    public void close() {
        this.D = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r3 == r4.f43433b) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long o1(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0075
            boolean r3 = r8.D
            if (r3 != 0) goto L_0x006d
            okio.Segment r3 = r8.f43408B
            if (r3 == 0) goto L_0x002b
            okio.Buffer r4 = r8.f43407A
            okio.Segment r4 = r4.f43339z
            if (r3 != r4) goto L_0x0023
            int r3 = r8.C
            kotlin.jvm.internal.Intrinsics.f(r4)
            int r4 = r4.f43433b
            if (r3 != r4) goto L_0x0023
            goto L_0x002b
        L_0x0023:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L_0x002b:
            if (r2 != 0) goto L_0x002e
            return r0
        L_0x002e:
            okio.BufferedSource r0 = r8.f43409z
            long r1 = r8.E
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.V0(r1)
            if (r0 != 0) goto L_0x003e
            r9 = -1
            return r9
        L_0x003e:
            okio.Segment r0 = r8.f43408B
            if (r0 != 0) goto L_0x0051
            okio.Buffer r0 = r8.f43407A
            okio.Segment r0 = r0.f43339z
            if (r0 == 0) goto L_0x0051
            r8.f43408B = r0
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r0 = r0.f43433b
            r8.C = r0
        L_0x0051:
            okio.Buffer r0 = r8.f43407A
            long r0 = r0.n0()
            long r2 = r8.E
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.f43407A
            long r4 = r8.E
            r3 = r9
            r6 = r10
            r2.j(r3, r4, r6)
            long r0 = r8.E
            long r0 = r0 + r10
            r8.E = r0
            return r10
        L_0x006d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L_0x0075:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.o1(okio.Buffer, long):long");
    }

    public Timeout u() {
        return this.f43409z.u();
    }
}
