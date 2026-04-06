package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeImpl$sharedBounds$2$2$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScope.SharedContentState f2355z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBounds$2$2$1(SharedTransitionScope.SharedContentState sharedContentState) {
        super(0);
        this.f2355z = sharedContentState;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(this.f2355z.f());
    }
}
