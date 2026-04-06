package dagger.hilt.android.internal.modules;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ActivityModule_ProvideFragmentActivityFactory implements Factory<FragmentActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f39755a;

    public static FragmentActivity b(Activity activity) {
        return (FragmentActivity) Preconditions.d(ActivityModule.a(activity));
    }

    /* renamed from: a */
    public FragmentActivity get() {
        return b((Activity) this.f39755a.get());
    }
}
