package androidx.compose.material;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class CheckDrawingCache {

    /* renamed from: a  reason: collision with root package name */
    public final Path f7444a;

    /* renamed from: b  reason: collision with root package name */
    public final PathMeasure f7445b;

    /* renamed from: c  reason: collision with root package name */
    public final Path f7446c;

    public CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2) {
        this.f7444a = path;
        this.f7445b = pathMeasure;
        this.f7446c = path2;
    }

    public final Path a() {
        return this.f7444a;
    }

    public final PathMeasure b() {
        return this.f7445b;
    }

    public final Path c() {
        return this.f7446c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AndroidPath_androidKt.a() : path, (i2 & 2) != 0 ? AndroidPathMeasure_androidKt.a() : pathMeasure, (i2 & 4) != 0 ? AndroidPath_androidKt.a() : path2);
    }
}
