package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

class DetectionResultColumn {

    /* renamed from: a  reason: collision with root package name */
    public final Codeword[] f32780a;

    public final Codeword[] a() {
        return this.f32780a;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i2 = 0;
            for (Codeword codeword : this.f32780a) {
                if (codeword == null) {
                    formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i2)});
                    i2++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i2), Integer.valueOf(codeword.a()), Integer.valueOf(codeword.b())});
                    i2++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th) {
            try {
                formatter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
