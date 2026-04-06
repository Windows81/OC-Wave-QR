package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata
public final class LocalFullyDrawnReporterOwner {

    /* renamed from: a  reason: collision with root package name */
    public static final LocalFullyDrawnReporterOwner f151a = new LocalFullyDrawnReporterOwner();

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f152b = CompositionLocalKt.h((SnapshotMutationPolicy) null, LocalFullyDrawnReporterOwner$LocalFullyDrawnReporterOwner$1.f153z, 1, (Object) null);

    public final FullyDrawnReporterOwner a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(540186968, i2, -1, "androidx.activity.compose.LocalFullyDrawnReporterOwner.<get-current> (ReportDrawn.kt:95)");
        }
        FullyDrawnReporterOwner fullyDrawnReporterOwner = (FullyDrawnReporterOwner) composer.C(f152b);
        if (fullyDrawnReporterOwner == null) {
            composer.X(-1738308180);
            fullyDrawnReporterOwner = ViewTreeFullyDrawnReporterOwner.a((View) composer.C(AndroidCompositionLocals_androidKt.j()));
            composer.M();
        } else {
            composer.X(-1738310474);
            composer.M();
        }
        if (fullyDrawnReporterOwner == null) {
            composer.X(-1738306337);
            Context context = (Context) composer.C(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof FullyDrawnReporterOwner) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            fullyDrawnReporterOwner = (FullyDrawnReporterOwner) context;
            composer.M();
        } else {
            composer.X(-1738310398);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return fullyDrawnReporterOwner;
    }
}
