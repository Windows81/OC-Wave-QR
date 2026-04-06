package okio;

import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HashingSource extends ForwardingSource implements Source {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final MessageDigest f43391A;

    /* renamed from: B  reason: collision with root package name */
    public final Mac f43392B;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        long o1 = super.o1(buffer, j2);
        if (o1 != -1) {
            long n0 = buffer.n0() - o1;
            long n02 = buffer.n0();
            Segment segment = buffer.f43339z;
            Intrinsics.f(segment);
            while (n02 > n0) {
                segment = segment.f43438g;
                Intrinsics.f(segment);
                n02 -= (long) (segment.f43434c - segment.f43433b);
            }
            while (n02 < buffer.n0()) {
                int i2 = (int) ((((long) segment.f43433b) + n0) - n02);
                MessageDigest messageDigest = this.f43391A;
                if (messageDigest != null) {
                    messageDigest.update(segment.f43432a, i2, segment.f43434c - i2);
                } else {
                    Mac mac = this.f43392B;
                    Intrinsics.f(mac);
                    mac.update(segment.f43432a, i2, segment.f43434c - i2);
                }
                n02 += (long) (segment.f43434c - segment.f43433b);
                segment = segment.f43437f;
                Intrinsics.f(segment);
                n0 = n02;
            }
        }
        return o1;
    }
}
