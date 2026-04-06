package androidx.compose.foundation;

import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTooltipKt$TooltipPopup$2$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f2943z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$TooltipPopup$2$1$1(String str) {
        super(1);
        this.f2943z = str;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m0(semanticsPropertyReceiver, LiveRegionMode.f18031b.a());
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, this.f2943z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
