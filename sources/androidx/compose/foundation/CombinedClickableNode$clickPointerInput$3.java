package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CombinedClickableNode$clickPointerInput$3 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CombinedClickableNode f3041z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$clickPointerInput$3(CombinedClickableNode combinedClickableNode) {
        super(1);
        this.f3041z = combinedClickableNode;
    }

    public final void b(long j2) {
        Function0 F3 = this.f3041z.j0;
        if (F3 != null) {
            F3.invoke();
        }
        if (this.f3041z.G3()) {
            ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.a(this.f3041z, CompositionLocalsKt.k())).a(HapticFeedbackType.f16726b.e());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
