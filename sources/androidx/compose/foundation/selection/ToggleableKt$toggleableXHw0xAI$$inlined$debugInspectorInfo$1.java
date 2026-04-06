package androidx.compose.foundation.selection;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5429A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f5430B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5431z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(boolean z2, boolean z3, Role role, Function1 function1) {
        super(1);
        this.f5431z = z2;
        this.f5429A = z3;
        this.f5430B = role;
        this.C = function1;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("toggleable");
        inspectorInfo.a().b("value", Boolean.valueOf(this.f5431z));
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.f5429A));
        inspectorInfo.a().b("role", this.f5430B);
        inspectorInfo.a().b("onValueChange", this.C);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
