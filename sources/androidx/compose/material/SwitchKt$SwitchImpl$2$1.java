package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwitchKt$SwitchImpl$2$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f8638z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$2$1(State state) {
        super(1);
        this.f8638z = state;
    }

    public final void b(DrawScope drawScope) {
        SwitchKt.q(drawScope, SwitchKt.g(this.f8638z), drawScope.B1(SwitchKt.s()), drawScope.B1(SwitchKt.r()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
