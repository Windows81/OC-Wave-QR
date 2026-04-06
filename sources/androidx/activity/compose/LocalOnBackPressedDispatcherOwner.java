package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata
public final class LocalOnBackPressedDispatcherOwner {

    /* renamed from: a  reason: collision with root package name */
    public static final LocalOnBackPressedDispatcherOwner f154a = new LocalOnBackPressedDispatcherOwner();

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f155b = CompositionLocalKt.h((SnapshotMutationPolicy) null, LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1.f156z, 1, (Object) null);

    public final OnBackPressedDispatcherOwner a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-2068013981, i2, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) composer.C(f155b);
        if (onBackPressedDispatcherOwner == null) {
            composer.X(544166745);
            onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.a((View) composer.C(AndroidCompositionLocals_androidKt.j()));
            composer.M();
        } else {
            composer.X(544164296);
            composer.M();
        }
        if (onBackPressedDispatcherOwner == null) {
            composer.X(544168748);
            Context context = (Context) composer.C(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof OnBackPressedDispatcherOwner) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) context;
            composer.M();
        } else {
            composer.X(544164377);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return onBackPressedDispatcherOwner;
    }
}
