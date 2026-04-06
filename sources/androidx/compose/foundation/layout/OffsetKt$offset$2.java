package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OffsetKt$offset$2 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f4093z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetKt$offset$2(Function1 function1) {
        super(1);
        this.f4093z = function1;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("offset");
        inspectorInfo.a().b("offset", this.f4093z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
