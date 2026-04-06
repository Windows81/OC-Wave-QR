package androidx.compose.ui.window;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider, OnApplyWindowInsetsListener {
    public final Window H;
    public final MutableState I = SnapshotStateKt__SnapshotStateKt.e(ComposableSingletons$AndroidDialog_androidKt.f19312a.a(), (SnapshotMutationPolicy) null, 2, (Object) null);
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;

    public DialogLayout(Context context, Window window) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.H = window;
        ViewCompat.d0(this, this);
        ViewCompat.i0(this, new WindowInsetsAnimationCompat.Callback(this) {

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ DialogLayout f19318B;

            {
                this.f19318B = r1;
            }

            public WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat, List list) {
                DialogLayout dialogLayout = this.f19318B;
                if (dialogLayout.K) {
                    return windowInsetsCompat;
                }
                View childAt = dialogLayout.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? windowInsetsCompat : windowInsetsCompat.n(max, max2, max3, max4);
            }

            public WindowInsetsAnimationCompat.BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                DialogLayout dialogLayout = this.f19318B;
                if (dialogLayout.K) {
                    return boundsCompat;
                }
                View childAt = dialogLayout.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? boundsCompat : boundsCompat.c(Insets.b(max, max2, max3, max4));
            }
        });
    }

    private final Function2 getContent() {
        return (Function2) this.I.getValue();
    }

    private final void setContent(Function2 function2) {
        this.I.setValue(function2);
    }

    public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.K) {
            return windowInsetsCompat;
        }
        View childAt = getChildAt(0);
        int max = Math.max(0, childAt.getLeft());
        int max2 = Math.max(0, childAt.getTop());
        int max3 = Math.max(0, getWidth() - childAt.getRight());
        int max4 = Math.max(0, getHeight() - childAt.getBottom());
        return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? windowInsetsCompat : windowInsetsCompat.n(max, max2, max3, max4);
    }

    public void b(Composer composer, int i2) {
        composer.X(1735448596);
        if (ComposerKt.P()) {
            ComposerKt.Y(1735448596, i2, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:410)");
        }
        getContent().m(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.M;
    }

    public void h(boolean z2, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int paddingLeft2 = getPaddingLeft() + (((i6 - measuredWidth) - paddingLeft) / 2);
            int paddingTop = getPaddingTop() + (((i7 - measuredHeight) - (getPaddingTop() + getPaddingBottom())) / 2);
            childAt.layout(paddingLeft2, paddingTop, measuredWidth + paddingLeft2, measuredHeight + paddingTop);
        }
    }

    public void i(int i2, int i3) {
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.i(i2, i3);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        int i5 = (mode != Integer.MIN_VALUE || this.J || this.K || m().getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i6 = size - paddingLeft;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = i5 - paddingTop;
        if (i7 >= 0) {
            i4 = i7;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        childAt.measure(i2, i3);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingTop));
        if (!this.J && !this.K && childAt.getMeasuredHeight() + paddingTop > size2 && m().getAttributes().height == -2) {
            m().setLayout(-1, -1);
        }
    }

    public Window m() {
        return this.H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r7 = kotlin.math.MathKt.d(r7.getY());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            if (r1 != 0) goto L_0x005d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x005d
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x005d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x005d
            android.view.View r0 = r6.getChildAt(r2)
            if (r0 != 0) goto L_0x0028
            return r2
        L_0x0028:
            int r1 = r6.getLeft()
            int r3 = r0.getLeft()
            int r1 = r1 + r3
            int r3 = r0.getWidth()
            int r3 = r3 + r1
            int r4 = r6.getTop()
            int r5 = r0.getTop()
            int r4 = r4 + r5
            int r0 = r0.getHeight()
            int r0 = r0 + r4
            float r5 = r7.getX()
            int r5 = kotlin.math.MathKt.d(r5)
            if (r1 > r5) goto L_0x005d
            if (r5 > r3) goto L_0x005d
            float r7 = r7.getY()
            int r7 = kotlin.math.MathKt.d(r7)
            if (r4 > r7) goto L_0x005d
            if (r7 > r0) goto L_0x005d
            r2 = 1
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.DialogLayout.n(android.view.MotionEvent):boolean");
    }

    public final void o(CompositionContext compositionContext, Function2 function2) {
        setParentCompositionContext(compositionContext);
        setContent(function2);
        this.M = true;
        e();
    }

    public final void p(boolean z2, boolean z3) {
        boolean z4 = (this.L && z2 == this.J && z3 == this.K) ? false : true;
        this.J = z2;
        this.K = z3;
        if (z4) {
            WindowManager.LayoutParams attributes = m().getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !this.L) {
                m().setLayout(i2, -2);
                this.L = true;
            }
        }
    }
}
