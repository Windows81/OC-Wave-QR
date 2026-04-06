package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LifecycleDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public static final LifecycleDispatcher f21907a = new LifecycleDispatcher();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f21908b = new AtomicBoolean(false);

    @Metadata
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.i(activity, "activity");
            ReportFragment.f21958A.c(activity);
        }
    }

    public static final void a(Context context) {
        Intrinsics.i(context, "context");
        if (!f21908b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
        }
    }
}
