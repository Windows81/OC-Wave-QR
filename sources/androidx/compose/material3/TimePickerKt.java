package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.api.Endpoint;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TimePickerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11468a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f11469b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11470c = Dp.m((float) 36);

    /* renamed from: d  reason: collision with root package name */
    public static final float f11471d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f11472e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f11473f = Dp.m((float) 7);

    /* renamed from: g  reason: collision with root package name */
    public static final float f11474g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f11475h = Dp.m((float) 74);

    /* renamed from: i  reason: collision with root package name */
    public static final float f11476i = Dp.m((float) 48);

    /* renamed from: j  reason: collision with root package name */
    public static final IntList f11477j = IntListKt.d(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    /* renamed from: k  reason: collision with root package name */
    public static final IntList f11478k;

    /* renamed from: l  reason: collision with root package name */
    public static final IntList f11479l;

    /* renamed from: m  reason: collision with root package name */
    public static final float f11480m = Dp.m((float) 12);

    /* renamed from: n  reason: collision with root package name */
    public static final float f11481n = Dp.m((float) 384);

    /* renamed from: o  reason: collision with root package name */
    public static final float f11482o = Dp.m((float) 330);

    /* renamed from: p  reason: collision with root package name */
    public static final float f11483p = Dp.m((float) 238);

    /* renamed from: q  reason: collision with root package name */
    public static final float f11484q = Dp.m((float) 200);

    static {
        float m2 = Dp.m((float) Endpoint.TARGET_FIELD_NUMBER);
        TimePickerTokens timePickerTokens = TimePickerTokens.f14264a;
        f11468a = m2 / timePickerTokens.a();
        f11469b = Dp.m((float) 69) / timePickerTokens.a();
        float f2 = (float) 24;
        f11471d = Dp.m(f2);
        f11472e = Dp.m(f2);
        f11474g = Dp.m(f2);
        IntList d2 = IntListKt.d(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f11478k = d2;
        MutableIntList mutableIntList = new MutableIntList(d2.f1784b);
        int[] iArr = d2.f1783a;
        int i2 = d2.f1784b;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableIntList.k((iArr[i3] % 12) + 12);
        }
        f11479l = mutableIntList;
    }

    public static final Unit A(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates P = layoutCoordinates.P();
        v(mutableState, P != null ? IntSizeKt.b(P.a()) : IntOffset.f19160b.b());
        x(mutableState2, LayoutCoordinatesKt.a(layoutCoordinates));
        t(mutableState3, w(mutableState2).m());
        return Unit.f40552a;
    }

    public static final boolean A0(TimePickerState timePickerState) {
        return timePickerState.g() >= 12;
    }

    public static final Unit B(CoroutineScope coroutineScope, AnalogTimePickerState analogTimePickerState, float f2, boolean z2, MutableState mutableState, MutableState mutableState2, State state, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.C(semanticsPropertyReceiver, (String) null, new A7(coroutineScope, analogTimePickerState, f2, z2, mutableState, mutableState2), 1, (Object) null);
        SemanticsPropertiesKt.t0(semanticsPropertyReceiver, z(state));
        return Unit.f40552a;
    }

    public static final void B0(TimePickerState timePickerState, float f2, float f3, float f4, long j2) {
        if (TimePickerSelectionMode.f(timePickerState.e(), TimePickerSelectionMode.f11521b.a()) && timePickerState.f()) {
            float w0 = w0(f2, f3, IntOffset.k(j2), IntOffset.l(j2));
            int i2 = 0;
            if (A0(timePickerState)) {
                int g2 = timePickerState.g();
                if (w0 >= f4) {
                    i2 = 12;
                }
                timePickerState.a(g2 - i2);
                return;
            }
            int g3 = timePickerState.g();
            if (w0 < f4) {
                i2 = 12;
            }
            timePickerState.a(g3 + i2);
        }
    }

    public static final boolean C(CoroutineScope coroutineScope, AnalogTimePickerState analogTimePickerState, float f2, boolean z2, MutableState mutableState, MutableState mutableState2) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TimePickerKt$ClockText$2$1$1$1(analogTimePickerState, f2, z2, mutableState, mutableState2, (Continuation) null), 3, (Object) null);
        return true;
    }

    public static final String C0(int i2, boolean z2, int i3, Composer composer, int i4) {
        int i5;
        if (ComposerKt.P()) {
            ComposerKt.Y(194237364, i4, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:2019)");
        }
        if (TimePickerSelectionMode.f(i2, TimePickerSelectionMode.f11521b.b())) {
            Strings.Companion companion = Strings.f12320b;
            i5 = Strings.a(R.string.Y);
        } else if (z2) {
            Strings.Companion companion2 = Strings.f12320b;
            i5 = Strings.a(R.string.S);
        } else {
            Strings.Companion companion3 = Strings.f12320b;
            i5 = Strings.a(R.string.U);
        }
        String c2 = Strings_androidKt.c(i5, new Object[]{Integer.valueOf(i3)}, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public static final Unit D(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object D0(androidx.compose.material3.AnalogTimePickerState r12, float r13, float r14, float r15, boolean r16, long r17, androidx.compose.animation.core.AnimationSpec r19, kotlin.coroutines.Continuation r20) {
        /*
            r6 = r12
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.material3.TimePickerKt$onTap$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            androidx.compose.material3.TimePickerKt$onTap$1 r1 = (androidx.compose.material3.TimePickerKt$onTap$1) r1
            int r2 = r1.F
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.F = r2
        L_0x0015:
            r7 = r1
            goto L_0x001d
        L_0x0017:
            androidx.compose.material3.TimePickerKt$onTap$1 r1 = new androidx.compose.material3.TimePickerKt$onTap$1
            r1.<init>(r0)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r0 = r7.E
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.F
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L_0x004b
            if (r1 == r10) goto L_0x0040
            if (r1 != r9) goto L_0x0038
            boolean r1 = r7.D
            java.lang.Object r2 = r7.C
            androidx.compose.material3.AnalogTimePickerState r2 = (androidx.compose.material3.AnalogTimePickerState) r2
            kotlin.ResultKt.b(r0)
            goto L_0x00c9
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            boolean r1 = r7.D
            java.lang.Object r2 = r7.C
            androidx.compose.material3.AnalogTimePickerState r2 = (androidx.compose.material3.AnalogTimePickerState) r2
            kotlin.ResultKt.b(r0)
            r0 = r1
            goto L_0x00a7
        L_0x004b:
            kotlin.ResultKt.b(r0)
            int r0 = androidx.compose.ui.unit.IntOffset.l(r17)
            float r0 = (float) r0
            float r0 = r14 - r0
            int r1 = androidx.compose.ui.unit.IntOffset.k(r17)
            float r1 = (float) r1
            float r1 = r13 - r1
            float r0 = v0(r0, r1)
            int r1 = r12.e()
            androidx.compose.material3.TimePickerSelectionMode$Companion r2 = androidx.compose.material3.TimePickerSelectionMode.f11521b
            int r2 = r2.b()
            boolean r1 = androidx.compose.material3.TimePickerSelectionMode.f(r1, r2)
            if (r1 == 0) goto L_0x0081
            r1 = 1037465424(0x3dd67750, float:0.10471976)
            float r0 = r0 / r1
            r2 = 1084227584(0x40a00000, float:5.0)
            float r0 = r0 / r2
            double r3 = (double) r0
            double r3 = java.lang.Math.rint(r3)
            float r0 = (float) r3
            float r0 = r0 * r2
        L_0x007e:
            float r0 = r0 * r1
            r11 = r0
            goto L_0x008c
        L_0x0081:
            r1 = 1057360530(0x3f060a92, float:0.5235988)
            float r0 = r0 / r1
            double r2 = (double) r0
            double r2 = java.lang.Math.rint(r2)
            float r0 = (float) r2
            goto L_0x007e
        L_0x008c:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            B0(r0, r1, r2, r3, r4)
            r7.C = r6
            r0 = r16
            r7.D = r0
            r7.F = r10
            r1 = r19
            java.lang.Object r1 = r12.z(r11, r1, r10, r7)
            if (r1 != r8) goto L_0x00a6
            return r8
        L_0x00a6:
            r2 = r6
        L_0x00a7:
            int r1 = r2.e()
            androidx.compose.material3.TimePickerSelectionMode$Companion r3 = androidx.compose.material3.TimePickerSelectionMode.f11521b
            int r3 = r3.a()
            boolean r1 = androidx.compose.material3.TimePickerSelectionMode.f(r1, r3)
            if (r1 == 0) goto L_0x00ca
            if (r0 == 0) goto L_0x00ca
            r7.C = r2
            r7.D = r0
            r7.F = r9
            r3 = 100
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.b(r3, r7)
            if (r1 != r8) goto L_0x00c8
            return r8
        L_0x00c8:
            r1 = r0
        L_0x00c9:
            r0 = r1
        L_0x00ca:
            if (r0 == 0) goto L_0x00d5
            androidx.compose.material3.TimePickerSelectionMode$Companion r0 = androidx.compose.material3.TimePickerSelectionMode.f11521b
            int r0 = r0.b()
            r2.d(r0)
        L_0x00d5:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.D0(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Unit E(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i2, boolean z2, int i3, Composer composer, int i4) {
        r(modifier, analogTimePickerState, i2, z2, composer, RecomposeScopeImplKt.a(i3 | 1));
        return Unit.f40552a;
    }

    public static final void E0(int i2, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i3, Ref ref, Function1 function1) {
        ref.b(Boolean.FALSE);
        if (Intrinsics.d(textFieldValue.i(), textFieldValue2.i())) {
            function1.invoke(textFieldValue);
            return;
        }
        int i4 = 12;
        if (textFieldValue.i().length() == 0) {
            if (TimePickerSelectionMode.f(i2, TimePickerSelectionMode.f11521b.a())) {
                if (!A0(timePickerState) || timePickerState.f()) {
                    i4 = 0;
                }
                timePickerState.a(i4);
            } else {
                timePickerState.b(0);
            }
            function1.invoke(TextFieldValue.e(textFieldValue, "", 0, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            int g2 = (textFieldValue.i().length() == 3 && TextRange.n(textFieldValue.h()) == 1) ? CharsKt.g(textFieldValue.i().charAt(0)) : Integer.parseInt(textFieldValue.i());
            if (g2 <= i3) {
                TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.f11521b;
                if (TimePickerSelectionMode.f(i2, companion.a())) {
                    if (g2 != 12 || !A0(timePickerState)) {
                        if (g2 != 12 || A0(timePickerState) || timePickerState.f()) {
                            if (!A0(timePickerState) || timePickerState.f()) {
                                i4 = 0;
                            }
                            i4 += g2;
                        } else {
                            i4 = 0;
                        }
                    }
                    timePickerState.a(i4);
                    if (g2 > 1 && !timePickerState.f()) {
                        timePickerState.d(companion.b());
                    }
                } else {
                    timePickerState.b(g2);
                }
                if (textFieldValue.i().length() > 2) {
                    textFieldValue = TextFieldValue.e(textFieldValue, String.valueOf(textFieldValue.i().charAt(0)), 0, (TextRange) null, 6, (Object) null);
                }
                function1.invoke(textFieldValue);
            }
        } catch (IllegalArgumentException | NumberFormatException unused) {
        }
    }

    public static final void F(Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier2 = modifier;
        int i4 = i2;
        Composer q2 = composer.q(2100674302);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if (q2.E((i3 & 3) != 2, 1 & i3)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2100674302, i3, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1379)");
            }
            int a2 = TextAlign.f19080b.a();
            LineHeightStyle lineHeightStyle = r2;
            LineHeightStyle lineHeightStyle2 = new LineHeightStyle(LineHeightStyle.Alignment.f19061b.a(), LineHeightStyle.Trim.f19071b.a(), (DefaultConstructorMarker) null);
            TextStyle c2 = TextStyle.c((TextStyle) q2.C(TextKt.q()), 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, a2, 0, 0, (TextIndent) null, (PlatformTextStyle) null, lineHeightStyle, 0, 0, (TextMotion) null, 15695871, (Object) null);
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new D7();
                q2.N(g2);
            }
            Modifier a3 = SemanticsModifierKt.a(modifier2, (Function1) g2);
            MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.e(), false);
            int a4 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, a3);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a5 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a5);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, g3, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a4))) {
                b2.N(Integer.valueOf(a4));
                b2.A(Integer.valueOf(a4), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            composer2 = q2;
            TextKt.j(":", (Modifier) null, ColorSchemeKt.k(TimeInputTokens.f14236a.e(), q2, 6), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, c2, composer2, 6, 0, 131066);
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new E7(modifier2, i4));
        }
    }

    public static final Modifier F0(Modifier modifier, boolean z2) {
        return modifier.o0(new VisibleModifier(z2, InspectableValueKt.b() ? new TimePickerKt$visible$$inlined$debugInspectorInfo$1(z2) : InspectableValueKt.a()));
    }

    public static final Unit G(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public static final Unit H(Modifier modifier, int i2, Composer composer, int i3) {
        F(modifier, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final TextFieldValue I(TimePickerState timePickerState) {
        return new TextFieldValue(CalendarLocale_jvmKt.c(y0(timePickerState), 2, 0, false, (Locale) null, 14, (Object) null), 0, (TextRange) null, 6, (DefaultConstructorMarker) null);
    }

    public static final TextFieldValue J(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    public static final void K(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    public static final TextFieldValue L(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    public static final void M(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    public static final TextFieldValue N(TimePickerState timePickerState) {
        return new TextFieldValue(CalendarLocale_jvmKt.c(timePickerState.c(), 2, 0, false, (Locale) null, 14, (Object) null), 0, (TextRange) null, 6, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x051a, code lost:
        if (r5.l(r8) != false) goto L_0x0523;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O(androidx.compose.ui.Modifier r124, androidx.compose.ui.text.input.TextFieldValue r125, kotlin.jvm.functions.Function1 r126, androidx.compose.material3.TimePickerState r127, int r128, androidx.compose.foundation.text.KeyboardOptions r129, androidx.compose.foundation.text.KeyboardActions r130, androidx.compose.material3.TimePickerColors r131, androidx.compose.runtime.Composer r132, int r133, int r134) {
        /*
            r1 = r124
            r0 = r125
            r15 = r127
            r9 = r128
            r14 = r131
            r13 = r133
            r12 = r134
            r22 = 57344(0xe000, float:8.0356E-41)
            r2 = 128(0x80, float:1.794E-43)
            r3 = 16
            r4 = 32
            r5 = 2
            r6 = 4
            r7 = 6
            r8 = 1299172990(0x4d6fce7e, float:2.51455456E8)
            r10 = r132
            androidx.compose.runtime.Composer r10 = r10.q(r8)
            r11 = 1
            r19 = r12 & 1
            if (r19 == 0) goto L_0x002b
            r19 = r13 | 6
            goto L_0x003f
        L_0x002b:
            r19 = r13 & 6
            if (r19 != 0) goto L_0x003d
            boolean r19 = r10.W(r1)
            if (r19 == 0) goto L_0x0038
            r19 = r6
            goto L_0x003a
        L_0x0038:
            r19 = r5
        L_0x003a:
            r19 = r13 | r19
            goto L_0x003f
        L_0x003d:
            r19 = r13
        L_0x003f:
            r5 = r5 & r12
            if (r5 == 0) goto L_0x0047
            r19 = r19 | 48
        L_0x0044:
            r5 = r19
            goto L_0x0057
        L_0x0047:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x0044
            boolean r5 = r10.W(r0)
            if (r5 == 0) goto L_0x0053
            r5 = r4
            goto L_0x0054
        L_0x0053:
            r5 = r3
        L_0x0054:
            r19 = r19 | r5
            goto L_0x0044
        L_0x0057:
            r6 = r6 & r12
            if (r6 == 0) goto L_0x005f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x005c:
            r6 = r126
            goto L_0x0072
        L_0x005f:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005c
            r6 = r126
            boolean r19 = r10.l(r6)
            if (r19 == 0) goto L_0x006e
            r19 = 256(0x100, float:3.59E-43)
            goto L_0x0070
        L_0x006e:
            r19 = r2
        L_0x0070:
            r5 = r5 | r19
        L_0x0072:
            r19 = r12 & 8
            if (r19 == 0) goto L_0x0079
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0092
        L_0x0079:
            r7 = r13 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0092
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 != 0) goto L_0x0086
            boolean r7 = r10.W(r15)
            goto L_0x008a
        L_0x0086:
            boolean r7 = r10.l(r15)
        L_0x008a:
            if (r7 == 0) goto L_0x008f
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0091
        L_0x008f:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0091:
            r5 = r5 | r7
        L_0x0092:
            r3 = r3 & r12
            if (r3 == 0) goto L_0x0098
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0098:
            r3 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00a8
            boolean r3 = r10.i(r9)
            if (r3 == 0) goto L_0x00a5
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r5 = r5 | r3
        L_0x00a8:
            r3 = r12 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00b2
            r5 = r5 | r4
        L_0x00af:
            r4 = r129
            goto L_0x00c4
        L_0x00b2:
            r4 = r4 & r13
            if (r4 != 0) goto L_0x00af
            r4 = r129
            boolean r19 = r10.W(r4)
            if (r19 == 0) goto L_0x00c0
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r5 = r5 | r19
        L_0x00c4:
            r19 = r12 & 64
            r21 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00cf
            r5 = r5 | r21
            r7 = r130
            goto L_0x00e2
        L_0x00cf:
            r21 = r13 & r21
            r7 = r130
            if (r21 != 0) goto L_0x00e2
            boolean r23 = r10.W(r7)
            if (r23 == 0) goto L_0x00de
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r5 = r5 | r23
        L_0x00e2:
            r2 = r2 & r12
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00ea
            r5 = r5 | r23
            goto L_0x00fa
        L_0x00ea:
            r2 = r13 & r23
            if (r2 != 0) goto L_0x00fa
            boolean r2 = r10.W(r14)
            if (r2 == 0) goto L_0x00f7
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r5 = r5 | r2
        L_0x00fa:
            r2 = 4793491(0x492493, float:6.717112E-39)
            r2 = r2 & r5
            r8 = 4793490(0x492492, float:6.71711E-39)
            r13 = 0
            if (r2 == r8) goto L_0x0106
            r2 = r11
            goto L_0x0107
        L_0x0106:
            r2 = r13
        L_0x0107:
            r8 = r5 & 1
            boolean r2 = r10.E(r2, r8)
            if (r2 == 0) goto L_0x0554
            if (r3 == 0) goto L_0x011a
            androidx.compose.foundation.text.KeyboardOptions$Companion r2 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r2 = r2.a()
            r117 = r2
            goto L_0x011c
        L_0x011a:
            r117 = r4
        L_0x011c:
            if (r19 == 0) goto L_0x0127
            androidx.compose.foundation.text.KeyboardActions$Companion r2 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r2 = r2.a()
            r118 = r2
            goto L_0x0129
        L_0x0127:
            r118 = r7
        L_0x0129:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0138
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1866)"
            r4 = 1299172990(0x4d6fce7e, float:2.51455456E8)
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r2, r3)
        L_0x0138:
            java.lang.Object r2 = r10.g()
            androidx.compose.runtime.Composer$Companion r119 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r119.a()
            if (r2 != r3) goto L_0x014b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r10.N(r2)
        L_0x014b:
            r8 = r2
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = (androidx.compose.foundation.interaction.MutableInteractionSource) r8
            java.lang.Object r2 = r10.g()
            java.lang.Object r3 = r119.a()
            if (r2 != r3) goto L_0x0160
            androidx.compose.ui.focus.FocusRequester r2 = new androidx.compose.ui.focus.FocusRequester
            r2.<init>()
            r10.N(r2)
        L_0x0160:
            r7 = r2
            androidx.compose.ui.focus.FocusRequester r7 = (androidx.compose.ui.focus.FocusRequester) r7
            androidx.compose.material3.OutlinedTextFieldDefaults r23 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            long r32 = r14.b(r11)
            long r34 = r14.b(r11)
            long r24 = r14.c(r11)
            r115 = 2147483598(0x7fffffce, float:NaN)
            r116 = 4095(0xfff, float:5.738E-42)
            r26 = 0
            r28 = 0
            r30 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r59 = 0
            r61 = 0
            r63 = 0
            r65 = 0
            r67 = 0
            r69 = 0
            r71 = 0
            r73 = 0
            r75 = 0
            r77 = 0
            r79 = 0
            r81 = 0
            r83 = 0
            r85 = 0
            r87 = 0
            r89 = 0
            r91 = 0
            r93 = 0
            r95 = 0
            r97 = 0
            r99 = 0
            r101 = 0
            r103 = 0
            r105 = 0
            r107 = 0
            r110 = 0
            r111 = 0
            r112 = 0
            r113 = 0
            r114 = 3072(0xc00, float:4.305E-42)
            r109 = r10
            androidx.compose.material3.TextFieldColors r4 = r23.h(r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95, r97, r99, r101, r103, r105, r107, r109, r110, r111, r112, r113, r114, r115, r116)
            int r2 = r127.e()
            boolean r3 = androidx.compose.material3.TimePickerSelectionMode.f(r9, r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r19 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r11 = r19.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r11, r10, r13)
            int r11 = androidx.compose.runtime.ComposablesKt.a(r10, r13)
            androidx.compose.runtime.CompositionLocalMap r13 = r10.I()
            r129 = r4
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r10, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r25 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r1 = r25.a()
            androidx.compose.runtime.Applier r26 = r10.v()
            if (r26 != 0) goto L_0x020b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x020b:
            r10.s()
            boolean r26 = r10.n()
            if (r26 == 0) goto L_0x0218
            r10.y(r1)
            goto L_0x021b
        L_0x0218:
            r10.K()
        L_0x021b:
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r6 = r25.c()
            androidx.compose.runtime.Updater.g(r1, r2, r6)
            kotlin.jvm.functions.Function2 r2 = r25.e()
            androidx.compose.runtime.Updater.g(r1, r13, r2)
            kotlin.jvm.functions.Function2 r2 = r25.b()
            boolean r6 = r1.n()
            if (r6 != 0) goto L_0x0245
            java.lang.Object r6 = r1.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r13)
            if (r6 != 0) goto L_0x0253
        L_0x0245:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r1.N(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r1.A(r6, r2)
        L_0x0253:
            kotlin.jvm.functions.Function2 r2 = r25.d()
            androidx.compose.runtime.Updater.g(r1, r4, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            if (r3 != 0) goto L_0x02b3
            r1 = 2023424468(0x789b01d4, float:2.5151347E34)
            r10.X(r1)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material3.tokens.TimeInputTokens r2 = androidx.compose.material3.tokens.TimeInputTokens.f14236a
            float r4 = r2.d()
            float r2 = r2.b()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.v(r1, r4, r2)
            androidx.compose.material3.TimePickerSelectionMode$Companion r1 = androidx.compose.material3.TimePickerSelectionMode.f11521b
            int r1 = r1.a()
            boolean r1 = androidx.compose.material3.TimePickerSelectionMode.f(r9, r1)
            if (r1 == 0) goto L_0x0285
            int r1 = y0(r127)
            goto L_0x0289
        L_0x0285:
            int r1 = r127.c()
        L_0x0289:
            int r4 = r5 >> 3
            r6 = r4 & 896(0x380, float:1.256E-42)
            r11 = 6
            r6 = r6 | r11
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r6
            int r6 = r5 >> 9
            r6 = r6 & r22
            r13 = r4 | r6
            r6 = r3
            r3 = r1
            r1 = r129
            r4 = r127
            r14 = r5
            r5 = r128
            r11 = r6
            r6 = r131
            r12 = r7
            r15 = 6
            r7 = r10
            r120 = r8
            r129 = 0
            r8 = r13
            S(r2, r3, r4, r5, r6, r7, r8)
            r10.M()
            goto L_0x02c6
        L_0x02b3:
            r1 = r129
            r11 = r3
            r14 = r5
            r12 = r7
            r120 = r8
            r129 = 0
            r15 = 6
            r2 = 2023879982(0x78a1f52e, float:2.6279145E34)
            r10.X(r2)
            r10.M()
        L_0x02c6:
            androidx.compose.material3.TimePickerSelectionMode$Companion r26 = androidx.compose.material3.TimePickerSelectionMode.f11521b
            int r2 = r26.b()
            boolean r2 = androidx.compose.material3.TimePickerSelectionMode.f(r9, r2)
            if (r2 == 0) goto L_0x02dc
            androidx.compose.material3.internal.Strings$Companion r2 = androidx.compose.material3.internal.Strings.f12320b
            int r2 = androidx.compose.material3.R.string.Z
            int r2 = androidx.compose.material3.internal.Strings.a(r2)
        L_0x02da:
            r3 = 0
            goto L_0x02e5
        L_0x02dc:
            androidx.compose.material3.internal.Strings$Companion r2 = androidx.compose.material3.internal.Strings.f12320b
            int r2 = androidx.compose.material3.R.string.V
            int r2 = androidx.compose.material3.internal.Strings.a(r2)
            goto L_0x02da
        L_0x02e5:
            java.lang.String r2 = androidx.compose.material3.internal.Strings_androidKt.b(r2, r10, r3)
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r4 = F0(r8, r11)
            androidx.compose.ui.Alignment r5 = r19.o()
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.BoxKt.g(r5, r3)
            int r6 = androidx.compose.runtime.ComposablesKt.a(r10, r3)
            androidx.compose.runtime.CompositionLocalMap r3 = r10.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r10, r4)
            kotlin.jvm.functions.Function0 r7 = r25.a()
            androidx.compose.runtime.Applier r11 = r10.v()
            if (r11 != 0) goto L_0x0310
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0310:
            r10.s()
            boolean r11 = r10.n()
            if (r11 == 0) goto L_0x031d
            r10.y(r7)
            goto L_0x0320
        L_0x031d:
            r10.K()
        L_0x0320:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r11 = r25.c()
            androidx.compose.runtime.Updater.g(r7, r5, r11)
            kotlin.jvm.functions.Function2 r5 = r25.e()
            androidx.compose.runtime.Updater.g(r7, r3, r5)
            kotlin.jvm.functions.Function2 r3 = r25.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x034a
            java.lang.Object r5 = r7.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r11)
            if (r5 != 0) goto L_0x0358
        L_0x034a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r7.N(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r7.A(r5, r3)
        L_0x0358:
            kotlin.jvm.functions.Function2 r3 = r25.d()
            androidx.compose.runtime.Updater.g(r7, r4, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.focus.FocusRequesterModifierKt.a(r8, r12)
            androidx.compose.material3.tokens.TimeInputTokens r27 = androidx.compose.material3.tokens.TimeInputTokens.f14236a
            float r4 = r27.d()
            float r5 = r27.b()
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.v(r3, r4, r5)
            boolean r4 = r10.W(r2)
            java.lang.Object r5 = r10.g()
            if (r4 != 0) goto L_0x0383
            java.lang.Object r4 = r119.a()
            if (r5 != r4) goto L_0x038b
        L_0x0383:
            androidx.compose.material3.F7 r5 = new androidx.compose.material3.F7
            r5.<init>(r2)
            r10.N(r5)
        L_0x038b:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r2 = 0
            r4 = 1
            r13 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r3, r13, r5, r4, r2)
            r4 = r3
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material3.TextKt.q()
            java.lang.Object r3 = r10.C(r3)
            r7 = r3
            androidx.compose.ui.text.TextStyle r7 = (androidx.compose.ui.text.TextStyle) r7
            androidx.compose.ui.graphics.Brush$Companion r28 = androidx.compose.ui.graphics.Brush.f15962b
            java.lang.Float r3 = java.lang.Float.valueOf(r129)
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.f15975b
            long r19 = r5.e()
            androidx.compose.ui.graphics.Color r6 = androidx.compose.ui.graphics.Color.h(r19)
            kotlin.Pair r29 = kotlin.TuplesKt.a(r3, r6)
            r3 = 1036831949(0x3dcccccd, float:0.1)
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            long r18 = r5.e()
            androidx.compose.ui.graphics.Color r11 = androidx.compose.ui.graphics.Color.h(r18)
            kotlin.Pair r30 = kotlin.TuplesKt.a(r6, r11)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.material3.MaterialTheme r6 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.ColorScheme r11 = r6.a(r10, r15)
            long r18 = r11.N()
            androidx.compose.ui.graphics.Color r11 = androidx.compose.ui.graphics.Color.h(r18)
            kotlin.Pair r31 = kotlin.TuplesKt.a(r3, r11)
            r3 = 1063675494(0x3f666666, float:0.9)
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            androidx.compose.material3.ColorScheme r6 = r6.a(r10, r15)
            long r16 = r6.N()
            androidx.compose.ui.graphics.Color r6 = androidx.compose.ui.graphics.Color.h(r16)
            kotlin.Pair r32 = kotlin.TuplesKt.a(r11, r6)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            long r16 = r5.e()
            androidx.compose.ui.graphics.Color r6 = androidx.compose.ui.graphics.Color.h(r16)
            kotlin.Pair r33 = kotlin.TuplesKt.a(r3, r6)
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            long r5 = r5.e()
            androidx.compose.ui.graphics.Color r5 = androidx.compose.ui.graphics.Color.h(r5)
            kotlin.Pair r34 = kotlin.TuplesKt.a(r3, r5)
            kotlin.Pair[] r29 = new kotlin.Pair[]{r29, r30, r31, r32, r33, r34}
            r33 = 14
            r34 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            androidx.compose.ui.graphics.Brush r16 = androidx.compose.ui.graphics.Brush.Companion.f(r28, r29, r30, r31, r32, r33, r34)
            androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2 r3 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
            r11 = r120
            r3.<init>(r0, r11, r1)
            r1 = 54
            r5 = 1007938103(0x3c13ea37, float:0.009028009)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r6, r3, r10, r1)
            int r1 = r14 >> 3
            r3 = r1 & 14
            r5 = 100666368(0x6000c00, float:2.408294E-35)
            r3 = r3 | r5
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            int r3 = r14 << 3
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r3
            r1 = r1 | r5
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r5
            r19 = r1 | r3
            r20 = 199680(0x30c00, float:2.79811E-40)
            r21 = 7696(0x1e10, float:1.0784E-41)
            r5 = 1
            r1 = 0
            r3 = r6
            r6 = r1
            r1 = 1
            r132 = r10
            r10 = r1
            r1 = 0
            r18 = r11
            r11 = r1
            r121 = r12
            r12 = r1
            r1 = 0
            r13 = r1
            r122 = r14
            r14 = r1
            r1 = r2
            r2 = r125
            r3 = r126
            r123 = r8
            r8 = r117
            r9 = r118
            r15 = r18
            r18 = r132
            androidx.compose.foundation.text.BasicTextFieldKt.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r132.T()
            float r2 = f11473f
            r5 = r129
            r4 = r123
            r3 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.OffsetKt.c(r4, r5, r2, r3, r1)
            java.lang.Object r4 = r132.g()
            java.lang.Object r5 = r119.a()
            if (r4 != r5) goto L_0x049d
            androidx.compose.material3.G7 r4 = new androidx.compose.material3.G7
            r4.<init>()
            r5 = r132
            r5.N(r4)
            goto L_0x049f
        L_0x049d:
            r5 = r132
        L_0x049f:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.ui.Modifier r24 = androidx.compose.ui.semantics.SemanticsModifierKt.a(r2, r4)
            int r2 = r26.a()
            r6 = r128
            boolean r2 = androidx.compose.material3.TimePickerSelectionMode.f(r6, r2)
            if (r2 == 0) goto L_0x04b9
            int r2 = androidx.compose.material3.R.string.R
            int r2 = androidx.compose.material3.internal.Strings.a(r2)
        L_0x04b7:
            r4 = 0
            goto L_0x04c0
        L_0x04b9:
            int r2 = androidx.compose.material3.R.string.W
            int r2 = androidx.compose.material3.internal.Strings.a(r2)
            goto L_0x04b7
        L_0x04c0:
            java.lang.String r23 = androidx.compose.material3.internal.Strings_androidKt.b(r2, r5, r4)
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r2 = r27.f()
            r7 = 6
            long r25 = androidx.compose.material3.ColorSchemeKt.k(r2, r5, r7)
            androidx.compose.material3.tokens.TypographyKeyTokens r2 = r27.g()
            androidx.compose.ui.text.TextStyle r44 = androidx.compose.material3.TypographyKt.e(r2, r5, r7)
            r47 = 0
            r48 = 131064(0x1fff8, float:1.8366E-40)
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r46 = 0
            r45 = r5
            androidx.compose.material3.TextKt.j(r23, r24, r25, r27, r28, r30, r31, r32, r33, r35, r36, r37, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r5.T()
            int r2 = r127.e()
            androidx.compose.material3.TimePickerSelectionMode r2 = androidx.compose.material3.TimePickerSelectionMode.c(r2)
            r7 = r122
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 == r9) goto L_0x0521
            r8 = r7 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x051d
            r8 = r127
            boolean r9 = r5.l(r8)
            if (r9 == 0) goto L_0x051f
            goto L_0x0523
        L_0x051d:
            r8 = r127
        L_0x051f:
            r11 = r4
            goto L_0x0524
        L_0x0521:
            r8 = r127
        L_0x0523:
            r11 = r3
        L_0x0524:
            r7 = r7 & r22
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r9) goto L_0x052b
            goto L_0x052c
        L_0x052b:
            r3 = r4
        L_0x052c:
            r3 = r3 | r11
            java.lang.Object r7 = r5.g()
            if (r3 != 0) goto L_0x0539
            java.lang.Object r3 = r119.a()
            if (r7 != r3) goto L_0x0543
        L_0x0539:
            androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1 r7 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1
            r3 = r121
            r7.<init>(r8, r6, r3, r1)
            r5.N(r7)
        L_0x0543:
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            androidx.compose.runtime.EffectsKt.g(r2, r7, r5, r4)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0551
            androidx.compose.runtime.ComposerKt.X()
        L_0x0551:
            r7 = r118
            goto L_0x055c
        L_0x0554:
            r6 = r9
            r5 = r10
            r8 = r15
            r5.B()
            r117 = r4
        L_0x055c:
            androidx.compose.runtime.ScopeUpdateScope r11 = r5.x()
            if (r11 == 0) goto L_0x057d
            androidx.compose.material3.H7 r12 = new androidx.compose.material3.H7
            r0 = r12
            r1 = r124
            r2 = r125
            r3 = r126
            r4 = r127
            r5 = r128
            r6 = r117
            r8 = r131
            r9 = r133
            r10 = r134
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x057d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.O(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit P(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final Unit Q(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public static final Unit R(Modifier modifier, TextFieldValue textFieldValue, Function1 function1, TimePickerState timePickerState, int i2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, int i3, int i4, Composer composer, int i5) {
        O(modifier, textFieldValue, function1, timePickerState, i2, keyboardOptions, keyboardActions, timePickerColors, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void S(androidx.compose.ui.Modifier r31, int r32, androidx.compose.material3.TimePickerState r33, int r34, androidx.compose.material3.TimePickerColors r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            r1 = r31
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r37
            r0 = 1
            r2 = -1148055889(0xffffffffbb920eaf, float:-0.004457317)
            r3 = r36
            androidx.compose.runtime.Composer r14 = r3.q(r2)
            r3 = 6
            r4 = r11 & 6
            if (r4 != 0) goto L_0x0024
            boolean r4 = r14.W(r1)
            if (r4 == 0) goto L_0x0021
            r4 = 4
            goto L_0x0022
        L_0x0021:
            r4 = 2
        L_0x0022:
            r4 = r4 | r11
            goto L_0x0025
        L_0x0024:
            r4 = r11
        L_0x0025:
            r5 = r11 & 48
            r12 = r32
            if (r5 != 0) goto L_0x0037
            boolean r5 = r14.i(r12)
            if (r5 == 0) goto L_0x0034
            r5 = 32
            goto L_0x0036
        L_0x0034:
            r5 = 16
        L_0x0036:
            r4 = r4 | r5
        L_0x0037:
            r5 = r11 & 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x0051
            r5 = r11 & 512(0x200, float:7.175E-43)
            if (r5 != 0) goto L_0x0046
            boolean r5 = r14.W(r8)
            goto L_0x004a
        L_0x0046:
            boolean r5 = r14.l(r8)
        L_0x004a:
            if (r5 == 0) goto L_0x004e
            r5 = r6
            goto L_0x0050
        L_0x004e:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r4 = r4 | r5
        L_0x0051:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0062
            boolean r5 = r14.i(r9)
            if (r5 == 0) goto L_0x005f
            r5 = r7
            goto L_0x0061
        L_0x005f:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0061:
            r4 = r4 | r5
        L_0x0062:
            r5 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0072
            boolean r5 = r14.W(r10)
            if (r5 == 0) goto L_0x006f
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0071
        L_0x006f:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0071:
            r4 = r4 | r5
        L_0x0072:
            r5 = r4 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            r15 = 0
            if (r5 == r13) goto L_0x007b
            r5 = r0
            goto L_0x007c
        L_0x007b:
            r5 = r15
        L_0x007c:
            r13 = r4 & 1
            boolean r5 = r14.E(r5, r13)
            if (r5 == 0) goto L_0x015e
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0090
            r5 = -1
            java.lang.String r13 = "androidx.compose.material3.TimeSelector (TimePicker.kt:1403)"
            androidx.compose.runtime.ComposerKt.Y(r2, r4, r5, r13)
        L_0x0090:
            int r2 = r33.e()
            boolean r5 = androidx.compose.material3.TimePickerSelectionMode.f(r2, r9)
            androidx.compose.material3.TimePickerSelectionMode$Companion r2 = androidx.compose.material3.TimePickerSelectionMode.f11521b
            int r2 = r2.a()
            boolean r2 = androidx.compose.material3.TimePickerSelectionMode.f(r9, r2)
            if (r2 == 0) goto L_0x00ad
            androidx.compose.material3.internal.Strings$Companion r2 = androidx.compose.material3.internal.Strings.f12320b
            int r2 = androidx.compose.material3.R.string.T
            int r2 = androidx.compose.material3.internal.Strings.a(r2)
            goto L_0x00b5
        L_0x00ad:
            androidx.compose.material3.internal.Strings$Companion r2 = androidx.compose.material3.internal.Strings.f12320b
            int r2 = androidx.compose.material3.R.string.X
            int r2 = androidx.compose.material3.internal.Strings.a(r2)
        L_0x00b5:
            java.lang.String r2 = androidx.compose.material3.internal.Strings_androidKt.b(r2, r14, r15)
            long r17 = r10.b(r5)
            long r19 = r10.c(r5)
            boolean r13 = r14.W(r2)
            java.lang.Object r15 = r14.g()
            if (r13 != 0) goto L_0x00d3
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r15 != r13) goto L_0x00db
        L_0x00d3:
            androidx.compose.material3.v7 r15 = new androidx.compose.material3.v7
            r15.<init>(r2)
            r14.N(r15)
        L_0x00db:
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r1, r0, r15)
            androidx.compose.material3.tokens.TimePickerTokens r2 = androidx.compose.material3.tokens.TimePickerTokens.f14264a
            androidx.compose.material3.tokens.ShapeKeyTokens r2 = r2.g()
            androidx.compose.ui.graphics.Shape r26 = androidx.compose.material3.ShapesKt.g(r2, r14, r3)
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != r7) goto L_0x00f1
            r2 = r0
            goto L_0x00f2
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            r3 = r4 & 896(0x380, float:1.256E-42)
            if (r3 == r6) goto L_0x0103
            r3 = r4 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0101
            boolean r3 = r14.l(r8)
            if (r3 == 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r15 = 0
            goto L_0x0104
        L_0x0103:
            r15 = r0
        L_0x0104:
            r2 = r2 | r15
            java.lang.Object r3 = r14.g()
            if (r2 != 0) goto L_0x0113
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x011b
        L_0x0113:
            androidx.compose.material3.B7 r3 = new androidx.compose.material3.B7
            r3.<init>(r9, r8)
            r14.N(r3)
        L_0x011b:
            r13 = r3
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            androidx.compose.material3.TimePickerKt$TimeSelector$3 r15 = new androidx.compose.material3.TimePickerKt$TimeSelector$3
            r2 = r15
            r3 = r34
            r4 = r33
            r30 = r5
            r5 = r32
            r6 = r19
            r2.<init>(r3, r4, r5, r6)
            r2 = 54
            r3 = -1477282471(0xffffffffa7f27559, float:-6.729572E-15)
            androidx.compose.runtime.internal.ComposableLambda r25 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r0, r15, r14, r2)
            r28 = 48
            r29 = 1992(0x7c8, float:2.791E-42)
            r15 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r12 = r30
            r0 = r14
            r14 = r16
            r16 = r26
            r26 = r0
            androidx.compose.material3.SurfaceKt.d(r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0162
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0162
        L_0x015e:
            r0 = r14
            r0.B()
        L_0x0162:
            androidx.compose.runtime.ScopeUpdateScope r7 = r0.x()
            if (r7 == 0) goto L_0x017d
            androidx.compose.material3.C7 r12 = new androidx.compose.material3.C7
            r0 = r12
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r12)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.S(androidx.compose.ui.Modifier, int, androidx.compose.material3.TimePickerState, int, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit T(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.f());
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final Unit U(int i2, TimePickerState timePickerState) {
        if (!TimePickerSelectionMode.f(i2, timePickerState.e())) {
            timePickerState.d(i2);
        }
        return Unit.f40552a;
    }

    public static final Unit V(Modifier modifier, int i2, TimePickerState timePickerState, int i3, TimePickerColors timePickerColors, int i4, Composer composer, int i5) {
        S(modifier, i2, timePickerState, i3, timePickerColors, composer, RecomposeScopeImplKt.a(i4 | 1));
        return Unit.f40552a;
    }

    public static final void p(Modifier modifier, float f2, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1041042571);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.h(f2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(function2) ? 256 : 128;
        }
        boolean z2 = true;
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1041042571, i4, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1978)");
            }
            if ((i4 & 112) != 32) {
                z2 = false;
            }
            Object g2 = q2.g();
            if (z2 || g2 == Composer.f14567a.a()) {
                g2 = new TimePickerKt$CircularLayout$1$1(f2);
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            int i6 = ((i4 >> 6) & 14) | ((i4 << 3) & 112);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            int i7 = ((i6 << 6) & 896) | 6;
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, measurePolicy, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            function2.m(q2, Integer.valueOf((i7 >> 6) & 14));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0305z7(modifier2, f2, function2, i2, i3));
        }
    }

    public static final Unit q(Modifier modifier, float f2, Function2 function2, int i2, int i3, Composer composer, int i4) {
        p(modifier, f2, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: androidx.compose.runtime.State} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(androidx.compose.ui.Modifier r43, androidx.compose.material3.AnalogTimePickerState r44, int r45, boolean r46, androidx.compose.runtime.Composer r47, int r48) {
        /*
            r1 = r43
            r10 = r44
            r11 = r45
            r12 = r48
            r0 = 1
            r2 = -206784607(0xfffffffff3acb7a1, float:-2.7368149E31)
            r3 = r47
            androidx.compose.runtime.Composer r13 = r3.q(r2)
            r3 = 6
            r4 = r12 & 6
            r5 = 2
            if (r4 != 0) goto L_0x0023
            boolean r4 = r13.W(r1)
            if (r4 == 0) goto L_0x0020
            r4 = 4
            goto L_0x0021
        L_0x0020:
            r4 = r5
        L_0x0021:
            r4 = r4 | r12
            goto L_0x0024
        L_0x0023:
            r4 = r12
        L_0x0024:
            r6 = r12 & 48
            if (r6 != 0) goto L_0x0034
            boolean r6 = r13.l(r10)
            if (r6 == 0) goto L_0x0031
            r6 = 32
            goto L_0x0033
        L_0x0031:
            r6 = 16
        L_0x0033:
            r4 = r4 | r6
        L_0x0034:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0044
            boolean r6 = r13.i(r11)
            if (r6 == 0) goto L_0x0041
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r4 = r4 | r6
        L_0x0044:
            r6 = r12 & 3072(0xc00, float:4.305E-42)
            r15 = r46
            if (r6 != 0) goto L_0x0056
            boolean r6 = r13.d(r15)
            if (r6 == 0) goto L_0x0053
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r4 = r4 | r6
        L_0x0056:
            r14 = r4
            r4 = r14 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r4 == r6) goto L_0x005f
            r4 = r0
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            r6 = r14 & 1
            boolean r4 = r13.E(r4, r6)
            if (r4 == 0) goto L_0x02a3
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0074
            r4 = -1
            java.lang.String r6 = "androidx.compose.material3.ClockText (TimePicker.kt:1727)"
            androidx.compose.runtime.ComposerKt.Y(r2, r14, r4, r6)
        L_0x0074:
            androidx.compose.material3.tokens.TimePickerTokens r2 = androidx.compose.material3.tokens.TimePickerTokens.f14264a
            androidx.compose.material3.tokens.TypographyKeyTokens r2 = r2.b()
            androidx.compose.ui.text.TextStyle r34 = androidx.compose.material3.TypographyKt.e(r2, r13, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r13.C(r2)
            r7 = r2
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            float r2 = f11475h
            float r6 = r7.B1(r2)
            java.lang.Object r2 = r13.g()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r16.a()
            r4 = 0
            if (r2 != r3) goto L_0x00ad
            androidx.compose.ui.geometry.Offset$Companion r2 = androidx.compose.ui.geometry.Offset.f15855b
            long r2 = r2.c()
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.d(r2)
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r2, r4, r5, r4)
            r13.N(r2)
        L_0x00ad:
            r3 = r2
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            java.lang.Object r2 = r13.g()
            java.lang.Object r8 = r16.a()
            if (r2 != r8) goto L_0x00cb
            androidx.compose.ui.unit.IntOffset$Companion r2 = androidx.compose.ui.unit.IntOffset.f19160b
            long r17 = r2.b()
            androidx.compose.ui.unit.IntOffset r2 = androidx.compose.ui.unit.IntOffset.c(r17)
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r2, r4, r5, r4)
            r13.N(r2)
        L_0x00cb:
            r8 = r2
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            java.lang.Object r2 = r13.g()
            java.lang.Object r0 = r16.a()
            if (r2 != r0) goto L_0x00e5
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r0 = r0.a()
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r0, r4, r5, r4)
            r13.N(r2)
        L_0x00e5:
            r0 = r2
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            java.lang.Object r2 = r13.g()
            java.lang.Object r5 = r16.a()
            if (r2 != r5) goto L_0x00fb
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.j(r2, r13)
            r13.N(r2)
        L_0x00fb:
            r5 = r2
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            int r2 = r44.e()
            boolean r4 = r44.f()
            r9 = r14 & 896(0x380, float:1.256E-42)
            java.lang.String r9 = C0(r2, r4, r11, r13, r9)
            r20 = 15
            r21 = 0
            r4 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r2 = r45
            r39 = r3
            r3 = r4
            r4 = r22
            r40 = r5
            r5 = r23
            r41 = r6
            r6 = r24
            r42 = r7
            r7 = r20
            r11 = r8
            r8 = r21
            java.lang.String r35 = androidx.compose.material3.CalendarLocale_jvmKt.c(r2, r3, r4, r5, r6, r7, r8)
            boolean r2 = r13.W(r10)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x0141
            java.lang.Object r2 = r16.a()
            if (r3 != r2) goto L_0x014f
        L_0x0141:
            androidx.compose.material3.I7 r2 = new androidx.compose.material3.I7
            r3 = r42
            r2.<init>(r10, r3, r0)
            androidx.compose.runtime.State r3 = androidx.compose.runtime.SnapshotStateKt.e(r2)
            r13.N(r3)
        L_0x014f:
            r8 = r3
            androidx.compose.runtime.State r8 = (androidx.compose.runtime.State) r8
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r7 = r2.e()
            java.lang.Object r2 = r13.g()
            java.lang.Object r3 = r16.a()
            if (r2 != r3) goto L_0x016d
            androidx.compose.material3.J7 r2 = new androidx.compose.material3.J7
            r6 = r39
            r2.<init>(r11, r0, r6)
            r13.N(r2)
            goto L_0x016f
        L_0x016d:
            r6 = r39
        L_0x016f:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r1, r2)
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.InteractiveComponentSizeKt.h(r0)
            float r2 = f11476i
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.t(r0, r2)
            r2 = 3
            r3 = 0
            r4 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.FocusableKt.b(r0, r3, r4, r2, r4)
            r3 = r40
            boolean r2 = r13.l(r3)
            boolean r4 = r13.l(r10)
            r2 = r2 | r4
            r5 = r41
            boolean r4 = r13.h(r5)
            r2 = r2 | r4
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            r14 = 2048(0x800, float:2.87E-42)
            if (r4 != r14) goto L_0x01a0
            r4 = 1
            goto L_0x01a1
        L_0x01a0:
            r4 = 0
        L_0x01a1:
            r2 = r2 | r4
            boolean r4 = r13.W(r8)
            r2 = r2 | r4
            java.lang.Object r4 = r13.g()
            if (r2 != 0) goto L_0x01b7
            java.lang.Object r2 = r16.a()
            if (r4 != r2) goto L_0x01b4
            goto L_0x01b7
        L_0x01b4:
            r1 = r7
            r11 = r9
            goto L_0x01d0
        L_0x01b7:
            androidx.compose.material3.w7 r14 = new androidx.compose.material3.w7
            r2 = r14
            r4 = r44
            r18 = r6
            r6 = r46
            r1 = r7
            r7 = r18
            r18 = r8
            r8 = r11
            r11 = r9
            r9 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r13.N(r14)
            r4 = r14
        L_0x01d0:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r2 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r0, r2, r4)
            r2 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r2)
            int r2 = androidx.compose.runtime.ComposablesKt.a(r13, r2)
            androidx.compose.runtime.CompositionLocalMap r3 = r13.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r13, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r6 = r13.v()
            if (r6 != 0) goto L_0x01f7
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01f7:
            r13.s()
            boolean r6 = r13.n()
            if (r6 == 0) goto L_0x0204
            r13.y(r5)
            goto L_0x0207
        L_0x0204:
            r13.K()
        L_0x0207:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r13)
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r3, r1)
            kotlin.jvm.functions.Function2 r1 = r4.b()
            boolean r3 = r5.n()
            if (r3 != 0) goto L_0x0231
            java.lang.Object r3 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r6)
            if (r3 != 0) goto L_0x023f
        L_0x0231:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.N(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.A(r2, r1)
        L_0x023f:
            kotlin.jvm.functions.Function2 r1 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            boolean r1 = r13.W(r11)
            java.lang.Object r2 = r13.g()
            if (r1 != 0) goto L_0x025a
            java.lang.Object r1 = r16.a()
            if (r2 != r1) goto L_0x0262
        L_0x025a:
            androidx.compose.material3.x7 r2 = new androidx.compose.material3.x7
            r2.<init>(r11)
            r13.N(r2)
        L_0x0262:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.semantics.SemanticsModifierKt.a(r0, r2)
            r37 = 0
            r38 = 131068(0x1fffc, float:1.83665E-40)
            r0 = 0
            r15 = r0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r36 = 0
            r0 = r13
            r13 = r35
            r35 = r0
            androidx.compose.material3.TextKt.j(r13, r14, r15, r17, r18, r20, r21, r22, r23, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r0.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x02a7
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x02a7
        L_0x02a3:
            r0 = r13
            r0.B()
        L_0x02a7:
            androidx.compose.runtime.ScopeUpdateScope r6 = r0.x()
            if (r6 == 0) goto L_0x02c0
            androidx.compose.material3.y7 r7 = new androidx.compose.material3.y7
            r0 = r7
            r1 = r43
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r48
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.r(androidx.compose.ui.Modifier, androidx.compose.material3.AnalogTimePickerState, int, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final long s(MutableState mutableState) {
        return ((Offset) mutableState.getValue()).t();
    }

    public static final void t(MutableState mutableState, long j2) {
        mutableState.setValue(Offset.d(j2));
    }

    public static final long u(MutableState mutableState) {
        return ((IntOffset) mutableState.getValue()).r();
    }

    public static final void v(MutableState mutableState, long j2) {
        mutableState.setValue(IntOffset.c(j2));
    }

    public static final float v0(float f2, float f3) {
        float atan2 = ((float) Math.atan2((double) f2, (double) f3)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + 6.2831855f : atan2;
    }

    public static final Rect w(MutableState mutableState) {
        return (Rect) mutableState.getValue();
    }

    public static final float w0(float f2, float f3, int i2, int i3) {
        return (float) Math.hypot((double) (((float) i2) - f2), (double) (((float) i3) - f3));
    }

    public static final void x(MutableState mutableState, Rect rect) {
        mutableState.setValue(rect);
    }

    public static final float x0() {
        return f11484q;
    }

    public static final boolean y(AnalogTimePickerState analogTimePickerState, Density density, MutableState mutableState) {
        long z0 = z0(analogTimePickerState);
        float B1 = density.B1(DpOffset.f(z0));
        float B12 = density.B1(DpOffset.g(z0));
        long floatToRawIntBits = (long) Float.floatToRawIntBits(B1);
        return w(mutableState).f(Offset.e((((long) Float.floatToRawIntBits(B12)) & 4294967295L) | (floatToRawIntBits << 32)));
    }

    public static final int y0(TimePickerState timePickerState) {
        if (timePickerState.f()) {
            return timePickerState.g() % 24;
        }
        if (timePickerState.g() % 12 == 0) {
            return 12;
        }
        return A0(timePickerState) ? timePickerState.g() - 12 : timePickerState.g();
    }

    public static final boolean z(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final long z0(AnalogTimePickerState analogTimePickerState) {
        float t2 = analogTimePickerState.t();
        TimePickerTokens timePickerTokens = TimePickerTokens.f14264a;
        float m2 = Dp.m(Dp.m(timePickerTokens.c() / 2.0f) * (t2 / timePickerTokens.a()));
        float m3 = Dp.m(((Dp) RangesKt.g(Dp.j(Dp.m(((!analogTimePickerState.f() || !A0(analogTimePickerState) || !TimePickerSelectionMode.f(analogTimePickerState.e(), TimePickerSelectionMode.f11521b.a())) ? Dp.m(analogTimePickerState.t() * f11468a) : Dp.m(analogTimePickerState.t() * f11469b)) - m2)), Dp.j(Dp.m((float) 0)))).t() + m2);
        float f2 = (float) 2;
        return DpOffset.c((((long) Float.floatToRawIntBits(Dp.m(Dp.m(((float) Math.cos((double) analogTimePickerState.s())) * m3) + Dp.m(analogTimePickerState.t() / f2)))) << 32) | (((long) Float.floatToRawIntBits(Dp.m(Dp.m(m3 * ((float) Math.sin((double) analogTimePickerState.s()))) + Dp.m(analogTimePickerState.t() / f2)))) & 4294967295L));
    }
}
