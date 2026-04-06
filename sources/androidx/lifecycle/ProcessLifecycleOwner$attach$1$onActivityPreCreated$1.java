package androidx.lifecycle;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ProcessLifecycleOwner$attach$1$onActivityPreCreated$1 extends EmptyActivityLifecycleCallbacks {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public ProcessLifecycleOwner$attach$1$onActivityPreCreated$1(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    public void onActivityPostResumed(Activity activity) {
        Intrinsics.i(activity, "activity");
        this.this$0.g();
    }

    public void onActivityPostStarted(Activity activity) {
        Intrinsics.i(activity, "activity");
        this.this$0.h();
    }
}
