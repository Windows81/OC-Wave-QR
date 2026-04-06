package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionModifierNode$measure$animSize$1 extends Lambda implements Function1<EnterExitState, IntSize> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f2265A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f2266z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$animSize$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j2) {
        super(1);
        this.f2266z = enterExitTransitionModifierNode;
        this.f2265A = j2;
    }

    public final long b(EnterExitState enterExitState) {
        return this.f2266z.l3(enterExitState, this.f2265A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.b(b((EnterExitState) obj));
    }
}
