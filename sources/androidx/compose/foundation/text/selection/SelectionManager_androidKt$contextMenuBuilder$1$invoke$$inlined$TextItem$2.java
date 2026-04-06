package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6921A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6922z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(ContextMenuState contextMenuState, SelectionManager selectionManager) {
        super(0);
        this.f6922z = contextMenuState;
        this.f6921A = selectionManager;
    }

    public final void invoke() {
        this.f6921A.R();
        ContextMenuState_androidKt.a(this.f6922z);
    }
}
