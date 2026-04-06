package androidx.compose.material3.internal;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DraggableAnchorsElement f12221z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.a().b("state", this.f12221z.f12220z);
        inspectorInfo.a().b("anchors", this.f12221z.f12218A);
        inspectorInfo.a().b("orientation", this.f12221z.f12219B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
