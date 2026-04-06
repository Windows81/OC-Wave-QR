package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7016A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f7017z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3(ContextMenuState contextMenuState, TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.f7017z = contextMenuState;
        this.f7016A = textFieldSelectionManager;
    }

    public final void invoke() {
        this.f7016A.Z();
        ContextMenuState_androidKt.a(this.f7017z);
    }
}
