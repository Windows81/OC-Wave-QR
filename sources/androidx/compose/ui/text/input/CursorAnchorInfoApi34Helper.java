package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;

@Metadata
final class CursorAnchorInfoApi34Helper {

    /* renamed from: a  reason: collision with root package name */
    public static final CursorAnchorInfoApi34Helper f18781a = new CursorAnchorInfoApi34Helper();

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, Rect rect) {
        int r2;
        int r3;
        if (!rect.y() && (r2 = textLayoutResult.r(rect.r())) <= (r3 = textLayoutResult.r(rect.i()))) {
            while (true) {
                CursorAnchorInfo.Builder unused = builder.addVisibleLineBounds(textLayoutResult.s(r2), textLayoutResult.v(r2), textLayoutResult.t(r2), textLayoutResult.m(r2));
                if (r2 == r3) {
                    break;
                }
                r2++;
            }
        }
        return builder;
    }
}
