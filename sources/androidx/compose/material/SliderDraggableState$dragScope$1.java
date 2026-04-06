package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;

@Metadata
public final class SliderDraggableState$dragScope$1 implements DragScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SliderDraggableState f8338a;

    public SliderDraggableState$dragScope$1(SliderDraggableState sliderDraggableState) {
        this.f8338a = sliderDraggableState;
    }

    public void a(float f2) {
        this.f8338a.g().invoke(Float.valueOf(f2));
    }
}
