package androidx.core.splashscreen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SplashScreenViewProvider {

    /* renamed from: a  reason: collision with root package name */
    public final ViewImpl f20063a;

    @Metadata
    public static class ViewImpl {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f20064a;

        /* renamed from: b  reason: collision with root package name */
        public final Lazy f20065b;

        public final Activity a() {
            return this.f20064a;
        }

        public ViewGroup b() {
            return c();
        }

        public final ViewGroup c() {
            return (ViewGroup) this.f20065b.getValue();
        }
    }

    @Metadata
    public static final class ViewImpl31 extends ViewImpl {

        /* renamed from: c  reason: collision with root package name */
        public SplashScreenView f20067c;

        public final SplashScreenView d() {
            SplashScreenView splashScreenView = this.f20067c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            Intrinsics.y("platformView");
            return null;
        }

        /* renamed from: e */
        public SplashScreenView b() {
            return d();
        }
    }

    public final View a() {
        return this.f20063a.b();
    }
}
