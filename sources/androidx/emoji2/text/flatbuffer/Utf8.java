package androidx.emoji2.text.flatbuffer;

public abstract class Utf8 {

    /* renamed from: a  reason: collision with root package name */
    public static Utf8 f21395a;

    public static class DecodeUtil {
        public static void a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
            if (f(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || f(b4) || f(b5)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int k2 = ((b2 & 7) << 18) | (k(b3) << 12) | (k(b4) << 6) | k(b5);
            cArr[i2] = e(k2);
            cArr[i2 + 1] = j(k2);
        }

        public static void b(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        public static void c(byte b2, byte b3, byte b4, char[] cArr, int i2) {
            if (f(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || f(b4)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i2] = (char) (((b2 & 15) << 12) | (k(b3) << 6) | k(b4));
        }

        public static void d(byte b2, byte b3, char[] cArr, int i2) {
            if (b2 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            } else if (!f(b3)) {
                cArr[i2] = (char) (((b2 & 31) << 6) | k(b3));
            } else {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
        }

        public static char e(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        public static boolean f(byte b2) {
            return b2 > -65;
        }

        public static boolean g(byte b2) {
            return b2 >= 0;
        }

        public static boolean h(byte b2) {
            return b2 < -16;
        }

        public static boolean i(byte b2) {
            return b2 < -32;
        }

        public static char j(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        public static int k(byte b2) {
            return b2 & 63;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
    }

    public static Utf8 a() {
        if (f21395a == null) {
            f21395a = new Utf8Safe();
        }
        return f21395a;
    }
}
