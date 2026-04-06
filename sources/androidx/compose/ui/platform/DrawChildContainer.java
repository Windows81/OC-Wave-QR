package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class DrawChildContainer extends ViewGroup {

    /* renamed from: z  reason: collision with root package name */
    public boolean f17764z;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.J, Boolean.TRUE);
    }

    public final void a(Canvas canvas, View view, long j2) {
        super.drawChild(AndroidCanvas_androidKt.d(canvas), view, j2);
    }

    public void dispatchDraw(android.graphics.Canvas canvas) {
        int childCount = super.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            Intrinsics.g(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).v()) {
                this.f17764z = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f17764z = false;
                }
            } else {
                i2++;
            }
        }
    }

    public int getChildCount() {
        if (this.f17764z) {
            return super.getChildCount();
        }
        return 0;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void requestLayout() {
    }
}
