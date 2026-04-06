package com.google.common.primitives;

import java.nio.ByteOrder;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
public final class UnsignedBytes {

    public static class LexicographicalComparatorHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final String f29185a = LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");

        /* renamed from: b  reason: collision with root package name */
        public static final Comparator f29186b = a();

        public enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            /* renamed from: f */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i2 = 0; i2 < min; i2++) {
                    int a2 = UnsignedBytes.a(bArr[i2], bArr2[i2]);
                    if (a2 != 0) {
                        return a2;
                    }
                }
                return bArr.length - bArr2.length;
            }

            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        public enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;
            

            /* renamed from: A  reason: collision with root package name */
            public static final boolean f29189A = false;

            /* renamed from: B  reason: collision with root package name */
            public static final Unsafe f29190B = null;
            public static final int C = 0;

            static {
                f29189A = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
                Unsafe h2 = h();
                f29190B = h2;
                Class<byte[]> cls = byte[].class;
                int arrayBaseOffset = h2.arrayBaseOffset(cls);
                C = arrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || arrayBaseOffset % 8 != 0 || h2.arrayIndexScale(cls) != 1) {
                    throw new Error();
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
                return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.AnonymousClass1());
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
            public static sun.misc.Unsafe h() {
                /*
                    sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                    return r0
                L_0x0005:
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1 r0 = new com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1     // Catch:{ PrivilegedActionException -> 0x0011 }
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.h():sun.misc.Unsafe");
            }

            /* renamed from: f */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i2 = min & -8;
                int i3 = 0;
                while (i3 < i2) {
                    Unsafe unsafe = f29190B;
                    int i4 = C;
                    long j2 = (long) i3;
                    long j3 = unsafe.getLong(bArr, ((long) i4) + j2);
                    long j4 = unsafe.getLong(bArr2, ((long) i4) + j2);
                    if (j3 == j4) {
                        i3 += 8;
                    } else if (f29189A) {
                        return UnsignedLongs.a(j3, j4);
                    } else {
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3 ^ j4) & -8;
                        return ((int) ((j3 >>> numberOfTrailingZeros) & 255)) - ((int) ((j4 >>> numberOfTrailingZeros) & 255));
                    }
                }
                while (i3 < min) {
                    int a2 = UnsignedBytes.a(bArr[i3], bArr2[i3]);
                    if (a2 != 0) {
                        return a2;
                    }
                    i3++;
                }
                return bArr.length - bArr2.length;
            }

            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        public static Comparator a() {
            try {
                Object[] enumConstants = Class.forName(f29185a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.b();
            }
        }
    }

    public static int a(byte b2, byte b3) {
        return c(b2) - c(b3);
    }

    public static Comparator b() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    public static int c(byte b2) {
        return b2 & 255;
    }
}
