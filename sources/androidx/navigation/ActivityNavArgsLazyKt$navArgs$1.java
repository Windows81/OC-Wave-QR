package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ActivityNavArgsLazyKt$navArgs$1 extends Lambda implements Function0<Bundle> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Activity f22155z;

    /* renamed from: b */
    public final Bundle invoke() {
        Bundle bundle;
        Intent intent = this.f22155z.getIntent();
        if (intent != null) {
            Activity activity = this.f22155z;
            bundle = intent.getExtras();
            if (bundle == null) {
                throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
            }
        } else {
            bundle = null;
        }
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Activity " + this.f22155z + " has a null Intent");
    }
}
