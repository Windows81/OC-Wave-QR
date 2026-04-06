package androidx.core.text;

public final class BidiFormatter {

    /* renamed from: d  reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f20072d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f20073e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    public static final String f20074f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    public static final BidiFormatter f20075g;

    /* renamed from: h  reason: collision with root package name */
    public static final BidiFormatter f20076h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20077a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20078b;

    /* renamed from: c  reason: collision with root package name */
    public final TextDirectionHeuristicCompat f20079c;

    public static final class Builder {
    }

    public static class DirectionalityEstimator {

        /* renamed from: a  reason: collision with root package name */
        public static final byte[] f20080a = new byte[1792];

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f20080a[i2] = Character.getDirectionality(i2);
            }
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f20097c;
        f20072d = textDirectionHeuristicCompat;
        f20075g = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        f20076h = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public BidiFormatter(boolean z2, int i2, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.f20077a = z2;
        this.f20078b = i2;
        this.f20079c = textDirectionHeuristicCompat;
    }
}
