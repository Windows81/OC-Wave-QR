package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.TouchBoundsExpansionKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class StylusHandwritingKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f6047a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f6048b;

    /* renamed from: c  reason: collision with root package name */
    public static final DpTouchBoundsExpansion f6049c;

    static {
        float m2 = Dp.m((float) 40);
        f6047a = m2;
        float m3 = Dp.m((float) 10);
        f6048b = m3;
        f6049c = TouchBoundsExpansionKt.a(m3, m2, m3, m2);
    }

    public static final DpTouchBoundsExpansion a() {
        return f6049c;
    }

    public static final Modifier b(Modifier modifier, boolean z2, boolean z3, Function0 function0) {
        if (!z2 || !StylusHandwriting_androidKt.a()) {
            return modifier;
        }
        if (z3) {
            modifier = PointerIconKt.c(modifier, TextPointerIcon_androidKt.a(), false, f6049c);
        }
        return modifier.o0(new StylusHandwritingElement(function0));
    }
}
