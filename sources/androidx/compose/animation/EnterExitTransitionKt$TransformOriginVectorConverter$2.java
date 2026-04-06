package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$TransformOriginVectorConverter$2 extends Lambda implements Function1<AnimationVector2D, TransformOrigin> {

    /* renamed from: z  reason: collision with root package name */
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$2 f2219z = new EnterExitTransitionKt$TransformOriginVectorConverter$2();

    public EnterExitTransitionKt$TransformOriginVectorConverter$2() {
        super(1);
    }

    public final long b(AnimationVector2D animationVector2D) {
        return TransformOriginKt.a(animationVector2D.f(), animationVector2D.g());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TransformOrigin.b(b((AnimationVector2D) obj));
    }
}
