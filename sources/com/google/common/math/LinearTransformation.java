package com.google.common.math;

@ElementTypesAreNonnullByDefault
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {
    }

    public static final class NaNLinearTransformation extends LinearTransformation {

        /* renamed from: a  reason: collision with root package name */
        public static final NaNLinearTransformation f29049a = new NaNLinearTransformation();

        public String toString() {
            return "NaN";
        }
    }

    public static final class RegularLinearTransformation extends LinearTransformation {

        /* renamed from: a  reason: collision with root package name */
        public final double f29050a;

        /* renamed from: b  reason: collision with root package name */
        public final double f29051b;

        public String toString() {
            return String.format("y = %g * x + %g", new Object[]{Double.valueOf(this.f29050a), Double.valueOf(this.f29051b)});
        }
    }

    public static final class VerticalLinearTransformation extends LinearTransformation {

        /* renamed from: a  reason: collision with root package name */
        public final double f29052a;

        public String toString() {
            return String.format("x = %g", new Object[]{Double.valueOf(this.f29052a)});
        }
    }
}
