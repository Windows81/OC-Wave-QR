package com.google.zxing.datamatrix.encoder;

final class ASCIIEncoder implements Encoder {
    public static char b(char c2, char c3) {
        if (HighLevelEncoder.f(c2) && HighLevelEncoder.f(c3)) {
            return (char) (((c2 - '0') * 10) + (c3 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c2 + c3);
    }

    public void a(EncoderContext encoderContext) {
        if (HighLevelEncoder.a(encoderContext.d(), encoderContext.f32669f) >= 2) {
            encoderContext.r(b(encoderContext.d().charAt(encoderContext.f32669f), encoderContext.d().charAt(encoderContext.f32669f + 1)));
            encoderContext.f32669f += 2;
            return;
        }
        char c2 = encoderContext.c();
        int n2 = HighLevelEncoder.n(encoderContext.d(), encoderContext.f32669f, c());
        if (n2 != c()) {
            if (n2 == 1) {
                encoderContext.r(230);
                encoderContext.o(1);
            } else if (n2 == 2) {
                encoderContext.r(239);
                encoderContext.o(2);
            } else if (n2 == 3) {
                encoderContext.r(238);
                encoderContext.o(3);
            } else if (n2 == 4) {
                encoderContext.r(240);
                encoderContext.o(4);
            } else if (n2 == 5) {
                encoderContext.r(231);
                encoderContext.o(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n2)));
            }
        } else if (HighLevelEncoder.g(c2)) {
            encoderContext.r(235);
            encoderContext.r((char) (c2 - 127));
            encoderContext.f32669f++;
        } else {
            encoderContext.r((char) (c2 + 1));
            encoderContext.f32669f++;
        }
    }

    public int c() {
        return 0;
    }
}
