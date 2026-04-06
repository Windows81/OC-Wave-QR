package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f4259z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1(WindowInsets windowInsets) {
        super(1);
        this.f4259z = windowInsets;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("windowInsetsPadding");
        inspectorInfo.a().b("insets", this.f4259z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
