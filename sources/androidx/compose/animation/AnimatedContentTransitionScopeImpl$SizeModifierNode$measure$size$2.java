package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2 extends Lambda implements Function1<S, IntSize> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f2078A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode f2079z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2(AnimatedContentTransitionScopeImpl.SizeModifierNode sizeModifierNode, long j2) {
        super(1);
        this.f2079z = sizeModifierNode;
        this.f2078A = j2;
    }

    public final long b(Object obj) {
        if (Intrinsics.d(obj, this.f2079z.a3().b())) {
            return this.f2079z.c3(this.f2078A);
        }
        State state = (State) this.f2079z.a3().n().e(obj);
        return state != null ? ((IntSize) state.getValue()).j() : IntSize.f19170b.a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.b(b(obj));
    }
}
