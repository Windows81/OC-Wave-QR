package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
public final class RippleHostView extends View {
    public static final Companion E = new Companion((DefaultConstructorMarker) null);
    public static final int F = 8;
    public static final int[] G = {16842919, 16842910};
    public static final int[] H = new int[0];

    /* renamed from: A  reason: collision with root package name */
    public Boolean f9080A;

    /* renamed from: B  reason: collision with root package name */
    public Long f9081B;
    public Runnable C;
    public Function0 D;

    /* renamed from: z  reason: collision with root package name */
    public UnprojectedRipple f9082z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RippleHostView(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.C;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l2 = this.f9081B;
        long longValue = currentAnimationTimeMillis - (l2 != null ? l2.longValue() : 0);
        if (z2 || longValue >= 5) {
            int[] iArr = z2 ? G : H;
            UnprojectedRipple unprojectedRipple = this.f9082z;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        } else {
            a aVar = new a(this);
            this.C = aVar;
            postDelayed(aVar, 50);
        }
        this.f9081B = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.f9082z;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(H);
        }
        rippleHostView.C = null;
    }

    public final void b(PressInteraction.Press press, boolean z2, long j2, int i2, long j3, float f2, Function0 function0) {
        boolean z3 = z2;
        if (this.f9082z == null || !Intrinsics.d(Boolean.valueOf(z2), this.f9080A)) {
            c(z2);
            this.f9080A = Boolean.valueOf(z2);
        }
        UnprojectedRipple unprojectedRipple = this.f9082z;
        Intrinsics.f(unprojectedRipple);
        this.D = function0;
        f(j2, i2, j3, f2);
        if (z3) {
            unprojectedRipple.setHotspot(Offset.m(press.a()), Offset.n(press.a()));
        } else {
            unprojectedRipple.setHotspot((float) unprojectedRipple.getBounds().centerX(), (float) unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c(boolean z2) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z2);
        setBackground(unprojectedRipple);
        this.f9082z = unprojectedRipple;
    }

    public final void d() {
        this.D = null;
        Runnable runnable = this.C;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.C;
            Intrinsics.f(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.f9082z;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(H);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.f9082z;
        if (unprojectedRipple2 != null) {
            unprojectedRipple2.setVisible(false, false);
            unscheduleDrawable(unprojectedRipple2);
        }
    }

    public void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            d();
        } else {
            super.draw(canvas);
        }
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j2, int i2, long j3, float f2) {
        UnprojectedRipple unprojectedRipple = this.f9082z;
        if (unprojectedRipple != null) {
            unprojectedRipple.c(i2);
            unprojectedRipple.b(j3, f2);
            Rect rect = new Rect(0, 0, MathKt.d(Size.i(j2)), MathKt.d(Size.g(j2)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            unprojectedRipple.setBounds(rect);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.D;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }
}
