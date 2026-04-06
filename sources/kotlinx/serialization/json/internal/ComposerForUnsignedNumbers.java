package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComposerForUnsignedNumbers extends Composer {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42374c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(InternalJsonWriter internalJsonWriter, boolean z2) {
        super(internalJsonWriter);
        Intrinsics.i(internalJsonWriter, "writer");
        this.f42374c = z2;
    }

    public void e(byte b2) {
        boolean z2 = this.f42374c;
        String k2 = UByte.k(UByte.f(b2));
        if (z2) {
            n(k2);
        } else {
            k(k2);
        }
    }

    public void i(int i2) {
        boolean z2 = this.f42374c;
        String unsignedString = Integer.toUnsignedString(UInt.f(i2));
        if (z2) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    public void j(long j2) {
        boolean z2 = this.f42374c;
        String unsignedString = Long.toUnsignedString(ULong.f(j2));
        if (z2) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    public void l(short s2) {
        boolean z2 = this.f42374c;
        String k2 = UShort.k(UShort.f(s2));
        if (z2) {
            n(k2);
        } else {
            k(k2);
        }
    }
}
