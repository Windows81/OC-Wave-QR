package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Layout.TextInclusionStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function2 f18602a;

    public /* synthetic */ e(Function2 function2) {
        this.f18602a = function2;
    }

    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return AndroidLayoutApi34.b(this.f18602a, rectF, rectF2);
    }
}
