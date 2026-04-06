package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class DrawablePainter extends Painter implements RememberObserver {
    public final Drawable F;
    public final MutableState G = SnapshotStateKt__SnapshotStateKt.e(0, (SnapshotMutationPolicy) null, 2, (Object) null);
    public final MutableState H;
    public final Lazy I;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23810a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f23810a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.drawablepainter.DrawablePainter.WhenMappings.<clinit>():void");
        }
    }

    public DrawablePainter(Drawable drawable) {
        Intrinsics.i(drawable, "drawable");
        this.F = drawable;
        this.H = SnapshotStateKt__SnapshotStateKt.e(Size.c(DrawablePainterKt.c(drawable)), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.I = LazyKt.b(new DrawablePainter$callback$2(this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    public boolean a(float f2) {
        this.F.setAlpha(RangesKt.o(MathKt.d(f2 * ((float) 255)), 0, 255));
        return true;
    }

    public boolean b(ColorFilter colorFilter) {
        this.F.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.c(colorFilter) : null);
        return true;
    }

    public boolean c(LayoutDirection layoutDirection) {
        Intrinsics.i(layoutDirection, "layoutDirection");
        Drawable drawable = this.F;
        int i2 = WhenMappings.f23810a[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i3);
    }

    public void e() {
        f();
    }

    public void f() {
        Drawable drawable = this.F;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.F.setVisible(false, false);
        this.F.setCallback((Drawable.Callback) null);
    }

    public void h() {
        this.F.setCallback(q());
        this.F.setVisible(true, true);
        Drawable drawable = this.F;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public long k() {
        return t();
    }

    public void m(DrawScope drawScope) {
        Intrinsics.i(drawScope, "<this>");
        Canvas j2 = drawScope.G1().j();
        r();
        this.F.setBounds(0, 0, MathKt.d(Size.i(drawScope.c())), MathKt.d(Size.g(drawScope.c())));
        try {
            j2.o();
            this.F.draw(AndroidCanvas_androidKt.d(j2));
        } finally {
            j2.t();
        }
    }

    public final Drawable.Callback q() {
        return (Drawable.Callback) this.I.getValue();
    }

    public final int r() {
        return ((Number) this.G.getValue()).intValue();
    }

    public final Drawable s() {
        return this.F;
    }

    public final long t() {
        return ((Size) this.H.getValue()).m();
    }

    public final void u(int i2) {
        this.G.setValue(Integer.valueOf(i2));
    }

    public final void v(long j2) {
        this.H.setValue(Size.c(j2));
    }
}
