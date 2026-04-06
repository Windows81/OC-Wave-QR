package androidx.compose.ui.text.input;

import androidx.compose.ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CursorAnchorInfoController$textFieldToRootTransform$1 extends Lambda implements Function1<Matrix, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final CursorAnchorInfoController$textFieldToRootTransform$1 f18801z = new CursorAnchorInfoController$textFieldToRootTransform$1();

    public CursorAnchorInfoController$textFieldToRootTransform$1() {
        super(1);
    }

    public final void b(float[] fArr) {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Matrix) obj).q());
        return Unit.f40552a;
    }
}
