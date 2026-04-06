package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2 extends Lambda implements Function2<EnterExitState, EnterExitState, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2 f2138z = new AnimatedVisibilityKt$AnimatedVisibilityImpl$2();

    public AnimatedVisibilityKt$AnimatedVisibilityImpl$2() {
        super(2);
    }

    /* renamed from: b */
    public final Boolean m(EnterExitState enterExitState, EnterExitState enterExitState2) {
        return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
    }
}
