package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ConcurrentLinkedListKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Symbol f41826a = new Symbol("CLOSED");

    public static final ConcurrentLinkedListNode b(ConcurrentLinkedListNode concurrentLinkedListNode) {
        while (true) {
            Object a2 = concurrentLinkedListNode.g();
            if (a2 == f41826a) {
                return concurrentLinkedListNode;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = (ConcurrentLinkedListNode) a2;
            if (concurrentLinkedListNode2 != null) {
                concurrentLinkedListNode = concurrentLinkedListNode2;
            } else if (concurrentLinkedListNode.m()) {
                return concurrentLinkedListNode;
            }
        }
    }

    public static final Object c(Segment segment, long j2, Function2 function2) {
        while (true) {
            if (segment.f41864B >= j2 && !segment.k()) {
                return SegmentOrClosed.a(segment);
            }
            Object a2 = segment.g();
            if (a2 == f41826a) {
                return SegmentOrClosed.a(f41826a);
            }
            Segment segment2 = (Segment) ((ConcurrentLinkedListNode) a2);
            if (segment2 == null) {
                segment2 = (Segment) function2.m(Long.valueOf(segment.f41864B + 1), segment);
                if (segment.o(segment2)) {
                    if (segment.k()) {
                        segment.n();
                    }
                }
            }
            segment = segment2;
        }
    }
}
