package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentKt$SizeTransform$1 extends Lambda implements Function2<IntSize, IntSize, SpringSpec<IntSize>> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnimatedContentKt$SizeTransform$1 f2047z = new AnimatedContentKt$SizeTransform$1();

    public AnimatedContentKt$SizeTransform$1() {
        super(2);
    }

    public final SpringSpec b(long j2, long j3) {
        return AnimationSpecKt.l(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((IntSize) obj).j(), ((IntSize) obj2).j());
    }
}
