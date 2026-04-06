package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;

@Metadata
public final class ActivityResultRegistry$register$2 extends ActivityResultLauncher<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActivityResultRegistry f237a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f238b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActivityResultContract f239c;

    public ActivityResultRegistry$register$2(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract) {
        this.f237a = activityResultRegistry;
        this.f238b = str;
        this.f239c = activityResultContract;
    }

    public void b(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        Object obj2 = this.f237a.f226b.get(this.f238b);
        ActivityResultContract activityResultContract = this.f239c;
        if (obj2 != null) {
            int intValue = ((Number) obj2).intValue();
            this.f237a.f228d.add(this.f238b);
            try {
                this.f237a.i(intValue, this.f239c, obj, activityOptionsCompat);
            } catch (Exception e2) {
                this.f237a.f228d.remove(this.f238b);
                throw e2;
            }
        } else {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    public void c() {
        this.f237a.p(this.f238b);
    }
}
