package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.R;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class WindowInsetsAnimationCompat {

    /* renamed from: a  reason: collision with root package name */
    public Impl f20298a;

    public static abstract class Callback {

        /* renamed from: A  reason: collision with root package name */
        public final int f20301A;

        /* renamed from: z  reason: collision with root package name */
        public WindowInsets f20302z;

        @Retention(RetentionPolicy.SOURCE)
        public @interface DispatchMode {
        }

        public Callback(int i2) {
            this.f20301A = i2;
        }

        public final int b() {
            return this.f20301A;
        }

        public void c(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void d(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public abstract WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat, List list);

        public BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            return boundsCompat;
        }
    }

    public static class Impl {

        /* renamed from: a  reason: collision with root package name */
        public final int f20303a;

        /* renamed from: b  reason: collision with root package name */
        public float f20304b;

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f20305c;

        /* renamed from: d  reason: collision with root package name */
        public final long f20306d;

        public Impl(int i2, Interpolator interpolator, long j2) {
            this.f20303a = i2;
            this.f20305c = interpolator;
            this.f20306d = j2;
        }

        public long a() {
            return this.f20306d;
        }

        public float b() {
            Interpolator interpolator = this.f20305c;
            return interpolator != null ? interpolator.getInterpolation(this.f20304b) : this.f20304b;
        }

        public void c(float f2) {
            this.f20304b = f2;
        }
    }

    public static class Impl21 extends Impl {

        /* renamed from: e  reason: collision with root package name */
        public static final Interpolator f20307e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f  reason: collision with root package name */
        public static final Interpolator f20308f = new FastOutLinearInInterpolator();

        /* renamed from: g  reason: collision with root package name */
        public static final Interpolator f20309g = new DecelerateInterpolator();

        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public final Callback f20310a;

            /* renamed from: b  reason: collision with root package name */
            public WindowInsetsCompat f20311b;

            public Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                this.f20310a = callback;
                WindowInsetsCompat w2 = ViewCompat.w(view);
                this.f20311b = w2 != null ? new WindowInsetsCompat.Builder(w2).a() : null;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                final View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f20311b = WindowInsetsCompat.y(windowInsets2, view2);
                    return Impl21.l(view, windowInsets);
                }
                WindowInsetsCompat y2 = WindowInsetsCompat.y(windowInsets2, view2);
                if (this.f20311b == null) {
                    this.f20311b = ViewCompat.w(view);
                }
                if (this.f20311b == null) {
                    this.f20311b = y2;
                    return Impl21.l(view, windowInsets);
                }
                Callback m2 = Impl21.m(view);
                if (m2 != null && Objects.equals(m2.f20302z, windowInsets2)) {
                    return Impl21.l(view, windowInsets);
                }
                final int d2 = Impl21.d(y2, this.f20311b);
                if (d2 == 0) {
                    return Impl21.l(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat = this.f20311b;
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(d2, Impl21.f(d2, y2, windowInsetsCompat), 160);
                windowInsetsAnimationCompat.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(windowInsetsAnimationCompat.a());
                BoundsCompat e2 = Impl21.e(y2, windowInsetsCompat, d2);
                Impl21.i(view2, windowInsetsAnimationCompat, windowInsets2, false);
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = windowInsetsAnimationCompat;
                final WindowInsetsCompat windowInsetsCompat2 = y2;
                final View view3 = view;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        windowInsetsAnimationCompat2.d(valueAnimator.getAnimatedFraction());
                        Impl21.j(view3, Impl21.n(windowInsetsCompat2, windowInsetsCompat, windowInsetsAnimationCompat2.b(), d2), Collections.singletonList(windowInsetsAnimationCompat2));
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        windowInsetsAnimationCompat.d(1.0f);
                        Impl21.h(view2, windowInsetsAnimationCompat);
                    }
                });
                final View view4 = view;
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat3 = windowInsetsAnimationCompat;
                final BoundsCompat boundsCompat = e2;
                final ValueAnimator valueAnimator = duration;
                OneShotPreDrawListener.a(view2, new Runnable() {
                    public void run() {
                        Impl21.k(view4, windowInsetsAnimationCompat3, boundsCompat);
                        valueAnimator.start();
                    }
                });
                this.f20311b = y2;
                return Impl21.l(view, windowInsets);
            }
        }

        public Impl21(int i2, Interpolator interpolator, long j2) {
            super(i2, interpolator, j2);
        }

        public static int d(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if (!windowInsetsCompat.f(i3).equals(windowInsetsCompat2.f(i3))) {
                    i2 |= i3;
                }
            }
            return i2;
        }

        public static BoundsCompat e(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i2) {
            Insets f2 = windowInsetsCompat.f(i2);
            Insets f3 = windowInsetsCompat2.f(i2);
            return new BoundsCompat(Insets.b(Math.min(f2.f19774a, f3.f19774a), Math.min(f2.f19775b, f3.f19775b), Math.min(f2.f19776c, f3.f19776c), Math.min(f2.f19777d, f3.f19777d)), Insets.b(Math.max(f2.f19774a, f3.f19774a), Math.max(f2.f19775b, f3.f19775b), Math.max(f2.f19776c, f3.f19776c), Math.max(f2.f19777d, f3.f19777d)));
        }

        public static Interpolator f(int i2, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            return (i2 & 8) != 0 ? windowInsetsCompat.f(WindowInsetsCompat.Type.d()).f19777d > windowInsetsCompat2.f(WindowInsetsCompat.Type.d()).f19777d ? f20307e : f20308f : f20309g;
        }

        public static View.OnApplyWindowInsetsListener g(View view, Callback callback) {
            return new Impl21OnApplyWindowInsetsListener(view, callback);
        }

        public static void h(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback m2 = m(view);
            if (m2 != null) {
                m2.c(windowInsetsAnimationCompat);
                if (m2.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    h(viewGroup.getChildAt(i2), windowInsetsAnimationCompat);
                }
            }
        }

        public static void i(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z2) {
            Callback m2 = m(view);
            if (m2 != null) {
                m2.f20302z = windowInsets;
                if (!z2) {
                    m2.d(windowInsetsAnimationCompat);
                    z2 = m2.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    i(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, windowInsets, z2);
                }
            }
        }

        public static void j(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback m2 = m(view);
            if (m2 != null) {
                windowInsetsCompat = m2.e(windowInsetsCompat, list);
                if (m2.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    j(viewGroup.getChildAt(i2), windowInsetsCompat, list);
                }
            }
        }

        public static void k(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback m2 = m(view);
            if (m2 != null) {
                m2.f(windowInsetsAnimationCompat, boundsCompat);
                if (m2.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    k(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        public static WindowInsets l(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static Callback m(View view) {
            Object tag = view.getTag(R.id.S);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).f20310a;
            }
            return null;
        }

        public static WindowInsetsCompat n(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f2, int i2) {
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) == 0) {
                    builder.b(i3, windowInsetsCompat.f(i3));
                } else {
                    Insets f3 = windowInsetsCompat.f(i3);
                    Insets f4 = windowInsetsCompat2.f(i3);
                    float f5 = 1.0f - f2;
                    builder.b(i3, WindowInsetsCompat.o(f3, (int) (((double) (((float) (f3.f19774a - f4.f19774a)) * f5)) + 0.5d), (int) (((double) (((float) (f3.f19775b - f4.f19775b)) * f5)) + 0.5d), (int) (((double) (((float) (f3.f19776c - f4.f19776c)) * f5)) + 0.5d), (int) (((double) (((float) (f3.f19777d - f4.f19777d)) * f5)) + 0.5d)));
                }
            }
            return builder.a();
        }

        public static void o(View view, Callback callback) {
            Object tag = view.getTag(R.id.L);
            if (callback == null) {
                view.setTag(R.id.S, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener g2 = g(view, callback);
            view.setTag(R.id.S, g2);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(g2);
            }
        }
    }

    public WindowInsetsAnimationCompat(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20298a = new Impl30(i2, interpolator, j2);
        } else {
            this.f20298a = new Impl21(i2, interpolator, j2);
        }
    }

    public static void c(View view, Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            Impl30.g(view, callback);
        } else {
            Impl21.o(view, callback);
        }
    }

    public static WindowInsetsAnimationCompat e(WindowInsetsAnimation windowInsetsAnimation) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    public long a() {
        return this.f20298a.a();
    }

    public float b() {
        return this.f20298a.b();
    }

    public void d(float f2) {
        this.f20298a.c(f2);
    }

    public static class Impl30 extends Impl {

        /* renamed from: e  reason: collision with root package name */
        public final WindowInsetsAnimation f20324e;

        public static class ProxyCallback extends WindowInsetsAnimation$Callback {

            /* renamed from: a  reason: collision with root package name */
            public final Callback f20325a;

            /* renamed from: b  reason: collision with root package name */
            public List f20326b;

            /* renamed from: c  reason: collision with root package name */
            public ArrayList f20327c;

            /* renamed from: d  reason: collision with root package name */
            public final HashMap f20328d = new HashMap();

            public ProxyCallback(Callback callback) {
                super(callback.b());
                this.f20325a = callback;
            }

            public final WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.f20328d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                WindowInsetsAnimationCompat e2 = WindowInsetsAnimationCompat.e(windowInsetsAnimation);
                this.f20328d.put(windowInsetsAnimation, e2);
                return e2;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f20325a.c(a(windowInsetsAnimation));
                this.f20328d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f20325a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f20327c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f20327c = arrayList2;
                    this.f20326b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a2 = G.a(list.get(size));
                    WindowInsetsAnimationCompat a3 = a(a2);
                    a3.d(a2.getFraction());
                    this.f20327c.add(a3);
                }
                return this.f20325a.e(WindowInsetsCompat.x(windowInsets), this.f20326b).w();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f20325a.f(a(windowInsetsAnimation), BoundsCompat.e(bounds)).d();
            }
        }

        public Impl30(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f20324e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds d(BoundsCompat boundsCompat) {
            F.a();
            return E.a(boundsCompat.a().e(), boundsCompat.b().e());
        }

        public static Insets e(WindowInsetsAnimation.Bounds bounds) {
            return Insets.d(bounds.getUpperBound());
        }

        public static Insets f(WindowInsetsAnimation.Bounds bounds) {
            return Insets.d(bounds.getLowerBound());
        }

        public static void g(View view, Callback callback) {
            view.setWindowInsetsAnimationCallback(callback != null ? new ProxyCallback(callback) : null);
        }

        public long a() {
            return this.f20324e.getDurationMillis();
        }

        public float b() {
            return this.f20324e.getInterpolatedFraction();
        }

        public void c(float f2) {
            this.f20324e.setFraction(f2);
        }

        public Impl30(int i2, Interpolator interpolator, long j2) {
            this(D.a(i2, interpolator, j2));
        }
    }

    public static final class BoundsCompat {

        /* renamed from: a  reason: collision with root package name */
        public final Insets f20299a;

        /* renamed from: b  reason: collision with root package name */
        public final Insets f20300b;

        public BoundsCompat(Insets insets, Insets insets2) {
            this.f20299a = insets;
            this.f20300b = insets2;
        }

        public static BoundsCompat e(WindowInsetsAnimation.Bounds bounds) {
            return new BoundsCompat(bounds);
        }

        public Insets a() {
            return this.f20299a;
        }

        public Insets b() {
            return this.f20300b;
        }

        public BoundsCompat c(Insets insets) {
            return new BoundsCompat(WindowInsetsCompat.o(this.f20299a, insets.f19774a, insets.f19775b, insets.f19776c, insets.f19777d), WindowInsetsCompat.o(this.f20300b, insets.f19774a, insets.f19775b, insets.f19776c, insets.f19777d));
        }

        public WindowInsetsAnimation.Bounds d() {
            return Impl30.d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f20299a + " upper=" + this.f20300b + "}";
        }

        public BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.f20299a = Impl30.f(bounds);
            this.f20300b = Impl30.e(bounds);
        }
    }

    public WindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20298a = new Impl30(windowInsetsAnimation);
        }
    }
}
