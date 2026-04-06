package androidx.compose.ui.spatial;

import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RectListDebuggerModifierNode$onAttach$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RectListDebuggerModifierNode f18159z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectListDebuggerModifierNode$onAttach$1(RectListDebuggerModifierNode rectListDebuggerModifierNode) {
        super(0);
        this.f18159z = rectListDebuggerModifierNode;
    }

    public final void invoke() {
        DrawModifierNodeKt.a(this.f18159z);
    }
}
