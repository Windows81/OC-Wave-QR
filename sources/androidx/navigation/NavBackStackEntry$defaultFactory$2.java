package androidx.navigation;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavBackStackEntry$defaultFactory$2 extends Lambda implements Function0<SavedStateViewModelFactory> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22200z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$defaultFactory$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.f22200z = navBackStackEntry;
    }

    /* renamed from: b */
    public final SavedStateViewModelFactory invoke() {
        Context b2 = this.f22200z.f22198z;
        Application application = null;
        Context applicationContext = b2 != null ? b2.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        NavBackStackEntry navBackStackEntry = this.f22200z;
        return new SavedStateViewModelFactory(application, navBackStackEntry, navBackStackEntry.e());
    }
}
