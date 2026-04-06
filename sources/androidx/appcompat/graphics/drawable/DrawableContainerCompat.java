package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.core.graphics.drawable.DrawableCompat;

public class DrawableContainerCompat extends Drawable implements Drawable.Callback {

    /* renamed from: A  reason: collision with root package name */
    public Rect f709A;

    /* renamed from: B  reason: collision with root package name */
    public Drawable f710B;
    public Drawable C;
    public int D = 255;
    public boolean E;
    public int F = -1;
    public boolean G;
    public Runnable H;
    public long I;
    public long J;
    public BlockInvalidateCallback K;

    /* renamed from: z  reason: collision with root package name */
    public DrawableContainerState f711z;

    public static class Api21Impl {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    public static class BlockInvalidateCallback implements Drawable.Callback {

        /* renamed from: z  reason: collision with root package name */
        public Drawable.Callback f713z;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f713z;
            this.f713z = null;
            return callback;
        }

        public BlockInvalidateCallback b(Drawable.Callback callback) {
            this.f713z = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f713z;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f713z;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class DrawableContainerState extends Drawable.ConstantState {

        /* renamed from: A  reason: collision with root package name */
        public int f714A = 0;

        /* renamed from: B  reason: collision with root package name */
        public int f715B = 0;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final DrawableContainerCompat f716a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f717b;

        /* renamed from: c  reason: collision with root package name */
        public int f718c;

        /* renamed from: d  reason: collision with root package name */
        public int f719d;

        /* renamed from: e  reason: collision with root package name */
        public int f720e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray f721f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f722g;

        /* renamed from: h  reason: collision with root package name */
        public int f723h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f724i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f725j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f726k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f727l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f728m;

        /* renamed from: n  reason: collision with root package name */
        public int f729n;

        /* renamed from: o  reason: collision with root package name */
        public int f730o;

        /* renamed from: p  reason: collision with root package name */
        public int f731p;

        /* renamed from: q  reason: collision with root package name */
        public int f732q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f733r;

        /* renamed from: s  reason: collision with root package name */
        public int f734s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f735t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f736u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f737v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f738w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f739x = true;

        /* renamed from: y  reason: collision with root package name */
        public boolean f740y;

        /* renamed from: z  reason: collision with root package name */
        public int f741z;

        public DrawableContainerState(DrawableContainerState drawableContainerState, DrawableContainerCompat drawableContainerCompat, Resources resources) {
            this.f716a = drawableContainerCompat;
            Rect rect = null;
            this.f717b = resources != null ? resources : drawableContainerState != null ? drawableContainerState.f717b : null;
            int f2 = DrawableContainerCompat.f(resources, drawableContainerState != null ? drawableContainerState.f718c : 0);
            this.f718c = f2;
            if (drawableContainerState != null) {
                this.f719d = drawableContainerState.f719d;
                this.f720e = drawableContainerState.f720e;
                this.f737v = true;
                this.f738w = true;
                this.f724i = drawableContainerState.f724i;
                this.f727l = drawableContainerState.f727l;
                this.f739x = drawableContainerState.f739x;
                this.f740y = drawableContainerState.f740y;
                this.f741z = drawableContainerState.f741z;
                this.f714A = drawableContainerState.f714A;
                this.f715B = drawableContainerState.f715B;
                this.C = drawableContainerState.C;
                this.D = drawableContainerState.D;
                this.E = drawableContainerState.E;
                this.F = drawableContainerState.F;
                this.G = drawableContainerState.G;
                this.H = drawableContainerState.H;
                this.I = drawableContainerState.I;
                if (drawableContainerState.f718c == f2) {
                    if (drawableContainerState.f725j) {
                        this.f726k = drawableContainerState.f726k != null ? new Rect(drawableContainerState.f726k) : rect;
                        this.f725j = true;
                    }
                    if (drawableContainerState.f728m) {
                        this.f729n = drawableContainerState.f729n;
                        this.f730o = drawableContainerState.f730o;
                        this.f731p = drawableContainerState.f731p;
                        this.f732q = drawableContainerState.f732q;
                        this.f728m = true;
                    }
                }
                if (drawableContainerState.f733r) {
                    this.f734s = drawableContainerState.f734s;
                    this.f733r = true;
                }
                if (drawableContainerState.f735t) {
                    this.f736u = drawableContainerState.f736u;
                    this.f735t = true;
                }
                Drawable[] drawableArr = drawableContainerState.f722g;
                this.f722g = new Drawable[drawableArr.length];
                this.f723h = drawableContainerState.f723h;
                SparseArray sparseArray = drawableContainerState.f721f;
                if (sparseArray != null) {
                    this.f721f = sparseArray.clone();
                } else {
                    this.f721f = new SparseArray(this.f723h);
                }
                int i2 = this.f723h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f721f.put(i3, constantState);
                        } else {
                            this.f722g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f722g = new Drawable[10];
            this.f723h = 0;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f723h;
            if (i2 >= this.f722g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f716a);
            this.f722g[i2] = drawable;
            this.f723h++;
            this.f720e = drawable.getChangingConfigurations() | this.f720e;
            p();
            this.f726k = null;
            this.f725j = false;
            this.f728m = false;
            this.f737v = false;
            return i2;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f723h;
                Drawable[] drawableArr = this.f722g;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null && DrawableCompat.b(drawable)) {
                        DrawableCompat.a(drawableArr[i3], theme);
                        this.f720e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                z(Api21Impl.c(theme));
            }
        }

        public boolean c() {
            if (this.f737v) {
                return this.f738w;
            }
            e();
            this.f737v = true;
            int i2 = this.f723h;
            Drawable[] drawableArr = this.f722g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.f738w = false;
                    return false;
                }
            }
            this.f738w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i2 = this.f723h;
            Drawable[] drawableArr = this.f722g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f721f.get(i3);
                    if (constantState != null && Api21Impl.a(constantState)) {
                        return true;
                    }
                } else if (DrawableCompat.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            this.f728m = true;
            e();
            int i2 = this.f723h;
            Drawable[] drawableArr = this.f722g;
            this.f730o = -1;
            this.f729n = -1;
            this.f732q = 0;
            this.f731p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f729n) {
                    this.f729n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f730o) {
                    this.f730o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f731p) {
                    this.f731p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f732q) {
                    this.f732q = minimumHeight;
                }
            }
        }

        public final void e() {
            SparseArray sparseArray = this.f721f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f722g[this.f721f.keyAt(i2)] = t(((Drawable.ConstantState) this.f721f.valueAt(i2)).newDrawable(this.f717b));
                }
                this.f721f = null;
            }
        }

        public final int f() {
            return this.f722g.length;
        }

        public final Drawable g(int i2) {
            int indexOfKey;
            Drawable drawable = this.f722g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f721f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable t2 = t(((Drawable.ConstantState) this.f721f.valueAt(indexOfKey)).newDrawable(this.f717b));
            this.f722g[i2] = t2;
            this.f721f.removeAt(indexOfKey);
            if (this.f721f.size() == 0) {
                this.f721f = null;
            }
            return t2;
        }

        public int getChangingConfigurations() {
            return this.f719d | this.f720e;
        }

        public final int h() {
            return this.f723h;
        }

        public final int i() {
            if (!this.f728m) {
                d();
            }
            return this.f730o;
        }

        public final int j() {
            if (!this.f728m) {
                d();
            }
            return this.f732q;
        }

        public final int k() {
            if (!this.f728m) {
                d();
            }
            return this.f731p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f724i) {
                return null;
            }
            Rect rect2 = this.f726k;
            if (rect2 != null || this.f725j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f723h;
            Drawable[] drawableArr = this.f722g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f725j = true;
            this.f726k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f728m) {
                d();
            }
            return this.f729n;
        }

        public final int n() {
            if (this.f733r) {
                return this.f734s;
            }
            e();
            int i2 = this.f723h;
            Drawable[] drawableArr = this.f722g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.f734s = opacity;
            this.f733r = true;
            return opacity;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f722g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f722g = drawableArr;
        }

        public void p() {
            this.f733r = false;
            this.f735t = false;
        }

        public final boolean q() {
            return this.f727l;
        }

        public final boolean r() {
            if (this.f735t) {
                return this.f736u;
            }
            e();
            int i2 = this.f723h;
            Drawable[] drawableArr = this.f722g;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                } else if (drawableArr[i3].isStateful()) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.f736u = z2;
            this.f735t = true;
            return z2;
        }

        public void s() {
            int i2 = this.f723h;
            Drawable[] drawableArr = this.f722g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f740y = true;
        }

        public final Drawable t(Drawable drawable) {
            DrawableCompat.l(drawable, this.f741z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f716a);
            return mutate;
        }

        public final void u(boolean z2) {
            this.f727l = z2;
        }

        public final void v(int i2) {
            this.f714A = i2;
        }

        public final void w(int i2) {
            this.f715B = i2;
        }

        public final boolean x(int i2, int i3) {
            int i4 = this.f723h;
            Drawable[] drawableArr = this.f722g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    boolean l2 = DrawableCompat.l(drawable, i2);
                    if (i5 == i3) {
                        z2 = l2;
                    }
                }
            }
            this.f741z = i2;
            return z2;
        }

        public final void y(boolean z2) {
            this.f724i = z2;
        }

        public final void z(Resources resources) {
            if (resources != null) {
                this.f717b = resources;
                int f2 = DrawableContainerCompat.f(resources, this.f718c);
                int i2 = this.f718c;
                this.f718c = f2;
                if (i2 != f2) {
                    this.f728m = false;
                    this.f725j = false;
                }
            }
        }
    }

    public static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.E = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f710B
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.I
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.D
            r3.setAlpha(r9)
            r13.I = r6
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r10 = r13.f711z
            int r10 = r10.f714A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.D
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.I = r6
        L_0x0038:
            r3 = r8
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.C
            if (r9 == 0) goto L_0x0061
            long r10 = r13.J
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r8, r8)
            r0 = 0
            r13.C = r0
            r13.J = r6
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r4 = r13.f711z
            int r4 = r4.f715B
            int r3 = r3 / r4
            int r4 = r13.D
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.J = r6
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.H
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainerCompat.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f711z.b(theme);
    }

    public DrawableContainerState b() {
        return this.f711z;
    }

    public int c() {
        return this.F;
    }

    public boolean canApplyTheme() {
        return this.f711z.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.K == null) {
            this.K = new BlockInvalidateCallback();
        }
        drawable.setCallback(this.K.b(drawable.getCallback()));
        try {
            if (this.f711z.f714A <= 0 && this.E) {
                drawable.setAlpha(this.D);
            }
            DrawableContainerState drawableContainerState = this.f711z;
            if (drawableContainerState.E) {
                drawable.setColorFilter(drawableContainerState.D);
            } else {
                if (drawableContainerState.H) {
                    DrawableCompat.n(drawable, drawableContainerState.F);
                }
                DrawableContainerState drawableContainerState2 = this.f711z;
                if (drawableContainerState2.I) {
                    DrawableCompat.o(drawable, drawableContainerState2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f711z.f739x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            DrawableCompat.l(drawable, DrawableCompat.e(this));
            DrawableCompat.i(drawable, this.f711z.C);
            Rect rect = this.f709A;
            if (rect != null) {
                DrawableCompat.k(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.K.a());
        } catch (Throwable th) {
            drawable.setCallback(this.K.a());
            throw th;
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f710B;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        return isAutoMirrored() && DrawableCompat.e(this) == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.F
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.f711z
            int r0 = r0.f715B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.C
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f710B
            if (r0 == 0) goto L_0x0029
            r9.C = r0
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.f711z
            int r0 = r0.f715B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.J = r0
            goto L_0x0035
        L_0x0029:
            r9.C = r4
            r9.J = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f710B
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.f711z
            int r1 = r0.f723h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f710B = r0
            r9.F = r10
            if (r0 == 0) goto L_0x005a
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r10 = r9.f711z
            int r10 = r10.f714A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.I = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f710B = r4
            r10 = -1
            r9.F = r10
        L_0x005a:
            long r0 = r9.I
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.J
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.H
            if (r10 != 0) goto L_0x0073
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$1 r10 = new androidx.appcompat.graphics.drawable.DrawableContainerCompat$1
            r10.<init>()
            r9.H = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainerCompat.g(int):boolean");
    }

    public int getAlpha() {
        return this.D;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f711z.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f711z.c()) {
            return null;
        }
        this.f711z.f719d = getChangingConfigurations();
        return this.f711z;
    }

    public Drawable getCurrent() {
        return this.f710B;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f709A;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f711z.q()) {
            return this.f711z.i();
        }
        Drawable drawable = this.f710B;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f711z.q()) {
            return this.f711z.m();
        }
        Drawable drawable = this.f710B;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f711z.q()) {
            return this.f711z.j();
        }
        Drawable drawable = this.f710B;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f711z.q()) {
            return this.f711z.k();
        }
        Drawable drawable = this.f710B;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f710B;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f711z.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f710B;
        if (drawable != null) {
            Api21Impl.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z2;
        Rect l2 = this.f711z.l();
        if (l2 != null) {
            rect.set(l2);
            z2 = (l2.right | ((l2.left | l2.top) | l2.bottom)) != 0;
        } else {
            Drawable drawable = this.f710B;
            z2 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z2;
    }

    public void h(DrawableContainerState drawableContainerState) {
        this.f711z = drawableContainerState;
        int i2 = this.F;
        if (i2 >= 0) {
            Drawable g2 = drawableContainerState.g(i2);
            this.f710B = g2;
            if (g2 != null) {
                d(g2);
            }
        }
        this.C = null;
    }

    public final void i(Resources resources) {
        this.f711z.z(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        DrawableContainerState drawableContainerState = this.f711z;
        if (drawableContainerState != null) {
            drawableContainerState.p();
        }
        if (drawable == this.f710B && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f711z.C;
    }

    public boolean isStateful() {
        return this.f711z.r();
    }

    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.C;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.C = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f710B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.E) {
                this.f710B.setAlpha(this.D);
            }
        }
        if (this.J != 0) {
            this.J = 0;
            z2 = true;
        }
        if (this.I != 0) {
            this.I = 0;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.G && super.mutate() == this) {
            DrawableContainerState b2 = b();
            b2.s();
            h(b2);
            this.G = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f710B;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.f711z.x(i2, c());
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.C;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f710B;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.C;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f710B;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f710B && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.E || this.D != i2) {
            this.E = true;
            this.D = i2;
            Drawable drawable = this.f710B;
            if (drawable == null) {
                return;
            }
            if (this.I == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z2) {
        DrawableContainerState drawableContainerState = this.f711z;
        if (drawableContainerState.C != z2) {
            drawableContainerState.C = z2;
            Drawable drawable = this.f710B;
            if (drawable != null) {
                DrawableCompat.i(drawable, z2);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        DrawableContainerState drawableContainerState = this.f711z;
        drawableContainerState.E = true;
        if (drawableContainerState.D != colorFilter) {
            drawableContainerState.D = colorFilter;
            Drawable drawable = this.f710B;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z2) {
        DrawableContainerState drawableContainerState = this.f711z;
        if (drawableContainerState.f739x != z2) {
            drawableContainerState.f739x = z2;
            Drawable drawable = this.f710B;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f710B;
        if (drawable != null) {
            DrawableCompat.j(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f709A;
        if (rect == null) {
            this.f709A = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f710B;
        if (drawable != null) {
            DrawableCompat.k(drawable, i2, i3, i4, i5);
        }
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        DrawableContainerState drawableContainerState = this.f711z;
        drawableContainerState.H = true;
        if (drawableContainerState.F != colorStateList) {
            drawableContainerState.F = colorStateList;
            DrawableCompat.n(this.f710B, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        DrawableContainerState drawableContainerState = this.f711z;
        drawableContainerState.I = true;
        if (drawableContainerState.G != mode) {
            drawableContainerState.G = mode;
            DrawableCompat.o(this.f710B, mode);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f710B;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f710B && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
