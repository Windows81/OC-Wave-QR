package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SharedTransitionScopeImpl$sharedElement$1 extends Lambda implements Function1<EnterExitState, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final SharedTransitionScopeImpl$sharedElement$1 f2360z = new SharedTransitionScopeImpl$sharedElement$1();

    public SharedTransitionScopeImpl$sharedElement$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(EnterExitState enterExitState) {
        return Boolean.valueOf(enterExitState == EnterExitState.Visible);
    }
}
