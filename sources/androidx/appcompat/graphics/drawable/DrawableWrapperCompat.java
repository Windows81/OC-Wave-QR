package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;

public class DrawableWrapperCompat extends Drawable implements Drawable.Callback {

    /* renamed from: z  reason: collision with root package name */
    public Drawable f742z;

    public DrawableWrapperCompat(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f742z;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f742z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f742z.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f742z.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f742z.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f742z.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f742z.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f742z.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f742z.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f742z.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f742z.getPadding(rect);
    }

    public int[] getState() {
        return this.f742z.getState();
    }

    public Region getTransparentRegion() {
        return this.f742z.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return DrawableCompat.g(this.f742z);
    }

    public boolean isStateful() {
        return this.f742z.isStateful();
    }

    public void jumpToCurrentState() {
        this.f742z.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f742z.setBounds(rect);
    }

    public boolean onLevelChange(int i2) {
        return this.f742z.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f742z.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z2) {
        DrawableCompat.i(this.f742z, z2);
    }

    public void setChangingConfigurations(int i2) {
        this.f742z.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f742z.setColorFilter(colorFilter);
    }

    public void setDither(boolean z2) {
        this.f742z.setDither(z2);
    }

    public void setFilterBitmap(boolean z2) {
        this.f742z.setFilterBitmap(z2);
    }

    public void setHotspot(float f2, float f3) {
        DrawableCompat.j(this.f742z, f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        DrawableCompat.k(this.f742z, i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.f742z.setState(iArr);
    }

    public void setTint(int i2) {
        DrawableCompat.m(this.f742z, i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        DrawableCompat.n(this.f742z, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        DrawableCompat.o(this.f742z, mode);
    }

    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f742z.setVisible(z2, z3);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
