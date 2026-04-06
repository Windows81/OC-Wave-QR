package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: coil.compose.ComposableSingletons$SubcomposeAsyncImageKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 extends Lambda implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 f23300z = new ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1();

    public ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1() {
        super(3);
    }

    public final void b(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, int i2) {
        int i3;
        if ((i2 & 14) == 0) {
            SubcomposeAsyncImageScope subcomposeAsyncImageScope2 = subcomposeAsyncImageScope;
            Composer composer2 = composer;
            i3 = i2 | (composer.W(subcomposeAsyncImageScope) ? 4 : 2);
        } else {
            SubcomposeAsyncImageScope subcomposeAsyncImageScope3 = subcomposeAsyncImageScope;
            Composer composer3 = composer;
            i3 = i2;
        }
        if ((i3 & 91) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1692951203, i3, -1, "coil.compose.ComposableSingletons$SubcomposeAsyncImageKt.lambda-1.<anonymous> (SubcomposeAsyncImage.kt:391)");
            }
            SubcomposeAsyncImageKt.c(subcomposeAsyncImageScope, (Modifier) null, (Painter) null, (String) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, false, composer, i3 & 14, 255);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SubcomposeAsyncImageScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
