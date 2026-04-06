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
public final class TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f6558A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6559B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6560z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4(ContextMenuState contextMenuState, Function2 function2, TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6560z = contextMenuState;
        this.f6558A = function2;
        this.f6559B = textFieldSelectionState;
    }

    public final void invoke() {
        this.f6558A.m(this.f6559B, TextContextMenuItems.SelectAll);
        ContextMenuState_androidKt.a(this.f6560z);
    }
}
