package com.google.zxing.datamatrix.encoder;

final class X12Encoder extends C40Encoder {
    public void a(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!encoderContext.i()) {
                break;
            }
            char c2 = encoderContext.c();
            encoderContext.f32669f++;
            c(c2, sb);
            if (sb.length() % 3 == 0) {
                C40Encoder.g(encoderContext, sb);
                if (HighLevelEncoder.n(encoderContext.d(), encoderContext.f32669f, e()) != e()) {
                    encoderContext.o(0);
                    break;
                }
            }
        }
        f(encoderContext, sb);
    }

    public int c(char c2, StringBuilder sb) {
        if (c2 == 13) {
            sb.append(0);
        } else if (c2 == ' ') {
            sb.append(3);
        } else if (c2 == '*') {
            sb.append(1);
        } else if (c2 == '>') {
            sb.append(2);
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) (c2 - ','));
        } else if (c2 < 'A' || c2 > 'Z') {
            HighLevelEncoder.e(c2);
        } else {
            sb.append((char) (c2 - '3'));
        }
        return 1;
    }

    public int e() {
        return 3;
    }

    public void f(EncoderContext encoderContext, StringBuilder sb) {
        encoderContext.p();
        int a2 = encoderContext.g().a() - encoderContext.a();
        encoderContext.f32669f -= sb.length();
        if (encoderContext.f() > 1 || a2 > 1 || encoderContext.f() != a2) {
            encoderContext.r(254);
        }
        if (encoderContext.e() < 0) {
            encoderContext.o(0);
        }
    }
}
