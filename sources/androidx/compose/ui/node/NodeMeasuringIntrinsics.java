package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachIntrinsicMeasureScope;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class NodeMeasuringIntrinsics {

    /* renamed from: a  reason: collision with root package name */
    public static final NodeMeasuringIntrinsics f17407a = new NodeMeasuringIntrinsics();

    @Metadata
    public interface ApproachMeasureBlock {
        MeasureResult a(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2);
    }

    @Metadata
    public static final class DefaultIntrinsicMeasurable implements Measurable {

        /* renamed from: A  reason: collision with root package name */
        public final IntrinsicMinMax f17408A;

        /* renamed from: B  reason: collision with root package name */
        public final IntrinsicWidthHeight f17409B;

        /* renamed from: z  reason: collision with root package name */
        public final IntrinsicMeasurable f17410z;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.f17410z = intrinsicMeasurable;
            this.f17408A = intrinsicMinMax;
            this.f17409B = intrinsicWidthHeight;
        }

        public int C(int i2) {
            return this.f17410z.C(i2);
        }

        public int Z(int i2) {
            return this.f17410z.Z(i2);
        }

        public int a0(int i2) {
            return this.f17410z.a0(i2);
        }

        public Placeable c0(long j2) {
            int i2 = 32767;
            if (this.f17409B == IntrinsicWidthHeight.Width) {
                int a0 = this.f17408A == IntrinsicMinMax.Max ? this.f17410z.a0(Constraints.k(j2)) : this.f17410z.Z(Constraints.k(j2));
                if (Constraints.g(j2)) {
                    i2 = Constraints.k(j2);
                }
                return new EmptyPlaceable(a0, i2);
            }
            int C = this.f17408A == IntrinsicMinMax.Max ? this.f17410z.C(Constraints.l(j2)) : this.f17410z.q0(Constraints.l(j2));
            if (Constraints.h(j2)) {
                i2 = Constraints.l(j2);
            }
            return new EmptyPlaceable(i2, C);
        }

        public int q0(int i2) {
            return this.f17410z.q0(i2);
        }

        public Object t() {
            return this.f17410z.t();
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

    @Metadata
    public interface MeasureBlock {
        MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2);
    }

    public final int a(ApproachMeasureBlock approachMeasureBlock, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return approachMeasureBlock.a(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null)).a();
    }

    public final int b(MeasureBlock measureBlock, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return measureBlock.f(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null)).a();
    }

    public final int c(ApproachMeasureBlock approachMeasureBlock, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return approachMeasureBlock.a(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null)).b();
    }

    public final int d(MeasureBlock measureBlock, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return measureBlock.f(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null)).b();
    }

    public final int e(ApproachMeasureBlock approachMeasureBlock, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return approachMeasureBlock.a(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null)).a();
    }

    public final int f(MeasureBlock measureBlock, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return measureBlock.f(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null)).a();
    }

    public final int g(ApproachMeasureBlock approachMeasureBlock, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return approachMeasureBlock.a(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null)).b();
    }

    public final int h(MeasureBlock measureBlock, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return measureBlock.f(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null)).b();
    }
}
