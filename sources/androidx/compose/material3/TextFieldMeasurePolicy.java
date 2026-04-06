package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
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
import androidx.compose.ui.unit.IntOffset;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

@Metadata
final class TextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11422a;

    /* renamed from: b  reason: collision with root package name */
    public final TextFieldLabelPosition f11423b;

    /* renamed from: c  reason: collision with root package name */
    public final FloatProducer f11424c;

    /* renamed from: d  reason: collision with root package name */
    public final PaddingValues f11425d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11426e;

    public /* synthetic */ TextFieldMeasurePolicy(boolean z2, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, textFieldLabelPosition, floatProducer, paddingValues, f2);
    }

    private final int k(Density density, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j2, boolean z2, float f2) {
        int i10;
        int i11;
        int i12;
        int i13;
        Density density2 = density;
        int i14 = i3;
        float f3 = f2;
        int P1 = density.P1(Dp.m(this.f11425d.d() + this.f11425d.a()));
        if (z2) {
            i12 = i6;
            i11 = i7;
            i10 = i8;
            i13 = 0;
        } else {
            i13 = MathHelpersKt.c(i3, 0, f3);
            i12 = i6;
            i11 = i7;
            i10 = i8;
        }
        int[] iArr = {i10, i12, i11, i13};
        int i15 = i2;
        int max = P1 + ((i14 <= 0 || z2) ? 0 : Math.max(density.P1(Dp.m(this.f11426e * ((float) 2))), MathHelpersKt.c(0, i3, MotionTokens.f13556a.a().a(f3)))) + ComparisonsKt.i(i2, iArr);
        int i16 = i5;
        if (!z2) {
            i14 = 0;
        }
        int i17 = i4;
        return ConstraintsKt.f(j2, i14 + Math.max(i4, Math.max(i5, max)) + i9);
    }

    private final int m(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        Object obj;
        int i3;
        int i4;
        Object obj2;
        int i5;
        int i6;
        Object obj3;
        Object obj4;
        int i7;
        int i8;
        Object obj5;
        int i9;
        Object obj6;
        Object obj7;
        List list2 = list;
        Function2 function22 = function2;
        Collection collection = list2;
        int size = collection.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i10);
            if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj), "Leading")) {
                break;
            }
            i10++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        if (intrinsicMeasurable != null) {
            i4 = LayoutUtilKt.d(i2, intrinsicMeasurable.a0(Integer.MAX_VALUE));
            i3 = ((Number) function22.m(intrinsicMeasurable, Integer.valueOf(i2))).intValue();
        } else {
            i4 = i2;
            i3 = 0;
        }
        int size2 = collection.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i11);
            if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj2), "Trailing")) {
                break;
            }
            i11++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable2 != null) {
            i5 = LayoutUtilKt.d(i4, intrinsicMeasurable2.a0(Integer.MAX_VALUE));
            i6 = ((Number) function22.m(intrinsicMeasurable2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = i4;
            i6 = 0;
        }
        int size3 = collection.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i12);
            if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj3), "Label")) {
                break;
            }
            i12++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj3;
        int intValue = intrinsicMeasurable3 != null ? ((Number) function22.m(intrinsicMeasurable3, Integer.valueOf(i5))).intValue() : 0;
        int size4 = collection.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i13);
            if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj4), "Prefix")) {
                break;
            }
            i13++;
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj4;
        if (intrinsicMeasurable4 != null) {
            int intValue2 = ((Number) function22.m(intrinsicMeasurable4, Integer.valueOf(i5))).intValue();
            int d2 = LayoutUtilKt.d(i5, intrinsicMeasurable4.a0(Integer.MAX_VALUE));
            i7 = intValue2;
            i8 = d2;
        } else {
            i8 = i5;
            i7 = 0;
        }
        int size5 = collection.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i14);
            if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj5), "Suffix")) {
                break;
            }
            i14++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable5 != null) {
            int intValue3 = ((Number) function22.m(intrinsicMeasurable5, Integer.valueOf(i8))).intValue();
            i8 = LayoutUtilKt.d(i8, intrinsicMeasurable5.a0(Integer.MAX_VALUE));
            i9 = intValue3;
        } else {
            i9 = 0;
        }
        int size6 = collection.size();
        for (int i15 = 0; i15 < size6; i15++) {
            Object obj8 = list2.get(i15);
            if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj8), "TextField")) {
                int intValue4 = ((Number) function22.m(obj8, Integer.valueOf(i8))).intValue();
                Collection collection2 = list2;
                int size7 = collection2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list2.get(i16);
                    int i17 = size7;
                    if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj6), "Hint")) {
                        break;
                    }
                    i16++;
                    size7 = i17;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj6;
                int intValue5 = intrinsicMeasurable6 != null ? ((Number) function22.m(intrinsicMeasurable6, Integer.valueOf(i8))).intValue() : 0;
                int size8 = collection2.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i18);
                    if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj7), "Supporting")) {
                        break;
                    }
                    i18++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = (IntrinsicMeasurable) obj7;
                return k(intrinsicMeasureScope, intValue4, intValue, i3, i6, i7, i9, intValue5, intrinsicMeasurable7 != null ? ((Number) function22.m(intrinsicMeasurable7, Integer.valueOf(i2))).intValue() : 0, ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null), this.f11423b instanceof TextFieldLabelPosition.Above, this.f11424c.invoke());
            }
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int n(java.util.List r19, int r20, kotlin.jvm.functions.Function2 r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r21
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        L_0x000d:
            if (r4 >= r2) goto L_0x0184
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            java.lang.Object r6 = androidx.compose.material3.internal.LayoutUtilKt.b(r6)
            java.lang.String r7 = "TextField"
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L_0x0180
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            java.lang.Object r2 = r1.m(r5, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r9 = r2.intValue()
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
            java.lang.String r10 = "Label"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r10)
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
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            java.lang.Object r4 = r1.m(r7, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r10 = r4
            goto L_0x0068
        L_0x0067:
            r10 = r3
        L_0x0068:
            int r4 = r2.size()
            r5 = r3
        L_0x006d:
            if (r5 >= r4) goto L_0x0086
            java.lang.Object r7 = r0.get(r5)
            r8 = r7
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            java.lang.Object r8 = androidx.compose.material3.internal.LayoutUtilKt.b(r8)
            java.lang.String r11 = "Trailing"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r11)
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
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
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
            r11 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            java.lang.Object r11 = androidx.compose.material3.internal.LayoutUtilKt.b(r11)
            java.lang.String r12 = "Prefix"
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            int r5 = r5 + 1
            goto L_0x00a1
        L_0x00ba:
            r8 = r6
        L_0x00bb:
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            if (r8 == 0) goto L_0x00cf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
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
            java.lang.Object r11 = r0.get(r5)
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.internal.LayoutUtilKt.b(r12)
            java.lang.String r13 = "Suffix"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 == 0) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            int r5 = r5 + 1
            goto L_0x00d5
        L_0x00ee:
            r11 = r6
        L_0x00ef:
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            if (r11 == 0) goto L_0x0103
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            java.lang.Object r4 = r1.m(r11, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r11 = r4
            goto L_0x0104
        L_0x0103:
            r11 = r3
        L_0x0104:
            int r4 = r2.size()
            r5 = r3
        L_0x0109:
            if (r5 >= r4) goto L_0x0122
            java.lang.Object r12 = r0.get(r5)
            r13 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r13 = (androidx.compose.ui.layout.IntrinsicMeasurable) r13
            java.lang.Object r13 = androidx.compose.material3.internal.LayoutUtilKt.b(r13)
            java.lang.String r14 = "Leading"
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
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            java.lang.Object r4 = r1.m(r12, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4
            goto L_0x0138
        L_0x0137:
            r5 = r3
        L_0x0138:
            int r2 = r2.size()
            r4 = r3
        L_0x013d:
            if (r4 >= r2) goto L_0x0157
            java.lang.Object r12 = r0.get(r4)
            r13 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r13 = (androidx.compose.ui.layout.IntrinsicMeasurable) r13
            java.lang.Object r13 = androidx.compose.material3.internal.LayoutUtilKt.b(r13)
            java.lang.String r14 = "Hint"
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r13, r14)
            if (r13 == 0) goto L_0x0154
            r6 = r12
            goto L_0x0157
        L_0x0154:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0157:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x0169
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r0 = r1.m(r6, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
        L_0x0169:
            r16 = 15
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            long r12 = androidx.compose.ui.unit.ConstraintsKt.b(r12, r13, r14, r15, r16, r17)
            r4 = r18
            r6 = r7
            r7 = r8
            r8 = r11
            r11 = r3
            int r0 = r4.l(r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0180:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0184:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            androidx.compose.ui.util.ListUtilsKt.f(r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldMeasurePolicy.n(java.util.List, int, kotlin.jvm.functions.Function2):int");
    }

    public static final int o(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.C(i2);
    }

    public static final int p(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.a0(i2);
    }

    public static final Unit q(Ref.ObjectRef objectRef, boolean z2, TextFieldMeasurePolicy textFieldMeasurePolicy, int i2, int i3, MeasureScope measureScope, int i4, int i5, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f2, Placeable.PlacementScope placementScope) {
        int i6;
        int P1;
        Ref.ObjectRef objectRef2 = objectRef;
        TextFieldMeasurePolicy textFieldMeasurePolicy2 = textFieldMeasurePolicy;
        if (objectRef2.f40908z != null) {
            int i7 = 0;
            if (z2) {
                MeasureScope measureScope2 = measureScope;
                i6 = 0;
            } else {
                if (textFieldMeasurePolicy2.f11422a) {
                    P1 = Alignment.f15444a.i().a(((Placeable) objectRef2.f40908z).C0(), i2);
                    MeasureScope measureScope3 = measureScope;
                } else {
                    P1 = i3 + measureScope.P1(textFieldMeasurePolicy2.f11426e);
                }
                i6 = P1;
            }
            int i8 = z2 ? 0 : i3;
            Object obj = objectRef2.f40908z;
            Placeable placeable9 = (Placeable) obj;
            if (!z2) {
                i7 = ((Placeable) obj).C0();
            }
            textFieldMeasurePolicy.t(placementScope, i4, i5, placeable, placeable9, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, i6, i8, z2, f2, i3 + i7, measureScope.getLayoutDirection());
        } else {
            MeasureScope measureScope4 = measureScope;
            textFieldMeasurePolicy.u(placementScope, i4, i5, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, measureScope.getDensity());
        }
        return Unit.f40552a;
    }

    public static final int r(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.q0(i2);
    }

    public static final int s(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.Z(i2);
    }

    public static final int v(TextFieldMeasurePolicy textFieldMeasurePolicy, int i2, int i3, Placeable placeable) {
        return textFieldMeasurePolicy.f11422a ? Alignment.f15444a.i().a(placeable.C0(), i2) : i3;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        float invoke = this.f11424c.invoke();
        int P1 = measureScope2.P1(this.f11425d.d());
        int P12 = measureScope2.P1(this.f11425d.a());
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
        boolean z2 = this.f11423b instanceof TextFieldLabelPosition.Above;
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
            objectRef.f40908z = measurable5 != null ? measurable5.c0(ConstraintsKt.i(d2, -c5, -P12)) : null;
            i2 = 0;
        } else {
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
            int i9 = size6;
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj6), "Supporting")) {
                break;
            }
            i8++;
            size6 = i9;
        }
        Measurable measurable6 = (Measurable) obj6;
        int q0 = measurable6 != null ? measurable6.q0(Constraints.n(j2)) : 0;
        int a2 = P1 + LayoutUtilKt.a((Placeable) objectRef.f40908z) + i2;
        boolean z3 = z2;
        Measurable measurable7 = measurable5;
        long i10 = ConstraintsKt.i(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null), -c5, ((-a2) - P12) - q0);
        int size7 = collection.size();
        int i11 = 0;
        while (i11 < size7) {
            Measurable measurable8 = (Measurable) list2.get(i11);
            int i12 = size7;
            if (Intrinsics.d(LayoutIdKt.a(measurable8), "TextField")) {
                Placeable c05 = measurable8.c0(i10);
                long d3 = Constraints.d(i10, 0, 0, 0, 0, 14, (Object) null);
                Collection collection2 = list2;
                int size8 = collection2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i13);
                    int i14 = size8;
                    if (Intrinsics.d(LayoutIdKt.a((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i13++;
                    size8 = i14;
                }
                Measurable measurable9 = (Measurable) obj7;
                Placeable c06 = measurable9 != null ? measurable9.c0(d3) : null;
                Ref.ObjectRef objectRef2 = objectRef;
                int max5 = Math.max(max4, Math.max(LayoutUtilKt.a(c05), LayoutUtilKt.a(c06)) + a2 + P12);
                boolean z4 = z3;
                Measurable measurable10 = measurable7;
                int l2 = l(LayoutUtilKt.c(c0), LayoutUtilKt.c(c02), LayoutUtilKt.c(c03), LayoutUtilKt.c(c04), c05.L0(), LayoutUtilKt.c((Placeable) objectRef.f40908z), LayoutUtilKt.c(c06), j2);
                if (z4) {
                    objectRef2.f40908z = measurable10 != null ? measurable10.c0(Constraints.d(d2, 0, l2, 0, i2, 5, (Object) null)) : null;
                }
                long d4 = Constraints.d(ConstraintsKt.j(d2, 0, -max5, 1, (Object) null), 0, l2, 0, 0, 9, (Object) null);
                if (measurable6 != null) {
                    placeable = measurable6.c0(d4);
                }
                int a3 = LayoutUtilKt.a(placeable);
                int i15 = l2;
                int k2 = k(measureScope, c05.C0(), LayoutUtilKt.a((Placeable) objectRef2.f40908z), LayoutUtilKt.a(c0), LayoutUtilKt.a(c02), LayoutUtilKt.a(c03), LayoutUtilKt.a(c04), LayoutUtilKt.a(c06), LayoutUtilKt.a(placeable), j2, z4, invoke);
                int a4 = (k2 - a3) - (z4 ? LayoutUtilKt.a((Placeable) objectRef2.f40908z) : 0);
                int size9 = collection2.size();
                for (int i16 = 0; i16 < size9; i16++) {
                    Measurable measurable11 = (Measurable) list.get(i16);
                    if (Intrinsics.d(LayoutIdKt.a(measurable11), "Container")) {
                        int i17 = i15;
                        return MeasureScope.R1(measureScope, i17, k2, (Map) null, new C0127i7(objectRef2, z4, this, a4, P1, measureScope, i17, k2, c05, c06, c0, c02, c03, c04, measurable11.c0(ConstraintsKt.a(i17 != Integer.MAX_VALUE ? i17 : 0, i17, a4 != Integer.MAX_VALUE ? a4 : 0, a4)), placeable, invoke), 4, (Object) null);
                    }
                    int i18 = i15;
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            Ref.ObjectRef objectRef3 = objectRef;
            List list3 = list2;
            Measurable measurable12 = measurable7;
            i11++;
            MeasureScope measureScope3 = measureScope;
            z3 = z3;
            list2 = list3;
            size7 = i12;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return n(list, i2, new C0118h7());
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return m(intrinsicMeasureScope, list, i2, new C0161j7());
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return n(list, i2, new C0109g7());
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return m(intrinsicMeasureScope, list, i2, new C0170k7());
    }

    public final int l(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        int i9 = i4 + i5;
        return ConstraintsKt.g(j2, i2 + Math.max(i6 + i9, Math.max(i8 + i9, i7)) + i3);
    }

    public final void t(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, int i4, int i5, boolean z2, float f2, int i6, LayoutDirection layoutDirection) {
        int i7 = i2;
        float f3 = f2;
        LayoutDirection layoutDirection2 = layoutDirection;
        int i8 = 0;
        int C0 = z2 ? placeable2.C0() : 0;
        Placeable.PlacementScope.j(placementScope, placeable8, 0, C0, 0.0f, 4, (Object) null);
        int a2 = i3 - LayoutUtilKt.a(placeable9);
        if (z2) {
            i8 = placeable2.C0();
        }
        int i9 = a2 - i8;
        if (placeable4 != null) {
            Placeable.PlacementScope.n(placementScope, placeable4, 0, C0 + Alignment.f15444a.i().a(placeable4.C0(), i9), 0.0f, 4, (Object) null);
        }
        int c2 = MathHelpersKt.c(i4, i5, f3);
        if (z2) {
            Placeable.PlacementScope.j(placementScope, placeable2, TextFieldImplKt.H(this.f11423b).a(placeable2.L0(), i7, layoutDirection2), c2, 0.0f, 4, (Object) null);
        } else {
            int c3 = layoutDirection2 == LayoutDirection.Ltr ? LayoutUtilKt.c(placeable4) : LayoutUtilKt.c(placeable5);
            Placeable.PlacementScope.j(placementScope, placeable2, MathHelpersKt.c(TextFieldImplKt.D(this.f11423b).a(placeable2.L0(), (i7 - LayoutUtilKt.c(placeable4)) - LayoutUtilKt.c(placeable5), layoutDirection2) + c3, TextFieldImplKt.H(this.f11423b).a(placeable2.L0(), (i7 - LayoutUtilKt.c(placeable4)) - LayoutUtilKt.c(placeable5), layoutDirection2) + c3, f3), c2, 0.0f, 4, (Object) null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.n(placementScope, placeable6, LayoutUtilKt.c(placeable4), C0 + i6, 0.0f, 4, (Object) null);
        }
        int c4 = LayoutUtilKt.c(placeable4) + LayoutUtilKt.c(placeable6);
        int i10 = C0 + i6;
        Placeable.PlacementScope.n(placementScope, placeable, c4, i10, 0.0f, 4, (Object) null);
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, c4, i10, 0.0f, 4, (Object) null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.n(placementScope, placeable7, (i7 - LayoutUtilKt.c(placeable5)) - placeable7.L0(), i10, 0.0f, 4, (Object) null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.n(placementScope, placeable5, i7 - placeable5.L0(), C0 + Alignment.f15444a.i().a(placeable5.C0(), i9), 0.0f, 4, (Object) null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.n(placementScope, placeable9, 0, C0 + i9, 0.0f, 4, (Object) null);
        }
    }

    public final void u(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f2) {
        Placeable placeable9 = placeable2;
        Placeable placeable10 = placeable5;
        Placeable placeable11 = placeable6;
        Placeable.PlacementScope.l(placementScope, placeable7, IntOffset.f19160b.b(), 0.0f, 2, (Object) null);
        int a2 = i3 - LayoutUtilKt.a(placeable8);
        int d2 = MathKt.d(this.f11425d.d() * f2);
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, 0, Alignment.f15444a.i().a(placeable3.C0(), a2), 0.0f, 4, (Object) null);
        }
        if (placeable10 != null) {
            Placeable.PlacementScope.n(placementScope, placeable5, LayoutUtilKt.c(placeable3), v(this, a2, d2, placeable10), 0.0f, 4, (Object) null);
        }
        int c2 = LayoutUtilKt.c(placeable3) + LayoutUtilKt.c(placeable5);
        Placeable.PlacementScope.n(placementScope, placeable, c2, v(this, a2, d2, placeable), 0.0f, 4, (Object) null);
        if (placeable9 != null) {
            Placeable.PlacementScope.n(placementScope, placeable2, c2, v(this, a2, d2, placeable9), 0.0f, 4, (Object) null);
        }
        if (placeable11 != null) {
            Placeable.PlacementScope.n(placementScope, placeable6, (i2 - LayoutUtilKt.c(placeable4)) - placeable6.L0(), v(this, a2, d2, placeable11), 0.0f, 4, (Object) null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.n(placementScope, placeable4, i2 - placeable4.L0(), Alignment.f15444a.i().a(placeable4.C0(), a2), 0.0f, 4, (Object) null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.n(placementScope, placeable8, 0, a2, 0.0f, 4, (Object) null);
        }
    }

    public TextFieldMeasurePolicy(boolean z2, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f2) {
        this.f11422a = z2;
        this.f11423b = textFieldLabelPosition;
        this.f11424c = floatProducer;
        this.f11425d = paddingValues;
        this.f11426e = f2;
    }
}
