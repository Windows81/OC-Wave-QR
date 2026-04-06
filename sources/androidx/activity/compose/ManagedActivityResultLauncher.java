package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.State;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;

@Metadata
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {

    /* renamed from: a  reason: collision with root package name */
    public final ActivityResultLauncherHolder f157a;

    /* renamed from: b  reason: collision with root package name */
    public final State f158b;

    public ManagedActivityResultLauncher(ActivityResultLauncherHolder activityResultLauncherHolder, State state) {
        this.f157a = activityResultLauncherHolder;
        this.f158b = state;
    }

    public void b(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        this.f157a.a(obj, activityOptionsCompat);
    }

    public void c() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
