package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f16925A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RequestDisallowInterceptTouchEvent f16926z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("pointerInteropFilter");
        inspectorInfo.a().b("requestDisallowInterceptTouchEvent", this.f16926z);
        inspectorInfo.a().b("onTouchEvent", this.f16925A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
