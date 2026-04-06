package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f3013A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f3014B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ String F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f3015z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("combinedClickable");
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.f3015z));
        inspectorInfo.a().b("onClickLabel", this.f3013A);
        inspectorInfo.a().b("role", this.f3014B);
        inspectorInfo.a().b("onClick", this.C);
        inspectorInfo.a().b("onDoubleClick", this.D);
        inspectorInfo.a().b("onLongClick", this.E);
        inspectorInfo.a().b("onLongClickLabel", this.F);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
