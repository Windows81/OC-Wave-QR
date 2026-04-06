package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ReceiveContentDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode a(ReceiveContentConfiguration receiveContentConfiguration, Function1 function1) {
        return DragAndDropNodeKt.c(ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$1.f3220z, new ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2(receiveContentConfiguration, function1));
    }

    public static final TransferableContent b(DragAndDropEvent dragAndDropEvent) {
        DragEvent b2 = DragAndDrop_androidKt.b(dragAndDropEvent);
        return new TransferableContent(AndroidClipboardManager_androidKt.a(b2.getClipData()), AndroidClipboardManager_androidKt.b(b2.getClipDescription()), TransferableContent.Source.f3207b.b(), (PlatformTransferableContent) null, 8, (DefaultConstructorMarker) null);
    }
}
