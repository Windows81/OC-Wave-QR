package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SuspendAnimationKt$animate$7 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimationState f2694z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$7(AnimationState animationState) {
        super(0);
        this.f2694z = animationState;
    }

    public final void invoke() {
        this.f2694z.x(false);
    }
}
