package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentKt$AnimatedContent$6$1$4$1 extends Lambda implements Function2<EnterExitState, EnterExitState, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ExitTransition f2037z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$4$1(ExitTransition exitTransition) {
        super(2);
        this.f2037z = exitTransition;
    }

    /* renamed from: b */
    public final Boolean m(EnterExitState enterExitState, EnterExitState enterExitState2) {
        EnterExitState enterExitState3 = EnterExitState.PostExit;
        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !this.f2037z.b().d());
    }
}
