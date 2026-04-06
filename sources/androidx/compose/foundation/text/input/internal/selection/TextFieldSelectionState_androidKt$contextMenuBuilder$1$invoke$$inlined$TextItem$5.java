package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f6561A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6562B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6563z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5(ContextMenuState contextMenuState, Function2 function2, TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6563z = contextMenuState;
        this.f6561A = function2;
        this.f6562B = textFieldSelectionState;
    }

    public final void invoke() {
        this.f6561A.m(this.f6562B, TextContextMenuItems.E);
        ContextMenuState_androidKt.a(this.f6563z);
    }
}
