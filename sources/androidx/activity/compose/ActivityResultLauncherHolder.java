package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class ActivityResultLauncherHolder<I> {

    /* renamed from: a  reason: collision with root package name */
    public ActivityResultLauncher f129a;

    public final void a(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        Unit unit;
        ActivityResultLauncher activityResultLauncher = this.f129a;
        if (activityResultLauncher != null) {
            activityResultLauncher.b(obj, activityOptionsCompat);
            unit = Unit.f40552a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(ActivityResultLauncher activityResultLauncher) {
        this.f129a = activityResultLauncher;
    }

    public final void c() {
        Unit unit;
        ActivityResultLauncher activityResultLauncher = this.f129a;
        if (activityResultLauncher != null) {
            activityResultLauncher.c();
            unit = Unit.f40552a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
