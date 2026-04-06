package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.SegmentFinder;
import androidx.compose.ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AndroidLayoutApi34 {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidLayoutApi34 f18507a = new AndroidLayoutApi34();

    public static final boolean b(Function2 function2, RectF rectF, RectF rectF2) {
        return ((Boolean) function2.m(rectF, rectF2)).booleanValue();
    }

    public final int[] c(TextLayout textLayout, RectF rectF, int i2, Function2 function2) {
        SegmentFinder segmentFinder;
        if (i2 == 1) {
            segmentFinder = Api34SegmentFinder.f18603a.a(new WordSegmentFinder(textLayout.G(), textLayout.I()));
        } else {
            C0349b.a();
            segmentFinder = C0350c.a(C0348a.a(textLayout.G(), textLayout.H()));
        }
        return textLayout.i().getRangeForRect(rectF, segmentFinder, new e(function2));
    }
}
