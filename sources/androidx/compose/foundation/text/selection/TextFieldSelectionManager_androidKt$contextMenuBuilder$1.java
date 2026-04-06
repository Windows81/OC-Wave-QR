package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionManager_androidKt$contextMenuBuilder$1 extends Lambda implements Function1<ContextMenuScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f7022A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7023B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f7024z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$contextMenuBuilder$1(State state, ContextMenuState contextMenuState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f7024z = state;
        this.f7022A = contextMenuState;
        this.f7023B = textFieldSelectionManager;
    }

    public final void b(ContextMenuScope contextMenuScope) {
        int m2 = ((MenuItemsAvailability) this.f7024z.getValue()).m();
        ContextMenuState contextMenuState = this.f7022A;
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
        boolean h2 = MenuItemsAvailability.h(m2);
        TextFieldSelectionManager textFieldSelectionManager = this.f7023B;
        if (h2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), (Modifier) null, false, (Function3) null, new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1(contextMenuState, textFieldSelectionManager), 14, (Object) null);
        }
        ContextMenuState contextMenuState2 = this.f7022A;
        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
        boolean g2 = MenuItemsAvailability.g(m2);
        TextFieldSelectionManager textFieldSelectionManager2 = this.f7023B;
        if (g2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), (Modifier) null, false, (Function3) null, new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(contextMenuState2, textFieldSelectionManager2), 14, (Object) null);
        }
        ContextMenuState contextMenuState3 = this.f7022A;
        TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
        boolean i2 = MenuItemsAvailability.i(m2);
        TextFieldSelectionManager textFieldSelectionManager3 = this.f7023B;
        if (i2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems3), (Modifier) null, false, (Function3) null, new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3(contextMenuState3, textFieldSelectionManager3), 14, (Object) null);
        }
        ContextMenuState contextMenuState4 = this.f7022A;
        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
        boolean j2 = MenuItemsAvailability.j(m2);
        TextFieldSelectionManager textFieldSelectionManager4 = this.f7023B;
        if (j2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems4), (Modifier) null, false, (Function3) null, new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4(contextMenuState4, textFieldSelectionManager4), 14, (Object) null);
        }
        ContextMenuState contextMenuState5 = this.f7022A;
        TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.E;
        boolean z2 = this.f7023B.G() && TextRange.h(this.f7023B.U().h());
        TextFieldSelectionManager textFieldSelectionManager5 = this.f7023B;
        if (z2) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems5), (Modifier) null, false, (Function3) null, new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5(contextMenuState5, textFieldSelectionManager5), 14, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContextMenuScope) obj);
        return Unit.f40552a;
    }
}
