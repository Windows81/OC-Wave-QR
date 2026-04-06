package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager_androidKt$contextMenuBuilder$1 extends Lambda implements Function1<ContextMenuScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6923A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6924z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$contextMenuBuilder$1(ContextMenuState contextMenuState, SelectionManager selectionManager) {
        super(1);
        this.f6924z = contextMenuState;
        this.f6923A = selectionManager;
    }

    public final void b(ContextMenuScope contextMenuScope) {
        ContextMenuState contextMenuState = this.f6924z;
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.Copy;
        boolean M = this.f6923A.M();
        SelectionManager selectionManager = this.f6923A;
        if (M) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), (Modifier) null, false, (Function3) null, new SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1(contextMenuState, selectionManager), 14, (Object) null);
        }
        Unit unit = Unit.f40552a;
        ContextMenuState contextMenuState2 = this.f6924z;
        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.SelectAll;
        boolean K = this.f6923A.K();
        SelectionManager selectionManager2 = this.f6923A;
        if (!K) {
            ContextMenuScope.d(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), (Modifier) null, false, (Function3) null, new SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(contextMenuState2, selectionManager2), 14, (Object) null);
        }
        CollectionsKt.p(unit, unit);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContextMenuScope) obj);
        return Unit.f40552a;
    }
}
