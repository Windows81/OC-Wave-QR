package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata
public final class LocalActivityResultRegistryOwner {

    /* renamed from: a  reason: collision with root package name */
    public static final LocalActivityResultRegistryOwner f148a = new LocalActivityResultRegistryOwner();

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f149b = CompositionLocalKt.h((SnapshotMutationPolicy) null, LocalActivityResultRegistryOwner$LocalComposition$1.f150z, 1, (Object) null);

    public final ActivityResultRegistryOwner a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1418020823, i2, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        ActivityResultRegistryOwner activityResultRegistryOwner = (ActivityResultRegistryOwner) composer.C(f149b);
        if (activityResultRegistryOwner == null) {
            composer.X(1006590171);
            Context context = (Context) composer.C(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof ActivityResultRegistryOwner) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            activityResultRegistryOwner = (ActivityResultRegistryOwner) context;
        } else {
            composer.X(1006589303);
        }
        composer.M();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return activityResultRegistryOwner;
    }
}
