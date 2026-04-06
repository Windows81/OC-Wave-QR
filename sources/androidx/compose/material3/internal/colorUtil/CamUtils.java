package androidx.compose.material3.internal.colorUtil;

import kotlin.Metadata;

@Metadata
public final class CamUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final CamUtils f12402a = new CamUtils();

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f12403b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[][] f12404c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f12405d = {95.047f, 100.0f, 108.883f};

    /* renamed from: e  reason: collision with root package name */
    public static final double[][] f12406e = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* renamed from: f  reason: collision with root package name */
    public static final double[][] f12407f = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* renamed from: g  reason: collision with root package name */
    public static final int f12408g = 8;

    public final float[] a() {
        return f12405d;
    }

    public final float[][] b() {
        return f12403b;
    }

    public final double c(double d2) {
        return (d2 > 8.0d ? Math.pow((d2 + 16.0d) / 116.0d, 3.0d) : d2 / 903.2962962962963d) * 100.0d;
    }
}
