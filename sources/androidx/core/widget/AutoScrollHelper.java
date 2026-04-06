package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

public abstract class AutoScrollHelper implements View.OnTouchListener {
    public static final int Q = ViewConfiguration.getTapTimeout();

    /* renamed from: A  reason: collision with root package name */
    public final Interpolator f20436A = new AccelerateInterpolator();

    /* renamed from: B  reason: collision with root package name */
    public final View f20437B;
    public Runnable C;
    public float[] D = {0.0f, 0.0f};
    public float[] E = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int F;
    public int G;
    public float[] H = {0.0f, 0.0f};
    public float[] I = {0.0f, 0.0f};
    public float[] J = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;

    /* renamed from: z  reason: collision with root package name */
    public final ClampedScroller f20438z = new ClampedScroller();

    public static class ClampedScroller {

        /* renamed from: a  reason: collision with root package name */
        public int f20439a;

        /* renamed from: b  reason: collision with root package name */
        public int f20440b;

        /* renamed from: c  reason: collision with root package name */
        public float f20441c;

        /* renamed from: d  reason: collision with root package name */
        public float f20442d;

        /* renamed from: e  reason: collision with root package name */
        public long f20443e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f20444f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f20445g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f20446h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f20447i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f20448j;

        /* renamed from: k  reason: collision with root package name */
        public int f20449k;

        public void a() {
            if (this.f20444f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                this.f20444f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f20444f)) * g2;
                this.f20445g = (int) (this.f20441c * f2);
                this.f20446h = (int) (f2 * this.f20442d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f20445g;
        }

        public int c() {
            return this.f20446h;
        }

        public int d() {
            float f2 = this.f20441c;
            return (int) (f2 / Math.abs(f2));
        }

        public final float e(long j2) {
            long j3 = this.f20443e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f20447i;
            if (j4 < 0 || j2 < j4) {
                return AutoScrollHelper.e(((float) (j2 - j3)) / ((float) this.f20439a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f20448j;
            return (1.0f - f2) + (f2 * AutoScrollHelper.e(((float) (j2 - j4)) / ((float) this.f20449k), 0.0f, 1.0f));
        }

        public int f() {
            float f2 = this.f20442d;
            return (int) (f2 / Math.abs(f2));
        }

        public final float g(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        public boolean h() {
            return this.f20447i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f20447i + ((long) this.f20449k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f20449k = AutoScrollHelper.f((int) (currentAnimationTimeMillis - this.f20443e), 0, this.f20440b);
            this.f20448j = e(currentAnimationTimeMillis);
            this.f20447i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f20440b = i2;
        }

        public void k(int i2) {
            this.f20439a = i2;
        }

        public void l(float f2, float f3) {
            this.f20441c = f2;
            this.f20442d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f20443e = currentAnimationTimeMillis;
            this.f20447i = -1;
            this.f20444f = currentAnimationTimeMillis;
            this.f20448j = 0.5f;
            this.f20445g = 0;
            this.f20446h = 0;
        }
    }

    public class ScrollAnimationRunnable implements Runnable {
        public ScrollAnimationRunnable() {
        }

        public void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.N) {
                if (autoScrollHelper.L) {
                    autoScrollHelper.L = false;
                    autoScrollHelper.f20438z.m();
                }
                ClampedScroller clampedScroller = AutoScrollHelper.this.f20438z;
                if (clampedScroller.h() || !AutoScrollHelper.this.u()) {
                    AutoScrollHelper.this.N = false;
                    return;
                }
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.M) {
                    autoScrollHelper2.M = false;
                    autoScrollHelper2.c();
                }
                clampedScroller.a();
                AutoScrollHelper.this.j(clampedScroller.b(), clampedScroller.c());
                ViewCompat.P(AutoScrollHelper.this.f20437B, this);
            }
        }
    }

    public AutoScrollHelper(View view) {
        this.f20437B = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (float) ((int) ((1575.0f * f2) + 0.5f));
        o(f3, f3);
        float f4 = (float) ((int) ((f2 * 315.0f) + 0.5f));
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(Q);
        r(500);
        q(500);
    }

    public static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    public static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f20437B.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.D[i2], f3, this.E[i2], f2);
        int i3 = (h2 > 0.0f ? 1 : (h2 == 0.0f ? 0 : -1));
        if (i3 == 0) {
            return 0.0f;
        }
        float f5 = this.H[i2];
        float f6 = this.I[i2];
        float f7 = this.J[i2];
        float f8 = f5 * f4;
        return i3 > 0 ? e(h2 * f8, f6, f7) : -e((-h2) * f8, f6, f7);
    }

    public final float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.F;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.N || i2 != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    public final float h(float f2, float f3, float f4, float f5) {
        float f6;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            f6 = -this.f20436A.getInterpolation(-g2);
        } else if (g2 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.f20436A.getInterpolation(g2);
        }
        return e(f6, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.L) {
            this.N = false;
        } else {
            this.f20438z.i();
        }
    }

    public abstract void j(int i2, int i3);

    public AutoScrollHelper k(int i2) {
        this.G = i2;
        return this;
    }

    public AutoScrollHelper l(int i2) {
        this.F = i2;
        return this;
    }

    public AutoScrollHelper m(boolean z2) {
        if (this.O && !z2) {
            i();
        }
        this.O = z2;
        return this;
    }

    public AutoScrollHelper n(float f2, float f3) {
        float[] fArr = this.E;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public AutoScrollHelper o(float f2, float f3) {
        float[] fArr = this.J;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.O
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.M = r2
            r5.K = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f20437B
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f20437B
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r7 = r5.f20438z
            r7.l(r0, r6)
            boolean r6 = r5.N
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.P
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.N
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public AutoScrollHelper p(float f2, float f3) {
        float[] fArr = this.I;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public AutoScrollHelper q(int i2) {
        this.f20438z.j(i2);
        return this;
    }

    public AutoScrollHelper r(int i2) {
        this.f20438z.k(i2);
        return this;
    }

    public AutoScrollHelper s(float f2, float f3) {
        float[] fArr = this.D;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public AutoScrollHelper t(float f2, float f3) {
        float[] fArr = this.H;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public boolean u() {
        ClampedScroller clampedScroller = this.f20438z;
        int f2 = clampedScroller.f();
        int d2 = clampedScroller.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }

    public final void v() {
        int i2;
        if (this.C == null) {
            this.C = new ScrollAnimationRunnable();
        }
        this.N = true;
        this.L = true;
        if (this.K || (i2 = this.G) <= 0) {
            this.C.run();
        } else {
            ViewCompat.Q(this.f20437B, this.C, (long) i2);
        }
        this.K = true;
    }
}
