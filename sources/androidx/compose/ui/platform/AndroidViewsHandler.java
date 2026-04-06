package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata
public final class AndroidViewsHandler extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public final HashMap f17654A = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public final HashMap f17655z = new HashMap();

    public AndroidViewsHandler(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final void a(AndroidViewHolder androidViewHolder, Canvas canvas) {
        androidViewHolder.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.f17655z;
    }

    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.f17654A;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    public void onDescendantInvalidated(View view, View view2) {
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        for (AndroidViewHolder androidViewHolder : this.f17655z.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    public void onMeasure(int i2, int i3) {
        boolean z2 = false;
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            InlineClassHelperKt.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        for (AndroidViewHolder F : this.f17655z.keySet()) {
            F.F();
        }
    }

    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutNode layoutNode = (LayoutNode) this.f17655z.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.H1(layoutNode, false, false, false, 7, (Object) null);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
