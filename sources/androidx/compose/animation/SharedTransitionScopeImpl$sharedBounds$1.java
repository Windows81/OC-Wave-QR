package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SharedTransitionScopeImpl$sharedBounds$1 extends Lambda implements Function1<EnterExitState, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final SharedTransitionScopeImpl$sharedBounds$1 f2350z = new SharedTransitionScopeImpl$sharedBounds$1();

    public SharedTransitionScopeImpl$sharedBounds$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(EnterExitState enterExitState) {
        return Boolean.valueOf(enterExitState == EnterExitState.Visible);
    }
}
