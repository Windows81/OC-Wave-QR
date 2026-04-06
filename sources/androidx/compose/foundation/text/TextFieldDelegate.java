package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldDelegate {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f5899a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TransformedText a(long j2, TransformedText transformedText) {
            int b2 = transformedText.a().b(TextRange.n(j2));
            int b3 = transformedText.a().b(TextRange.i(j2));
            int min = Math.min(b2, b3);
            int max = Math.max(b2, b3);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.b());
            builder.e(new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f19089b.d(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), min, max);
            return new TransformedText(builder.r(), transformedText.a());
        }

        public final void b(Canvas canvas, TextFieldValue textFieldValue, long j2, long j3, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint, long j4) {
            if (!TextRange.h(j2)) {
                paint.I(j4);
                c(canvas, j2, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.h(j3)) {
                Color h2 = Color.h(textLayoutResult.l().i().h());
                if (h2.v() == 16) {
                    h2 = null;
                }
                long v2 = h2 != null ? h2.v() : Color.f15975b.a();
                Paint paint2 = paint;
                paint2.I(Color.l(v2, Color.o(v2) * 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                c(canvas, j3, offsetMapping, textLayoutResult, paint2);
            } else {
                Paint paint3 = paint;
                if (!TextRange.h(textFieldValue.h())) {
                    paint.I(j4);
                    c(canvas, textFieldValue.h(), offsetMapping, textLayoutResult, paint);
                }
            }
            Canvas canvas2 = canvas;
            TextPainter.f18495a.a(canvas, textLayoutResult);
        }

        public final void c(Canvas canvas, long j2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int b2 = offsetMapping.b(TextRange.l(j2));
            int b3 = offsetMapping.b(TextRange.k(j2));
            if (b2 != b3) {
                canvas.s(textLayoutResult.z(b2, b3), paint);
            }
        }

        public final Triple d(TextDelegate textDelegate, long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            TextLayoutResult l2 = textDelegate.l(j2, layoutDirection, textLayoutResult);
            return new Triple(Integer.valueOf((int) (l2.B() >> 32)), Integer.valueOf((int) (l2.B() & 4294967295L)), l2);
        }

        public final void e(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z2, OffsetMapping offsetMapping) {
            TextLayoutResult textLayoutResult2 = textLayoutResult;
            if (z2) {
                int b2 = offsetMapping.b(TextRange.k(textFieldValue.h()));
                Rect d2 = b2 < textLayoutResult.l().j().length() ? textLayoutResult.d(b2) : b2 != 0 ? textLayoutResult.d(b2 - 1) : new Rect(0.0f, 0.0f, 1.0f, (float) ((int) (TextFieldDelegateKt.b(textDelegate.j(), textDelegate.a(), textDelegate.b(), (String) null, 0, 24, (Object) null) & 4294967295L)));
                LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
                long o0 = layoutCoordinates2.o0(Offset.e((((long) Float.floatToRawIntBits(d2.r())) & 4294967295L) | (((long) Float.floatToRawIntBits(d2.o())) << 32)));
                textInputSession.c(RectKt.c(Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (o0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (o0 >> 32)))) << 32)), Size.d((4294967295L & ((long) Float.floatToRawIntBits(d2.i() - d2.r()))) | (((long) Float.floatToRawIntBits(d2.p() - d2.o())) << 32))));
            }
        }

        public final void f(TextInputSession textInputSession, EditProcessor editProcessor, Function1 function1) {
            function1.invoke(TextFieldValue.d(editProcessor.f(), (AnnotatedString) null, 0, (TextRange) null, 3, (Object) null));
            textInputSession.a();
        }

        public final void g(List list, EditProcessor editProcessor, Function1 function1, TextInputSession textInputSession) {
            TextFieldValue b2 = editProcessor.b(list);
            if (textInputSession != null) {
                textInputSession.d((TextFieldValue) null, b2);
            }
            function1.invoke(b2);
        }

        public final TextInputSession h(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, Function1 function1, Function1 function12) {
            return i(textInputService, textFieldValue, editProcessor, imeOptions, function1, function12);
        }

        public final TextInputSession i(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, Function1 function1, Function1 function12) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            TextInputSession d2 = textInputService.d(textFieldValue, imeOptions, new TextFieldDelegate$Companion$restartInput$1(editProcessor, function1, objectRef), function12);
            objectRef.f40908z = d2;
            return d2;
        }

        public final void j(long j2, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, Function1 function1) {
            function1.invoke(TextFieldValue.d(editProcessor.f(), (AnnotatedString) null, TextRangeKt.a(offsetMapping.a(TextLayoutResultProxy.e(textLayoutResultProxy, j2, false, 2, (Object) null))), (TextRange) null, 5, (Object) null));
        }

        public final void k(TextInputSession textInputSession, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates b2;
            LayoutCoordinates c2 = textLayoutResultProxy.c();
            if (c2 != null && c2.b() && (b2 = textLayoutResultProxy.b()) != null) {
                textInputSession.e(textFieldValue, offsetMapping, textLayoutResultProxy.f(), new TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1(c2), SelectionManagerKt.i(c2), c2.X(b2, false));
            }
        }

        public Companion() {
        }
    }
}
