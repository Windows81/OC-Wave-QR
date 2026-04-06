package androidx.core.splashscreen;

import android.graphics.Rect;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SplashScreen {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f20050a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static class Impl {

        /* renamed from: a  reason: collision with root package name */
        public KeepOnScreenCondition f20051a;

        /* renamed from: b  reason: collision with root package name */
        public OnExitAnimationListener f20052b;

        /* renamed from: c  reason: collision with root package name */
        public SplashScreenViewProvider f20053c;

        public static final void e(SplashScreenViewProvider splashScreenViewProvider, OnExitAnimationListener onExitAnimationListener) {
            Intrinsics.i(splashScreenViewProvider, "$splashScreenViewProvider");
            Intrinsics.i(onExitAnimationListener, "$finalListener");
            splashScreenViewProvider.a().bringToFront();
            onExitAnimationListener.a(splashScreenViewProvider);
        }

        public final void d(SplashScreenViewProvider splashScreenViewProvider) {
            Intrinsics.i(splashScreenViewProvider, "splashScreenViewProvider");
            OnExitAnimationListener onExitAnimationListener = this.f20052b;
            if (onExitAnimationListener != null) {
                this.f20052b = null;
                splashScreenViewProvider.a().postOnAnimation(new a(splashScreenViewProvider, onExitAnimationListener));
            }
        }

        public final KeepOnScreenCondition f() {
            return this.f20051a;
        }
    }

    @Metadata
    public static final class Impl31 extends Impl {

        /* renamed from: d  reason: collision with root package name */
        public boolean f20058d;

        public final boolean g(SplashScreenView splashScreenView) {
            Intrinsics.i(splashScreenView, "child");
            WindowInsets a2 = b.a().build();
            Intrinsics.h(a2, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return a2 != d.a(splashScreenView).computeSystemWindowInsets(a2, rect) || !rect.isEmpty();
        }

        public final void h(boolean z2) {
            this.f20058d = z2;
        }
    }

    @Metadata
    public interface KeepOnScreenCondition {
        boolean a();
    }

    @Metadata
    public interface OnExitAnimationListener {
        void a(SplashScreenViewProvider splashScreenViewProvider);
    }
}
