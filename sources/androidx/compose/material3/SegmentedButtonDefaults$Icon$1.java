package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class SegmentedButtonDefaults$Icon$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10925z;

    public SegmentedButtonDefaults$Icon$1(Function2 function2) {
        this.f10925z = function2;
    }

    public final void b(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(2059591811, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:649)");
        }
        this.f10925z.m(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
