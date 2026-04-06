package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;

@Metadata
final class MeasuringIntrinsics {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasuringIntrinsics f17116a = new MeasuringIntrinsics();

    @Metadata
    public static final class DefaultIntrinsicMeasurable implements Measurable {

        /* renamed from: A  reason: collision with root package name */
        public final IntrinsicMinMax f17117A;

        /* renamed from: B  reason: collision with root package name */
        public final IntrinsicWidthHeight f17118B;

        /* renamed from: z  reason: collision with root package name */
        public final IntrinsicMeasurable f17119z;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.f17119z = intrinsicMeasurable;
            this.f17117A = intrinsicMinMax;
            this.f17118B = intrinsicWidthHeight;
        }

        public int C(int i2) {
            return this.f17119z.C(i2);
        }

        public int Z(int i2) {
            return this.f17119z.Z(i2);
        }

        public int a0(int i2) {
            return this.f17119z.a0(i2);
        }

        public Placeable c0(long j2) {
            int i2 = 32767;
            if (this.f17118B == IntrinsicWidthHeight.Width) {
                int a0 = this.f17117A == IntrinsicMinMax.Max ? this.f17119z.a0(Constraints.k(j2)) : this.f17119z.Z(Constraints.k(j2));
                if (Constraints.g(j2)) {
                    i2 = Constraints.k(j2);
                }
                return new EmptyPlaceable(a0, i2);
            }
            int C = this.f17117A == IntrinsicMinMax.Max ? this.f17119z.C(Constraints.l(j2)) : this.f17119z.q0(Constraints.l(j2));
            if (Constraints.h(j2)) {
                i2 = Constraints.l(j2);
            }
            return new EmptyPlaceable(i2, C);
        }

        public int q0(int i2) {
            return this.f17119z.q0(i2);
        }

        public Object t() {
            return this.f17119z.t();
        }
    }

    @Metadata
    public static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i2, int i3) {
            S0(IntSize.c((((long) i3) & 4294967295L) | (((long) i2) << 32)));
        }

        public void R0(long j2, float f2, Function1 function1) {
        }

        public int f0(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }
    }

    @Metadata
    public enum IntrinsicMinMax {
        Min,
        Max;

        static {
            IntrinsicMinMax[] d2;
            C = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public enum IntrinsicWidthHeight {
        Width,
        Height;

        static {
            IntrinsicWidthHeight[] d2;
            C = EnumEntriesKt.a(d2);
        }
    }

    public final int a(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return layoutModifier.f(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null)).a();
    }

    public final int b(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return layoutModifier.f(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null)).b();
    }

    public final int c(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return layoutModifier.f(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null)).a();
    }

    public final int d(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return layoutModifier.f(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null)).b();
    }
}
