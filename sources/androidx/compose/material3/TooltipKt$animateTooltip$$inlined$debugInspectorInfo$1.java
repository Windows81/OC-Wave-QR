package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f11602z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(Transition transition) {
        super(1);
        this.f11602z = transition;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("animateTooltip");
        inspectorInfo.a().b("transition", this.f11602z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
