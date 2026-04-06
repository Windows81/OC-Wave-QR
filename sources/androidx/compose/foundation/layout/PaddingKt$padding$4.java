package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PaddingKt$padding$4 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4116z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingKt$padding$4(PaddingValues paddingValues) {
        super(1);
        this.f4116z = paddingValues;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("padding");
        inspectorInfo.a().b("paddingValues", this.f4116z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
