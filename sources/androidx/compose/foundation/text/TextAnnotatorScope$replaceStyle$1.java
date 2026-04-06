package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextAnnotatorScope$replaceStyle$1 extends Lambda implements Function1<AnnotatedString.Range<? extends AnnotatedString.Annotation>, AnnotatedString.Range<? extends AnnotatedString.Annotation>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString.Range f5870A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SpanStyle f5871B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f5872z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextAnnotatorScope$replaceStyle$1(Ref.BooleanRef booleanRef, AnnotatedString.Range range, SpanStyle spanStyle) {
        super(1);
        this.f5872z = booleanRef;
        this.f5870A = range;
        this.f5871B = spanStyle;
    }

    /* renamed from: b */
    public final AnnotatedString.Range invoke(AnnotatedString.Range range) {
        AnnotatedString.Range range2;
        if (!this.f5872z.f40901z || !(range.g() instanceof SpanStyle) || range.h() != this.f5870A.h() || range.f() != this.f5870A.f()) {
            range2 = range;
        } else {
            SpanStyle spanStyle = this.f5871B;
            if (spanStyle == null) {
                spanStyle = new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (DefaultConstructorMarker) null);
            }
            range2 = new AnnotatedString.Range(spanStyle, range.h(), range.f());
        }
        this.f5872z.f40901z = Intrinsics.d(this.f5870A, range);
        return range2;
    }
}
