package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.Metadata;

@Metadata
public final class AndroidPathMeasure implements PathMeasure {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f15918a;

    public AndroidPathMeasure(PathMeasure pathMeasure) {
        this.f15918a = pathMeasure;
    }

    public void a(Path path, boolean z2) {
        Path path2;
        PathMeasure pathMeasure = this.f15918a;
        if (path == null) {
            path2 = null;
        } else if (path instanceof AndroidPath) {
            path2 = ((AndroidPath) path).B();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path2, z2);
    }

    public float b() {
        return this.f15918a.getLength();
    }

    public boolean c(float f2, float f3, Path path, boolean z2) {
        PathMeasure pathMeasure = this.f15918a;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f2, f3, ((AndroidPath) path).B(), z2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
