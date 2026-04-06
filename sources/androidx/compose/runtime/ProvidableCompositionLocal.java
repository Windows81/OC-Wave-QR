package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public ProvidableCompositionLocal(Function0 function0) {
        super(function0, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.compose.runtime.ComputedValueHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.compose.runtime.DynamicValueHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.compose.runtime.StaticValueHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.runtime.DynamicValueHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: androidx.compose.runtime.DynamicValueHolder} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r0 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r0 == r2) goto L_0x0034;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.ValueHolder b(androidx.compose.runtime.ProvidedValue r4, androidx.compose.runtime.ValueHolder r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.DynamicValueHolder
            r1 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x0047
            r1 = r5
            androidx.compose.runtime.DynamicValueHolder r1 = (androidx.compose.runtime.DynamicValueHolder) r1
            androidx.compose.runtime.MutableState r5 = r1.b()
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L_0x0047
        L_0x001a:
            boolean r0 = r5 instanceof androidx.compose.runtime.StaticValueHolder
            if (r0 == 0) goto L_0x0036
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r4.d()
            androidx.compose.runtime.StaticValueHolder r5 = (androidx.compose.runtime.StaticValueHolder) r5
            java.lang.Object r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r2)
            if (r0 == 0) goto L_0x0047
        L_0x0034:
            r1 = r5
            goto L_0x0047
        L_0x0036:
            boolean r0 = r5 instanceof androidx.compose.runtime.ComputedValueHolder
            if (r0 == 0) goto L_0x0047
            kotlin.jvm.functions.Function1 r0 = r4.c()
            androidx.compose.runtime.ComputedValueHolder r5 = (androidx.compose.runtime.ComputedValueHolder) r5
            kotlin.jvm.functions.Function1 r2 = r5.b()
            if (r0 != r2) goto L_0x0047
            goto L_0x0034
        L_0x0047:
            if (r1 != 0) goto L_0x004d
            androidx.compose.runtime.ValueHolder r1 = r3.f(r4)
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProvidableCompositionLocal.b(androidx.compose.runtime.ProvidedValue, androidx.compose.runtime.ValueHolder):androidx.compose.runtime.ValueHolder");
    }

    public abstract ProvidedValue c(Object obj);

    public final ProvidedValue d(Object obj) {
        return c(obj);
    }

    public final ProvidedValue e(Object obj) {
        return c(obj).h();
    }

    public final ValueHolder f(ProvidedValue providedValue) {
        if (!providedValue.i()) {
            return providedValue.c() != null ? new ComputedValueHolder(providedValue.c()) : providedValue.f() != null ? new DynamicValueHolder(providedValue.f()) : new StaticValueHolder(providedValue.d());
        }
        MutableState f2 = providedValue.f();
        if (f2 == null) {
            Object g2 = providedValue.g();
            SnapshotMutationPolicy e2 = providedValue.e();
            if (e2 == null) {
                e2 = SnapshotStateKt.r();
            }
            f2 = SnapshotStateKt.i(g2, e2);
        }
        return new DynamicValueHolder(f2);
    }
}
