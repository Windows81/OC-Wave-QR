package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSizeKt$textFieldMinSize$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextStyle f5975z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1(TextStyle textStyle) {
        super(3);
        this.f5975z = textStyle;
    }

    private static final Object c(State state) {
        return state.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.text.TextStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.runtime.State} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: androidx.compose.foundation.text.TextFieldSize} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier b(androidx.compose.ui.Modifier r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r11 = this;
            r12 = 1582736677(0x5e56a525, float:3.86670229E18)
            r13.X(r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0012
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)"
            androidx.compose.runtime.ComposerKt.Y(r12, r14, r0, r1)
        L_0x0012:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r12 = r13.C(r12)
            androidx.compose.ui.unit.Density r12 = (androidx.compose.ui.unit.Density) r12
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.i()
            java.lang.Object r14 = r13.C(r14)
            androidx.compose.ui.text.font.FontFamily$Resolver r14 = (androidx.compose.ui.text.font.FontFamily.Resolver) r14
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r0 = r13.C(r0)
            r6 = r0
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.ui.unit.LayoutDirection) r6
            androidx.compose.ui.text.TextStyle r0 = r11.f5975z
            boolean r0 = r13.W(r0)
            boolean r1 = r13.W(r6)
            r0 = r0 | r1
            androidx.compose.ui.text.TextStyle r1 = r11.f5975z
            java.lang.Object r2 = r13.g()
            if (r0 != 0) goto L_0x004c
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0053
        L_0x004c:
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.ui.text.TextStyleKt.d(r1, r6)
            r13.N(r2)
        L_0x0053:
            r7 = r2
            androidx.compose.ui.text.TextStyle r7 = (androidx.compose.ui.text.TextStyle) r7
            boolean r0 = r13.W(r14)
            boolean r1 = r13.W(r7)
            r0 = r0 | r1
            java.lang.Object r1 = r13.g()
            if (r0 != 0) goto L_0x006d
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00a6
        L_0x006d:
            androidx.compose.ui.text.font.FontFamily r0 = r7.j()
            androidx.compose.ui.text.font.FontWeight r1 = r7.o()
            if (r1 != 0) goto L_0x007d
            androidx.compose.ui.text.font.FontWeight$Companion r1 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r1 = r1.g()
        L_0x007d:
            androidx.compose.ui.text.font.FontStyle r2 = r7.m()
            if (r2 == 0) goto L_0x0088
            int r2 = r2.i()
            goto L_0x008e
        L_0x0088:
            androidx.compose.ui.text.font.FontStyle$Companion r2 = androidx.compose.ui.text.font.FontStyle.f18724b
            int r2 = r2.b()
        L_0x008e:
            androidx.compose.ui.text.font.FontSynthesis r3 = r7.n()
            if (r3 == 0) goto L_0x0099
            int r3 = r3.m()
            goto L_0x009f
        L_0x0099:
            androidx.compose.ui.text.font.FontSynthesis$Companion r3 = androidx.compose.ui.text.font.FontSynthesis.f18728b
            int r3 = r3.a()
        L_0x009f:
            androidx.compose.runtime.State r1 = r14.a(r0, r1, r2, r3)
            r13.N(r1)
        L_0x00a6:
            r8 = r1
            androidx.compose.runtime.State r8 = (androidx.compose.runtime.State) r8
            androidx.compose.ui.text.TextStyle r4 = r11.f5975z
            java.lang.Object r0 = r13.g()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r9.a()
            if (r0 != r1) goto L_0x00c7
            androidx.compose.foundation.text.TextFieldSize r10 = new androidx.compose.foundation.text.TextFieldSize
            java.lang.Object r5 = c(r8)
            r0 = r10
            r1 = r6
            r2 = r12
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r13.N(r10)
        L_0x00c7:
            r10 = r0
            androidx.compose.foundation.text.TextFieldSize r10 = (androidx.compose.foundation.text.TextFieldSize) r10
            java.lang.Object r5 = c(r8)
            r0 = r10
            r1 = r6
            r2 = r12
            r3 = r14
            r4 = r7
            r0.c(r1, r2, r3, r4, r5)
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            boolean r14 = r13.l(r10)
            java.lang.Object r0 = r13.g()
            if (r14 != 0) goto L_0x00e8
            java.lang.Object r14 = r9.a()
            if (r0 != r14) goto L_0x00f0
        L_0x00e8:
            androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1 r0 = new androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1
            r0.<init>(r10)
            r13.N(r0)
        L_0x00f0:
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.layout.LayoutModifierKt.a(r12, r0)
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x00ff
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ff:
            r13.M()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1.b(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
