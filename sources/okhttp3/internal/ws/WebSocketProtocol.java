package okhttp3.internal.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

@Metadata
public final class WebSocketProtocol {

    /* renamed from: a  reason: collision with root package name */
    public static final WebSocketProtocol f43300a = new WebSocketProtocol();

    public final String a(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return "Code must be in range [1000,5000): " + i2;
        } else if ((1004 > i2 || i2 >= 1007) && (1015 > i2 || i2 >= 3000)) {
            return null;
        } else {
            return "Code " + i2 + " is reserved and may not be used.";
        }
    }

    public final void b(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        Intrinsics.i(unsafeCursor, "cursor");
        Intrinsics.i(bArr, "key");
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = unsafeCursor.D;
            int i3 = unsafeCursor.E;
            int i4 = unsafeCursor.F;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
        } while (unsafeCursor.b() != -1);
    }

    public final void c(int i2) {
        String a2 = a(i2);
        if (a2 != null) {
            Intrinsics.f(a2);
            throw new IllegalArgumentException(a2.toString());
        }
    }
}
