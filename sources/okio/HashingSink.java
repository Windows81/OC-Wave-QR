package okio;

import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HashingSink extends ForwardingSink implements Sink {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final MessageDigest f43389A;

    /* renamed from: B  reason: collision with root package name */
    public final Mac f43390B;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        SegmentedByteString.b(buffer.n0(), 0, j2);
        Segment segment = buffer.f43339z;
        Intrinsics.f(segment);
        long j3 = 0;
        while (j3 < j2) {
            int min = (int) Math.min(j2 - j3, (long) (segment.f43434c - segment.f43433b));
            MessageDigest messageDigest = this.f43389A;
            if (messageDigest != null) {
                messageDigest.update(segment.f43432a, segment.f43433b, min);
            } else {
                Mac mac = this.f43390B;
                Intrinsics.f(mac);
                mac.update(segment.f43432a, segment.f43433b, min);
            }
            j3 += (long) min;
            segment = segment.f43437f;
            Intrinsics.f(segment);
        }
        super.N0(buffer, j2);
    }
}
