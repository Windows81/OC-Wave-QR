package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends Lambda implements Function1<TransformOrigin, AnimationVector2D> {

    /* renamed from: z  reason: collision with root package name */
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 f2218z = new EnterExitTransitionKt$TransformOriginVectorConverter$1();

    public EnterExitTransitionKt$TransformOriginVectorConverter$1() {
        super(1);
    }

    public final AnimationVector2D b(long j2) {
        return new AnimationVector2D(TransformOrigin.f(j2), TransformOrigin.g(j2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((TransformOrigin) obj).j());
    }
}
