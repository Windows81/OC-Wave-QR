package androidx.compose.material3.internal;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class V implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ColorProducer f12373A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Shape f12374z;

    public /* synthetic */ V(Shape shape, ColorProducer colorProducer) {
        this.f12374z = shape;
        this.f12373A = colorProducer;
    }

    public final Object invoke(Object obj) {
        return TextFieldImplKt.O(this.f12374z, this.f12373A, (CacheDrawScope) obj);
    }
}
