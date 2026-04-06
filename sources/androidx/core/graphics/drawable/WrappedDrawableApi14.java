package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {
    public static final PorterDuff.Mode F = PorterDuff.Mode.SRC_IN;

    /* renamed from: A  reason: collision with root package name */
    public PorterDuff.Mode f19849A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f19850B;
    public WrappedDrawableState C;
    public boolean D;
    public Drawable E;

    /* renamed from: z  reason: collision with root package name */
    public int f19851z;

    public WrappedDrawableApi14(WrappedDrawableState wrappedDrawableState, Resources resources) {
        this.C = wrappedDrawableState;
        e(resources);
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.C;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.f19853b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.E;
    }

    public boolean c() {
        return true;
    }

    public final WrappedDrawableState d() {
        return new WrappedDrawableState(this.C);
    }

    public void draw(Canvas canvas) {
        this.E.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        WrappedDrawableState wrappedDrawableState = this.C;
        if (wrappedDrawableState != null && (constantState = wrappedDrawableState.f19853b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.C;
        ColorStateList colorStateList = wrappedDrawableState.f19854c;
        PorterDuff.Mode mode = wrappedDrawableState.f19855d;
        if (colorStateList == null || mode == null) {
            this.f19850B = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f19850B && colorForState == this.f19851z && mode == this.f19849A)) {
                setColorFilter(colorForState, mode);
                this.f19851z = colorForState;
                this.f19849A = mode;
                this.f19850B = true;
                return true;
            }
        }
        return false;
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.C;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.E.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.C;
        if (wrappedDrawableState == null || !wrappedDrawableState.a()) {
            return null;
        }
        this.C.f19852a = getChangingConfigurations();
        return this.C;
    }

    public Drawable getCurrent() {
        return this.E.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.E.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.E.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return DrawableCompat.e(this.E);
    }

    public int getMinimumHeight() {
        return this.E.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.E.getMinimumWidth();
    }

    public int getOpacity() {
        return this.E.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.E.getPadding(rect);
    }

    public int[] getState() {
        return this.E.getState();
    }

    public Region getTransparentRegion() {
        return this.E.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return DrawableCompat.g(this.E);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r1.C
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f19854c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.E
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.WrappedDrawableApi14.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.E.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.D && super.mutate() == this) {
            this.C = d();
            Drawable drawable = this.E;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState = this.C;
            if (wrappedDrawableState != null) {
                Drawable drawable2 = this.E;
                wrappedDrawableState.f19853b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.D = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return DrawableCompat.l(this.E, i2);
    }

    public boolean onLevelChange(int i2) {
        return this.E.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.E.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z2) {
        DrawableCompat.i(this.E, z2);
    }

    public void setChangingConfigurations(int i2) {
        this.E.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.E.setColorFilter(colorFilter);
    }

    public void setDither(boolean z2) {
        this.E.setDither(z2);
    }

    public void setFilterBitmap(boolean z2) {
        this.E.setFilterBitmap(z2);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.E.setState(iArr);
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.C.f19854c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.C.f19855d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.E.setVisible(z2, z3);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
