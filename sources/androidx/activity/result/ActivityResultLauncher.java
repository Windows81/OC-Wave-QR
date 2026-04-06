package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;

@Metadata
public abstract class ActivityResultLauncher<I> {
    public void a(Object obj) {
        b(obj, (ActivityOptionsCompat) null);
    }

    public abstract void b(Object obj, ActivityOptionsCompat activityOptionsCompat);

    public abstract void c();
}
