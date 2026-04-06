package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4257z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2(PaddingValues paddingValues) {
        super(1);
        this.f4257z = paddingValues;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("consumeWindowInsets");
        inspectorInfo.a().b("paddingValues", this.f4257z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
