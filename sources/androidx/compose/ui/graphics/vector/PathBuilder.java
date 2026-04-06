package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class PathBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16522a = new ArrayList(32);

    public final PathBuilder a() {
        this.f16522a.add(PathNode.Close.f16554c);
        return this;
    }

    public final PathBuilder b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f16522a.add(new PathNode.CurveTo(f2, f3, f4, f5, f6, f7));
        return this;
    }

    public final PathBuilder c(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f16522a.add(new PathNode.RelativeCurveTo(f2, f3, f4, f5, f6, f7));
        return this;
    }

    public final List d() {
        return this.f16522a;
    }

    public final PathBuilder e(float f2) {
        this.f16522a.add(new PathNode.HorizontalTo(f2));
        return this;
    }

    public final PathBuilder f(float f2) {
        this.f16522a.add(new PathNode.RelativeHorizontalTo(f2));
        return this;
    }

    public final PathBuilder g(float f2, float f3) {
        this.f16522a.add(new PathNode.LineTo(f2, f3));
        return this;
    }

    public final PathBuilder h(float f2, float f3) {
        this.f16522a.add(new PathNode.RelativeLineTo(f2, f3));
        return this;
    }

    public final PathBuilder i(float f2, float f3) {
        this.f16522a.add(new PathNode.MoveTo(f2, f3));
        return this;
    }

    public final PathBuilder j(float f2, float f3) {
        this.f16522a.add(new PathNode.RelativeMoveTo(f2, f3));
        return this;
    }

    public final PathBuilder k(float f2, float f3, float f4, float f5) {
        this.f16522a.add(new PathNode.ReflectiveCurveTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder l(float f2, float f3, float f4, float f5) {
        this.f16522a.add(new PathNode.RelativeReflectiveCurveTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder m(float f2) {
        this.f16522a.add(new PathNode.VerticalTo(f2));
        return this;
    }

    public final PathBuilder n(float f2) {
        this.f16522a.add(new PathNode.RelativeVerticalTo(f2));
        return this;
    }
}
