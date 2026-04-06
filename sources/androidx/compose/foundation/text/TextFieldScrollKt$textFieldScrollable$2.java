package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldScrollKt$textFieldScrollable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5950A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5951B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f5952z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z2, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.f5952z = textFieldScrollerPosition;
        this.f5950A = z2;
        this.f5951B = mutableInteractionSource;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier b(androidx.compose.ui.Modifier r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            r12 = this;
            r13 = 805428266(0x3001dc2a, float:4.72428E-10)
            r14.X(r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0012
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:71)"
            androidx.compose.runtime.ComposerKt.Y(r13, r15, r0, r1)
        L_0x0012:
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r13 = r14.C(r13)
            androidx.compose.ui.unit.LayoutDirection r15 = androidx.compose.ui.unit.LayoutDirection.Rtl
            r0 = 1
            r1 = 0
            if (r13 != r15) goto L_0x0022
            r13 = r0
            goto L_0x0023
        L_0x0022:
            r13 = r1
        L_0x0023:
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.f5952z
            androidx.compose.foundation.gestures.Orientation r15 = r15.f()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r15 == r2) goto L_0x0032
            if (r13 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r7 = r1
            goto L_0x0033
        L_0x0032:
            r7 = r0
        L_0x0033:
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.f5952z
            boolean r13 = r14.W(r13)
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.f5952z
            java.lang.Object r2 = r14.g()
            if (r13 != 0) goto L_0x0049
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r2 != r13) goto L_0x0051
        L_0x0049:
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 r2 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
            r2.<init>(r15)
            r14.N(r2)
        L_0x0051:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.foundation.gestures.ScrollableState r13 = androidx.compose.foundation.gestures.ScrollableStateKt.b(r2, r14, r1)
            boolean r15 = r14.W(r13)
            androidx.compose.foundation.text.TextFieldScrollerPosition r2 = r12.f5952z
            boolean r2 = r14.W(r2)
            r15 = r15 | r2
            androidx.compose.foundation.text.TextFieldScrollerPosition r2 = r12.f5952z
            java.lang.Object r3 = r14.g()
            if (r15 != 0) goto L_0x0072
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r15.a()
            if (r3 != r15) goto L_0x007a
        L_0x0072:
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r3 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
            r3.<init>(r13, r2)
            r14.N(r3)
        L_0x007a:
            r4 = r3
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r4 = (androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) r4
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.f5952z
            androidx.compose.foundation.gestures.Orientation r5 = r13.f()
            boolean r13 = r12.f5950A
            if (r13 == 0) goto L_0x0097
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.f5952z
            float r13 = r13.c()
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r6 = r0
            goto L_0x0098
        L_0x0097:
            r6 = r1
        L_0x0098:
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = r12.f5951B
            r10 = 16
            r11 = 0
            r8 = 0
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.gestures.ScrollableKt.k(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x00ab
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ab:
            r14.M()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2.b(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
