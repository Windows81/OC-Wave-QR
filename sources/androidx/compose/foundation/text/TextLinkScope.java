package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata
public final class TextLinkScope {

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f5981a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f5982b = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public AnnotatedString f5983c;

    /* renamed from: d  reason: collision with root package name */
    public final SnapshotStateList f5984d;

    public TextLinkScope(AnnotatedString annotatedString) {
        this.f5981a = annotatedString;
        this.f5983c = annotatedString.a(AnonymousClass1.f5987z);
        this.f5984d = SnapshotStateKt.f();
    }

    public static final TextRangeLayoutMeasureResult u(TextLinkScope textLinkScope, AnnotatedString.Range range, TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLayoutResult n2 = textLinkScope.n();
        if (n2 == null) {
            return textRangeLayoutMeasureScope.a(0, 0, TextLinkScope$textRange$1$layoutResult$1.f6007z);
        }
        AnnotatedString.Range j2 = textLinkScope.j(range, n2);
        if (j2 == null) {
            return textRangeLayoutMeasureScope.a(0, 0, TextLinkScope$textRange$1$updatedRange$1.f6008z);
        }
        IntRect b2 = IntRectKt.b(n2.z(j2.h(), j2.f()).getBounds());
        return textRangeLayoutMeasureScope.a(b2.l(), b2.f(), new TextLinkScope$textRange$1$1(b2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.runtime.Composer r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            r2 = 1154651354(0x44d294da, float:1684.6516)
            r3 = r29
            androidx.compose.runtime.Composer r3 = r3.q(r2)
            r4 = r1 & 6
            r5 = 2
            if (r4 != 0) goto L_0x001d
            boolean r4 = r3.l(r0)
            if (r4 == 0) goto L_0x001a
            r4 = 4
            goto L_0x001b
        L_0x001a:
            r4 = r5
        L_0x001b:
            r4 = r4 | r1
            goto L_0x001e
        L_0x001d:
            r4 = r1
        L_0x001e:
            r6 = r4 & 3
            r7 = 1
            r8 = 0
            if (r6 == r5) goto L_0x0026
            r6 = r7
            goto L_0x0027
        L_0x0026:
            r6 = r8
        L_0x0027:
            r9 = r4 & 1
            boolean r6 = r3.E(r6, r9)
            if (r6 == 0) goto L_0x01ef
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x003b
            r6 = -1
            java.lang.String r9 = "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)"
            androidx.compose.runtime.ComposerKt.Y(r2, r4, r6, r9)
        L_0x003b:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.s()
            java.lang.Object r2 = r3.C(r2)
            androidx.compose.ui.platform.UriHandler r2 = (androidx.compose.ui.platform.UriHandler) r2
            androidx.compose.ui.text.AnnotatedString r6 = r0.f5983c
            int r9 = r6.length()
            java.util.List r6 = r6.e(r8, r9)
            r9 = r6
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = r8
        L_0x0057:
            if (r10 >= r9) goto L_0x01e5
            java.lang.Object r11 = r6.get(r10)
            androidx.compose.ui.text.AnnotatedString$Range r11 = (androidx.compose.ui.text.AnnotatedString.Range) r11
            int r12 = r11.h()
            int r13 = r11.f()
            if (r12 == r13) goto L_0x01d3
            r12 = 1386075176(0x529dd428, float:3.38934628E11)
            r3.X(r12)
            java.lang.Object r12 = r3.g()
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r13.a()
            if (r12 != r14) goto L_0x0082
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r3.N(r12)
        L_0x0082:
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = (androidx.compose.foundation.interaction.MutableInteractionSource) r12
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r14 = r0.k(r14, r11)
            androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$1 r15 = androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$1.f5988z
            r5 = 0
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r14, r8, r15, r7, r5)
            androidx.compose.ui.Modifier r14 = r0.t(r14, r11)
            r15 = 2
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.HoverableKt.b(r14, r12, r8, r15, r5)
            androidx.compose.ui.input.pointer.PointerIcon$Companion r16 = androidx.compose.ui.input.pointer.PointerIcon.f16863a
            androidx.compose.ui.input.pointer.PointerIcon r7 = r16.b()
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.input.pointer.PointerIconKt.b(r14, r7, r8, r15, r5)
            boolean r7 = r3.l(r0)
            boolean r16 = r3.W(r11)
            r7 = r7 | r16
            boolean r16 = r3.l(r2)
            r7 = r7 | r16
            java.lang.Object r15 = r3.g()
            if (r7 != 0) goto L_0x00c0
            java.lang.Object r7 = r13.a()
            if (r15 != r7) goto L_0x00c8
        L_0x00c0:
            androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$2$1 r15 = new androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$2$1
            r15.<init>(r0, r11, r2)
            r3.N(r15)
        L_0x00c8:
            r24 = r15
            kotlin.jvm.functions.Function0 r24 = (kotlin.jvm.functions.Function0) r24
            r25 = 508(0x1fc, float:7.12E-43)
            r26 = 0
            r7 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r27 = 2
            r15 = r12
            r16 = r7
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.ClickableKt.h(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            androidx.compose.foundation.layout.BoxKt.a(r7, r3, r8)
            java.lang.Object r7 = r11.g()
            androidx.compose.ui.text.LinkAnnotation r7 = (androidx.compose.ui.text.LinkAnnotation) r7
            androidx.compose.ui.text.TextLinkStyles r7 = r7.b()
            boolean r7 = androidx.compose.foundation.text.TextLinkScopeKt.b(r7)
            if (r7 != 0) goto L_0x01c6
            r7 = 1386898319(0x52aa638f, float:3.65907378E11)
            r3.X(r7)
            java.lang.Object r7 = r3.g()
            java.lang.Object r14 = r13.a()
            if (r7 != r14) goto L_0x0113
            androidx.compose.foundation.text.LinkStateInteractionSourceObserver r7 = new androidx.compose.foundation.text.LinkStateInteractionSourceObserver
            r7.<init>(r12)
            r3.N(r7)
        L_0x0113:
            androidx.compose.foundation.text.LinkStateInteractionSourceObserver r7 = (androidx.compose.foundation.text.LinkStateInteractionSourceObserver) r7
            kotlin.Unit r12 = kotlin.Unit.f40552a
            java.lang.Object r14 = r3.g()
            java.lang.Object r15 = r13.a()
            if (r14 != r15) goto L_0x0129
            androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1 r14 = new androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1
            r14.<init>(r7, r5)
            r3.N(r14)
        L_0x0129:
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r15 = 6
            androidx.compose.runtime.EffectsKt.g(r12, r14, r3, r15)
            boolean r12 = r7.g()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            boolean r12 = r7.f()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r12)
            boolean r12 = r7.h()
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r12)
            java.lang.Object r12 = r11.g()
            androidx.compose.ui.text.LinkAnnotation r12 = (androidx.compose.ui.text.LinkAnnotation) r12
            androidx.compose.ui.text.TextLinkStyles r12 = r12.b()
            if (r12 == 0) goto L_0x015a
            androidx.compose.ui.text.SpanStyle r12 = r12.d()
            r19 = r12
            goto L_0x015c
        L_0x015a:
            r19 = r5
        L_0x015c:
            java.lang.Object r12 = r11.g()
            androidx.compose.ui.text.LinkAnnotation r12 = (androidx.compose.ui.text.LinkAnnotation) r12
            androidx.compose.ui.text.TextLinkStyles r12 = r12.b()
            if (r12 == 0) goto L_0x016f
            androidx.compose.ui.text.SpanStyle r12 = r12.a()
            r20 = r12
            goto L_0x0171
        L_0x016f:
            r20 = r5
        L_0x0171:
            java.lang.Object r12 = r11.g()
            androidx.compose.ui.text.LinkAnnotation r12 = (androidx.compose.ui.text.LinkAnnotation) r12
            androidx.compose.ui.text.TextLinkStyles r12 = r12.b()
            if (r12 == 0) goto L_0x0184
            androidx.compose.ui.text.SpanStyle r12 = r12.b()
            r21 = r12
            goto L_0x0186
        L_0x0184:
            r21 = r5
        L_0x0186:
            java.lang.Object r12 = r11.g()
            androidx.compose.ui.text.LinkAnnotation r12 = (androidx.compose.ui.text.LinkAnnotation) r12
            androidx.compose.ui.text.TextLinkStyles r12 = r12.b()
            if (r12 == 0) goto L_0x0196
            androidx.compose.ui.text.SpanStyle r5 = r12.c()
        L_0x0196:
            r22 = r5
            java.lang.Object[] r5 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22}
            boolean r12 = r3.l(r0)
            boolean r14 = r3.W(r11)
            r12 = r12 | r14
            java.lang.Object r14 = r3.g()
            if (r12 != 0) goto L_0x01b1
            java.lang.Object r12 = r13.a()
            if (r14 != r12) goto L_0x01b9
        L_0x01b1:
            androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$4$1 r14 = new androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$4$1
            r14.<init>(r0, r11, r7)
            r3.N(r14)
        L_0x01b9:
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            int r7 = r4 << 6
            r7 = r7 & 896(0x380, float:1.256E-42)
            r0.c(r5, r14, r3, r7)
            r3.M()
            goto L_0x01cf
        L_0x01c6:
            r5 = 1388926990(0x52c9580e, float:4.3238287E11)
            r3.X(r5)
            r3.M()
        L_0x01cf:
            r3.M()
            goto L_0x01de
        L_0x01d3:
            r27 = r5
            r5 = 1388940878(0x52c98e4e, float:4.32837951E11)
            r3.X(r5)
            r3.M()
        L_0x01de:
            int r10 = r10 + 1
            r5 = r27
            r7 = 1
            goto L_0x0057
        L_0x01e5:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x01f2
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x01f2
        L_0x01ef:
            r3.B()
        L_0x01f2:
            androidx.compose.runtime.ScopeUpdateScope r2 = r3.x()
            if (r2 == 0) goto L_0x0200
            androidx.compose.foundation.text.TextLinkScope$LinksComposables$2 r3 = new androidx.compose.foundation.text.TextLinkScope$LinksComposables$2
            r3.<init>(r0, r1)
            r2.a(r3)
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLinkScope.b(androidx.compose.runtime.Composer, int):void");
    }

    public final void c(Object[] objArr, Function1 function1, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-2083052099);
        if ((i2 & 48) == 0) {
            i3 = (q2.l(function1) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(this) ? 256 : 128;
        }
        q2.r(-416604407, Integer.valueOf(objArr.length));
        int length = objArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            i3 |= q2.l(objArr[i4]) ? 4 : 0;
        }
        q2.Q();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        boolean z2 = true;
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2083052099, i3, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.a(function1);
            spreadBuilder.b(objArr);
            Object[] d2 = spreadBuilder.d(new Object[spreadBuilder.c()]);
            boolean l2 = q2.l(this);
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            boolean z3 = l2 | z2;
            Object g2 = q2.g();
            if (z3 || g2 == Composer.f14567a.a()) {
                g2 = new TextLinkScope$StyleAnnotation$1$1(this, function1);
                q2.N(g2);
            }
            EffectsKt.d(d2, (Function1) g2, q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new TextLinkScope$StyleAnnotation$2(this, objArr, function1, i2));
        }
    }

    public final AnnotatedString i() {
        AnnotatedString annotatedString;
        if (this.f5984d.isEmpty()) {
            annotatedString = this.f5983c;
        } else {
            TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(this.f5983c);
            SnapshotStateList snapshotStateList = this.f5984d;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Function1) snapshotStateList.get(i2)).invoke(textAnnotatorScope);
            }
            annotatedString = textAnnotatorScope.a();
        }
        this.f5983c = annotatedString;
        return annotatedString;
    }

    public final AnnotatedString.Range j(AnnotatedString.Range range, TextLayoutResult textLayoutResult) {
        int p2 = TextLayoutResult.p(textLayoutResult, textLayoutResult.n() - 1, false, 2, (Object) null);
        if (range.h() >= p2) {
            return null;
        }
        return AnnotatedString.Range.e(range, (Object) null, 0, Math.min(range.f(), p2), (String) null, 11, (Object) null);
    }

    public final Modifier k(Modifier modifier, AnnotatedString.Range range) {
        return GraphicsLayerModifierKt.a(modifier, new TextLinkScope$clipLink$1(this, range));
    }

    public final Function0 l() {
        return new TextLinkScope$shouldMeasureLinks$1(this);
    }

    public final AnnotatedString m() {
        return this.f5983c;
    }

    public final TextLayoutResult n() {
        return (TextLayoutResult) this.f5982b.getValue();
    }

    public final void o(LinkAnnotation linkAnnotation, UriHandler uriHandler) {
        LinkInteractionListener a2;
        Unit unit;
        if (linkAnnotation instanceof LinkAnnotation.Url) {
            LinkInteractionListener a3 = linkAnnotation.a();
            if (a3 != null) {
                a3.a(linkAnnotation);
                unit = Unit.f40552a;
            } else {
                unit = null;
            }
            if (unit == null) {
                try {
                    uriHandler.a(((LinkAnnotation.Url) linkAnnotation).e());
                } catch (IllegalArgumentException unused) {
                }
            }
        } else if ((linkAnnotation instanceof LinkAnnotation.Clickable) && (a2 = linkAnnotation.a()) != null) {
            a2.a(linkAnnotation);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.y(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.text.SpanStyle p(androidx.compose.ui.text.SpanStyle r1, androidx.compose.ui.text.SpanStyle r2) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x000a
            androidx.compose.ui.text.SpanStyle r1 = r1.y(r2)
            if (r1 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLinkScope.p(androidx.compose.ui.text.SpanStyle, androidx.compose.ui.text.SpanStyle):androidx.compose.ui.text.SpanStyle");
    }

    public final Path q(AnnotatedString.Range range) {
        TextLayoutResult n2;
        Path path = null;
        if (((Boolean) l().invoke()).booleanValue() && (n2 = n()) != null) {
            AnnotatedString.Range j2 = j(range, n2);
            if (j2 == null) {
                return null;
            }
            path = n2.z(j2.h(), j2.f());
            Rect d2 = n2.d(j2.h());
            float min = n2.q(j2.h()) == n2.q(j2.f() + -1) ? Math.min(n2.d(j2.f() - 1).o(), d2.o()) : 0.0f;
            path.v(Offset.e(Offset.e((((long) Float.floatToRawIntBits(min)) << 32) | (((long) Float.floatToRawIntBits(d2.r())) & 4294967295L)) ^ -9223372034707292160L));
        }
        return path;
    }

    public final void r(TextLayoutResult textLayoutResult) {
        this.f5982b.setValue(textLayoutResult);
    }

    public final Shape s(AnnotatedString.Range range) {
        Path q2 = q(range);
        if (q2 != null) {
            return new TextLinkScope$shapeForRange$1$1(q2);
        }
        return null;
    }

    public final Modifier t(Modifier modifier, AnnotatedString.Range range) {
        return modifier.o0(new TextRangeLayoutModifier(new c(this, range)));
    }
}
