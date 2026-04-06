package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.android.lifecycle.RetainedLifecycle;
import java.util.HashSet;
import java.util.Set;

public final class RetainedLifecycleImpl implements ActivityRetainedLifecycle, ViewModelLifecycle {

    /* renamed from: a  reason: collision with root package name */
    public final Set f39722a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public boolean f39723b = false;

    public void a() {
        ThreadUtil.a();
        this.f39723b = true;
        for (RetainedLifecycle.OnClearedListener a2 : this.f39722a) {
            a2.a();
        }
    }
}
