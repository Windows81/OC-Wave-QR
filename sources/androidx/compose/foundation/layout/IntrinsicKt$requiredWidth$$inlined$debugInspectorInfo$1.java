package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class IntrinsicKt$requiredWidth$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ IntrinsicSize f4064z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("requiredWidth");
        inspectorInfo.a().b("intrinsicSize", this.f4064z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
