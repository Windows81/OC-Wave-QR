package androidx.compose.material3;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class CheckDrawingCache {

    /* renamed from: a  reason: collision with root package name */
    public final Path f9367a;

    /* renamed from: b  reason: collision with root package name */
    public final PathMeasure f9368b;

    /* renamed from: c  reason: collision with root package name */
    public final Path f9369c;

    public CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2) {
        this.f9367a = path;
        this.f9368b = pathMeasure;
        this.f9369c = path2;
    }

    public final Path a() {
        return this.f9367a;
    }

    public final PathMeasure b() {
        return this.f9368b;
    }

    public final Path c() {
        return this.f9369c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AndroidPath_androidKt.a() : path, (i2 & 2) != 0 ? AndroidPathMeasure_androidKt.a() : pathMeasure, (i2 & 4) != 0 ? AndroidPath_androidKt.a() : path2);
    }
}
