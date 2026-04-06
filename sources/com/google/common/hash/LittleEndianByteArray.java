package com.google.common.hash;

import com.google.common.primitives.Longs;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
final class LittleEndianByteArray {

    /* renamed from: a  reason: collision with root package name */
    public static final LittleEndianBytes f28887a;

    public enum JavaLittleEndianBytes implements LittleEndianBytes {
        INSTANCE {
            public long d(byte[] bArr, int i2) {
                return Longs.d(bArr[i2 + 7], bArr[i2 + 6], bArr[i2 + 5], bArr[i2 + 4], bArr[i2 + 3], bArr[i2 + 2], bArr[i2 + 1], bArr[i2]);
            }
        }
    }

    public interface LittleEndianBytes {
        long d(byte[] bArr, int i2);
    }

    public enum UnsafeByteArray implements LittleEndianBytes {
        UNSAFE_LITTLE_ENDIAN {
            public long d(byte[] bArr, int i2) {
                return UnsafeByteArray.f28891B.getLong(bArr, ((long) i2) + ((long) UnsafeByteArray.C));
            }
        },
        UNSAFE_BIG_ENDIAN {
            public long d(byte[] bArr, int i2) {
                return Long.reverseBytes(UnsafeByteArray.f28891B.getLong(bArr, ((long) i2) + ((long) UnsafeByteArray.C)));
            }
        };
        

        /* renamed from: B  reason: collision with root package name */
        public static final Unsafe f28891B = null;
        public static final int C = 0;

        static {
            Unsafe k2 = k();
            f28891B = k2;
            Class<byte[]> cls = byte[].class;
            C = k2.arrayBaseOffset(cls);
            if (k2.arrayIndexScale(cls) != 1) {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.AnonymousClass3());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static sun.misc.Unsafe k() {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                return r0
            L_0x0005:
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3 r0 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3     // Catch:{ PrivilegedActionException -> 0x0011 }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
                return r0
            L_0x0011:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.k():sun.misc.Unsafe");
        }
    }

    static {
        LittleEndianBytes littleEndianBytes = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                littleEndianBytes = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        f28887a = littleEndianBytes;
    }

    public static int a(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long b(byte[] bArr, int i2) {
        return f28887a.d(bArr, i2);
    }

    public static long c(byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, 8);
        long j2 = 0;
        for (int i4 = 0; i4 < min; i4++) {
            j2 |= (((long) bArr[i2 + i4]) & 255) << (i4 * 8);
        }
        return j2;
    }
}
