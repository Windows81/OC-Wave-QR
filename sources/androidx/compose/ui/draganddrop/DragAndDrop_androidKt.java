package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@Metadata
public final class DragAndDrop_androidKt {
    public static final long a(DragAndDropEvent dragAndDropEvent) {
        return Offset.e((((long) Float.floatToRawIntBits(dragAndDropEvent.a().getX())) << 32) | (((long) Float.floatToRawIntBits(dragAndDropEvent.a().getY())) & 4294967295L));
    }

    public static final DragEvent b(DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.a();
    }
}
