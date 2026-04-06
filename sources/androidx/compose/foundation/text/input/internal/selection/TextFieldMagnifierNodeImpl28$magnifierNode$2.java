package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldMagnifierNodeImpl28$magnifierNode$2 extends Lambda implements Function1<DpSize, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldMagnifierNodeImpl28 f6446z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$magnifierNode$2(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
        super(1);
        this.f6446z = textFieldMagnifierNodeImpl28;
    }

    public final void b(long j2) {
        TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.f6446z;
        Density density = (Density) CompositionLocalConsumerModifierNodeKt.a(textFieldMagnifierNodeImpl28, CompositionLocalsKt.g());
        int P1 = density.P1(DpSize.j(j2));
        textFieldMagnifierNodeImpl28.p3(IntSize.c((((long) density.P1(DpSize.i(j2))) & 4294967295L) | (((long) P1) << 32)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((DpSize) obj).m());
        return Unit.f40552a;
    }
}
