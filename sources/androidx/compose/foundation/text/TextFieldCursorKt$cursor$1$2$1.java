package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldCursorKt$cursor$1$2$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5895A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5896B;
    public final /* synthetic */ LegacyTextFieldState C;
    public final /* synthetic */ Brush D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CursorAnimationState f5897z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1$2$1(CursorAnimationState cursorAnimationState, OffsetMapping offsetMapping, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, Brush brush) {
        super(1);
        this.f5897z = cursorAnimationState;
        this.f5895A = offsetMapping;
        this.f5896B = textFieldValue;
        this.C = legacyTextFieldState;
        this.D = brush;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        Rect rect;
        TextLayoutResult f2;
        contentDrawScope.q2();
        float e2 = this.f5897z.e();
        if (e2 != 0.0f) {
            int b2 = this.f5895A.b(TextRange.n(this.f5896B.h()));
            TextLayoutResultProxy l2 = this.C.l();
            if (l2 == null || (f2 = l2.f()) == null || (rect = f2.e(b2)) == null) {
                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float d2 = RangesKt.d((float) Math.floor((double) contentDrawScope.B1(TextFieldCursor_androidKt.a())), 1.0f);
            float f3 = d2 / ((float) 2);
            float d3 = RangesKt.d(RangesKt.i(rect.o() + f3, Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)) - f3), f3);
            float floor = ((int) d2) % 2 == 1 ? ((float) Math.floor((double) d3)) + 0.5f : (float) Math.rint((double) d3);
            DrawScope.p2(contentDrawScope, this.D, Offset.e((((long) Float.floatToRawIntBits(floor)) << 32) | (((long) Float.floatToRawIntBits(rect.r())) & 4294967295L)), Offset.e((((long) Float.floatToRawIntBits(rect.i())) & 4294967295L) | (((long) Float.floatToRawIntBits(floor)) << 32)), d2, 0, (PathEffect) null, e2, (ColorFilter) null, 0, 432, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
