package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public IBinder f17459A;

    /* renamed from: B  reason: collision with root package name */
    public Composition f17460B;
    public CompositionContext C;
    public Function0 D;
    public boolean E;
    public boolean F;
    public boolean G;

    /* renamed from: z  reason: collision with root package name */
    public WeakReference f17461z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.C != compositionContext) {
            this.C = compositionContext;
            if (compositionContext != null) {
                this.f17461z = null;
            }
            Composition composition = this.f17460B;
            if (composition != null) {
                composition.d();
                this.f17460B = null;
                if (isAttachedToWindow()) {
                    g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f17459A != iBinder) {
            this.f17459A = iBinder;
            this.f17461z = null;
        }
    }

    public void addView(View view) {
        d();
        super.addView(view);
    }

    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        d();
        return super.addViewInLayout(view, i2, layoutParams);
    }

    public abstract void b(Composer composer, int i2);

    public final CompositionContext c(CompositionContext compositionContext) {
        CompositionContext compositionContext2 = j(compositionContext) ? compositionContext : null;
        if (compositionContext2 != null) {
            this.f17461z = new WeakReference(compositionContext2);
        }
        return compositionContext;
    }

    public final void d() {
        if (!this.F) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    public final void e() {
        if (this.C != null || isAttachedToWindow()) {
            g();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
    }

    public final void f() {
        Composition composition = this.f17460B;
        if (composition != null) {
            composition.d();
        }
        this.f17460B = null;
        requestLayout();
    }

    /* JADX INFO: finally extract failed */
    public final void g() {
        if (this.f17460B == null) {
            try {
                this.F = true;
                this.f17460B = Wrapper_androidKt.c(this, k(), ComposableLambdaKt.c(-656146368, true, new AbstractComposeView$ensureCompositionCreated$1(this)));
                this.F = false;
            } catch (Throwable th) {
                this.F = false;
                throw th;
            }
        }
    }

    public final boolean getHasComposition() {
        return this.f17460B != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.E;
    }

    public void h(boolean z2, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i4 - i2) - getPaddingRight(), (i5 - i3) - getPaddingBottom());
        }
    }

    public void i(int i2, int i3) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i2, i3);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i2)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i3)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public boolean isTransitionGroup() {
        return !this.G || super.isTransitionGroup();
    }

    public final boolean j(CompositionContext compositionContext) {
        return !(compositionContext instanceof Recomposer) || ((Recomposer.State) ((Recomposer) compositionContext).x0().getValue()).compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    public final CompositionContext k() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2 = this.C;
        if (compositionContext2 != null) {
            return compositionContext2;
        }
        CompositionContext d2 = WindowRecomposer_androidKt.d(this);
        CompositionContext compositionContext3 = null;
        CompositionContext c2 = d2 != null ? c(d2) : null;
        if (c2 != null) {
            return c2;
        }
        WeakReference weakReference = this.f17461z;
        if (!(weakReference == null || (compositionContext = (CompositionContext) weakReference.get()) == null || !j(compositionContext))) {
            compositionContext3 = compositionContext;
        }
        CompositionContext compositionContext4 = compositionContext3;
        return compositionContext4 == null ? c(WindowRecomposer_androidKt.h(this)) : compositionContext4;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            g();
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        h(z2, i2, i3, i4, i5);
    }

    public final void onMeasure(int i2, int i3) {
        g();
        i(i2, i3);
    }

    public void onRtlPropertiesChanged(int i2) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i2);
        }
    }

    public final void setParentCompositionContext(CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z2) {
        this.E = z2;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z2);
        }
    }

    public void setTransitionGroup(boolean z2) {
        super.setTransitionGroup(z2);
        this.G = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        Function0 function0 = this.D;
        if (function0 != null) {
            function0.invoke();
        }
        this.D = viewCompositionStrategy.a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.D = ViewCompositionStrategy.f17889a.a().a(this);
    }

    public void addView(View view, int i2) {
        d();
        super.addView(view, i2);
    }

    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        d();
        return super.addViewInLayout(view, i2, layoutParams, z2);
    }

    public void addView(View view, int i2, int i3) {
        d();
        super.addView(view, i2, i3);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, i2, layoutParams);
    }
}
