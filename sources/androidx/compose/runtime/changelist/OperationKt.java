package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import androidx.compose.runtime.tooling.SourceInformation;
import b.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class OperationKt {
    public static final Throwable f(Throwable th, OperationErrorContext operationErrorContext, SlotWriter slotWriter, Anchor anchor) {
        return operationErrorContext == null ? th : ComposeStackTraceKt.b(th, new a(anchor, slotWriter, operationErrorContext));
    }

    public static final List g(Anchor anchor, SlotWriter slotWriter, OperationErrorContext operationErrorContext) {
        if (anchor != null) {
            slotWriter.U0(anchor);
        }
        List c2 = ComposeStackTraceBuilderKt.c(slotWriter, (Object) null, 0, (Integer) null, 7, (Object) null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) CollectionsKt.q0(c2);
        Integer c3 = composeStackTraceFrame != null ? composeStackTraceFrame.c() : null;
        List f2 = operationErrorContext.f(c3);
        if (c3 != null && !f2.isEmpty()) {
            f2 = CollectionsKt.x0(CollectionsKt.e(ComposeStackTraceFrame.b((ComposeStackTraceFrame) CollectionsKt.e0(f2), (SourceInformation) null, c3, 1, (Object) null)), CollectionsKt.Z(f2, 1));
        }
        return CollectionsKt.x0(c2, f2);
    }

    public static final int h(SlotWriter slotWriter) {
        int b0 = slotWriter.b0();
        int d0 = slotWriter.d0();
        while (d0 >= 0 && !slotWriter.t0(d0)) {
            d0 = slotWriter.H0(d0);
        }
        int i2 = d0 + 1;
        int i3 = 0;
        while (i2 < b0) {
            if (slotWriter.n0(b0, i2)) {
                if (slotWriter.t0(i2)) {
                    i3 = 0;
                }
                i2++;
            } else {
                i3 += slotWriter.t0(i2) ? 1 : slotWriter.F0(i2);
                i2 += slotWriter.k0(i2);
            }
        }
        return i3;
    }

    public static final int i(SlotWriter slotWriter, Anchor anchor, Applier applier) {
        int C = slotWriter.C(anchor);
        boolean z2 = true;
        if (!(slotWriter.b0() < C)) {
            ComposerKt.v("Check failed");
        }
        j(slotWriter, applier, C);
        int h2 = h(slotWriter);
        while (slotWriter.b0() < C) {
            if (slotWriter.m0(C)) {
                if (slotWriter.s0()) {
                    applier.d(slotWriter.D0(slotWriter.b0()));
                    h2 = 0;
                }
                slotWriter.i1();
            } else {
                h2 += slotWriter.Y0();
            }
        }
        if (slotWriter.b0() != C) {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.v("Check failed");
        }
        return h2;
    }

    public static final void j(SlotWriter slotWriter, Applier applier, int i2) {
        while (!slotWriter.o0(i2)) {
            slotWriter.Z0();
            if (slotWriter.t0(slotWriter.d0())) {
                applier.h();
            }
            slotWriter.R();
        }
    }

    public static final OperationErrorContext k(OperationErrorContext operationErrorContext, SlotWriter slotWriter) {
        return new OperationKt$withCurrentStackTrace$1(operationErrorContext, slotWriter);
    }
}
