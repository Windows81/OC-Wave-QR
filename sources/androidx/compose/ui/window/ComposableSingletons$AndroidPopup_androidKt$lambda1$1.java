package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AndroidPopup_androidKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AndroidPopup_androidKt$lambda1$1 f19317z = new ComposableSingletons$AndroidPopup_androidKt$lambda1$1();

    public ComposableSingletons$AndroidPopup_androidKt$lambda1$1() {
        super(2);
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1131826196, i2, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda-1.<anonymous> (AndroidPopup.android.kt:555)");
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
