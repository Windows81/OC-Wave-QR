package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextStringSimpleNode$applySemantics$1 extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextStringSimpleNode f6692z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$1(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.f6692z = textStringSimpleNode;
    }

    /* renamed from: b */
    public final Boolean invoke(List list) {
        ParagraphLayoutCache a3 = this.f6692z.i3();
        TextStyle c3 = this.f6692z.O;
        ColorProducer b3 = this.f6692z.U;
        TextLayoutResult o2 = a3.o(TextStyle.L(c3, b3 != null ? b3.a() : Color.f15975b.f(), 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (LineHeightStyle) null, 0, 0, (PlatformTextStyle) null, (TextMotion) null, 16777214, (Object) null));
        if (o2 != null) {
            list.add(o2);
        } else {
            o2 = null;
        }
        return Boolean.valueOf(o2 != null);
    }
}
