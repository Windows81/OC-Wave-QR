package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ProcessLifecycleOwner$attach$1 extends EmptyActivityLifecycleCallbacks {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public ProcessLifecycleOwner$attach$1(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.i(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            ReportFragment.f21958A.b(activity).e(this.this$0.G);
        }
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.i(activity, "activity");
        this.this$0.f();
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.i(activity, "activity");
        ProcessLifecycleOwner.Api29Impl.a(activity, new ProcessLifecycleOwner$attach$1$onActivityPreCreated$1(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.i(activity, "activity");
        this.this$0.i();
    }
}
