package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionModifierNode$measure$offsetDelta$2 extends Lambda implements Function1<EnterExitState, IntOffset> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f2268A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f2269z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$offsetDelta$2(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j2) {
        super(1);
        this.f2269z = enterExitTransitionModifierNode;
        this.f2268A = j2;
    }

    public final long b(EnterExitState enterExitState) {
        return this.f2269z.n3(enterExitState, this.f2268A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b((EnterExitState) obj));
    }
}
