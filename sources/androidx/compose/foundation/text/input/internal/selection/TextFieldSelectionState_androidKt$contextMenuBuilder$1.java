package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionState_androidKt$contextMenuBuilder$1 extends Lambda implements Function1<ContextMenuScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6564A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f6565B;
    public final /* synthetic */ TextFieldSelectionState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f6566z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState_androidKt$contextMenuBuilder$1(State state, ContextMenuState contextMenuState, Function2 function2, TextFieldSelectionState textFieldSelectionState) {
        super(1);
        this.f6566z = state;
        this.f6564A = contextMenuState;
        this.f6565B = function2;
        this.C = textFieldSelectionState;
    }

    public final void b(ContextMenuScope contextMenuScope) {
        int m2 = ((MenuItemsAvailability) this.f6566z.getValue()).m();
        ContextMenuState contextMenuState = this.f6564A;
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
        boolean h2 = MenuItemsAvailability.h(m2);
        Function2 function2 = this.f6565B;
        TextFieldSelectionState textFieldSelectionState = this.C;
        if (h2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), (Modifier) null, false, (Function3) null, new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1(contextMenuState, function2, textFieldSelectionState), 14, (Object) null);
        }
        ContextMenuState contextMenuState2 = this.f6564A;
        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
        boolean g2 = MenuItemsAvailability.g(m2);
        Function2 function22 = this.f6565B;
        TextFieldSelectionState textFieldSelectionState2 = this.C;
        if (g2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), (Modifier) null, false, (Function3) null, new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(contextMenuState2, function22, textFieldSelectionState2), 14, (Object) null);
        }
        ContextMenuState contextMenuState3 = this.f6564A;
        TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
        boolean i2 = MenuItemsAvailability.i(m2);
        Function2 function23 = this.f6565B;
        TextFieldSelectionState textFieldSelectionState3 = this.C;
        if (i2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems3), (Modifier) null, false, (Function3) null, new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3(contextMenuState3, function23, textFieldSelectionState3), 14, (Object) null);
        }
        ContextMenuState contextMenuState4 = this.f6564A;
        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
        boolean j2 = MenuItemsAvailability.j(m2);
        Function2 function24 = this.f6565B;
        TextFieldSelectionState textFieldSelectionState4 = this.C;
        if (j2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems4), (Modifier) null, false, (Function3) null, new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4(contextMenuState4, function24, textFieldSelectionState4), 14, (Object) null);
        }
        ContextMenuState contextMenuState5 = this.f6564A;
        TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.E;
        boolean f2 = MenuItemsAvailability.f(m2);
        Function2 function25 = this.f6565B;
        TextFieldSelectionState textFieldSelectionState5 = this.C;
        if (f2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems5), (Modifier) null, false, (Function3) null, new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5(contextMenuState5, function25, textFieldSelectionState5), 14, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContextMenuScope) obj);
        return Unit.f40552a;
    }
}
