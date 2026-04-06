package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import kotlin.Metadata;

@Metadata
final class AndroidComposeViewStartDragAndDropN {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewStartDragAndDropN f17585a = new AndroidComposeViewStartDragAndDropN();

    public final boolean a(View view, DragAndDropTransferData dragAndDropTransferData, ComposeDragShadowBuilder composeDragShadowBuilder) {
        return view.startDragAndDrop(dragAndDropTransferData.a(), composeDragShadowBuilder, dragAndDropTransferData.c(), dragAndDropTransferData.b());
    }
}
