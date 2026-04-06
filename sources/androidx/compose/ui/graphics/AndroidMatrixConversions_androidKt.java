package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import kotlin.Metadata;

@Metadata
public final class AndroidMatrixConversions_androidKt {
    public static final void a(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void b(float[] fArr, Matrix matrix) {
        float[] fArr2 = fArr;
        matrix.getValues(fArr2);
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        float f5 = fArr2[3];
        float f6 = fArr2[4];
        float f7 = fArr2[5];
        float f8 = fArr2[6];
        float f9 = fArr2[7];
        float f10 = fArr2[8];
        fArr2[0] = f2;
        fArr2[1] = f5;
        fArr2[2] = 0.0f;
        fArr2[3] = f8;
        fArr2[4] = f3;
        fArr2[5] = f6;
        fArr2[6] = 0.0f;
        fArr2[7] = f9;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = f4;
        fArr2[13] = f7;
        fArr2[14] = 0.0f;
        fArr2[15] = f10;
    }
}
