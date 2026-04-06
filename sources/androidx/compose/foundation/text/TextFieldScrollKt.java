package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

@Metadata
public final class TextFieldScrollKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5949a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f5949a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Modifier b(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Function0 function0) {
        Modifier modifier2;
        Orientation f2 = textFieldScrollerPosition.f();
        int e2 = textFieldScrollerPosition.e(textFieldValue.h());
        textFieldScrollerPosition.i(textFieldValue.h());
        TransformedText c2 = ValidatingOffsetMappingKt.c(visualTransformation, textFieldValue.f());
        int i2 = WhenMappings.f5949a[f2.ordinal()];
        if (i2 == 1) {
            modifier2 = new VerticalScrollLayoutModifier(textFieldScrollerPosition, e2, c2, function0);
        } else if (i2 == 2) {
            modifier2 = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, e2, c2, function0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ClipKt.b(modifier).o0(modifier2);
    }

    public static final Rect c(Density density, int i2, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z2, int i3) {
        Rect a2;
        if (textLayoutResult == null || (a2 = textLayoutResult.e(transformedText.a().b(i2))) == null) {
            a2 = Rect.f15860e.a();
        }
        Rect rect = a2;
        int P1 = density.P1(TextFieldCursor_androidKt.a());
        return Rect.h(rect, z2 ? (((float) i3) - rect.o()) - ((float) P1) : rect.o(), 0.0f, z2 ? ((float) i3) - rect.o() : rect.o() + ((float) P1), 0.0f, 10, (Object) null);
    }

    public static final Modifier d(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z2) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(textFieldScrollerPosition, mutableInteractionSource, z2) : InspectableValueKt.a(), new TextFieldScrollKt$textFieldScrollable$2(textFieldScrollerPosition, z2, mutableInteractionSource));
    }
}
