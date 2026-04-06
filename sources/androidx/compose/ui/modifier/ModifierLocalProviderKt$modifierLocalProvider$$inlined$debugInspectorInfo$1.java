package androidx.compose.ui.modifier;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f17192A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProvidableModifierLocal f17193z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("modifierLocalProvider");
        inspectorInfo.a().b("key", this.f17193z);
        inspectorInfo.a().b("value", this.f17192A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
