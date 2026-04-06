package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldCursorKt$cursor$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5892A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5893B;
    public final /* synthetic */ OffsetMapping C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Brush f5894z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1(Brush brush, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(3);
        this.f5894z = brush;
        this.f5892A = legacyTextFieldState;
        this.f5893B = textFieldValue;
        this.C = offsetMapping;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.compose.foundation.text.input.internal.CursorAnimationState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1} */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e3, code lost:
        if (r0 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00e5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier b(androidx.compose.ui.Modifier r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            r8 = this;
            r0 = -84507373(0xfffffffffaf68513, float:-6.4000205E35)
            r10.X(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)"
            androidx.compose.runtime.ComposerKt.Y(r0, r11, r1, r2)
        L_0x0012:
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.f()
            java.lang.Object r11 = r10.C(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            boolean r0 = r10.d(r11)
            java.lang.Object r1 = r10.g()
            if (r0 != 0) goto L_0x0032
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x003a
        L_0x0032:
            androidx.compose.foundation.text.input.internal.CursorAnimationState r1 = new androidx.compose.foundation.text.input.internal.CursorAnimationState
            r1.<init>(r11)
            r10.N(r1)
        L_0x003a:
            r3 = r1
            androidx.compose.foundation.text.input.internal.CursorAnimationState r3 = (androidx.compose.foundation.text.input.internal.CursorAnimationState) r3
            androidx.compose.ui.graphics.Brush r11 = r8.f5894z
            boolean r0 = r11 instanceof androidx.compose.ui.graphics.SolidColor
            r1 = 0
            if (r0 == 0) goto L_0x0052
            androidx.compose.ui.graphics.SolidColor r11 = (androidx.compose.ui.graphics.SolidColor) r11
            long r4 = r11.c()
            r6 = 16
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x0052
            r11 = r1
            goto L_0x0053
        L_0x0052:
            r11 = 1
        L_0x0053:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.u()
            java.lang.Object r0 = r10.C(r0)
            androidx.compose.ui.platform.WindowInfo r0 = (androidx.compose.ui.platform.WindowInfo) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x00f8
            androidx.compose.foundation.text.LegacyTextFieldState r0 = r8.f5892A
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00f8
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.f5893B
            long r4 = r0.h()
            boolean r0 = androidx.compose.ui.text.TextRange.h(r4)
            if (r0 == 0) goto L_0x00f8
            if (r11 == 0) goto L_0x00f8
            r11 = 808460990(0x303022be, float:6.40778E-10)
            r10.X(r11)
            androidx.compose.ui.text.input.TextFieldValue r11 = r8.f5893B
            androidx.compose.ui.text.AnnotatedString r11 = r11.f()
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.f5893B
            long r4 = r0.h()
            androidx.compose.ui.text.TextRange r0 = androidx.compose.ui.text.TextRange.b(r4)
            boolean r2 = r10.l(r3)
            java.lang.Object r4 = r10.g()
            if (r2 != 0) goto L_0x00a1
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x00aa
        L_0x00a1:
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1 r4 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1
            r2 = 0
            r4.<init>(r3, r2)
            r10.N(r4)
        L_0x00aa:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            androidx.compose.runtime.EffectsKt.f(r11, r0, r4, r10, r1)
            boolean r11 = r10.l(r3)
            androidx.compose.ui.text.input.OffsetMapping r0 = r8.C
            boolean r0 = r10.l(r0)
            r11 = r11 | r0
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.f5893B
            boolean r0 = r10.W(r0)
            r11 = r11 | r0
            androidx.compose.foundation.text.LegacyTextFieldState r0 = r8.f5892A
            boolean r0 = r10.l(r0)
            r11 = r11 | r0
            androidx.compose.ui.graphics.Brush r0 = r8.f5894z
            boolean r0 = r10.W(r0)
            r11 = r11 | r0
            androidx.compose.ui.text.input.OffsetMapping r4 = r8.C
            androidx.compose.ui.text.input.TextFieldValue r5 = r8.f5893B
            androidx.compose.foundation.text.LegacyTextFieldState r6 = r8.f5892A
            androidx.compose.ui.graphics.Brush r7 = r8.f5894z
            java.lang.Object r0 = r10.g()
            if (r11 != 0) goto L_0x00e5
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x00ee
        L_0x00e5:
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1 r0 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r10.N(r0)
        L_0x00ee:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.draw.DrawModifierKt.d(r9, r0)
            r10.M()
            goto L_0x0103
        L_0x00f8:
            r9 = 810474750(0x304edcfe, float:7.525641E-10)
            r10.X(r9)
            r10.M()
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
        L_0x0103:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x010c
            androidx.compose.runtime.ComposerKt.X()
        L_0x010c:
            r10.M()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.b(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
