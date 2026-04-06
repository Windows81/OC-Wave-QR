package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BoxScopeInstance$align$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Alignment f3798z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxScopeInstance$align$$inlined$debugInspectorInfo$1(Alignment alignment) {
        super(1);
        this.f3798z = alignment;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("align");
        inspectorInfo.c(this.f3798z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
