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
public final class TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f6552A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6553B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6554z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(ContextMenuState contextMenuState, Function2 function2, TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6554z = contextMenuState;
        this.f6552A = function2;
        this.f6553B = textFieldSelectionState;
    }

    public final void invoke() {
        this.f6552A.m(this.f6553B, TextContextMenuItems.Copy);
        ContextMenuState_androidKt.a(this.f6554z);
    }
}
