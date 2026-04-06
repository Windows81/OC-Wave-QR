package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public SelectionController P;
    public Function1 Q;
    public final TextAnnotatedStringNode R;

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, textAutoSize, function13);
    }

    public boolean D2() {
        return false;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.R.n3(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        SelectionController selectionController = this.P;
        if (selectionController != null) {
            selectionController.d(layoutCoordinates);
        }
    }

    public void U(ContentDrawScope contentDrawScope) {
        this.R.h3(contentDrawScope);
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.R.p3(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        return this.R.o3(measureScope, measurable, j2);
    }

    public final void f3(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, int i3, boolean z2, FontFamily.Resolver resolver, int i4, Function1 function1, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        SelectionController selectionController2 = selectionController;
        TextAnnotatedStringNode textAnnotatedStringNode = this.R;
        TextStyle textStyle2 = textStyle;
        AnnotatedString annotatedString2 = annotatedString;
        textAnnotatedStringNode.g3(textAnnotatedStringNode.t3(colorProducer, textStyle2), this.R.v3(annotatedString), this.R.u3(textStyle2, list, i2, i3, z2, resolver, i4, textAutoSize), this.R.s3(function1, function12, selectionController2, this.Q));
        this.P = selectionController2;
        LayoutModifierNodeKt.b(this);
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.R.m3(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.R.q3(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SelectableTextAnnotatedStringNode(androidx.compose.ui.text.AnnotatedString r20, androidx.compose.ui.text.TextStyle r21, androidx.compose.ui.text.font.FontFamily.Resolver r22, kotlin.jvm.functions.Function1 r23, int r24, boolean r25, int r26, int r27, java.util.List r28, kotlin.jvm.functions.Function1 r29, androidx.compose.foundation.text.modifiers.SelectionController r30, androidx.compose.ui.graphics.ColorProducer r31, androidx.compose.foundation.text.TextAutoSize r32, kotlin.jvm.functions.Function1 r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r19 = this;
            r0 = r34
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r23
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0017
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r1 = r1.a()
            r8 = r1
            goto L_0x0019
        L_0x0017:
            r8 = r24
        L_0x0019:
            r1 = r0 & 32
            r3 = 1
            if (r1 == 0) goto L_0x0020
            r9 = r3
            goto L_0x0022
        L_0x0020:
            r9 = r25
        L_0x0022:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r1
            goto L_0x002d
        L_0x002b:
            r10 = r26
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0033
            r11 = r3
            goto L_0x0035
        L_0x0033:
            r11 = r27
        L_0x0035:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003b
            r12 = r2
            goto L_0x003d
        L_0x003b:
            r12 = r28
        L_0x003d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0043
            r13 = r2
            goto L_0x0045
        L_0x0043:
            r13 = r29
        L_0x0045:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004b
            r14 = r2
            goto L_0x004d
        L_0x004b:
            r14 = r30
        L_0x004d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0053
            r15 = r2
            goto L_0x0055
        L_0x0053:
            r15 = r31
        L_0x0055:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005c
            r16 = r2
            goto L_0x005e
        L_0x005c:
            r16 = r32
        L_0x005e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0065
            r17 = r2
            goto L_0x0067
        L_0x0065:
            r17 = r33
        L_0x0067:
            r18 = 0
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.font.FontFamily$Resolver, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.foundation.text.modifiers.SelectionController, androidx.compose.ui.graphics.ColorProducer, androidx.compose.foundation.text.TextAutoSize, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, Function1 function13) {
        this.P = selectionController;
        this.Q = function13;
        TextAnnotatedStringNode textAnnotatedStringNode = r1;
        TextAnnotatedStringNode textAnnotatedStringNode2 = new TextAnnotatedStringNode(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, this.P, colorProducer, textAutoSize, this.Q, (DefaultConstructorMarker) null);
        this.R = (TextAnnotatedStringNode) Z2(textAnnotatedStringNode);
        if (this.P == null) {
            InlineClassHelperKt.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
            throw new KotlinNothingValueException();
        }
    }
}
