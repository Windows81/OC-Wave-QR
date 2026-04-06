package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class IndicationKt$indication$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Indication f3088A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f3089z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$$inlined$debugInspectorInfo$1(InteractionSource interactionSource, Indication indication) {
        super(1);
        this.f3089z = interactionSource;
        this.f3088A = indication;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("indication");
        inspectorInfo.a().b("interactionSource", this.f3089z);
        inspectorInfo.a().b("indication", this.f3088A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
