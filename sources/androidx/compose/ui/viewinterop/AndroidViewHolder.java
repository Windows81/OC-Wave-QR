package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    public static final Companion c0 = new Companion((DefaultConstructorMarker) null);
    public static final int d0 = 8;
    public static final Function1 e0 = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.f19203z;

    /* renamed from: A  reason: collision with root package name */
    public final NestedScrollDispatcher f19199A;

    /* renamed from: B  reason: collision with root package name */
    public final View f19200B;
    public final Owner C;
    public Function0 D;
    public boolean E;
    public Function0 F;
    public Function0 G;
    public Modifier H;
    public Function1 I;
    public Density J;
    public Function1 K;
    public LifecycleOwner L;
    public SavedStateRegistryOwner M;
    public final int[] N;
    public long O;
    public WindowInsetsCompat P;
    public final Function0 Q;
    public final Function0 R;
    public Function1 S;
    public final int[] T;
    public int U;
    public int V;
    public final NestedScrollingParentHelper W;
    public boolean a0;
    public final LayoutNode b0;

    /* renamed from: z  reason: collision with root package name */
    public final int f19201z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i2, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        CompositionContext compositionContext2 = compositionContext;
        int i3 = i2;
        NestedScrollDispatcher nestedScrollDispatcher2 = nestedScrollDispatcher;
        View view2 = view;
        this.f19201z = i3;
        this.f19199A = nestedScrollDispatcher2;
        this.f19200B = view2;
        this.C = owner;
        if (compositionContext2 != null) {
            WindowRecomposer_androidKt.i(this, compositionContext2);
        }
        setSaveFromParentEnabled(false);
        addView(view2);
        ViewCompat.i0(this, new WindowInsetsAnimationCompat.Callback(this) {

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AndroidViewHolder f19202B;

            {
                this.f19202B = r1;
            }

            public WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat, List list) {
                return this.f19202B.B(windowInsetsCompat);
            }

            public WindowInsetsAnimationCompat.BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                return this.f19202B.A(boundsCompat);
            }
        });
        ViewCompat.d0(this, this);
        this.D = AndroidViewHolder$update$1.f19225z;
        this.F = AndroidViewHolder$reset$1.f19222z;
        this.G = AndroidViewHolder$release$1.f19221z;
        Modifier.Companion companion = Modifier.f15489d;
        this.H = companion;
        this.J = DensityKt.b(1.0f, 0.0f, 2, (Object) null);
        this.N = new int[2];
        this.O = IntSize.f19170b.a();
        this.Q = new AndroidViewHolder$runUpdate$1(this);
        this.R = new AndroidViewHolder$runInvalidate$1(this);
        this.T = new int[2];
        this.U = Integer.MIN_VALUE;
        this.V = Integer.MIN_VALUE;
        this.W = new NestedScrollingParentHelper(this);
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, (DefaultConstructorMarker) null);
        layoutNode.M1(true);
        layoutNode.O1(this);
        Modifier a2 = OnGloballyPositionedModifierKt.a(DrawModifierKt.b(GraphicsLayerModifierKt.c(PointerInteropFilter_androidKt.a(SemanticsModifierKt.c(NestedScrollModifierKt.a(companion, AndroidViewHolder_androidKt.f19226a, nestedScrollDispatcher2), true, AndroidViewHolder$layoutNode$1$coreModifier$1.f19215z), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131071, (Object) null), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode));
        layoutNode.f(i3);
        layoutNode.h(this.H.o0(a2));
        this.I = new AndroidViewHolder$layoutNode$1$1(layoutNode, a2);
        layoutNode.a(this.J);
        this.K = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.U1(new AndroidViewHolder$layoutNode$1$3(this, layoutNode));
        layoutNode.V1(new AndroidViewHolder$layoutNode$1$4(this));
        layoutNode.e(new AndroidViewHolder$layoutNode$1$5(this, layoutNode));
        this.b0 = layoutNode;
    }

    public static final void D(Function0 function0) {
        function0.invoke();
    }

    /* access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.C.getSnapshotObserver();
    }

    public final WindowInsetsAnimationCompat.BoundsCompat A(WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        NodeCoordinator V2 = this.b0.V();
        if (V2.b()) {
            long d2 = IntOffsetKt.d(LayoutCoordinatesKt.f(V2));
            int k2 = IntOffset.k(d2);
            int i2 = k2 < 0 ? 0 : k2;
            int l2 = IntOffset.l(d2);
            int i3 = l2 < 0 ? 0 : l2;
            long a2 = LayoutCoordinatesKt.d(V2).a();
            int i4 = (int) (a2 >> 32);
            int i5 = (int) (a2 & 4294967295L);
            long a3 = V2.a();
            long d3 = IntOffsetKt.d(V2.o0(Offset.e((((long) Float.floatToRawIntBits((float) ((int) (a3 >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((float) ((int) (a3 & 4294967295L))))))));
            int k3 = i4 - IntOffset.k(d3);
            int i6 = k3 < 0 ? 0 : k3;
            int l3 = i5 - IntOffset.l(d3);
            int i7 = l3 < 0 ? 0 : l3;
            if (!(i2 == 0 && i3 == 0 && i6 == 0 && i7 == 0)) {
                int i8 = i2;
                int i9 = i3;
                int i10 = i6;
                int i11 = i7;
                return new WindowInsetsAnimationCompat.BoundsCompat(z(boundsCompat.a(), i8, i9, i10, i11), z(boundsCompat.b(), i8, i9, i10, i11));
            }
        }
        return boundsCompat;
    }

    public final WindowInsetsCompat B(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = windowInsetsCompat;
        if (!windowInsetsCompat.m()) {
            return windowInsetsCompat2;
        }
        NodeCoordinator V2 = this.b0.V();
        if (!V2.b()) {
            return windowInsetsCompat2;
        }
        long d2 = IntOffsetKt.d(LayoutCoordinatesKt.f(V2));
        int k2 = IntOffset.k(d2);
        if (k2 < 0) {
            k2 = 0;
        }
        int l2 = IntOffset.l(d2);
        if (l2 < 0) {
            l2 = 0;
        }
        long a2 = LayoutCoordinatesKt.d(V2).a();
        long a3 = V2.a();
        int i2 = (int) (a2 & 4294967295L);
        long d3 = IntOffsetKt.d(V2.o0(Offset.e((((long) Float.floatToRawIntBits((float) ((int) (a3 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((int) (a3 >> 32)))) << 32))));
        int k3 = ((int) (a2 >> 32)) - IntOffset.k(d3);
        if (k3 < 0) {
            k3 = 0;
        }
        int l3 = i2 - IntOffset.l(d3);
        int i3 = l3 < 0 ? 0 : l3;
        return (k2 == 0 && l2 == 0 && k3 == 0 && i3 == 0) ? windowInsetsCompat2 : windowInsetsCompat2.n(k2, l2, k3, i3);
    }

    public final void C() {
        if (this.a0) {
            this.f19200B.postOnAnimation(new a(this.R));
        } else {
            this.b0.P0();
        }
    }

    public final int E(int i2, int i3, int i4) {
        return (i4 >= 0 || i2 == i3) ? View.MeasureSpec.makeMeasureSpec(RangesKt.o(i4, i2, i3), 1073741824) : (i4 != -2 || i3 == Integer.MAX_VALUE) ? (i4 != -1 || i3 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void F() {
        int i2;
        int i3 = this.U;
        if (i3 != Integer.MIN_VALUE && (i2 = this.V) != Integer.MIN_VALUE) {
            measure(i3, i2);
        }
    }

    public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        this.P = new WindowInsetsCompat(windowInsetsCompat);
        return B(windowInsetsCompat);
    }

    public void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.f19199A;
            float c2 = AndroidViewHolder_androidKt.g(i2);
            float c3 = AndroidViewHolder_androidKt.g(i3);
            long floatToRawIntBits = (long) Float.floatToRawIntBits(c2);
            long e2 = Offset.e((((long) Float.floatToRawIntBits(c3)) & 4294967295L) | (floatToRawIntBits << 32));
            float c4 = AndroidViewHolder_androidKt.g(i4);
            float c5 = AndroidViewHolder_androidKt.g(i5);
            long floatToRawIntBits2 = (long) Float.floatToRawIntBits(c4);
            long b2 = nestedScrollDispatcher.b(e2, Offset.e((((long) Float.floatToRawIntBits(c5)) & 4294967295L) | (floatToRawIntBits2 << 32)), AndroidViewHolder_androidKt.i(i6));
            iArr[0] = NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (b2 >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (b2 & 4294967295L)));
        }
    }

    public void g() {
        this.G.invoke();
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.T);
        int[] iArr = this.T;
        int i2 = iArr[0];
        region.op(i2, iArr[1], i2 + getWidth(), this.T[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Density getDensity() {
        return this.J;
    }

    public final View getInteropView() {
        return this.f19200B;
    }

    public final LayoutNode getLayoutNode() {
        return this.b0;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f19200B.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.L;
    }

    public final Modifier getModifier() {
        return this.H;
    }

    public int getNestedScrollAxes() {
        return this.W.a();
    }

    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.K;
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.I;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.S;
    }

    public final Function0<Unit> getRelease() {
        return this.G;
    }

    public final Function0<Unit> getReset() {
        return this.F;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.M;
    }

    public final Function0<Unit> getUpdate() {
        return this.D;
    }

    public final View getView() {
        return this.f19200B;
    }

    public void i() {
        this.F.invoke();
        if (ComposeUiFlags.f15478f && hasFocus() && isInTouchMode() && Build.VERSION.SDK_INT > 28) {
            findFocus().clearFocus();
        }
        removeAllViewsInLayout();
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        C();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f19200B.isNestedScrollingEnabled();
    }

    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.f19199A;
            float c2 = AndroidViewHolder_androidKt.g(i2);
            float c3 = AndroidViewHolder_androidKt.g(i3);
            long floatToRawIntBits = (long) Float.floatToRawIntBits(c2);
            long e2 = Offset.e((((long) Float.floatToRawIntBits(c3)) & 4294967295L) | (floatToRawIntBits << 32));
            float c4 = AndroidViewHolder_androidKt.g(i4);
            float c5 = AndroidViewHolder_androidKt.g(i5);
            long floatToRawIntBits2 = (long) Float.floatToRawIntBits(c4);
            nestedScrollDispatcher.b(e2, Offset.e((((long) Float.floatToRawIntBits(c5)) & 4294967295L) | (floatToRawIntBits2 << 32)), AndroidViewHolder_androidKt.i(i6));
        }
    }

    public boolean l(View view, View view2, int i2, int i3) {
        return ((i2 & 2) == 0 && (i2 & 1) == 0) ? false : true;
    }

    public void m(View view, View view2, int i2, int i3) {
        this.W.c(view, view2, i2, i3);
    }

    public void n(View view, int i2) {
        this.W.d(view, i2);
    }

    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.f19199A;
            float c2 = AndroidViewHolder_androidKt.g(i2);
            float c3 = AndroidViewHolder_androidKt.g(i3);
            long floatToRawIntBits = (long) Float.floatToRawIntBits(c2);
            long d2 = nestedScrollDispatcher.d(Offset.e((((long) Float.floatToRawIntBits(c3)) & 4294967295L) | (floatToRawIntBits << 32)), AndroidViewHolder_androidKt.i(i4));
            iArr[0] = NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (d2 >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (d2 & 4294967295L)));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.invoke();
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        C();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.f19200B.layout(0, 0, i4 - i2, i5 - i3);
    }

    public void onMeasure(int i2, int i3) {
        if (this.f19200B.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        } else if (this.f19200B.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
        } else {
            this.f19200B.measure(i2, i3);
            setMeasuredDimension(this.f19200B.getMeasuredWidth(), this.f19200B.getMeasuredHeight());
            this.U = i2;
            this.V = i3;
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long a2 = VelocityKt.a(AndroidViewHolder_androidKt.h(f2), AndroidViewHolder_androidKt.h(f3));
        Job unused = BuildersKt__Builders_commonKt.d(this.f19199A.e(), (CoroutineContext) null, (CoroutineStart) null, new AndroidViewHolder$onNestedFling$1(z2, this, a2, (Continuation) null), 3, (Object) null);
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        Job unused = BuildersKt__Builders_commonKt.d(this.f19199A.e(), (CoroutineContext) null, (CoroutineStart) null, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.a(AndroidViewHolder_androidKt.h(f2), AndroidViewHolder_androidKt.h(f3)), (Continuation) null), 3, (Object) null);
        return false;
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void p() {
        if (this.f19200B.getParent() != this) {
            addView(this.f19200B);
        } else {
            this.F.invoke();
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        Function1 function1 = this.S;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void setDensity(Density density) {
        if (density != this.J) {
            this.J = density;
            Function1 function1 = this.K;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.L) {
            this.L = lifecycleOwner;
            ViewTreeLifecycleOwner.b(this, lifecycleOwner);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.H) {
            this.H = modifier;
            Function1 function1 = this.I;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super Density, Unit> function1) {
        this.K = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, Unit> function1) {
        this.I = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.S = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.G = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.F = function0;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.M) {
            this.M = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.b(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.D = function0;
        this.E = true;
        this.Q.invoke();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean v0() {
        return isAttachedToWindow();
    }

    public final Insets z(Insets insets, int i2, int i3, int i4, int i5) {
        int i6 = insets.f19774a - i2;
        int i7 = 0;
        if (i6 < 0) {
            i6 = 0;
        }
        int i8 = insets.f19775b - i3;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = insets.f19776c - i4;
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = insets.f19777d - i5;
        if (i10 >= 0) {
            i7 = i10;
        }
        return Insets.b(i6, i8, i9, i7);
    }
}
