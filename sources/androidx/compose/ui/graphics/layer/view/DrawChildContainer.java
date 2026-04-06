package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.R;
import androidx.compose.ui.graphics.layer.ViewLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class DrawChildContainer extends ViewGroup {

    /* renamed from: z  reason: collision with root package name */
    public boolean f16455z;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(R.id.f16102a, Boolean.TRUE);
    }

    public final void a(Canvas canvas, View view, long j2) {
        super.drawChild(AndroidCanvas_androidKt.d(canvas), view, j2);
    }

    public void dispatchDraw(android.graphics.Canvas canvas) {
        int childCount = super.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            Intrinsics.g(childAt, "null cannot be cast to non-null type androidx.compose.ui.graphics.layer.ViewLayer");
            if (((ViewLayer) childAt).b()) {
                this.f16455z = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f16455z = false;
                }
            } else {
                i2++;
            }
        }
    }

    public void forceLayout() {
    }

    public int getChildCount() {
        if (this.f16455z) {
            return super.getChildCount();
        }
        return 0;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void requestLayout() {
    }
}
