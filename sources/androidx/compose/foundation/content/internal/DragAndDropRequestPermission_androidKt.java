package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.core.view.DragAndDropPermissionsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DragAndDropRequestPermission_androidKt {
    public static final boolean a(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            Uri uri = clipData.getItemAt(i2).getUri();
            if (uri != null && Intrinsics.d(uri.getScheme(), "content")) {
                return true;
            }
        }
        return false;
    }

    public static final void b(DelegatableNode delegatableNode, DragAndDropEvent dragAndDropEvent) {
        Activity c2;
        if (a(DragAndDrop_androidKt.b(dragAndDropEvent).getClipData()) && delegatableNode.M().F2() && (c2 = c(DelegatableNode_androidKt.a(delegatableNode))) != null) {
            DragAndDropPermissionsCompat.a(c2, DragAndDrop_androidKt.b(dragAndDropEvent));
        }
    }

    public static final Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
