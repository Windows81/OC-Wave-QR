package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$animateIntOffset$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<IntOffset>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TransitionKt$animateIntOffset$1 f2763z = new TransitionKt$animateIntOffset$1();

    public TransitionKt$animateIntOffset$1() {
        super(3);
    }

    public final SpringSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-1953479610);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1953479610, i2, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2043)");
        }
        long j2 = (long) 1;
        SpringSpec l2 = AnimationSpecKt.l(0.0f, 0.0f, IntOffset.c(IntOffset.f((j2 & 4294967295L) | (j2 << 32))), 3, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return l2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
