package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.Metadata;

@Metadata
public final class SemanticsNodeWithAdjustedBounds {

    /* renamed from: a  reason: collision with root package name */
    public final SemanticsNode f17877a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f17878b;

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, Rect rect) {
        this.f17877a = semanticsNode;
        this.f17878b = rect;
    }

    public final Rect a() {
        return this.f17878b;
    }

    public final SemanticsNode b() {
        return this.f17877a;
    }
}
