package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class ExcludeFromSystemGestureNode extends RectListNode {
    public ExcludeFromSystemGestureNode(Function1 function1) {
        super(function1);
    }

    public MutableVector a3() {
        MutableVector mutableVector = new MutableVector(new Rect[16], 0);
        mutableVector.h(mutableVector.p(), c3().getSystemGestureExclusionRects());
        return mutableVector;
    }

    public void f3(MutableVector mutableVector) {
        c3().setSystemGestureExclusionRects(mutableVector.k());
    }
}
