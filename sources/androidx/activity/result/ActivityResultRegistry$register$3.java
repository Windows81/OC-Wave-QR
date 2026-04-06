package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;

@Metadata
public final class ActivityResultRegistry$register$3 extends ActivityResultLauncher<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActivityResultRegistry f240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f241b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActivityResultContract f242c;

    public ActivityResultRegistry$register$3(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract) {
        this.f240a = activityResultRegistry;
        this.f241b = str;
        this.f242c = activityResultContract;
    }

    public void b(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        Object obj2 = this.f240a.f226b.get(this.f241b);
        ActivityResultContract activityResultContract = this.f242c;
        if (obj2 != null) {
            int intValue = ((Number) obj2).intValue();
            this.f240a.f228d.add(this.f241b);
            try {
                this.f240a.i(intValue, this.f242c, obj, activityOptionsCompat);
            } catch (Exception e2) {
                this.f240a.f228d.remove(this.f241b);
                throw e2;
            }
        } else {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    public void c() {
        this.f240a.p(this.f241b);
    }
}
