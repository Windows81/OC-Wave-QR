package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f17665a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f17666b;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public void a(View view, float[] fArr) {
        Matrix.h(fArr);
        d(view, fArr);
    }

    public final void b(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.b(this.f17665a, matrix);
        AndroidComposeView_androidKt.i(fArr, this.f17665a);
    }

    public final void c(float[] fArr, float f2, float f3) {
        AndroidComposeView_androidKt.j(fArr, f2, f3, this.f17665a);
    }

    public final void d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            c(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.f17666b;
            view.getLocationInWindow(iArr);
            c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            c(fArr, (float) iArr[0], (float) iArr[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            b(fArr, matrix);
        }
    }

    public CalculateMatrixToWindowApi21(float[] fArr) {
        this.f17665a = fArr;
        this.f17666b = new int[2];
    }
}
