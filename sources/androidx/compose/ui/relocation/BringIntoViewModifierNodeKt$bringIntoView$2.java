package androidx.compose.ui.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BringIntoViewModifierNodeKt$bringIntoView$2 extends Lambda implements Function0<Rect> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f17986A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f17987z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewModifierNodeKt$bringIntoView$2(Function0 function0, LayoutCoordinates layoutCoordinates) {
        super(0);
        this.f17987z = function0;
        this.f17986A = layoutCoordinates;
    }

    /* renamed from: b */
    public final Rect invoke() {
        Rect rect;
        Function0 function0 = this.f17987z;
        if (function0 != null && (rect = (Rect) function0.invoke()) != null) {
            return rect;
        }
        LayoutCoordinates layoutCoordinates = this.f17986A;
        if (!layoutCoordinates.b()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates != null) {
            return SizeKt.c(IntSizeKt.e(layoutCoordinates.a()));
        }
        return null;
    }
}
