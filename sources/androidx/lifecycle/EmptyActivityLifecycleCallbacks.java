package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class EmptyActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.i(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.i(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.i(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        Intrinsics.i(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.i(activity, "activity");
        Intrinsics.i(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.i(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.i(activity, "activity");
    }
}
