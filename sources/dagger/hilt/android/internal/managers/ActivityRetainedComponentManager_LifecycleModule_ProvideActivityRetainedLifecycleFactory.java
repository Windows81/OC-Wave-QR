package dagger.hilt.android.internal.managers;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory implements Factory<ActivityRetainedLifecycle> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory f39735a = new ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory();
    }

    public static ActivityRetainedLifecycle b() {
        return (ActivityRetainedLifecycle) Preconditions.d(ActivityRetainedComponentManager.LifecycleModule.a());
    }

    /* renamed from: a */
    public ActivityRetainedLifecycle get() {
        return b();
    }
}
