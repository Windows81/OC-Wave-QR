package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;

@Metadata
final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f17667a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f17668b = new int[2];

    public void a(View view, float[] fArr) {
        this.f17667a.reset();
        view.transformMatrixToGlobal(this.f17667a);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(this.f17668b);
        int[] iArr = this.f17668b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f17668b;
        this.f17667a.postTranslate((float) (iArr2[0] - i2), (float) (iArr2[1] - i3));
        AndroidMatrixConversions_androidKt.b(fArr, this.f17667a);
    }
}
