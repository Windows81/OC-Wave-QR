package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata
public final class _JvmPlatformKt {
    public static final byte[] a(String str) {
        Intrinsics.i(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.f41118b);
        Intrinsics.h(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        Intrinsics.i(bArr, "<this>");
        return new String(bArr, Charsets.f41118b);
    }
}
