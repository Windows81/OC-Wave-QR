package androidx.compose.material3.internal;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DraggableAnchorsElementV2$inspectableProperties$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DraggableAnchorsElementV2 f12225z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.a().b("state", this.f12225z.f12224z);
        inspectorInfo.a().b("anchors", this.f12225z.f12222A);
        inspectorInfo.a().b("orientation", this.f12225z.f12223B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
