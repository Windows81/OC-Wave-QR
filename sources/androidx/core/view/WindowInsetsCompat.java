package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.splashscreen.b;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class WindowInsetsCompat {

    /* renamed from: b  reason: collision with root package name */
    public static final WindowInsetsCompat f20331b;

    /* renamed from: a  reason: collision with root package name */
    public final Impl f20332a;

    public static class Api21ReflectionHolder {

        /* renamed from: a  reason: collision with root package name */
        public static Field f20333a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f20334b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f20335c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f20336d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f20333a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f20334b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f20335c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }
    }

    public static class BuilderImpl {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsCompat f20338a;

        /* renamed from: b  reason: collision with root package name */
        public Insets[] f20339b;

        public BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public final void a() {
            Insets[] insetsArr = this.f20339b;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.e(1)];
                Insets insets2 = this.f20339b[Type.e(2)];
                if (insets2 == null) {
                    insets2 = this.f20338a.f(2);
                }
                if (insets == null) {
                    insets = this.f20338a.f(1);
                }
                g(Insets.a(insets, insets2));
                Insets insets3 = this.f20339b[Type.e(16)];
                if (insets3 != null) {
                    f(insets3);
                }
                Insets insets4 = this.f20339b[Type.e(32)];
                if (insets4 != null) {
                    d(insets4);
                }
                Insets insets5 = this.f20339b[Type.e(64)];
                if (insets5 != null) {
                    h(insets5);
                }
            }
        }

        public WindowInsetsCompat b() {
            a();
            return this.f20338a;
        }

        public void c(int i2, Insets insets) {
            if (this.f20339b == null) {
                this.f20339b = new Insets[9];
            }
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    this.f20339b[Type.e(i3)] = insets;
                }
            }
        }

        public void d(Insets insets) {
        }

        public void e(Insets insets) {
        }

        public void f(Insets insets) {
        }

        public void g(Insets insets) {
        }

        public void h(Insets insets) {
        }

        public BuilderImpl(WindowInsetsCompat windowInsetsCompat) {
            this.f20338a = windowInsetsCompat;
        }
    }

    public static class BuilderImpl30 extends BuilderImpl29 {
        public BuilderImpl30() {
        }

        public void c(int i2, Insets insets) {
            WindowInsets.Builder unused = this.f20346c.setInsets(TypeImpl30.a(i2), insets.e());
        }

        public BuilderImpl30(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public static class Impl {

        /* renamed from: b  reason: collision with root package name */
        public static final WindowInsetsCompat f20347b = new Builder().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsCompat f20348a;

        public Impl(WindowInsetsCompat windowInsetsCompat) {
            this.f20348a = windowInsetsCompat;
        }

        public WindowInsetsCompat a() {
            return this.f20348a;
        }

        public WindowInsetsCompat b() {
            return this.f20348a;
        }

        public WindowInsetsCompat c() {
            return this.f20348a;
        }

        public void d(View view) {
        }

        public void e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return p() == impl.p() && o() == impl.o() && ObjectsCompat.a(l(), impl.l()) && ObjectsCompat.a(j(), impl.j()) && ObjectsCompat.a(f(), impl.f());
        }

        public DisplayCutoutCompat f() {
            return null;
        }

        public Insets g(int i2) {
            return Insets.f19773e;
        }

        public Insets h(int i2) {
            if ((i2 & 8) == 0) {
                return Insets.f19773e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return ObjectsCompat.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public Insets i() {
            return l();
        }

        public Insets j() {
            return Insets.f19773e;
        }

        public Insets k() {
            return l();
        }

        public Insets l() {
            return Insets.f19773e;
        }

        public Insets m() {
            return l();
        }

        public WindowInsetsCompat n(int i2, int i3, int i4, int i5) {
            return f20347b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i2) {
            return true;
        }

        public void r(Insets[] insetsArr) {
        }

        public void s(Insets insets) {
        }

        public void t(WindowInsetsCompat windowInsetsCompat) {
        }

        public void u(Insets insets) {
        }
    }

    public static class Impl28 extends Impl21 {
        public Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        public WindowInsetsCompat a() {
            return WindowInsetsCompat.x(this.f20354c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.f20354c, impl28.f20354c) && Objects.equals(this.f20358g, impl28.f20358g);
        }

        public DisplayCutoutCompat f() {
            return DisplayCutoutCompat.f(this.f20354c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f20354c.hashCode();
        }

        public Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, (Impl21) impl28);
        }
    }

    public static class Impl30 extends Impl29 {

        /* renamed from: q  reason: collision with root package name */
        public static final WindowInsetsCompat f20363q = WindowInsetsCompat.x(WindowInsets.CONSUMED);

        public Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        public final void d(View view) {
        }

        public Insets g(int i2) {
            return Insets.d(this.f20354c.getInsets(TypeImpl30.a(i2)));
        }

        public Insets h(int i2) {
            return Insets.d(this.f20354c.getInsetsIgnoringVisibility(TypeImpl30.a(i2)));
        }

        public boolean q(int i2) {
            return this.f20354c.isVisible(TypeImpl30.a(i2));
        }

        public Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, (Impl29) impl30);
        }
    }

    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        public static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        public static int e(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    public static final class TypeImpl30 {
        public static int a(int i2) {
            int a2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        a2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        a2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        a2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        a2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        a2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        a2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        a2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        a2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= a2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f20331b = Impl30.f20363q;
        } else {
            f20331b = Impl.f20347b;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f20332a = new Impl30(this, windowInsets);
        } else if (i2 >= 29) {
            this.f20332a = new Impl29(this, windowInsets);
        } else if (i2 >= 28) {
            this.f20332a = new Impl28(this, windowInsets);
        } else {
            this.f20332a = new Impl21(this, windowInsets);
        }
    }

    public static Insets o(Insets insets, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, insets.f19774a - i2);
        int max2 = Math.max(0, insets.f19775b - i3);
        int max3 = Math.max(0, insets.f19776c - i4);
        int max4 = Math.max(0, insets.f19777d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? insets : Insets.b(max, max2, max3, max4);
    }

    public static WindowInsetsCompat x(WindowInsets windowInsets) {
        return y(windowInsets, (View) null);
    }

    public static WindowInsetsCompat y(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) Preconditions.f(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.u(ViewCompat.w(view));
            windowInsetsCompat.d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    public WindowInsetsCompat a() {
        return this.f20332a.a();
    }

    public WindowInsetsCompat b() {
        return this.f20332a.b();
    }

    public WindowInsetsCompat c() {
        return this.f20332a.c();
    }

    public void d(View view) {
        this.f20332a.d(view);
    }

    public DisplayCutoutCompat e() {
        return this.f20332a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return ObjectsCompat.a(this.f20332a, ((WindowInsetsCompat) obj).f20332a);
    }

    public Insets f(int i2) {
        return this.f20332a.g(i2);
    }

    public Insets g(int i2) {
        return this.f20332a.h(i2);
    }

    public Insets h() {
        return this.f20332a.j();
    }

    public int hashCode() {
        Impl impl = this.f20332a;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public int i() {
        return this.f20332a.l().f19777d;
    }

    public int j() {
        return this.f20332a.l().f19774a;
    }

    public int k() {
        return this.f20332a.l().f19776c;
    }

    public int l() {
        return this.f20332a.l().f19775b;
    }

    public boolean m() {
        Insets f2 = f(Type.a());
        Insets insets = Insets.f19773e;
        return !f2.equals(insets) || !g(Type.a() ^ Type.d()).equals(insets) || e() != null;
    }

    public WindowInsetsCompat n(int i2, int i3, int i4, int i5) {
        return this.f20332a.n(i2, i3, i4, i5);
    }

    public boolean p() {
        return this.f20332a.o();
    }

    public boolean q(int i2) {
        return this.f20332a.q(i2);
    }

    public WindowInsetsCompat r(int i2, int i3, int i4, int i5) {
        return new Builder(this).d(Insets.b(i2, i3, i4, i5)).a();
    }

    public void s(Insets[] insetsArr) {
        this.f20332a.r(insetsArr);
    }

    public void t(Insets insets) {
        this.f20332a.s(insets);
    }

    public void u(WindowInsetsCompat windowInsetsCompat) {
        this.f20332a.t(windowInsetsCompat);
    }

    public void v(Insets insets) {
        this.f20332a.u(insets);
    }

    public WindowInsets w() {
        Impl impl = this.f20332a;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).f20354c;
        }
        return null;
    }

    public static class BuilderImpl20 extends BuilderImpl {

        /* renamed from: e  reason: collision with root package name */
        public static Field f20340e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f20341f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor f20342g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f20343h = false;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsets f20344c;

        /* renamed from: d  reason: collision with root package name */
        public Insets f20345d;

        public BuilderImpl20() {
            this.f20344c = i();
        }

        private static WindowInsets i() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!f20341f) {
                try {
                    f20340e = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f20341f = true;
            }
            Field field = f20340e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f20343h) {
                try {
                    f20342g = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f20343h = true;
            }
            Constructor constructor = f20342g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat x2 = WindowInsetsCompat.x(this.f20344c);
            x2.s(this.f20339b);
            x2.v(this.f20345d);
            return x2;
        }

        public void e(Insets insets) {
            this.f20345d = insets;
        }

        public void g(Insets insets) {
            WindowInsets windowInsets = this.f20344c;
            if (windowInsets != null) {
                this.f20344c = windowInsets.replaceSystemWindowInsets(insets.f19774a, insets.f19775b, insets.f19776c, insets.f19777d);
            }
        }

        public BuilderImpl20(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f20344c = windowInsetsCompat.w();
        }
    }

    public static class BuilderImpl29 extends BuilderImpl {

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets.Builder f20346c;

        public BuilderImpl29() {
            this.f20346c = b.a();
        }

        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat x2 = WindowInsetsCompat.x(this.f20346c.build());
            x2.s(this.f20339b);
            return x2;
        }

        public void d(Insets insets) {
            WindowInsets.Builder unused = this.f20346c.setMandatorySystemGestureInsets(insets.e());
        }

        public void e(Insets insets) {
            WindowInsets.Builder unused = this.f20346c.setStableInsets(insets.e());
        }

        public void f(Insets insets) {
            WindowInsets.Builder unused = this.f20346c.setSystemGestureInsets(insets.e());
        }

        public void g(Insets insets) {
            WindowInsets.Builder unused = this.f20346c.setSystemWindowInsets(insets.e());
        }

        public void h(Insets insets) {
            WindowInsets.Builder unused = this.f20346c.setTappableElementInsets(insets.e());
        }

        public BuilderImpl29(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder builder;
            WindowInsets w2 = windowInsetsCompat.w();
            if (w2 != null) {
                builder = N.a(w2);
            } else {
                builder = b.a();
            }
            this.f20346c = builder;
        }
    }

    public static class Impl21 extends Impl20 {

        /* renamed from: m  reason: collision with root package name */
        public Insets f20359m = null;

        public Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        public WindowInsetsCompat b() {
            return WindowInsetsCompat.x(this.f20354c.consumeStableInsets());
        }

        public WindowInsetsCompat c() {
            return WindowInsetsCompat.x(this.f20354c.consumeSystemWindowInsets());
        }

        public final Insets j() {
            if (this.f20359m == null) {
                this.f20359m = Insets.b(this.f20354c.getStableInsetLeft(), this.f20354c.getStableInsetTop(), this.f20354c.getStableInsetRight(), this.f20354c.getStableInsetBottom());
            }
            return this.f20359m;
        }

        public boolean o() {
            return this.f20354c.isConsumed();
        }

        public void u(Insets insets) {
            this.f20359m = insets;
        }

        public Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, (Impl20) impl21);
            this.f20359m = impl21.f20359m;
        }
    }

    public static class Impl20 extends Impl {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f20349h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f20350i;

        /* renamed from: j  reason: collision with root package name */
        public static Class f20351j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f20352k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f20353l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f20354c;

        /* renamed from: d  reason: collision with root package name */
        public Insets[] f20355d;

        /* renamed from: e  reason: collision with root package name */
        public Insets f20356e;

        /* renamed from: f  reason: collision with root package name */
        public WindowInsetsCompat f20357f;

        /* renamed from: g  reason: collision with root package name */
        public Insets f20358g;

        public Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f20356e = null;
            this.f20354c = windowInsets;
        }

        private static void A() {
            try {
                f20350i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f20351j = cls;
                f20352k = cls.getDeclaredField("mVisibleInsets");
                f20353l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f20352k.setAccessible(true);
                f20353l.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f20349h = true;
        }

        private Insets v(int i2, boolean z2) {
            Insets insets = Insets.f19773e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    insets = Insets.a(insets, w(i3, z2));
                }
            }
            return insets;
        }

        private Insets x() {
            WindowInsetsCompat windowInsetsCompat = this.f20357f;
            return windowInsetsCompat != null ? windowInsetsCompat.h() : Insets.f19773e;
        }

        private Insets y(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f20349h) {
                    A();
                }
                Method method = f20350i;
                if (!(method == null || f20351j == null || f20352k == null)) {
                    try {
                        Object invoke = method.invoke(view, (Object[]) null);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f20352k.get(f20353l.get(invoke));
                        if (rect != null) {
                            return Insets.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void d(View view) {
            Insets y2 = y(view);
            if (y2 == null) {
                y2 = Insets.f19773e;
            }
            s(y2);
        }

        public void e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.u(this.f20357f);
            windowInsetsCompat.t(this.f20358g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f20358g, ((Impl20) obj).f20358g);
        }

        public Insets g(int i2) {
            return v(i2, false);
        }

        public Insets h(int i2) {
            return v(i2, true);
        }

        public final Insets l() {
            if (this.f20356e == null) {
                this.f20356e = Insets.b(this.f20354c.getSystemWindowInsetLeft(), this.f20354c.getSystemWindowInsetTop(), this.f20354c.getSystemWindowInsetRight(), this.f20354c.getSystemWindowInsetBottom());
            }
            return this.f20356e;
        }

        public WindowInsetsCompat n(int i2, int i3, int i4, int i5) {
            Builder builder = new Builder(WindowInsetsCompat.x(this.f20354c));
            builder.d(WindowInsetsCompat.o(l(), i2, i3, i4, i5));
            builder.c(WindowInsetsCompat.o(j(), i2, i3, i4, i5));
            return builder.a();
        }

        public boolean p() {
            return this.f20354c.isRound();
        }

        public boolean q(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0 && !z(i3)) {
                    return false;
                }
            }
            return true;
        }

        public void r(Insets[] insetsArr) {
            this.f20355d = insetsArr;
        }

        public void s(Insets insets) {
            this.f20358g = insets;
        }

        public void t(WindowInsetsCompat windowInsetsCompat) {
            this.f20357f = windowInsetsCompat;
        }

        public Insets w(int i2, boolean z2) {
            int i3;
            if (i2 == 1) {
                return z2 ? Insets.b(0, Math.max(x().f19775b, l().f19775b), 0, 0) : Insets.b(0, l().f19775b, 0, 0);
            }
            Insets insets = null;
            if (i2 != 2) {
                if (i2 == 8) {
                    Insets[] insetsArr = this.f20355d;
                    if (insetsArr != null) {
                        insets = insetsArr[Type.e(8)];
                    }
                    if (insets != null) {
                        return insets;
                    }
                    Insets l2 = l();
                    Insets x2 = x();
                    int i4 = l2.f19777d;
                    if (i4 > x2.f19777d) {
                        return Insets.b(0, 0, 0, i4);
                    }
                    Insets insets2 = this.f20358g;
                    return (insets2 == null || insets2.equals(Insets.f19773e) || (i3 = this.f20358g.f19777d) <= x2.f19777d) ? Insets.f19773e : Insets.b(0, 0, 0, i3);
                } else if (i2 == 16) {
                    return k();
                } else {
                    if (i2 == 32) {
                        return i();
                    }
                    if (i2 == 64) {
                        return m();
                    }
                    if (i2 != 128) {
                        return Insets.f19773e;
                    }
                    WindowInsetsCompat windowInsetsCompat = this.f20357f;
                    DisplayCutoutCompat e2 = windowInsetsCompat != null ? windowInsetsCompat.e() : f();
                    return e2 != null ? Insets.b(e2.b(), e2.d(), e2.c(), e2.a()) : Insets.f19773e;
                }
            } else if (z2) {
                Insets x3 = x();
                Insets j2 = j();
                return Insets.b(Math.max(x3.f19774a, j2.f19774a), 0, Math.max(x3.f19776c, j2.f19776c), Math.max(x3.f19777d, j2.f19777d));
            } else {
                Insets l3 = l();
                WindowInsetsCompat windowInsetsCompat2 = this.f20357f;
                if (windowInsetsCompat2 != null) {
                    insets = windowInsetsCompat2.h();
                }
                int i5 = l3.f19777d;
                if (insets != null) {
                    i5 = Math.min(i5, insets.f19777d);
                }
                return Insets.b(l3.f19774a, 0, l3.f19776c, i5);
            }
        }

        public boolean z(int i2) {
            if (!(i2 == 1 || i2 == 2)) {
                if (i2 == 4) {
                    return false;
                }
                if (!(i2 == 8 || i2 == 128)) {
                    return true;
                }
            }
            return !w(i2, false).equals(Insets.f19773e);
        }

        public Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.f20354c));
        }
    }

    public static class Impl29 extends Impl28 {

        /* renamed from: n  reason: collision with root package name */
        public Insets f20360n = null;

        /* renamed from: o  reason: collision with root package name */
        public Insets f20361o = null;

        /* renamed from: p  reason: collision with root package name */
        public Insets f20362p = null;

        public Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        public Insets i() {
            if (this.f20361o == null) {
                this.f20361o = Insets.d(this.f20354c.getMandatorySystemGestureInsets());
            }
            return this.f20361o;
        }

        public Insets k() {
            if (this.f20360n == null) {
                this.f20360n = Insets.d(this.f20354c.getSystemGestureInsets());
            }
            return this.f20360n;
        }

        public Insets m() {
            if (this.f20362p == null) {
                this.f20362p = Insets.d(this.f20354c.getTappableElementInsets());
            }
            return this.f20362p;
        }

        public WindowInsetsCompat n(int i2, int i3, int i4, int i5) {
            return WindowInsetsCompat.x(this.f20354c.inset(i2, i3, i4, i5));
        }

        public void u(Insets insets) {
        }

        public Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, (Impl28) impl29);
        }
    }

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final BuilderImpl f20337a;

        public Builder() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f20337a = new BuilderImpl30();
            } else if (i2 >= 29) {
                this.f20337a = new BuilderImpl29();
            } else {
                this.f20337a = new BuilderImpl20();
            }
        }

        public WindowInsetsCompat a() {
            return this.f20337a.b();
        }

        public Builder b(int i2, Insets insets) {
            this.f20337a.c(i2, insets);
            return this;
        }

        public Builder c(Insets insets) {
            this.f20337a.e(insets);
            return this;
        }

        public Builder d(Insets insets) {
            this.f20337a.g(insets);
            return this;
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f20337a = new BuilderImpl30(windowInsetsCompat);
            } else if (i2 >= 29) {
                this.f20337a = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.f20337a = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.f20332a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (impl instanceof Impl30)) {
                this.f20332a = new Impl30(this, (Impl30) impl);
            } else if (i2 >= 29 && (impl instanceof Impl29)) {
                this.f20332a = new Impl29(this, (Impl29) impl);
            } else if (i2 >= 28 && (impl instanceof Impl28)) {
                this.f20332a = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.f20332a = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.f20332a = new Impl20(this, (Impl20) impl);
            } else {
                this.f20332a = new Impl(this);
            }
            impl.e(this);
            return;
        }
        this.f20332a = new Impl(this);
    }
}
