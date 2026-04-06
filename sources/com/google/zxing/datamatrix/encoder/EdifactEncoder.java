package com.google.zxing.datamatrix.encoder;

final class EdifactEncoder implements Encoder {
    public static void b(char c2, StringBuilder sb) {
        if (c2 >= ' ' && c2 <= '?') {
            sb.append(c2);
        } else if (c2 < '@' || c2 > '^') {
            HighLevelEncoder.e(c2);
        } else {
            sb.append((char) (c2 - '@'));
        }
    }

    private static String c(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            char c2 = 0;
            char charAt = charSequence.charAt(0);
            char charAt2 = length >= 2 ? charSequence.charAt(1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(2) : 0;
            if (length >= 4) {
                c2 = charSequence.charAt(3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c2;
            char c3 = (char) ((i2 >> 8) & 255);
            char c4 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public static void e(EncoderContext encoderContext, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z2 = true;
                if (length == 1) {
                    encoderContext.p();
                    int a2 = encoderContext.g().a() - encoderContext.a();
                    int f2 = encoderContext.f();
                    if (f2 > a2) {
                        encoderContext.q(encoderContext.a() + 1);
                        a2 = encoderContext.g().a() - encoderContext.a();
                    }
                    if (f2 <= a2 && a2 <= 2) {
                        encoderContext.o(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i2 = length - 1;
                    String c2 = c(charSequence);
                    if (encoderContext.i() || i2 > 2) {
                        z2 = false;
                    }
                    if (i2 <= 2) {
                        encoderContext.q(encoderContext.a() + i2);
                        if (encoderContext.g().a() - encoderContext.a() >= 3) {
                            encoderContext.q(encoderContext.a() + c2.length());
                            z2 = false;
                        }
                    }
                    if (z2) {
                        encoderContext.k();
                        encoderContext.f32669f -= i2;
                    } else {
                        encoderContext.s(c2);
                    }
                    encoderContext.o(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            encoderContext.o(0);
        }
    }

    public void a(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!encoderContext.i()) {
                break;
            }
            b(encoderContext.c(), sb);
            encoderContext.f32669f++;
            if (sb.length() >= 4) {
                encoderContext.s(c(sb));
                sb.delete(0, 4);
                if (HighLevelEncoder.n(encoderContext.d(), encoderContext.f32669f, d()) != d()) {
                    encoderContext.o(0);
                    break;
                }
            }
        }
        sb.append(31);
        e(encoderContext, sb);
    }

    public int d() {
        return 4;
    }
}
