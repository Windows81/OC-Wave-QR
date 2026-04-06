package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class ReportFragment extends Fragment {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f21958A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public ActivityInitializationListener f21959z;

    @Metadata
    public interface ActivityInitializationListener {
        void j();

        void n();

        void onCreate();
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity, Lifecycle.Event event) {
            Intrinsics.i(activity, "activity");
            Intrinsics.i(event, "event");
            if (activity instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner) activity).a().i(event);
            } else if (activity instanceof LifecycleOwner) {
                Lifecycle a2 = ((LifecycleOwner) activity).a();
                if (a2 instanceof LifecycleRegistry) {
                    ((LifecycleRegistry) a2).i(event);
                }
            }
        }

        public final ReportFragment b(Activity activity) {
            Intrinsics.i(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.g(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment) findFragmentByTag;
        }

        public final void c(Activity activity) {
            Intrinsics.i(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                LifecycleCallbacks.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void a(Activity activity) {
                Intrinsics.i(activity, "activity");
                h.a(activity, new LifecycleCallbacks());
            }

            public Companion() {
            }
        }

        @JvmStatic
        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.i(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            Intrinsics.i(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            Intrinsics.i(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            Intrinsics.i(activity, "activity");
            ReportFragment.f21958A.a(activity, Lifecycle.Event.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            Intrinsics.i(activity, "activity");
            ReportFragment.f21958A.a(activity, Lifecycle.Event.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            Intrinsics.i(activity, "activity");
            ReportFragment.f21958A.a(activity, Lifecycle.Event.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            Intrinsics.i(activity, "activity");
            ReportFragment.f21958A.a(activity, Lifecycle.Event.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            Intrinsics.i(activity, "activity");
            ReportFragment.f21958A.a(activity, Lifecycle.Event.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            Intrinsics.i(activity, "activity");
            ReportFragment.f21958A.a(activity, Lifecycle.Event.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            Intrinsics.i(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.i(activity, "activity");
            Intrinsics.i(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            Intrinsics.i(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            Intrinsics.i(activity, "activity");
        }
    }

    public final void a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            Companion companion = f21958A;
            Activity activity = getActivity();
            Intrinsics.h(activity, "getActivity(...)");
            companion.a(activity, event);
        }
    }

    public final void b(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onCreate();
        }
    }

    public final void c(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.j();
        }
    }

    public final void d(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.n();
        }
    }

    public final void e(ActivityInitializationListener activityInitializationListener) {
        this.f21959z = activityInitializationListener;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f21959z);
        a(Lifecycle.Event.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(Lifecycle.Event.ON_DESTROY);
        this.f21959z = null;
    }

    public void onPause() {
        super.onPause();
        a(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f21959z);
        a(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f21959z);
        a(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(Lifecycle.Event.ON_STOP);
    }
}
