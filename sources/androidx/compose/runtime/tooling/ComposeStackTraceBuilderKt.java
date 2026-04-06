package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata
public final class ComposeStackTraceBuilderKt {
    public static final List a(SlotReader slotReader) {
        if (slotReader.i() || slotReader.x() == 0) {
            return CollectionsKt.m();
        }
        ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
        int u2 = slotReader.u();
        Object valueOf = Integer.valueOf(slotReader.y());
        while (u2 >= 0) {
            readerTraceBuilder.f(slotReader.z().M(u2), valueOf);
            valueOf = slotReader.a(u2);
            u2 = slotReader.Q(u2);
        }
        return readerTraceBuilder.i();
    }

    public static final List b(SlotWriter slotWriter, Object obj, int i2, Integer num) {
        if (slotWriter.Y() || slotWriter.e0() == 0) {
            return CollectionsKt.m();
        }
        WriterTraceBuilder writerTraceBuilder = new WriterTraceBuilder(slotWriter);
        int intValue = num != null ? num.intValue() : slotWriter.d0() < 0 ? slotWriter.H0(i2) : slotWriter.d0();
        if (obj == null) {
            obj = Integer.valueOf(slotWriter.l0(i2));
        }
        while (i2 >= 0) {
            writerTraceBuilder.f(slotWriter.g1(i2), obj);
            obj = slotWriter.B(i2);
            if (intValue >= 0) {
                int i3 = intValue;
                intValue = slotWriter.H0(intValue);
                i2 = i3;
            } else {
                i2 = intValue;
            }
        }
        return writerTraceBuilder.i();
    }

    public static /* synthetic */ List c(SlotWriter slotWriter, Object obj, int i2, Integer num, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            obj = null;
        }
        if ((i3 & 2) != 0) {
            i2 = slotWriter.b0();
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        return b(slotWriter, obj, i2, num);
    }

    public static final ObjectLocation d(SlotTable slotTable, Function1 function1) {
        SlotReader E = slotTable.E();
        try {
            Ref.IntRef intRef = new Ref.IntRef();
            while (intRef.f40906z < slotTable.u()) {
                if (!E.K(intRef.f40906z) || !((Boolean) function1.invoke(E.M(intRef.f40906z))).booleanValue()) {
                    int V = E.V(intRef.f40906z);
                    for (int i2 = 0; i2 < V; i2++) {
                        if (((Boolean) function1.invoke(E.C(intRef.f40906z, i2))).booleanValue()) {
                            return new ObjectLocation(intRef.f40906z, Integer.valueOf(i2));
                        }
                    }
                    intRef.f40906z++;
                } else {
                    ObjectLocation objectLocation = new ObjectLocation(intRef.f40906z, (Integer) null);
                    E.d();
                    return objectLocation;
                }
            }
            Unit unit = Unit.f40552a;
            E.d();
            return null;
        } finally {
            E.d();
        }
    }

    public static final Integer e(SlotTable slotTable, CompositionContext compositionContext) {
        SlotReader E = slotTable.E();
        try {
            return f(E, compositionContext, 0, E.x());
        } finally {
            E.d();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.compose.runtime.ComposerImpl$CompositionContextHolder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer f(androidx.compose.runtime.SlotReader r4, androidx.compose.runtime.CompositionContext r5, int r6, int r7) {
        /*
        L_0x0000:
            r0 = 0
            if (r6 >= r7) goto L_0x005a
            int r1 = r4.F(r6)
            int r1 = r1 + r6
            boolean r2 = r4.G(r6)
            if (r2 == 0) goto L_0x0041
            int r2 = r4.D(r6)
            r3 = 206(0xce, float:2.89E-43)
            if (r2 != r3) goto L_0x0041
            java.lang.Object r2 = r4.E(r6)
            java.lang.Object r3 = androidx.compose.runtime.ComposerKt.L()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 == 0) goto L_0x0041
            r2 = 0
            java.lang.Object r2 = r4.C(r6, r2)
            boolean r3 = r2 instanceof androidx.compose.runtime.ComposerImpl.CompositionContextHolder
            if (r3 == 0) goto L_0x0030
            r0 = r2
            androidx.compose.runtime.ComposerImpl$CompositionContextHolder r0 = (androidx.compose.runtime.ComposerImpl.CompositionContextHolder) r0
        L_0x0030:
            if (r0 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerImpl$CompositionContextImpl r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r5)
            if (r0 == 0) goto L_0x0041
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            return r4
        L_0x0041:
            boolean r0 = r4.e(r6)
            if (r0 == 0) goto L_0x0058
            int r6 = r6 + 1
            java.lang.Integer r6 = f(r4, r5, r6, r1)
            if (r6 == 0) goto L_0x0058
            int r4 = r6.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L_0x0058:
            r6 = r1
            goto L_0x0000
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.f(androidx.compose.runtime.SlotReader, androidx.compose.runtime.CompositionContext, int, int):java.lang.Integer");
    }

    public static final List g(SlotReader slotReader, int i2, Object obj) {
        ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
        int Q = slotReader.Q(i2);
        Anchor a2 = slotReader.a(i2);
        while (i2 >= 0) {
            readerTraceBuilder.f(slotReader.z().M(i2), obj);
            if (Q >= 0) {
                Anchor anchor = a2;
                a2 = slotReader.a(Q);
                i2 = Q;
                Q = slotReader.Q(Q);
                obj = anchor;
            } else {
                i2 = Q;
                obj = a2;
            }
        }
        return readerTraceBuilder.i();
    }
}
