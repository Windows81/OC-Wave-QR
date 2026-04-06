package androidx.compose.foundation.selection;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5417A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f5418B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5419z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(boolean z2, boolean z3, Role role, Function0 function0) {
        super(1);
        this.f5419z = z2;
        this.f5417A = z3;
        this.f5418B = role;
        this.C = function0;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("selectable");
        inspectorInfo.a().b("selected", Boolean.valueOf(this.f5419z));
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.f5417A));
        inspectorInfo.a().b("role", this.f5418B);
        inspectorInfo.a().b("onClick", this.C);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
