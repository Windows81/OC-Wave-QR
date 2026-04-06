package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldSemanticsModifierNode$applySemantics$5 extends Lambda implements Function3<Integer, Integer, Boolean, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6152z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldSemanticsModifierNode$applySemantics$5(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        super(3);
        this.f6152z = coreTextFieldSemanticsModifierNode;
    }

    public final Boolean b(int i2, int i3, boolean z2) {
        if (!z2) {
            i2 = this.f6152z.j3().a(i2);
        }
        if (!z2) {
            i3 = this.f6152z.j3().a(i3);
        }
        boolean z3 = false;
        if (this.f6152z.g3() && !(i2 == TextRange.n(this.f6152z.m3().h()) && i3 == TextRange.i(this.f6152z.m3().h()))) {
            if (Math.min(i2, i3) < 0 || Math.max(i2, i3) > this.f6152z.m3().f().length()) {
                this.f6152z.i3().z();
            } else {
                if (z2 || i2 == i3) {
                    this.f6152z.i3().z();
                } else {
                    TextFieldSelectionManager.y(this.f6152z.i3(), false, 1, (Object) null);
                }
                this.f6152z.l3().o().invoke(new TextFieldValue(this.f6152z.m3().f(), TextRangeKt.b(i2, i3), (TextRange) null, 4, (DefaultConstructorMarker) null));
                z3 = true;
            }
        }
        return Boolean.valueOf(z3);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
    }
}
