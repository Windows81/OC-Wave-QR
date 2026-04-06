package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.key.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager$modifier$5 extends Lambda implements Function1<KeyEvent, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6910z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$5(SelectionManager selectionManager) {
        super(1);
        this.f6910z = selectionManager;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        boolean z2;
        if (SelectionManager_androidKt.b(keyEvent)) {
            this.f6910z.o();
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
