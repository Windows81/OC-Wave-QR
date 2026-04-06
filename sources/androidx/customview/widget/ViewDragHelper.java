package androidx.customview.widget;

import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

public class ViewDragHelper {

    /* renamed from: w  reason: collision with root package name */
    public static final Interpolator f20507w = new Interpolator() {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f20508a;

    /* renamed from: b  reason: collision with root package name */
    public int f20509b;

    /* renamed from: c  reason: collision with root package name */
    public int f20510c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f20511d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f20512e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f20513f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f20514g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f20515h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f20516i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f20517j;

    /* renamed from: k  reason: collision with root package name */
    public int f20518k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f20519l;

    /* renamed from: m  reason: collision with root package name */
    public float f20520m;

    /* renamed from: n  reason: collision with root package name */
    public float f20521n;

    /* renamed from: o  reason: collision with root package name */
    public int f20522o;

    /* renamed from: p  reason: collision with root package name */
    public int f20523p;

    /* renamed from: q  reason: collision with root package name */
    public OverScroller f20524q;

    /* renamed from: r  reason: collision with root package name */
    public final Callback f20525r;

    /* renamed from: s  reason: collision with root package name */
    public View f20526s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f20527t;

    /* renamed from: u  reason: collision with root package name */
    public final ViewGroup f20528u;

    /* renamed from: v  reason: collision with root package name */
    public final Runnable f20529v;

    /* renamed from: androidx.customview.widget.ViewDragHelper$2  reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ViewDragHelper f20530z;

        public void run() {
            this.f20530z.H(0);
        }
    }

    public static abstract class Callback {
        public int a(View view, int i2, int i3) {
            return 0;
        }

        public int b(View view, int i2, int i3) {
            return 0;
        }

        public int c(int i2) {
            return i2;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i2, int i3) {
        }

        public boolean g(int i2) {
            return false;
        }

        public void h(int i2, int i3) {
        }

        public void i(View view, int i2) {
        }

        public void j(int i2) {
        }

        public void k(View view, int i2, int i3, int i4, int i5) {
        }

        public void l(View view, float f2, float f3) {
        }

        public abstract boolean m(View view, int i2);
    }

    public final boolean A(int i2) {
        if (z(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean B(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void C(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f20519l == null) {
            this.f20519l = VelocityTracker.obtain();
        }
        this.f20519l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r2 = r((int) x2, (int) y2);
            F(x2, y2, pointerId);
            L(r2, pointerId);
            int i4 = this.f20515h[pointerId];
            int i5 = this.f20523p;
            if ((i4 & i5) != 0) {
                this.f20525r.h(i4 & i5, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f20508a == 1) {
                D();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f20508a == 1) {
                    n(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                F(x3, y3, pointerId2);
                if (this.f20508a == 0) {
                    L(r((int) x3, (int) y3), pointerId2);
                    int i6 = this.f20515h[pointerId2];
                    int i7 = this.f20523p;
                    if ((i6 & i7) != 0) {
                        this.f20525r.h(i6 & i7, pointerId2);
                    }
                } else if (y((int) x3, (int) y3)) {
                    L(this.f20526s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f20508a == 1 && pointerId3 == this.f20510c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i3);
                        if (pointerId4 != this.f20510c) {
                            View r3 = r((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view = this.f20526s;
                            if (r3 == view && L(view, pointerId4)) {
                                i2 = this.f20510c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        D();
                    }
                }
                j(pointerId3);
            }
        } else if (this.f20508a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i3);
                if (A(pointerId5)) {
                    float x4 = motionEvent.getX(i3);
                    float y4 = motionEvent.getY(i3);
                    float f2 = x4 - this.f20511d[pointerId5];
                    float f3 = y4 - this.f20512e[pointerId5];
                    E(f2, f3, pointerId5);
                    if (this.f20508a != 1) {
                        View r4 = r((int) x4, (int) y4);
                        if (f(r4, f2, f3) && L(r4, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            G(motionEvent);
        } else if (A(this.f20510c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f20510c);
            float x5 = motionEvent.getX(findPointerIndex);
            float y5 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f20513f;
            int i8 = this.f20510c;
            int i9 = (int) (x5 - fArr[i8]);
            int i10 = (int) (y5 - this.f20514g[i8]);
            p(this.f20526s.getLeft() + i9, this.f20526s.getTop() + i10, i9, i10);
            G(motionEvent);
        }
    }

    public final void D() {
        this.f20519l.computeCurrentVelocity(1000, this.f20520m);
        n(g(this.f20519l.getXVelocity(this.f20510c), this.f20521n, this.f20520m), g(this.f20519l.getYVelocity(this.f20510c), this.f20521n, this.f20520m));
    }

    public final void E(float f2, float f3, int i2) {
        boolean c2 = c(f2, f3, i2, 1);
        if (c(f3, f2, i2, 4)) {
            c2 |= true;
        }
        if (c(f2, f3, i2, 2)) {
            c2 |= true;
        }
        if (c(f3, f2, i2, 8)) {
            c2 |= true;
        }
        if (c2) {
            int[] iArr = this.f20516i;
            iArr[i2] = iArr[i2] | c2;
            this.f20525r.f(c2 ? 1 : 0, i2);
        }
    }

    public final void F(float f2, float f3, int i2) {
        q(i2);
        float[] fArr = this.f20511d;
        this.f20513f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f20512e;
        this.f20514g[i2] = f3;
        fArr2[i2] = f3;
        this.f20515h[i2] = v((int) f2, (int) f3);
        this.f20518k |= 1 << i2;
    }

    public final void G(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (A(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f20513f[pointerId] = x2;
                this.f20514g[pointerId] = y2;
            }
        }
    }

    public void H(int i2) {
        this.f20528u.removeCallbacks(this.f20529v);
        if (this.f20508a != i2) {
            this.f20508a = i2;
            this.f20525r.j(i2);
            if (this.f20508a == 0) {
                this.f20526s = null;
            }
        }
    }

    public boolean I(int i2, int i3) {
        if (this.f20527t) {
            return s(i2, i3, (int) this.f20519l.getXVelocity(this.f20510c), (int) this.f20519l.getYVelocity(this.f20510c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f20519l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f20519l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f20519l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.j(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.F(r7, r1, r2)
            int r3 = r0.f20508a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f20515h
            r1 = r1[r2]
            int r3 = r0.f20523p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            androidx.customview.widget.ViewDragHelper$Callback r4 = r0.f20525r
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.r(r3, r1)
            android.view.View r3 = r0.f20526s
            if (r1 != r3) goto L_0x0031
            r0.L(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f20511d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f20512e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.A(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f20511d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f20512e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.r(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.f(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            androidx.customview.widget.ViewDragHelper$Callback r14 = r0.f20525r
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            androidx.customview.widget.ViewDragHelper$Callback r5 = r0.f20525r
            int r5 = r5.b(r7, r15, r14)
            androidx.customview.widget.ViewDragHelper$Callback r14 = r0.f20525r
            int r14 = r14.d(r7)
            androidx.customview.widget.ViewDragHelper$Callback r15 = r0.f20525r
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.E(r9, r10, r4)
            int r5 = r0.f20508a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.L(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.G(r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.F(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.r(r2, r3)
            android.view.View r3 = r0.f20526s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f20508a
            if (r3 != r4) goto L_0x0125
            r0.L(r2, r1)
        L_0x0125:
            int[] r2 = r0.f20515h
            r2 = r2[r1]
            int r3 = r0.f20523p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            androidx.customview.widget.ViewDragHelper$Callback r4 = r0.f20525r
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.f20508a
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.J(android.view.MotionEvent):boolean");
    }

    public boolean K(View view, int i2, int i3) {
        this.f20526s = view;
        this.f20510c = -1;
        boolean s2 = s(i2, i3, 0, 0);
        if (!s2 && this.f20508a == 0 && this.f20526s != null) {
            this.f20526s = null;
        }
        return s2;
    }

    public boolean L(View view, int i2) {
        if (view == this.f20526s && this.f20510c == i2) {
            return true;
        }
        if (view == null || !this.f20525r.m(view, i2)) {
            return false;
        }
        this.f20510c = i2;
        b(view, i2);
        return true;
    }

    public void a() {
        this.f20510c = -1;
        i();
        VelocityTracker velocityTracker = this.f20519l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20519l = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.f20528u) {
            this.f20526s = view;
            this.f20510c = i2;
            this.f20525r.i(view, i2);
            H(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f20528u + ")");
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f20515h[i2] & i3) != i3 || (this.f20523p & i3) == 0 || (this.f20517j[i2] & i3) == i3 || (this.f20516i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f20509b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f20525r.g(i3)) {
            return (this.f20516i[i2] & i3) == 0 && abs > ((float) this.f20509b);
        }
        int[] iArr = this.f20517j;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    public boolean d(int i2) {
        int length = this.f20511d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (e(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i2, int i3) {
        if (!z(i3)) {
            return false;
        }
        boolean z2 = (i2 & 1) == 1;
        boolean z3 = (i2 & 2) == 2;
        float f2 = this.f20513f[i3] - this.f20511d[i3];
        float f3 = this.f20514g[i3] - this.f20512e[i3];
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f20509b) : z3 && Math.abs(f3) > ((float) this.f20509b);
        }
        int i4 = this.f20509b;
        return (f2 * f2) + (f3 * f3) > ((float) (i4 * i4));
    }

    public final boolean f(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.f20525r.d(view) > 0;
        boolean z3 = this.f20525r.e(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f20509b) : z3 && Math.abs(f3) > ((float) this.f20509b);
        }
        int i2 = this.f20509b;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }

    public final float g(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    public final int h(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    public final void i() {
        float[] fArr = this.f20511d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f20512e, 0.0f);
            Arrays.fill(this.f20513f, 0.0f);
            Arrays.fill(this.f20514g, 0.0f);
            Arrays.fill(this.f20515h, 0);
            Arrays.fill(this.f20516i, 0);
            Arrays.fill(this.f20517j, 0);
            this.f20518k = 0;
        }
    }

    public final void j(int i2) {
        if (this.f20511d != null && z(i2)) {
            this.f20511d[i2] = 0.0f;
            this.f20512e[i2] = 0.0f;
            this.f20513f[i2] = 0.0f;
            this.f20514g[i2] = 0.0f;
            this.f20515h[i2] = 0;
            this.f20516i[i2] = 0;
            this.f20517j[i2] = 0;
            this.f20518k = (~(1 << i2)) & this.f20518k;
        }
    }

    public final int k(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.f20528u.getWidth();
        float f2 = (float) (width / 2);
        float o2 = f2 + (o(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(o2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    public final int l(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int h2 = h(i4, (int) this.f20521n, (int) this.f20520m);
        int h3 = h(i5, (int) this.f20521n, (int) this.f20520m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(h2);
        int abs4 = Math.abs(h3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (h2 != 0) {
            f2 = (float) abs3;
            f3 = (float) i6;
        } else {
            f2 = (float) abs;
            f3 = (float) i7;
        }
        float f6 = f2 / f3;
        if (h3 != 0) {
            f4 = (float) abs4;
            f5 = (float) i6;
        } else {
            f4 = (float) abs2;
            f5 = (float) i7;
        }
        float f7 = f4 / f5;
        return (int) ((((float) k(i2, h2, this.f20525r.d(view))) * f6) + (((float) k(i3, h3, this.f20525r.e(view))) * f7));
    }

    public boolean m(boolean z2) {
        if (this.f20508a == 2) {
            boolean computeScrollOffset = this.f20524q.computeScrollOffset();
            int currX = this.f20524q.getCurrX();
            int currY = this.f20524q.getCurrY();
            int left = currX - this.f20526s.getLeft();
            int top = currY - this.f20526s.getTop();
            if (left != 0) {
                ViewCompat.H(this.f20526s, left);
            }
            if (top != 0) {
                ViewCompat.I(this.f20526s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f20525r.k(this.f20526s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f20524q.getFinalX() && currY == this.f20524q.getFinalY()) {
                this.f20524q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z2) {
                    this.f20528u.post(this.f20529v);
                } else {
                    H(0);
                }
            }
        }
        return this.f20508a == 2;
    }

    public final void n(float f2, float f3) {
        this.f20527t = true;
        this.f20525r.l(this.f20526s, f2, f3);
        this.f20527t = false;
        if (this.f20508a == 1) {
            H(0);
        }
    }

    public final float o(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    public final void p(int i2, int i3, int i4, int i5) {
        int left = this.f20526s.getLeft();
        int top = this.f20526s.getTop();
        if (i4 != 0) {
            i2 = this.f20525r.a(this.f20526s, i2, i4);
            ViewCompat.H(this.f20526s, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.f20525r.b(this.f20526s, i3, i5);
            ViewCompat.I(this.f20526s, i3 - top);
        }
        int i7 = i3;
        if (i4 != 0 || i5 != 0) {
            this.f20525r.k(this.f20526s, i6, i7, i6 - left, i7 - top);
        }
    }

    public final void q(int i2) {
        float[] fArr = this.f20511d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f20512e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f20513f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f20514g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f20515h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f20516i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f20517j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f20511d = fArr2;
            this.f20512e = fArr3;
            this.f20513f = fArr4;
            this.f20514g = fArr5;
            this.f20515h = iArr;
            this.f20516i = iArr2;
            this.f20517j = iArr3;
        }
    }

    public View r(int i2, int i3) {
        for (int childCount = this.f20528u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f20528u.getChildAt(this.f20525r.c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i2, int i3, int i4, int i5) {
        int left = this.f20526s.getLeft();
        int top = this.f20526s.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f20524q.abortAnimation();
            H(0);
            return false;
        }
        this.f20524q.startScroll(left, top, i6, i7, l(this.f20526s, i6, i7, i4, i5));
        H(2);
        return true;
    }

    public View t() {
        return this.f20526s;
    }

    public int u() {
        return this.f20522o;
    }

    public final int v(int i2, int i3) {
        int i4 = i2 < this.f20528u.getLeft() + this.f20522o ? 1 : 0;
        if (i3 < this.f20528u.getTop() + this.f20522o) {
            i4 |= 4;
        }
        if (i2 > this.f20528u.getRight() - this.f20522o) {
            i4 |= 2;
        }
        return i3 > this.f20528u.getBottom() - this.f20522o ? i4 | 8 : i4;
    }

    public int w() {
        return this.f20509b;
    }

    public int x() {
        return this.f20508a;
    }

    public boolean y(int i2, int i3) {
        return B(this.f20526s, i2, i3);
    }

    public boolean z(int i2) {
        return ((1 << i2) & this.f20518k) != 0;
    }
}
