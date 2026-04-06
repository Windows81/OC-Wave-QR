package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class GenericShape implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public final Function3 f5456a;

    public GenericShape(Function3 function3) {
        this.f5456a = function3;
    }

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        Path a2 = AndroidPath_androidKt.a();
        this.f5456a.d(a2, Size.c(j2), layoutDirection);
        a2.close();
        return new Outline.Generic(a2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Function3 function3 = null;
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        if (genericShape != null) {
            function3 = genericShape.f5456a;
        }
        return function3 == this.f5456a;
    }

    public int hashCode() {
        return this.f5456a.hashCode();
    }
}
