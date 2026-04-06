package androidx.core.splashscreen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.splashscreen.SplashScreen;
import kotlin.Metadata;

@Metadata
public final class SplashScreen$Impl31$hierarchyListener$1 implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen.Impl31 f20059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f20060b;

    public void onChildViewAdded(View view, View view2) {
        if (e.a(view2)) {
            SplashScreen.Impl31 impl31 = this.f20059a;
            impl31.h(impl31.g(f.a(view2)));
            ((ViewGroup) this.f20060b.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
    }
}
