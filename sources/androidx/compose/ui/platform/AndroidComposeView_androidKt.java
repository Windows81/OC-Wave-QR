package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidComposeView_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static Function1 f17590a = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.f17591z;

    public static final boolean e(View view, View view2) {
        if (Intrinsics.d(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final float f(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4] * fArr2[i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 3] * fArr2[12 + i3]);
    }

    public static final ContentCaptureSessionCompat g(View view) {
        ViewCompatShims.c(view, 1);
        return ViewCompatShims.b(view);
    }

    public static final Function1 h() {
        return f17590a;
    }

    public static final void i(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float f2 = f(fArr4, 0, fArr3, 0);
        float f3 = f(fArr4, 0, fArr3, 1);
        float f4 = f(fArr4, 0, fArr3, 2);
        float f5 = f(fArr4, 0, fArr3, 3);
        float f6 = f(fArr4, 1, fArr3, 0);
        float f7 = f(fArr4, 1, fArr3, 1);
        float f8 = f(fArr4, 1, fArr3, 2);
        float f9 = f(fArr4, 1, fArr3, 3);
        float f10 = f(fArr4, 2, fArr3, 0);
        float f11 = f(fArr4, 2, fArr3, 1);
        float f12 = f(fArr4, 2, fArr3, 2);
        float f13 = f(fArr4, 2, fArr3, 3);
        float f14 = f(fArr4, 3, fArr3, 0);
        float f15 = f(fArr4, 3, fArr3, 1);
        float f16 = f(fArr4, 3, fArr3, 2);
        float f17 = f(fArr4, 3, fArr3, 3);
        fArr3[0] = f2;
        fArr3[1] = f3;
        fArr3[2] = f4;
        fArr3[3] = f5;
        fArr3[4] = f6;
        fArr3[5] = f7;
        fArr3[6] = f8;
        fArr3[7] = f9;
        fArr3[8] = f10;
        fArr3[9] = f11;
        fArr3[10] = f12;
        fArr3[11] = f13;
        fArr3[12] = f14;
        fArr3[13] = f15;
        fArr3[14] = f16;
        fArr3[15] = f17;
    }

    public static final void j(float[] fArr, float f2, float f3, float[] fArr2) {
        Matrix.h(fArr2);
        Matrix.p(fArr2, f2, f3, 0.0f, 4, (Object) null);
        i(fArr, fArr2);
    }
}
