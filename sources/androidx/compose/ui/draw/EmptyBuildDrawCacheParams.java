package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {

    /* renamed from: A  reason: collision with root package name */
    public static final long f15710A = Size.f15876b.a();

    /* renamed from: B  reason: collision with root package name */
    public static final LayoutDirection f15711B = LayoutDirection.Ltr;
    public static final Density C = DensityKt.a(1.0f, 1.0f);

    /* renamed from: z  reason: collision with root package name */
    public static final EmptyBuildDrawCacheParams f15712z = new EmptyBuildDrawCacheParams();

    public long c() {
        return f15710A;
    }

    public Density getDensity() {
        return C;
    }

    public LayoutDirection getLayoutDirection() {
        return f15711B;
    }
}
