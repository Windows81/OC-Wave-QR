package androidx.compose.foundation;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BorderCache {

    /* renamed from: a  reason: collision with root package name */
    public ImageBitmap f2967a;

    /* renamed from: b  reason: collision with root package name */
    public Canvas f2968b;

    /* renamed from: c  reason: collision with root package name */
    public CanvasDrawScope f2969c;

    /* renamed from: d  reason: collision with root package name */
    public Path f2970d;

    public BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        this.f2967a = imageBitmap;
        this.f2968b = canvas;
        this.f2969c = canvasDrawScope;
        this.f2970d = path;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        return Intrinsics.d(this.f2967a, borderCache.f2967a) && Intrinsics.d(this.f2968b, borderCache.f2968b) && Intrinsics.d(this.f2969c, borderCache.f2969c) && Intrinsics.d(this.f2970d, borderCache.f2970d);
    }

    public final Path g() {
        Path path = this.f2970d;
        if (path != null) {
            return path;
        }
        Path a2 = AndroidPath_androidKt.a();
        this.f2970d = a2;
        return a2;
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.f2967a;
        int i2 = 0;
        int hashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        Canvas canvas = this.f2968b;
        int hashCode2 = (hashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.f2969c;
        int hashCode3 = (hashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.f2970d;
        if (path != null) {
            i2 = path.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f2967a + ", canvas=" + this.f2968b + ", canvasDrawScope=" + this.f2969c + ", borderPath=" + this.f2970d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : imageBitmap, (i2 & 2) != 0 ? null : canvas, (i2 & 4) != 0 ? null : canvasDrawScope, (i2 & 8) != 0 ? null : path);
    }
}
