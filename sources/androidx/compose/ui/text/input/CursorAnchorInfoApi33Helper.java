package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.internal.C0023l;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import kotlin.Metadata;

@Metadata
final class CursorAnchorInfoApi33Helper {

    /* renamed from: a  reason: collision with root package name */
    public static final CursorAnchorInfoApi33Helper f18780a = new CursorAnchorInfoApi33Helper();

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, Rect rect) {
        return builder.setEditorBoundsInfo(C0023l.a().setEditorBounds(RectHelper_androidKt.c(rect)).setHandwritingBounds(RectHelper_androidKt.c(rect)).build());
    }
}
