package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ActivityResultRegistryKt {
    public static final ManagedActivityResultLauncher a(ActivityResultContract activityResultContract, Function1 function1, Composer composer, int i2) {
        ActivityResultContract activityResultContract2 = activityResultContract;
        Composer composer2 = composer;
        int i3 = i2;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1408504823, i3, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        State p2 = SnapshotStateKt.p(activityResultContract2, composer2, i3 & 14);
        State p3 = SnapshotStateKt.p(function1, composer2, (i3 >> 3) & 14);
        String str = (String) RememberSaveableKt.h(new Object[0], (Saver) null, (String) null, ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1.f134z, composer, 3072, 6);
        ActivityResultRegistryOwner a2 = LocalActivityResultRegistryOwner.f148a.a(composer2, 6);
        if (a2 != null) {
            ActivityResultRegistry p4 = a2.p();
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new ActivityResultLauncherHolder();
                composer2.N(g2);
            }
            ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) g2;
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new ManagedActivityResultLauncher(activityResultLauncherHolder, p2);
                composer2.N(g3);
            }
            ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) g3;
            boolean l2 = composer2.l(activityResultLauncherHolder) | composer2.l(p4) | composer2.W(str) | composer2.l(activityResultContract2) | composer2.W(p3);
            Object g4 = composer.g();
            if (l2 || g4 == companion.a()) {
                ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 activityResultRegistryKt$rememberLauncherForActivityResult$1$1 = new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(activityResultLauncherHolder, p4, str, activityResultContract, p3);
                composer2.N(activityResultRegistryKt$rememberLauncherForActivityResult$1$1);
                g4 = activityResultRegistryKt$rememberLauncherForActivityResult$1$1;
            }
            ActivityResultRegistry activityResultRegistry = p4;
            String str2 = str;
            ActivityResultContract activityResultContract3 = activityResultContract;
            EffectsKt.a(activityResultRegistry, str2, activityResultContract3, (Function1) g4, composer, (i3 << 6) & 896);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            return managedActivityResultLauncher;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
    }
}
