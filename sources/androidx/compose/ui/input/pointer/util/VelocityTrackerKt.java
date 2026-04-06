package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class VelocityTrackerKt {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16978a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f16979b;

    public static final void c(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (f16978a) {
            e(velocityTracker, pointerInputChange);
        } else {
            d(velocityTracker, pointerInputChange);
        }
    }

    public static final void d(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.b(pointerInputChange)) {
            velocityTracker.f(pointerInputChange.h());
            velocityTracker.e();
        }
        long k2 = pointerInputChange.k();
        List e2 = pointerInputChange.e();
        int size = e2.size();
        int i2 = 0;
        while (i2 < size) {
            HistoricalChange historicalChange = (HistoricalChange) e2.get(i2);
            long p2 = Offset.p(historicalChange.b(), k2);
            long b2 = historicalChange.b();
            velocityTracker.f(Offset.q(velocityTracker.c(), p2));
            velocityTracker.a(historicalChange.c(), velocityTracker.c());
            i2++;
            k2 = b2;
        }
        velocityTracker.f(Offset.q(velocityTracker.c(), Offset.p(pointerInputChange.h(), k2)));
        velocityTracker.a(pointerInputChange.o(), velocityTracker.c());
    }

    public static final void e(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.b(pointerInputChange)) {
            velocityTracker.e();
        }
        if (!PointerEventKt.d(pointerInputChange)) {
            List e2 = pointerInputChange.e();
            int size = e2.size();
            for (int i2 = 0; i2 < size; i2++) {
                HistoricalChange historicalChange = (HistoricalChange) e2.get(i2);
                velocityTracker.a(historicalChange.c(), historicalChange.a());
            }
            velocityTracker.a(pointerInputChange.o(), pointerInputChange.g());
        }
        if (PointerEventKt.d(pointerInputChange) && pointerInputChange.o() - velocityTracker.d() > 40) {
            velocityTracker.e();
        }
        velocityTracker.g(pointerInputChange.o());
    }

    public static final float f(float[] fArr, float[] fArr2, int i2, boolean z2) {
        int i3 = i2 - 1;
        float f2 = fArr2[i3];
        float f3 = 0.0f;
        int i4 = i3;
        while (i4 > 0) {
            int i5 = i4 - 1;
            float f4 = fArr2[i5];
            if (f2 != f4) {
                float f5 = (z2 ? -fArr[i5] : fArr[i4] - fArr[i5]) / (f2 - f4);
                f3 += (f5 - (Math.signum(f3) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f3)))))) * Math.abs(f5);
                if (i4 == i3) {
                    f3 *= 0.5f;
                }
            }
            i4--;
            f2 = f4;
        }
        return Math.signum(f3) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f3))));
    }

    public static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2] * fArr2[i2];
        }
        return f2;
    }

    public static final boolean h() {
        return f16979b;
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i2, int i3, float[] fArr3) {
        int i4 = i2;
        int i5 = i3;
        if (i5 < 1) {
            InlineClassHelperKt.a("The degree must be at positive integer");
        }
        if (i4 == 0) {
            InlineClassHelperKt.a("At least one point must be provided");
        }
        if (i5 >= i4) {
            i5 = i4 - 1;
        }
        int i6 = i5 + 1;
        float[][] fArr4 = new float[i6][];
        for (int i7 = 0; i7 < i6; i7++) {
            fArr4[i7] = new float[i4];
        }
        for (int i8 = 0; i8 < i4; i8++) {
            fArr4[0][i8] = 1.0f;
            for (int i9 = 1; i9 < i6; i9++) {
                fArr4[i9][i8] = fArr4[i9 - 1][i8] * fArr[i8];
            }
        }
        float[][] fArr5 = new float[i6][];
        for (int i10 = 0; i10 < i6; i10++) {
            fArr5[i10] = new float[i4];
        }
        float[][] fArr6 = new float[i6][];
        for (int i11 = 0; i11 < i6; i11++) {
            fArr6[i11] = new float[i6];
        }
        int i12 = 0;
        while (i12 < i6) {
            float[] fArr7 = fArr5[i12];
            ArraysKt.i(fArr4[i12], fArr7, 0, 0, i4);
            for (int i13 = 0; i13 < i12; i13++) {
                float[] fArr8 = fArr5[i13];
                float g2 = g(fArr7, fArr8);
                for (int i14 = 0; i14 < i4; i14++) {
                    fArr7[i14] = fArr7[i14] - (fArr8[i14] * g2);
                }
            }
            float sqrt = (float) Math.sqrt((double) g(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f2 = 1.0f / sqrt;
            for (int i15 = 0; i15 < i4; i15++) {
                fArr7[i15] = fArr7[i15] * f2;
            }
            float[] fArr9 = fArr6[i12];
            int i16 = 0;
            while (i16 < i6) {
                fArr9[i16] = i16 < i12 ? 0.0f : g(fArr7, fArr4[i16]);
                i16++;
            }
            i12++;
        }
        for (int i17 = i5; -1 < i17; i17--) {
            float g3 = g(fArr5[i17], fArr2);
            float[] fArr10 = fArr6[i17];
            int i18 = i17 + 1;
            if (i18 <= i5) {
                int i19 = i5;
                while (true) {
                    g3 -= fArr10[i19] * fArr3[i19];
                    if (i19 == i18) {
                        break;
                    }
                    i19--;
                }
            }
            fArr3[i17] = g3 / fArr10[i17];
        }
        return fArr3;
    }

    public static final void j(DataPointAtTime[] dataPointAtTimeArr, int i2, long j2, float f2) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i2] = new DataPointAtTime(j2, f2);
            return;
        }
        dataPointAtTime.d(j2);
        dataPointAtTime.c(f2);
    }
}
