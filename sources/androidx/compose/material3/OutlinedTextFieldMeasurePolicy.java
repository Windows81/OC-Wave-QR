package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f10587a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10588b;

    /* renamed from: c  reason: collision with root package name */
    public final TextFieldLabelPosition f10589c;

    /* renamed from: d  reason: collision with root package name */
    public final FloatProducer f10590d;

    /* renamed from: e  reason: collision with root package name */
    public final PaddingValues f10591e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10592f;

    public /* synthetic */ OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z2, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, z2, textFieldLabelPosition, floatProducer, paddingValues, f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m(androidx.compose.ui.layout.IntrinsicMeasureScope r25, java.util.List r26, int r27, kotlin.jvm.functions.Function2 r28) {
        /*
            r24 = this;
            r14 = r24
            r0 = r26
            r1 = r27
            r2 = r28
            androidx.compose.material3.internal.FloatProducer r3 = r14.f10590d
            float r13 = r3.invoke()
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r4 = r3.size()
            r6 = 0
        L_0x0016:
            if (r6 >= r4) goto L_0x002f
            java.lang.Object r8 = r0.get(r6)
            r9 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material3.internal.LayoutUtilKt.b(r9)
            java.lang.String r10 = "Leading"
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x002f:
            r8 = 0
        L_0x0030:
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == 0) goto L_0x004e
            int r6 = r8.a0(r4)
            int r6 = androidx.compose.material3.internal.LayoutUtilKt.d(r1, r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r27)
            java.lang.Object r8 = r2.m(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L_0x0050
        L_0x004e:
            r6 = r1
            r8 = 0
        L_0x0050:
            int r9 = r3.size()
            r10 = 0
        L_0x0055:
            if (r10 >= r9) goto L_0x006e
            java.lang.Object r11 = r0.get(r10)
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.internal.LayoutUtilKt.b(r12)
            java.lang.String r15 = "Trailing"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r15)
            if (r12 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            int r10 = r10 + 1
            goto L_0x0055
        L_0x006e:
            r11 = 0
        L_0x006f:
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            if (r11 == 0) goto L_0x008a
            int r9 = r11.a0(r4)
            int r6 = androidx.compose.material3.internal.LayoutUtilKt.d(r6, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r27)
            java.lang.Object r9 = r2.m(r11, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            goto L_0x008b
        L_0x008a:
            r9 = 0
        L_0x008b:
            int r10 = r3.size()
            r11 = 0
        L_0x0090:
            if (r11 >= r10) goto L_0x00a9
            java.lang.Object r12 = r0.get(r11)
            r15 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r15 = (androidx.compose.ui.layout.IntrinsicMeasurable) r15
            java.lang.Object r15 = androidx.compose.material3.internal.LayoutUtilKt.b(r15)
            java.lang.String r5 = "Label"
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r15, r5)
            if (r5 == 0) goto L_0x00a6
            goto L_0x00aa
        L_0x00a6:
            int r11 = r11 + 1
            goto L_0x0090
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            if (r12 == 0) goto L_0x00c2
            int r5 = androidx.compose.ui.util.MathHelpersKt.c(r6, r1, r13)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r2.m(r12, r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r10 = r5
            goto L_0x00c3
        L_0x00c2:
            r10 = 0
        L_0x00c3:
            int r5 = r3.size()
            r11 = 0
        L_0x00c8:
            if (r11 >= r5) goto L_0x00e1
            java.lang.Object r12 = r0.get(r11)
            r15 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r15 = (androidx.compose.ui.layout.IntrinsicMeasurable) r15
            java.lang.Object r15 = androidx.compose.material3.internal.LayoutUtilKt.b(r15)
            java.lang.String r7 = "Prefix"
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 == 0) goto L_0x00de
            goto L_0x00e2
        L_0x00de:
            int r11 = r11 + 1
            goto L_0x00c8
        L_0x00e1:
            r12 = 0
        L_0x00e2:
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            if (r12 == 0) goto L_0x00fd
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.Object r5 = r2.m(r12, r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r7 = r12.a0(r4)
            int r6 = androidx.compose.material3.internal.LayoutUtilKt.d(r6, r7)
            goto L_0x00fe
        L_0x00fd:
            r5 = 0
        L_0x00fe:
            int r7 = r3.size()
            r11 = 0
        L_0x0103:
            if (r11 >= r7) goto L_0x011f
            java.lang.Object r12 = r0.get(r11)
            r15 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r15 = (androidx.compose.ui.layout.IntrinsicMeasurable) r15
            java.lang.Object r15 = androidx.compose.material3.internal.LayoutUtilKt.b(r15)
            java.lang.String r4 = "Suffix"
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r15, r4)
            if (r4 == 0) goto L_0x0119
            goto L_0x0120
        L_0x0119:
            int r11 = r11 + 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0103
        L_0x011f:
            r12 = 0
        L_0x0120:
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            if (r12 == 0) goto L_0x0143
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Object r4 = r2.m(r12, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r12.a0(r7)
            int r6 = androidx.compose.material3.internal.LayoutUtilKt.d(r6, r7)
            r23 = r6
            r6 = r4
            r4 = r23
            goto L_0x0145
        L_0x0143:
            r4 = r6
            r6 = 0
        L_0x0145:
            int r3 = r3.size()
            r7 = 0
        L_0x014a:
            if (r7 >= r3) goto L_0x0214
            java.lang.Object r11 = r0.get(r7)
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.internal.LayoutUtilKt.b(r12)
            java.lang.String r15 = "TextField"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r15)
            if (r12 == 0) goto L_0x020e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r2.m(r11, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r7 = r3.intValue()
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r11 = r3.size()
            r12 = 0
        L_0x0175:
            if (r12 >= r11) goto L_0x0195
            java.lang.Object r15 = r0.get(r12)
            r18 = r15
            androidx.compose.ui.layout.IntrinsicMeasurable r18 = (androidx.compose.ui.layout.IntrinsicMeasurable) r18
            java.lang.Object r1 = androidx.compose.material3.internal.LayoutUtilKt.b(r18)
            r18 = r11
            java.lang.String r11 = "Hint"
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r11)
            if (r1 == 0) goto L_0x018e
            goto L_0x0196
        L_0x018e:
            int r12 = r12 + 1
            r1 = r27
            r11 = r18
            goto L_0x0175
        L_0x0195:
            r15 = 0
        L_0x0196:
            androidx.compose.ui.layout.IntrinsicMeasurable r15 = (androidx.compose.ui.layout.IntrinsicMeasurable) r15
            if (r15 == 0) goto L_0x01aa
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r2.m(r15, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r11 = r1
            goto L_0x01ab
        L_0x01aa:
            r11 = 0
        L_0x01ab:
            int r1 = r3.size()
            r3 = 0
        L_0x01b0:
            if (r3 >= r1) goto L_0x01cb
            java.lang.Object r4 = r0.get(r3)
            r12 = r4
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.internal.LayoutUtilKt.b(r12)
            java.lang.String r15 = "Supporting"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r15)
            if (r12 == 0) goto L_0x01c8
            r17 = r4
            goto L_0x01cd
        L_0x01c8:
            int r3 = r3 + 1
            goto L_0x01b0
        L_0x01cb:
            r17 = 0
        L_0x01cd:
            r0 = r17
            androidx.compose.ui.layout.IntrinsicMeasurable r0 = (androidx.compose.ui.layout.IntrinsicMeasurable) r0
            if (r0 == 0) goto L_0x01e4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            java.lang.Object r0 = r2.m(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r16 = r0
            goto L_0x01e6
        L_0x01e4:
            r16 = 0
        L_0x01e6:
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            long r17 = androidx.compose.ui.unit.ConstraintsKt.b(r17, r18, r19, r20, r21, r22)
            androidx.compose.material3.TextFieldLabelPosition r0 = r14.f10589c
            boolean r12 = r0 instanceof androidx.compose.material3.TextFieldLabelPosition.Above
            r0 = r24
            r1 = r25
            r2 = r8
            r3 = r9
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r8 = r11
            r9 = r16
            r10 = r17
            int r0 = r0.k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return r0
        L_0x020e:
            int r7 = r7 + 1
            r1 = r27
            goto L_0x014a
        L_0x0214:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            androidx.compose.ui.util.ListUtilsKt.f(r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.m(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, kotlin.jvm.functions.Function2):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int n(androidx.compose.ui.layout.IntrinsicMeasureScope r20, java.util.List r21, int r22, kotlin.jvm.functions.Function2 r23) {
        /*
            r19 = this;
            r0 = r21
            r1 = r23
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        L_0x000d:
            if (r4 >= r2) goto L_0x018f
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            java.lang.Object r6 = androidx.compose.material3.internal.LayoutUtilKt.b(r6)
            java.lang.String r7 = "TextField"
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L_0x018b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            java.lang.Object r2 = r1.m(r5, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r10 = r2.intValue()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            int r4 = r2.size()
            r5 = r3
        L_0x0038:
            r6 = 0
            if (r5 >= r4) goto L_0x0052
            java.lang.Object r7 = r0.get(r5)
            r8 = r7
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            java.lang.Object r8 = androidx.compose.material3.internal.LayoutUtilKt.b(r8)
            java.lang.String r9 = "Label"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 == 0) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0052:
            r7 = r6
        L_0x0053:
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            if (r7 == 0) goto L_0x0067
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            java.lang.Object r4 = r1.m(r7, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r11 = r4
            goto L_0x0068
        L_0x0067:
            r11 = r3
        L_0x0068:
            int r4 = r2.size()
            r5 = r3
        L_0x006d:
            if (r5 >= r4) goto L_0x0086
            java.lang.Object r7 = r0.get(r5)
            r8 = r7
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            java.lang.Object r8 = androidx.compose.material3.internal.LayoutUtilKt.b(r8)
            java.lang.String r9 = "Trailing"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 == 0) goto L_0x0083
            goto L_0x0087
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x006d
        L_0x0086:
            r7 = r6
        L_0x0087:
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            if (r7 == 0) goto L_0x009b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            java.lang.Object r4 = r1.m(r7, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r7 = r4
            goto L_0x009c
        L_0x009b:
            r7 = r3
        L_0x009c:
            int r4 = r2.size()
            r5 = r3
        L_0x00a1:
            if (r5 >= r4) goto L_0x00ba
            java.lang.Object r8 = r0.get(r5)
            r9 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material3.internal.LayoutUtilKt.b(r9)
            java.lang.String r12 = "Leading"
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r12)
            if (r9 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            int r5 = r5 + 1
            goto L_0x00a1
        L_0x00ba:
            r8 = r6
        L_0x00bb:
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            if (r8 == 0) goto L_0x00cf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            java.lang.Object r4 = r1.m(r8, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r8 = r4
            goto L_0x00d0
        L_0x00cf:
            r8 = r3
        L_0x00d0:
            int r4 = r2.size()
            r5 = r3
        L_0x00d5:
            if (r5 >= r4) goto L_0x00ee
            java.lang.Object r9 = r0.get(r5)
            r12 = r9
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.internal.LayoutUtilKt.b(r12)
            java.lang.String r13 = "Prefix"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 == 0) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            int r5 = r5 + 1
            goto L_0x00d5
        L_0x00ee:
            r9 = r6
        L_0x00ef:
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            if (r9 == 0) goto L_0x0103
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            java.lang.Object r4 = r1.m(r9, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r9 = r4
            goto L_0x0104
        L_0x0103:
            r9 = r3
        L_0x0104:
            int r4 = r2.size()
            r5 = r3
        L_0x0109:
            if (r5 >= r4) goto L_0x0122
            java.lang.Object r12 = r0.get(r5)
            r13 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r13 = (androidx.compose.ui.layout.IntrinsicMeasurable) r13
            java.lang.Object r13 = androidx.compose.material3.internal.LayoutUtilKt.b(r13)
            java.lang.String r14 = "Suffix"
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r13, r14)
            if (r13 == 0) goto L_0x011f
            goto L_0x0123
        L_0x011f:
            int r5 = r5 + 1
            goto L_0x0109
        L_0x0122:
            r12 = r6
        L_0x0123:
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            if (r12 == 0) goto L_0x0137
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            java.lang.Object r4 = r1.m(r12, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r12 = r4
            goto L_0x0138
        L_0x0137:
            r12 = r3
        L_0x0138:
            int r2 = r2.size()
            r4 = r3
        L_0x013d:
            if (r4 >= r2) goto L_0x0157
            java.lang.Object r5 = r0.get(r4)
            r13 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r13 = (androidx.compose.ui.layout.IntrinsicMeasurable) r13
            java.lang.Object r13 = androidx.compose.material3.internal.LayoutUtilKt.b(r13)
            java.lang.String r14 = "Hint"
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r13, r14)
            if (r13 == 0) goto L_0x0154
            r6 = r5
            goto L_0x0157
        L_0x0154:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0157:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x0169
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            java.lang.Object r0 = r1.m(r6, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
        L_0x0169:
            r17 = 15
            r18 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            long r13 = androidx.compose.ui.unit.ConstraintsKt.b(r13, r14, r15, r16, r17, r18)
            r0 = r19
            androidx.compose.material3.internal.FloatProducer r1 = r0.f10590d
            float r15 = r1.invoke()
            r4 = r19
            r5 = r20
            r6 = r8
            r8 = r9
            r9 = r12
            r12 = r3
            int r1 = r4.l(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
            return r1
        L_0x018b:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x018f:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            androidx.compose.ui.util.ListUtilsKt.f(r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.n(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, kotlin.jvm.functions.Function2):int");
    }

    public static final int o(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.C(i2);
    }

    public static final int p(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.a0(i2);
    }

    public static final Unit q(OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Ref.ObjectRef objectRef, Placeable placeable6, Placeable placeable7, Placeable placeable8, MeasureScope measureScope, boolean z2, float f2, Placeable.PlacementScope placementScope) {
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = outlinedTextFieldMeasurePolicy;
        Placeable placeable9 = (Placeable) objectRef.f40908z;
        float density = measureScope.getDensity();
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        float B1 = measureScope.B1(outlinedTextFieldMeasurePolicy2.f10592f);
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy3 = outlinedTextFieldMeasurePolicy2;
        outlinedTextFieldMeasurePolicy3.t(placementScope, i2, i3, placeable, placeable2, placeable3, placeable4, placeable5, placeable9, placeable6, placeable7, placeable8, density, layoutDirection, z2, f2, B1);
        return Unit.f40552a;
    }

    public static final int r(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.q0(i2);
    }

    public static final int s(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.Z(i2);
    }

    public static final int u(int i2, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i3, int i4, Placeable placeable, Placeable placeable2) {
        if (outlinedTextFieldMeasurePolicy.f10588b) {
            i4 = Alignment.f15444a.i().a(placeable2.C0(), i3);
        }
        int i5 = i2 + i4;
        return outlinedTextFieldMeasurePolicy.f10589c instanceof TextFieldLabelPosition.Above ? i5 : Math.max(i5, LayoutUtilKt.a(placeable) / 2);
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i2;
        long j3;
        Object obj6;
        Object obj7;
        long j4;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        float invoke = this.f10590d.invoke();
        int P1 = measureScope2.P1(this.f10591e.a());
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        Collection collection = list2;
        int size = collection.size();
        int i3 = 0;
        while (true) {
            placeable = null;
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i3);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj), "Leading")) {
                break;
            }
            i3++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable c0 = measurable != null ? measurable.c0(d2) : null;
        int c2 = LayoutUtilKt.c(c0);
        int max = Math.max(0, LayoutUtilKt.a(c0));
        int size2 = collection.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i4);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable c02 = measurable2 != null ? measurable2.c0(ConstraintsKt.j(d2, -c2, 0, 2, (Object) null)) : null;
        int c3 = c2 + LayoutUtilKt.c(c02);
        int max2 = Math.max(max, LayoutUtilKt.a(c02));
        int size3 = collection.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i5);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj3), "Prefix")) {
                break;
            }
            i5++;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable c03 = measurable3 != null ? measurable3.c0(ConstraintsKt.j(d2, -c3, 0, 2, (Object) null)) : null;
        int c4 = c3 + LayoutUtilKt.c(c03);
        int max3 = Math.max(max2, LayoutUtilKt.a(c03));
        int size4 = collection.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i6);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj4), "Suffix")) {
                break;
            }
            i6++;
        }
        Measurable measurable4 = (Measurable) obj4;
        Placeable c04 = measurable4 != null ? measurable4.c0(ConstraintsKt.j(d2, -c4, 0, 2, (Object) null)) : null;
        int c5 = c4 + LayoutUtilKt.c(c04);
        int max4 = Math.max(max3, LayoutUtilKt.a(c04));
        boolean z2 = this.f10589c instanceof TextFieldLabelPosition.Above;
        int size5 = collection.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i7);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj5), "Label")) {
                break;
            }
            i7++;
        }
        Measurable measurable5 = (Measurable) obj5;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (!z2) {
            int P12 = measureScope2.P1(this.f10591e.b(measureScope.getLayoutDirection())) + measureScope2.P1(this.f10591e.c(measureScope.getLayoutDirection()));
            Placeable c05 = measurable5 != null ? measurable5.c0(ConstraintsKt.i(d2, -MathHelpersKt.c(c5 + P12, P12, invoke), -P1)) : null;
            objectRef.f40908z = c05;
            if (c05 != null) {
                j3 = d2;
                j4 = Size.d((((long) Float.floatToRawIntBits((float) c05.L0())) << 32) | (((long) Float.floatToRawIntBits((float) c05.C0())) & 4294967295L));
            } else {
                j3 = d2;
                j4 = Size.f15876b.b();
            }
            this.f10587a.invoke(Size.c(j4));
            i2 = 0;
        } else {
            j3 = d2;
            i2 = measurable5 != null ? measurable5.q0(Constraints.n(j2)) : 0;
        }
        int size6 = collection.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i8);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj6), "Supporting")) {
                break;
            }
            i8++;
        }
        Measurable measurable6 = (Measurable) obj6;
        int q0 = measurable6 != null ? measurable6.q0(Constraints.n(j2)) : 0;
        int P13 = z2 ? measureScope2.P1(this.f10591e.d()) : Math.max(LayoutUtilKt.a((Placeable) objectRef.f40908z) / 2, measureScope2.P1(this.f10591e.d()));
        boolean z3 = z2;
        Measurable measurable7 = measurable6;
        long d3 = Constraints.d(ConstraintsKt.i(j2, -c5, (((-P1) - P13) - i2) - q0), 0, 0, 0, 0, 11, (Object) null);
        int size7 = collection.size();
        int i9 = 0;
        while (i9 < size7) {
            Measurable measurable8 = (Measurable) list2.get(i9);
            int i10 = size7;
            if (Intrinsics.d(LayoutIdKt.a(measurable8), "TextField")) {
                Placeable c06 = measurable8.c0(d3);
                long d4 = Constraints.d(d3, 0, 0, 0, 0, 14, (Object) null);
                Collection collection2 = list2;
                int size8 = collection2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i11);
                    int i12 = size8;
                    if (Intrinsics.d(LayoutIdKt.a((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i11++;
                    size8 = i12;
                }
                Measurable measurable9 = (Measurable) obj7;
                Placeable c07 = measurable9 != null ? measurable9.c0(d4) : null;
                Ref.ObjectRef objectRef2 = objectRef;
                boolean z4 = z3;
                long j5 = j3;
                Measurable measurable10 = measurable7;
                int max5 = Math.max(max4, Math.max(LayoutUtilKt.a(c06), LayoutUtilKt.a(c07)) + P13 + P1);
                Measurable measurable11 = measurable5;
                int l2 = l(measureScope, LayoutUtilKt.c(c0), LayoutUtilKt.c(c02), LayoutUtilKt.c(c03), LayoutUtilKt.c(c04), c06.L0(), LayoutUtilKt.c((Placeable) objectRef.f40908z), LayoutUtilKt.c(c07), j2, invoke);
                if (z4) {
                    Placeable c08 = measurable11 != null ? measurable11.c0(Constraints.d(j5, 0, l2, 0, i2, 5, (Object) null)) : null;
                    objectRef2.f40908z = c08;
                    this.f10587a.invoke(Size.c(c08 != null ? Size.d((((long) Float.floatToRawIntBits((float) c08.L0())) << 32) | (((long) Float.floatToRawIntBits((float) c08.C0())) & 4294967295L)) : Size.f15876b.b()));
                }
                long d5 = Constraints.d(ConstraintsKt.j(j5, 0, -max5, 1, (Object) null), 0, l2, 0, 0, 9, (Object) null);
                if (measurable10 != null) {
                    placeable = measurable10.c0(d5);
                }
                int a2 = LayoutUtilKt.a(placeable);
                int i13 = l2;
                float f2 = invoke;
                int k2 = k(measureScope, LayoutUtilKt.a(c0), LayoutUtilKt.a(c02), LayoutUtilKt.a(c03), LayoutUtilKt.a(c04), c06.C0(), LayoutUtilKt.a((Placeable) objectRef2.f40908z), LayoutUtilKt.a(c07), LayoutUtilKt.a(placeable), j2, z4, f2);
                int a3 = (k2 - a2) - (z4 ? LayoutUtilKt.a((Placeable) objectRef2.f40908z) : 0);
                int size9 = collection2.size();
                for (int i14 = 0; i14 < size9; i14++) {
                    Measurable measurable12 = (Measurable) list.get(i14);
                    if (Intrinsics.d(LayoutIdKt.a(measurable12), "Container")) {
                        int i15 = i13;
                        Placeable c09 = measurable12.c0(ConstraintsKt.a(i15 != Integer.MAX_VALUE ? i15 : 0, i15, a3 != Integer.MAX_VALUE ? a3 : 0, a3));
                        int i16 = k2;
                        return MeasureScope.R1(measureScope, i15, i16, (Map) null, new U4(this, i16, i15, c0, c02, c03, c04, c06, objectRef2, c07, c09, placeable, measureScope, z4, f2), 4, (Object) null);
                    }
                    int i17 = i13;
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            Ref.ObjectRef objectRef3 = objectRef;
            boolean z5 = z3;
            List list3 = list2;
            long j6 = j3;
            Measurable measurable13 = measurable7;
            Measurable measurable14 = measurable5;
            float f3 = invoke;
            i9++;
            size7 = i10;
            j3 = j6;
            long j7 = j2;
            list2 = list3;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return n(intrinsicMeasureScope, list, i2, new T4());
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return m(intrinsicMeasureScope, list, i2, new S4());
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return n(intrinsicMeasureScope, list, i2, new W4());
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return m(intrinsicMeasureScope, list, i2, new V4());
    }

    public final int k(Density density, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j2, boolean z2, float f2) {
        int i10 = ComparisonsKt.i(i6, i8, i4, i5, z2 ? 0 : MathHelpersKt.c(i7, 0, f2));
        float B1 = density.B1(this.f10591e.d());
        if (!z2) {
            B1 = MathHelpersKt.b(B1, Math.max(B1, ((float) i7) / 2.0f), f2);
        }
        float B12 = B1 + ((float) i10) + density.B1(this.f10591e.a());
        if (!z2) {
            i7 = 0;
        }
        return ConstraintsKt.f(j2, i7 + Math.max(i2, Math.max(i3, MathKt.d(B12))) + i9);
    }

    public final int l(Density density, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, float f2) {
        int i9 = i4 + i5;
        int max = i2 + Math.max(i6 + i9, Math.max(i8 + i9, MathHelpersKt.c(i7, 0, f2))) + i3;
        PaddingValues paddingValues = this.f10591e;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return ConstraintsKt.g(j2, Math.max(max, MathKt.d((((float) i7) + density.B1(Dp.m(paddingValues.b(layoutDirection) + this.f10591e.c(layoutDirection)))) * f2)));
    }

    public final void t(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f2, LayoutDirection layoutDirection, boolean z2, float f3, float f4) {
        int i4 = i3;
        LayoutDirection layoutDirection2 = layoutDirection;
        float f5 = f3;
        int i5 = 0;
        int a2 = z2 ? LayoutUtilKt.a(placeable6) : 0;
        Placeable.PlacementScope.j(placementScope, placeable8, 0, a2, 0.0f, 4, (Object) null);
        int a3 = (i2 - LayoutUtilKt.a(placeable9)) - (z2 ? LayoutUtilKt.a(placeable6) : 0);
        int d2 = MathKt.d(this.f10591e.d() * f2);
        if (placeable != null) {
            Placeable.PlacementScope.n(placementScope, placeable, 0, a2 + Alignment.f15444a.i().a(placeable.C0(), a3), 0.0f, 4, (Object) null);
        }
        if (placeable6 != null) {
            int a4 = z2 ? 0 : this.f10588b ? Alignment.f15444a.i().a(placeable6.C0(), a3) : d2;
            if (!z2) {
                i5 = -(placeable6.C0() / 2);
            }
            int c2 = MathHelpersKt.c(a4, i5, f5);
            if (z2) {
                Placeable.PlacementScope.j(placementScope, placeable6, TextFieldImplKt.H(this.f10589c).a(placeable6.L0(), i4, layoutDirection2), c2, 0.0f, 4, (Object) null);
            } else {
                float g2 = PaddingKt.g(this.f10591e, layoutDirection2) * f2;
                float f6 = PaddingKt.f(this.f10591e, layoutDirection2) * f2;
                float L0 = placeable == null ? g2 : ((float) placeable.L0()) + RangesKt.d(g2 - f4, 0.0f);
                float L02 = placeable2 == null ? f6 : ((float) placeable2.L0()) + RangesKt.d(f6 - f4, 0.0f);
                LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
                Placeable.PlacementScope.j(placementScope, placeable6, MathKt.d(MathHelpersKt.b(((float) TextFieldImplKt.D(this.f10589c).a(placeable6.L0(), i4 - MathKt.d(L0 + L02), layoutDirection2)) + (layoutDirection2 == layoutDirection3 ? L0 : L02), ((float) TextFieldImplKt.H(this.f10589c).a(placeable6.L0(), i4 - MathKt.d(g2 + f6), layoutDirection2)) + (layoutDirection2 == layoutDirection3 ? g2 : f6), f5)), c2, 0.0f, 4, (Object) null);
            }
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, LayoutUtilKt.c(placeable), u(a2, this, a3, d2, placeable6, placeable3), 0.0f, 4, (Object) null);
        }
        int c3 = LayoutUtilKt.c(placeable) + LayoutUtilKt.c(placeable3);
        Placeable.PlacementScope.n(placementScope, placeable5, c3, u(a2, this, a3, d2, placeable6, placeable5), 0.0f, 4, (Object) null);
        if (placeable7 != null) {
            Placeable.PlacementScope.n(placementScope, placeable7, c3, u(a2, this, a3, d2, placeable6, placeable7), 0.0f, 4, (Object) null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.n(placementScope, placeable4, (i4 - LayoutUtilKt.c(placeable2)) - placeable4.L0(), u(a2, this, a3, d2, placeable6, placeable4), 0.0f, 4, (Object) null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.n(placementScope, placeable2, i4 - placeable2.L0(), a2 + Alignment.f15444a.i().a(placeable2.C0(), a3), 0.0f, 4, (Object) null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.n(placementScope, placeable9, 0, a2 + a3, 0.0f, 4, (Object) null);
        }
    }

    public OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z2, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f2) {
        this.f10587a = function1;
        this.f10588b = z2;
        this.f10589c = textFieldLabelPosition;
        this.f10590d = floatProducer;
        this.f10591e = paddingValues;
        this.f10592f = f2;
    }
}
