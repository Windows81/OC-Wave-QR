package com.google.zxing.datamatrix.encoder;

class C40Encoder implements Encoder {
    public static String d(CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    public static void g(EncoderContext encoderContext, StringBuilder sb) {
        encoderContext.s(d(sb));
        sb.delete(0, 3);
    }

    public void a(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!encoderContext.i()) {
                break;
            }
            char c2 = encoderContext.c();
            encoderContext.f32669f++;
            int c3 = c(c2, sb);
            int a2 = encoderContext.a() + ((sb.length() / 3) << 1);
            encoderContext.q(a2);
            int a3 = encoderContext.g().a() - a2;
            if (encoderContext.i()) {
                if (sb.length() % 3 == 0 && HighLevelEncoder.n(encoderContext.d(), encoderContext.f32669f, e()) != e()) {
                    encoderContext.o(0);
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && a3 != 2) {
                    c3 = b(encoderContext, sb, sb2, c3);
                }
                while (sb.length() % 3 == 1 && (c3 > 3 || a3 != 1)) {
                    c3 = b(encoderContext, sb, sb2, c3);
                }
            }
        }
        f(encoderContext, sb);
    }

    public final int b(EncoderContext encoderContext, StringBuilder sb, StringBuilder sb2, int i2) {
        int length = sb.length();
        sb.delete(length - i2, length);
        encoderContext.f32669f--;
        int c2 = c(encoderContext.c(), sb2);
        encoderContext.k();
        return c2;
    }

    public int c(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append(3);
            return 1;
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) (c2 - ','));
            return 1;
        } else if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) (c2 - '3'));
            return 1;
        } else if (c2 < ' ') {
            sb.append(0);
            sb.append(c2);
            return 2;
        } else if (c2 <= '/') {
            sb.append(1);
            sb.append((char) (c2 - '!'));
            return 2;
        } else if (c2 <= '@') {
            sb.append(1);
            sb.append((char) (c2 - '+'));
            return 2;
        } else if (c2 <= '_') {
            sb.append(1);
            sb.append((char) (c2 - 'E'));
            return 2;
        } else if (c2 <= 127) {
            sb.append(2);
            sb.append((char) (c2 - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return c((char) (c2 - 128), sb) + 2;
        }
    }

    public int e() {
        return 1;
    }

    public void f(EncoderContext encoderContext, StringBuilder sb) {
        int length = sb.length() % 3;
        int a2 = encoderContext.a() + ((sb.length() / 3) << 1);
        encoderContext.q(a2);
        int a3 = encoderContext.g().a() - a2;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                g(encoderContext, sb);
            }
            if (encoderContext.i()) {
                encoderContext.r(254);
            }
        } else if (a3 == 1 && length == 1) {
            while (sb.length() >= 3) {
                g(encoderContext, sb);
            }
            if (encoderContext.i()) {
                encoderContext.r(254);
            }
            encoderContext.f32669f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                g(encoderContext, sb);
            }
            if (a3 > 0 || encoderContext.i()) {
                encoderContext.r(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        encoderContext.o(0);
    }
}
