package okio;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Segment {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f43431h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f43432a;

    /* renamed from: b  reason: collision with root package name */
    public int f43433b;

    /* renamed from: c  reason: collision with root package name */
    public int f43434c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43435d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f43436e;

    /* renamed from: f  reason: collision with root package name */
    public Segment f43437f;

    /* renamed from: g  reason: collision with root package name */
    public Segment f43438g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public Segment() {
        this.f43432a = new byte[8192];
        this.f43436e = true;
        this.f43435d = false;
    }

    public final void a() {
        int i2;
        Segment segment = this.f43438g;
        if (segment != this) {
            Intrinsics.f(segment);
            if (segment.f43436e) {
                int i3 = this.f43434c - this.f43433b;
                Segment segment2 = this.f43438g;
                Intrinsics.f(segment2);
                int i4 = 8192 - segment2.f43434c;
                Segment segment3 = this.f43438g;
                Intrinsics.f(segment3);
                if (segment3.f43435d) {
                    i2 = 0;
                } else {
                    Segment segment4 = this.f43438g;
                    Intrinsics.f(segment4);
                    i2 = segment4.f43433b;
                }
                if (i3 <= i4 + i2) {
                    Segment segment5 = this.f43438g;
                    Intrinsics.f(segment5);
                    g(segment5, i3);
                    b();
                    SegmentPool.b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact");
    }

    public final Segment b() {
        Segment segment = this.f43437f;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.f43438g;
        Intrinsics.f(segment2);
        segment2.f43437f = this.f43437f;
        Segment segment3 = this.f43437f;
        Intrinsics.f(segment3);
        segment3.f43438g = this.f43438g;
        this.f43437f = null;
        this.f43438g = null;
        return segment;
    }

    public final Segment c(Segment segment) {
        Intrinsics.i(segment, "segment");
        segment.f43438g = this;
        segment.f43437f = this.f43437f;
        Segment segment2 = this.f43437f;
        Intrinsics.f(segment2);
        segment2.f43438g = segment;
        this.f43437f = segment;
        return segment;
    }

    public final Segment d() {
        this.f43435d = true;
        return new Segment(this.f43432a, this.f43433b, this.f43434c, true, false);
    }

    public final Segment e(int i2) {
        Segment segment;
        if (i2 <= 0 || i2 > this.f43434c - this.f43433b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i2 >= 1024) {
            segment = d();
        } else {
            segment = SegmentPool.c();
            byte[] bArr = this.f43432a;
            byte[] bArr2 = segment.f43432a;
            int i3 = this.f43433b;
            ArraysKt.m(bArr, bArr2, 0, i3, i3 + i2, 2, (Object) null);
        }
        segment.f43434c = segment.f43433b + i2;
        this.f43433b += i2;
        Segment segment2 = this.f43438g;
        Intrinsics.f(segment2);
        segment2.c(segment);
        return segment;
    }

    public final Segment f() {
        byte[] bArr = this.f43432a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        return new Segment(copyOf, this.f43433b, this.f43434c, false, true);
    }

    public final void g(Segment segment, int i2) {
        Intrinsics.i(segment, "sink");
        if (segment.f43436e) {
            int i3 = segment.f43434c;
            if (i3 + i2 > 8192) {
                if (!segment.f43435d) {
                    int i4 = segment.f43433b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = segment.f43432a;
                        ArraysKt.m(bArr, bArr, 0, i4, i3, 2, (Object) null);
                        segment.f43434c -= segment.f43433b;
                        segment.f43433b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f43432a;
            byte[] bArr3 = segment.f43432a;
            int i5 = segment.f43434c;
            int i6 = this.f43433b;
            ArraysKt.g(bArr2, bArr3, i5, i6, i6 + i2);
            segment.f43434c += i2;
            this.f43433b += i2;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public Segment(byte[] bArr, int i2, int i3, boolean z2, boolean z3) {
        Intrinsics.i(bArr, "data");
        this.f43432a = bArr;
        this.f43433b = i2;
        this.f43434c = i3;
        this.f43435d = z2;
        this.f43436e = z3;
    }
}
