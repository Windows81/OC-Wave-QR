package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectionMagnifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static final AnimationVector2D f6865a = new AnimationVector2D(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    public static final TwoWayConverter f6866b = VectorConvertersKt.a(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.f6869z, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.f6870z);

    /* renamed from: c  reason: collision with root package name */
    public static final long f6867c;

    /* renamed from: d  reason: collision with root package name */
    public static final SpringSpec f6868d;

    static {
        long e2 = Offset.e((((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L));
        f6867c = e2;
        f6868d = new SpringSpec(0.0f, 0.0f, Offset.d(e2), 3, (DefaultConstructorMarker) null);
    }

    public static final Modifier d(Modifier modifier, Function0 function0, Function1 function1) {
        return ComposedModifierKt.c(modifier, (Function1) null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(function0, function1), 1, (Object) null);
    }

    public static final SpringSpec e() {
        return f6868d;
    }

    public static final long f() {
        return f6867c;
    }

    public static final TwoWayConverter g() {
        return f6866b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State h(kotlin.jvm.functions.Function0 r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)"
            r2 = -1589795249(0xffffffffa13da64f, float:-6.42558E-19)
            androidx.compose.runtime.ComposerKt.Y(r2, r11, r0, r1)
        L_0x000f:
            java.lang.Object r11 = r10.g()
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r0.a()
            if (r11 != r1) goto L_0x0022
            androidx.compose.runtime.State r11 = androidx.compose.runtime.SnapshotStateKt.e(r9)
            r10.N(r11)
        L_0x0022:
            androidx.compose.runtime.State r11 = (androidx.compose.runtime.State) r11
            java.lang.Object r9 = r10.g()
            java.lang.Object r1 = r0.a()
            if (r9 != r1) goto L_0x004b
            androidx.compose.animation.core.Animatable r9 = new androidx.compose.animation.core.Animatable
            long r1 = i(r11)
            androidx.compose.ui.geometry.Offset r3 = androidx.compose.ui.geometry.Offset.d(r1)
            androidx.compose.animation.core.TwoWayConverter r4 = f6866b
            long r1 = f6867c
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.d(r1)
            r7 = 8
            r8 = 0
            r6 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.N(r9)
        L_0x004b:
            androidx.compose.animation.core.Animatable r9 = (androidx.compose.animation.core.Animatable) r9
            kotlin.Unit r1 = kotlin.Unit.f40552a
            boolean r2 = r10.l(r9)
            java.lang.Object r3 = r10.g()
            if (r2 != 0) goto L_0x005f
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x0068
        L_0x005f:
            androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 r3 = new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1
            r0 = 0
            r3.<init>(r11, r9, r0)
            r10.N(r3)
        L_0x0068:
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r11 = 6
            androidx.compose.runtime.EffectsKt.g(r1, r3, r10, r11)
            androidx.compose.runtime.State r9 = r9.g()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x007b
            androidx.compose.runtime.ComposerKt.X()
        L_0x007b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionMagnifierKt.h(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public static final long i(State state) {
        return ((Offset) state.getValue()).t();
    }
}
