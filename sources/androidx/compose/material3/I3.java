package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class I3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Animatable f10108A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f10109z;

    public /* synthetic */ I3(SheetState sheetState, Animatable animatable) {
        this.f10109z = sheetState;
        this.f10108A = animatable;
    }

    public final Object invoke(Object obj) {
        return ModalBottomSheetKt.x(this.f10109z, this.f10108A, (GraphicsLayerScope) obj);
    }
}
