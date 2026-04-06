package coil.drawable;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback, Animatable2Compat {
    public static final Companion L = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final int f23428A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f23429B;
    public final boolean C;
    public final List D = new ArrayList();
    public final int E;
    public final int F;
    public long G;
    public int H;
    public int I;
    public Drawable J;
    public final Drawable K;

    /* renamed from: z  reason: collision with root package name */
    public final Scale f23430z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2, Scale scale, int i2, boolean z2, boolean z3) {
        this.f23430z = scale;
        this.f23428A = i2;
        this.f23429B = z2;
        this.C = z3;
        Drawable drawable3 = null;
        this.E = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.F = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.H = 255;
        this.J = drawable != null ? drawable.mutate() : null;
        drawable3 = drawable2 != null ? drawable2.mutate() : drawable3;
        this.K = drawable3;
        if (i2 > 0) {
            Drawable drawable4 = this.J;
            if (drawable4 != null) {
                drawable4.setCallback(this);
            }
            if (drawable3 != null) {
                drawable3.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }

    public final int a(Integer num, Integer num2) {
        int i2 = -1;
        if (!this.C && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        int intValue = num != null ? num.intValue() : -1;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return Math.max(intValue, i2);
    }

    public final void b() {
        this.I = 2;
        this.J = null;
        List list = this.D;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Animatable2Compat.AnimationCallback) list.get(i2)).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c2 = DecodeUtils.c(intrinsicWidth, intrinsicHeight, width, height, this.f23430z);
        double d2 = (double) 2;
        int c3 = MathKt.c((((double) width) - (((double) intrinsicWidth) * c2)) / d2);
        int c4 = MathKt.c((((double) height) - (c2 * ((double) intrinsicHeight))) / d2);
        drawable.setBounds(rect.left + c3, rect.top + c4, rect.right - c3, rect.bottom - c4);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i2 = this.I;
        if (i2 == 0) {
            Drawable drawable2 = this.J;
            if (drawable2 != null) {
                drawable2.setAlpha(this.H);
                int save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else if (i2 == 2) {
            Drawable drawable3 = this.K;
            if (drawable3 != null) {
                drawable3.setAlpha(this.H);
                int save2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } else {
            double uptimeMillis = ((double) (SystemClock.uptimeMillis() - this.G)) / ((double) this.f23428A);
            double m2 = RangesKt.m(uptimeMillis, 0.0d, 1.0d);
            int i3 = this.H;
            int i4 = (int) (m2 * ((double) i3));
            if (this.f23429B) {
                i3 -= i4;
            }
            boolean z2 = uptimeMillis >= 1.0d;
            if (!z2 && (drawable = this.J) != null) {
                drawable.setAlpha(i3);
                int save3 = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            Drawable drawable4 = this.K;
            if (drawable4 != null) {
                drawable4.setAlpha(i4);
                int save4 = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            if (z2) {
                b();
            } else {
                invalidateSelf();
            }
        }
    }

    public int getAlpha() {
        return this.H;
    }

    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i2 = this.I;
        if (i2 == 0) {
            Drawable drawable2 = this.J;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        } else if (i2 == 1) {
            Drawable drawable3 = this.K;
            if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable4 = this.J;
            if (drawable4 != null) {
                return drawable4.getColorFilter();
            }
            return null;
        } else if (i2 == 2 && (drawable = this.K) != null) {
            return drawable.getColorFilter();
        } else {
            return null;
        }
    }

    public int getIntrinsicHeight() {
        return this.F;
    }

    public int getIntrinsicWidth() {
        return this.E;
    }

    public int getOpacity() {
        Drawable drawable = this.J;
        Drawable drawable2 = this.K;
        int i2 = this.I;
        if (i2 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        } else if (i2 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.I == 1;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.J;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.J;
        boolean level = drawable != null ? drawable.setLevel(i2) : false;
        Drawable drawable2 = this.K;
        return level || (drawable2 != null ? drawable2.setLevel(i2) : false);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.J;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.K;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        if (i2 < 0 || i2 >= 256) {
            throw new IllegalArgumentException(("Invalid alpha: " + i2).toString());
        }
        this.H = i2;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i2) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setTint(i2);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setTint(i2);
        }
    }

    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.J
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.start()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r4.K
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.start()
        L_0x001e:
            int r0 = r4.I
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            r0 = 1
            r4.I = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.G = r0
            java.util.List r0 = r4.D
            int r1 = r0.size()
            r2 = 0
        L_0x0033:
            if (r2 >= r1) goto L_0x0041
            java.lang.Object r3 = r0.get(r2)
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r3 = (androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) r3
            r3.b(r4)
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0041:
            r4.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.drawable.CrossfadeDrawable.start():void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.J
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.stop()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r3.K
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.stop()
        L_0x001e:
            int r0 = r3.I
            r1 = 2
            if (r0 == r1) goto L_0x0026
            r3.b()
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.drawable.CrossfadeDrawable.stop():void");
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
