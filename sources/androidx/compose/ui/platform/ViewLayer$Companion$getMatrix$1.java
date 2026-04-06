package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ViewLayer$Companion$getMatrix$1 extends Lambda implements Function2<View, Matrix, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ViewLayer$Companion$getMatrix$1 f17912z = new ViewLayer$Companion$getMatrix$1();

    public ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    public final void b(View view, Matrix matrix) {
        matrix.set(view.getMatrix());
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((View) obj, (Matrix) obj2);
        return Unit.f40552a;
    }
}
