package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SegmentPool {

    /* renamed from: a  reason: collision with root package name */
    public static final SegmentPool f43439a = new SegmentPool();

    /* renamed from: b  reason: collision with root package name */
    public static final int f43440b = 65536;

    /* renamed from: c  reason: collision with root package name */
    public static final Segment f43441c = new Segment(new byte[0], 0, 0, false, false);

    /* renamed from: d  reason: collision with root package name */
    public static final int f43442d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReference[] f43443e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f43442d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f43443e = atomicReferenceArr;
    }

    public static final void b(Segment segment) {
        Intrinsics.i(segment, "segment");
        if (segment.f43437f != null || segment.f43438g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!segment.f43435d) {
            AtomicReference a2 = f43439a.a();
            Segment segment2 = f43441c;
            Segment segment3 = (Segment) a2.getAndSet(segment2);
            if (segment3 != segment2) {
                int i2 = segment3 != null ? segment3.f43434c : 0;
                if (i2 >= f43440b) {
                    a2.set(segment3);
                    return;
                }
                segment.f43437f = segment3;
                segment.f43433b = 0;
                segment.f43434c = i2 + 8192;
                a2.set(segment);
            }
        }
    }

    public static final Segment c() {
        AtomicReference a2 = f43439a.a();
        Segment segment = f43441c;
        Segment segment2 = (Segment) a2.getAndSet(segment);
        if (segment2 == segment) {
            return new Segment();
        }
        if (segment2 == null) {
            a2.set((Object) null);
            return new Segment();
        }
        a2.set(segment2.f43437f);
        segment2.f43437f = null;
        segment2.f43434c = 0;
        return segment2;
    }

    public final AtomicReference a() {
        return f43443e[(int) (Thread.currentThread().getId() & (((long) f43442d) - 1))];
    }
}
