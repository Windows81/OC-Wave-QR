package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1 extends Lambda implements Function1<Matrix, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f5903z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1(LayoutCoordinates layoutCoordinates) {
        super(1);
        this.f5903z = layoutCoordinates;
    }

    public final void b(float[] fArr) {
        if (this.f5903z.b()) {
            LayoutCoordinatesKt.d(this.f5903z).e0(this.f5903z, fArr);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Matrix) obj).q());
        return Unit.f40552a;
    }
}
