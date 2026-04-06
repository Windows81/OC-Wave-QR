package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.ColorUtils;

public final class AppCompatDrawableManager {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1078b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static AppCompatDrawableManager f1079c;

    /* renamed from: a  reason: collision with root package name */
    public ResourceManagerInternal f1080a;

    public static synchronized AppCompatDrawableManager b() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            try {
                if (f1079c == null) {
                    h();
                }
                appCompatDrawableManager = f1079c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return appCompatDrawableManager;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter k2;
        synchronized (AppCompatDrawableManager.class) {
            k2 = ResourceManagerInternal.k(i2, mode);
        }
        return k2;
    }

    public static synchronized void h() {
        synchronized (AppCompatDrawableManager.class) {
            if (f1079c == null) {
                AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                f1079c = appCompatDrawableManager;
                appCompatDrawableManager.f1080a = ResourceManagerInternal.g();
                f1079c.f1080a.t(new ResourceManagerInternal.ResourceManagerHooks() {

                    /* renamed from: a  reason: collision with root package name */
                    public final int[] f1081a = {R.drawable.R, R.drawable.P, R.drawable.f347a};

                    /* renamed from: b  reason: collision with root package name */
                    public final int[] f1082b = {R.drawable.f361o, R.drawable.f346B, R.drawable.f366t, R.drawable.f362p, R.drawable.f363q, R.drawable.f365s, R.drawable.f364r};

                    /* renamed from: c  reason: collision with root package name */
                    public final int[] f1083c = {R.drawable.O, R.drawable.Q, R.drawable.f357k, R.drawable.K, R.drawable.L, R.drawable.M, R.drawable.N};

                    /* renamed from: d  reason: collision with root package name */
                    public final int[] f1084d = {R.drawable.f369w, R.drawable.f355i, R.drawable.f368v};

                    /* renamed from: e  reason: collision with root package name */
                    public final int[] f1085e = {R.drawable.J, R.drawable.S};

                    /* renamed from: f  reason: collision with root package name */
                    public final int[] f1086f = {R.drawable.f349c, R.drawable.f353g, R.drawable.f350d, R.drawable.f354h};

                    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[RETURN] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
                        /*
                            r7 = this;
                            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.f1078b
                            int[] r1 = r7.f1081a
                            boolean r1 = r7.f(r1, r9)
                            r2 = 1
                            r3 = 0
                            r4 = -1
                            if (r1 == 0) goto L_0x0015
                            int r9 = androidx.appcompat.R.attr.f319y
                        L_0x0011:
                            r1 = r0
                            r5 = r2
                        L_0x0013:
                            r0 = r4
                            goto L_0x004f
                        L_0x0015:
                            int[] r1 = r7.f1083c
                            boolean r1 = r7.f(r1, r9)
                            if (r1 == 0) goto L_0x0020
                            int r9 = androidx.appcompat.R.attr.f317w
                            goto L_0x0011
                        L_0x0020:
                            int[] r1 = r7.f1084d
                            boolean r1 = r7.f(r1, r9)
                            r5 = 16842801(0x1010031, float:2.3693695E-38)
                            if (r1 == 0) goto L_0x0032
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                        L_0x002d:
                            r1 = r0
                            r0 = r4
                            r9 = r5
                            r5 = r2
                            goto L_0x004f
                        L_0x0032:
                            int r1 = androidx.appcompat.R.drawable.f367u
                            if (r9 != r1) goto L_0x0046
                            r9 = 1109603123(0x42233333, float:40.8)
                            int r9 = java.lang.Math.round(r9)
                            r1 = 16842800(0x1010030, float:2.3693693E-38)
                            r5 = r2
                            r6 = r0
                            r0 = r9
                            r9 = r1
                            r1 = r6
                            goto L_0x004f
                        L_0x0046:
                            int r1 = androidx.appcompat.R.drawable.f358l
                            if (r9 != r1) goto L_0x004b
                            goto L_0x002d
                        L_0x004b:
                            r1 = r0
                            r9 = r3
                            r5 = r9
                            goto L_0x0013
                        L_0x004f:
                            if (r5 == 0) goto L_0x006c
                            boolean r3 = androidx.appcompat.widget.DrawableUtils.a(r10)
                            if (r3 == 0) goto L_0x005b
                            android.graphics.drawable.Drawable r10 = r10.mutate()
                        L_0x005b:
                            int r8 = androidx.appcompat.widget.ThemeUtils.c(r8, r9)
                            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.AppCompatDrawableManager.e(r8, r1)
                            r10.setColorFilter(r8)
                            if (r0 == r4) goto L_0x006b
                            r10.setAlpha(r0)
                        L_0x006b:
                            return r2
                        L_0x006c:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    public PorterDuff.Mode b(int i2) {
                        if (i2 == R.drawable.H) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }

                    public Drawable c(ResourceManagerInternal resourceManagerInternal, Context context, int i2) {
                        if (i2 == R.drawable.f356j) {
                            return new LayerDrawable(new Drawable[]{resourceManagerInternal.i(context, R.drawable.f355i), resourceManagerInternal.i(context, R.drawable.f357k)});
                        }
                        if (i2 == R.drawable.f371y) {
                            return l(resourceManagerInternal, context, R.dimen.f338i);
                        }
                        if (i2 == R.drawable.f370x) {
                            return l(resourceManagerInternal, context, R.dimen.f339j);
                        }
                        if (i2 == R.drawable.f372z) {
                            return l(resourceManagerInternal, context, R.dimen.f340k);
                        }
                        return null;
                    }

                    public ColorStateList d(Context context, int i2) {
                        if (i2 == R.drawable.f359m) {
                            return AppCompatResources.a(context, R.color.f326e);
                        }
                        if (i2 == R.drawable.I) {
                            return AppCompatResources.a(context, R.color.f329h);
                        }
                        if (i2 == R.drawable.H) {
                            return k(context);
                        }
                        if (i2 == R.drawable.f352f) {
                            return j(context);
                        }
                        if (i2 == R.drawable.f348b) {
                            return g(context);
                        }
                        if (i2 == R.drawable.f351e) {
                            return i(context);
                        }
                        if (i2 == R.drawable.D || i2 == R.drawable.E) {
                            return AppCompatResources.a(context, R.color.f328g);
                        }
                        if (f(this.f1082b, i2)) {
                            return ThemeUtils.e(context, R.attr.f319y);
                        }
                        if (f(this.f1085e, i2)) {
                            return AppCompatResources.a(context, R.color.f325d);
                        }
                        if (f(this.f1086f, i2)) {
                            return AppCompatResources.a(context, R.color.f324c);
                        }
                        if (i2 == R.drawable.f345A) {
                            return AppCompatResources.a(context, R.color.f327f);
                        }
                        return null;
                    }

                    public boolean e(Context context, int i2, Drawable drawable) {
                        if (i2 == R.drawable.C) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            m(layerDrawable.findDrawableByLayerId(16908288), ThemeUtils.c(context, R.attr.f319y), AppCompatDrawableManager.f1078b);
                            m(layerDrawable.findDrawableByLayerId(16908303), ThemeUtils.c(context, R.attr.f319y), AppCompatDrawableManager.f1078b);
                            m(layerDrawable.findDrawableByLayerId(16908301), ThemeUtils.c(context, R.attr.f317w), AppCompatDrawableManager.f1078b);
                            return true;
                        } else if (i2 != R.drawable.f371y && i2 != R.drawable.f370x && i2 != R.drawable.f372z) {
                            return false;
                        } else {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                            m(layerDrawable2.findDrawableByLayerId(16908288), ThemeUtils.b(context, R.attr.f319y), AppCompatDrawableManager.f1078b);
                            m(layerDrawable2.findDrawableByLayerId(16908303), ThemeUtils.c(context, R.attr.f317w), AppCompatDrawableManager.f1078b);
                            m(layerDrawable2.findDrawableByLayerId(16908301), ThemeUtils.c(context, R.attr.f317w), AppCompatDrawableManager.f1078b);
                            return true;
                        }
                    }

                    public final boolean f(int[] iArr, int i2) {
                        for (int i3 : iArr) {
                            if (i3 == i2) {
                                return true;
                            }
                        }
                        return false;
                    }

                    public final ColorStateList g(Context context) {
                        return h(context, 0);
                    }

                    public final ColorStateList h(Context context, int i2) {
                        int c2 = ThemeUtils.c(context, R.attr.f318x);
                        int b2 = ThemeUtils.b(context, R.attr.f316v);
                        return new ColorStateList(new int[][]{ThemeUtils.f1304b, ThemeUtils.f1307e, ThemeUtils.f1305c, ThemeUtils.f1311i}, new int[]{b2, ColorUtils.c(c2, i2), ColorUtils.c(c2, i2), i2});
                    }

                    public final ColorStateList i(Context context) {
                        return h(context, ThemeUtils.c(context, R.attr.f315u));
                    }

                    public final ColorStateList j(Context context) {
                        return h(context, ThemeUtils.c(context, R.attr.f316v));
                    }

                    public final ColorStateList k(Context context) {
                        int[][] iArr = new int[3][];
                        int[] iArr2 = new int[3];
                        ColorStateList e2 = ThemeUtils.e(context, R.attr.f293A);
                        if (e2 == null || !e2.isStateful()) {
                            iArr[0] = ThemeUtils.f1304b;
                            iArr2[0] = ThemeUtils.b(context, R.attr.f293A);
                            iArr[1] = ThemeUtils.f1308f;
                            iArr2[1] = ThemeUtils.c(context, R.attr.f317w);
                            iArr[2] = ThemeUtils.f1311i;
                            iArr2[2] = ThemeUtils.c(context, R.attr.f293A);
                        } else {
                            int[] iArr3 = ThemeUtils.f1304b;
                            iArr[0] = iArr3;
                            iArr2[0] = e2.getColorForState(iArr3, 0);
                            iArr[1] = ThemeUtils.f1308f;
                            iArr2[1] = ThemeUtils.c(context, R.attr.f317w);
                            iArr[2] = ThemeUtils.f1311i;
                            iArr2[2] = e2.getDefaultColor();
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    public final LayerDrawable l(ResourceManagerInternal resourceManagerInternal, Context context, int i2) {
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable3;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                        Drawable i3 = resourceManagerInternal.i(context, R.drawable.F);
                        Drawable i4 = resourceManagerInternal.i(context, R.drawable.G);
                        if ((i3 instanceof BitmapDrawable) && i3.getIntrinsicWidth() == dimensionPixelSize && i3.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable2 = (BitmapDrawable) i3;
                            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            i3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            i3.draw(canvas);
                            bitmapDrawable2 = new BitmapDrawable(createBitmap);
                            bitmapDrawable = new BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
                        if ((i4 instanceof BitmapDrawable) && i4.getIntrinsicWidth() == dimensionPixelSize && i4.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) i4;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            i4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            i4.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
                        layerDrawable.setId(0, 16908288);
                        layerDrawable.setId(1, 16908303);
                        layerDrawable.setId(2, 16908301);
                        return layerDrawable;
                    }

                    public final void m(Drawable drawable, int i2, PorterDuff.Mode mode) {
                        if (DrawableUtils.a(drawable)) {
                            drawable = drawable.mutate();
                        }
                        if (mode == null) {
                            mode = AppCompatDrawableManager.f1078b;
                        }
                        drawable.setColorFilter(AppCompatDrawableManager.e(i2, mode));
                    }
                });
            }
        }
    }

    public static void i(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.v(drawable, tintInfo, iArr);
    }

    public synchronized Drawable c(Context context, int i2) {
        return this.f1080a.i(context, i2);
    }

    public synchronized Drawable d(Context context, int i2, boolean z2) {
        return this.f1080a.j(context, i2, z2);
    }

    public synchronized ColorStateList f(Context context, int i2) {
        return this.f1080a.l(context, i2);
    }

    public synchronized void g(Context context) {
        this.f1080a.r(context);
    }
}
