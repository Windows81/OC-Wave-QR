package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

final class DetectionResult {

    /* renamed from: a  reason: collision with root package name */
    public final DetectionResultColumn[] f32778a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32779b;

    public String toString() {
        DetectionResultColumn[] detectionResultColumnArr = this.f32778a;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null) {
            detectionResultColumn = detectionResultColumnArr[this.f32779b + 1];
        }
        Formatter formatter = new Formatter();
        int i2 = 0;
        while (i2 < detectionResultColumn.a().length) {
            try {
                formatter.format("CW %3d:", new Object[]{Integer.valueOf(i2)});
                for (int i3 = 0; i3 < this.f32779b + 2; i3++) {
                    DetectionResultColumn detectionResultColumn2 = this.f32778a[i3];
                    if (detectionResultColumn2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        Codeword codeword = detectionResultColumn2.a()[i2];
                        if (codeword == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(codeword.a()), Integer.valueOf(codeword.b())});
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
                i2++;
            } catch (Throwable th) {
                try {
                    formatter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
