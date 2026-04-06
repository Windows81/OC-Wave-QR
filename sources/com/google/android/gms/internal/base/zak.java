package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class zak extends Drawable implements Drawable.Callback {

    /* renamed from: A  reason: collision with root package name */
    public long f25268A;

    /* renamed from: B  reason: collision with root package name */
    public int f25269B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public zaj H;
    public Drawable I;
    public Drawable J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;

    /* renamed from: z  reason: collision with root package name */
    public int f25270z;

    public zak(Drawable drawable, Drawable drawable2) {
        this((zaj) null);
        drawable = drawable == null ? zai.f25264a : drawable;
        this.I = drawable;
        drawable.setCallback(this);
        zaj zaj = this.H;
        zaj.f25267b = drawable.getChangingConfigurations() | zaj.f25267b;
        drawable2 = drawable2 == null ? zai.f25264a : drawable2;
        this.J = drawable2;
        drawable2.setCallback(this);
        zaj zaj2 = this.H;
        zaj2.f25267b = drawable2.getChangingConfigurations() | zaj2.f25267b;
    }

    public final Drawable a() {
        return this.J;
    }

    public final void b(int i2) {
        this.f25269B = this.C;
        this.E = 0;
        this.D = 250;
        this.f25270z = 1;
        invalidateSelf();
    }

    public final boolean c() {
        if (!this.K) {
            boolean z2 = false;
            if (!(this.I.getConstantState() == null || this.J.getConstantState() == null)) {
                z2 = true;
            }
            this.L = z2;
            this.K = true;
        }
        return this.L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r0 == 0) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.f25270z
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x000b
        L_0x0009:
            r4 = r3
            goto L_0x0043
        L_0x000b:
            long r0 = r7.f25268A
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0009
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f25268A
            long r0 = r0 - r4
            int r4 = r7.D
            float r4 = (float) r4
            float r0 = (float) r0
            float r0 = r0 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0027
            r4 = r3
            goto L_0x0028
        L_0x0027:
            r4 = r2
        L_0x0028:
            if (r4 == 0) goto L_0x002c
            r7.f25270z = r2
        L_0x002c:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f25269B
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.E = r0
            goto L_0x0043
        L_0x003a:
            long r4 = android.os.SystemClock.uptimeMillis()
            r7.f25268A = r4
            r7.f25270z = r1
            r4 = r2
        L_0x0043:
            int r0 = r7.E
            boolean r1 = r7.F
            android.graphics.drawable.Drawable r5 = r7.I
            android.graphics.drawable.Drawable r6 = r7.J
            if (r4 == 0) goto L_0x0062
            if (r1 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0057
            goto L_0x0053
        L_0x0052:
            r2 = r0
        L_0x0053:
            r5.draw(r8)
            r0 = r2
        L_0x0057:
            int r1 = r7.C
            if (r0 != r1) goto L_0x0061
            r6.setAlpha(r1)
            r6.draw(r8)
        L_0x0061:
            return
        L_0x0062:
            if (r1 == 0) goto L_0x006b
            int r1 = r7.C
            int r1 = r1 - r0
            r5.setAlpha(r1)
            r2 = r3
        L_0x006b:
            r5.draw(r8)
            if (r2 == 0) goto L_0x0075
            int r1 = r7.C
            r5.setAlpha(r1)
        L_0x0075:
            if (r0 <= 0) goto L_0x0082
            r6.setAlpha(r0)
            r6.draw(r8)
            int r8 = r7.C
            r6.setAlpha(r8)
        L_0x0082:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zak.draw(android.graphics.Canvas):void");
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zaj zaj = this.H;
        return changingConfigurations | zaj.f25266a | zaj.f25267b;
    }

    public final Drawable.ConstantState getConstantState() {
        if (!c()) {
            return null;
        }
        this.H.f25266a = getChangingConfigurations();
        return this.H;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.I.getIntrinsicHeight(), this.J.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.I.getIntrinsicWidth(), this.J.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.M) {
            this.N = Drawable.resolveOpacity(this.I.getOpacity(), this.J.getOpacity());
            this.M = true;
        }
        return this.N;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        if (!this.G && super.mutate() == this) {
            if (c()) {
                this.I.mutate();
                this.J.mutate();
                this.G = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.I.setBounds(rect);
        this.J.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (this.E == this.C) {
            this.E = i2;
        }
        this.C = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.I.setColorFilter(colorFilter);
        this.J.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public zak(zaj zaj) {
        this.f25270z = 0;
        this.C = 255;
        this.E = 0;
        this.F = true;
        this.H = new zaj(zaj);
    }
}
