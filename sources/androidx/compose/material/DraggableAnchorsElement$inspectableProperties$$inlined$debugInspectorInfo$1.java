package androidx.compose.material;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DraggableAnchorsElement f7699z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.a().b("state", this.f7699z.f7698z);
        inspectorInfo.a().b("anchors", this.f7699z.f7696A);
        inspectorInfo.a().b("orientation", this.f7699z.f7697B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
