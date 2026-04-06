package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f3004A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f3005B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f3006z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(boolean z2, String str, Role role, Function0 function0) {
        super(1);
        this.f3006z = z2;
        this.f3004A = str;
        this.f3005B = role;
        this.C = function0;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("clickable");
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.f3006z));
        inspectorInfo.a().b("onClickLabel", this.f3004A);
        inspectorInfo.a().b("role", this.f3005B);
        inspectorInfo.a().b("onClick", this.C);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
