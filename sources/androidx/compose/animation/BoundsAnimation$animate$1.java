package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BoundsAnimation$animate$1 extends Lambda implements Function1<Transition.Segment<Boolean>, FiniteAnimationSpec<Rect>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BoundsAnimation f2157z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoundsAnimation$animate$1(BoundsAnimation boundsAnimation) {
        super(1);
        this.f2157z = boundsAnimation;
    }

    /* renamed from: b */
    public final FiniteAnimationSpec invoke(Transition.Segment segment) {
        return this.f2157z.c();
    }
}
