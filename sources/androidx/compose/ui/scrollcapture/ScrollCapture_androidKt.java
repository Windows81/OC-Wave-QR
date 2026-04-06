package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ScrollCapture_androidKt {
    public static final boolean a(SemanticsNode semanticsNode) {
        Function2 c2 = c(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.w(), SemanticsProperties.f18102a.M());
        return (c2 == null || scrollAxisRange == null || ((Number) scrollAxisRange.a().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    public static final List b(SemanticsNode semanticsNode) {
        return semanticsNode.l(false, false, false);
    }

    public static final Function2 c(SemanticsNode semanticsNode) {
        return (Function2) SemanticsConfigurationKt.a(semanticsNode.w(), SemanticsActions.f18056a.v());
    }

    public static final void d(SemanticsNode semanticsNode, int i2, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        List b2 = b(semanticsNode);
        while (true) {
            mutableVector.h(mutableVector.p(), b2);
            while (mutableVector.p() != 0) {
                SemanticsNode semanticsNode2 = (SemanticsNode) mutableVector.y(mutableVector.p() - 1);
                if (!SemanticsUtils_androidKt.f(semanticsNode2) && !semanticsNode2.w().h(SemanticsProperties.f18102a.f())) {
                    NodeCoordinator e2 = semanticsNode2.e();
                    if (e2 != null) {
                        LayoutCoordinates e1 = e2.e1();
                        IntRect b3 = IntRectKt.b(LayoutCoordinatesKt.c(e1));
                        if (b3.m()) {
                            continue;
                        } else if (!a(semanticsNode2)) {
                            b2 = b(semanticsNode2);
                        } else {
                            int i3 = i2 + 1;
                            function1.invoke(new ScrollCaptureCandidate(semanticsNode2, i3, b3, e1));
                            d(semanticsNode2, i3, function1);
                        }
                    } else {
                        InlineClassHelperKt.d("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                }
            }
            return;
        }
    }

    public static /* synthetic */ void e(SemanticsNode semanticsNode, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        d(semanticsNode, i2, function1);
    }
}
