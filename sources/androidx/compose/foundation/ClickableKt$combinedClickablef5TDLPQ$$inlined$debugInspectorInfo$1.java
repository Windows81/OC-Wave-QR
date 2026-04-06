package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-f5TDLPQ$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ClickableKt$combinedClickablef5TDLPQ$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f3016A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f3017B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f3018z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("combinedClickable");
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.f3018z));
        inspectorInfo.a().b("onClickLabel", this.f3016A);
        inspectorInfo.a().b("role", this.f3017B);
        inspectorInfo.a().b("onClick", this.C);
        inspectorInfo.a().b("onDoubleClick", this.D);
        inspectorInfo.a().b("onLongClick", this.E);
        inspectorInfo.a().b("onLongClickLabel", this.F);
        inspectorInfo.a().b("hapticFeedbackEnabled", Boolean.valueOf(this.G));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
