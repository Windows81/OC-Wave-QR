package kotlin.math;

import kotlin.Metadata;

@Metadata
final class Constants {

    /* renamed from: a  reason: collision with root package name */
    public static final Constants f40924a = new Constants();

    /* renamed from: b  reason: collision with root package name */
    public static final double f40925b = Math.log(2.0d);

    /* renamed from: c  reason: collision with root package name */
    public static final double f40926c;

    /* renamed from: d  reason: collision with root package name */
    public static final double f40927d;

    /* renamed from: e  reason: collision with root package name */
    public static final double f40928e;

    /* renamed from: f  reason: collision with root package name */
    public static final double f40929f;

    /* renamed from: g  reason: collision with root package name */
    public static final double f40930g;

    static {
        double ulp = Math.ulp(1.0d);
        f40926c = ulp;
        double sqrt = Math.sqrt(ulp);
        f40927d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f40928e = sqrt2;
        double d2 = (double) 1;
        f40929f = d2 / sqrt;
        f40930g = d2 / sqrt2;
    }
}
