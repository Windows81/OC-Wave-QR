package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldMagnifierNodeImpl28$magnifierNode$1 extends Lambda implements Function1<Density, Offset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldMagnifierNodeImpl28 f6445z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$magnifierNode$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
        super(1);
        this.f6445z = textFieldMagnifierNodeImpl28;
    }

    public final long b(Density density) {
        return ((Offset) this.f6445z.U.m()).t();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.d(b((Density) obj));
    }
}
