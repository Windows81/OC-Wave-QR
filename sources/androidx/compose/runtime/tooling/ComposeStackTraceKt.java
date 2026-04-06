package androidx.compose.runtime.tooling;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class ComposeStackTraceKt {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            java.util.List r0 = kotlin.collections.CollectionsKt.c()
            java.util.List r13 = kotlin.collections.CollectionsKt.Q(r13)
            r1 = r13
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L_0x0014:
            if (r4 >= r1) goto L_0x00c7
            java.lang.Object r7 = r13.get(r4)
            androidx.compose.runtime.tooling.ComposeStackTraceFrame r7 = (androidx.compose.runtime.tooling.ComposeStackTraceFrame) r7
            androidx.compose.runtime.tooling.SourceInformation r8 = r7.d()
            java.lang.String r9 = r8.a()
            if (r9 != 0) goto L_0x0037
            boolean r9 = r8.e()
            if (r9 == 0) goto L_0x002f
            java.lang.String r9 = "<lambda>"
            goto L_0x0030
        L_0x002f:
            r9 = r2
        L_0x0030:
            if (r9 != 0) goto L_0x0037
            if (r5 != 0) goto L_0x0038
            java.lang.String r5 = "<unknown function>"
            goto L_0x0038
        L_0x0037:
            r5 = r9
        L_0x0038:
            java.lang.String r9 = r8.d()
            if (r9 != 0) goto L_0x0043
            if (r6 != 0) goto L_0x0044
            java.lang.String r6 = "<unknown file>"
            goto L_0x0044
        L_0x0043:
            r6 = r9
        L_0x0044:
            java.util.List r9 = r8.b()
            java.lang.Integer r10 = r7.c()
            if (r10 == 0) goto L_0x0073
            java.lang.Integer r10 = r7.c()
            int r10 = r10.intValue()
            int r11 = r9.size()
            if (r10 >= r11) goto L_0x0073
            java.lang.Integer r7 = r7.c()
            int r7 = r7.intValue()
            java.lang.Object r7 = r9.get(r7)
            androidx.compose.runtime.tooling.LocationSourceInformation r7 = (androidx.compose.runtime.tooling.LocationSourceInformation) r7
            int r7 = r7.a()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            goto L_0x0075
        L_0x0073:
            java.lang.String r7 = "<unknown line>"
        L_0x0075:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r10 = 40
            r9.append(r10)
            r9.append(r6)
            r10 = 58
            r9.append(r10)
            r9.append(r7)
            r7 = 41
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r7, r9)
            boolean r9 = r8.e()
            if (r9 != 0) goto L_0x00a7
            java.lang.Object r9 = kotlin.collections.CollectionsKt.L(r0)
            java.lang.String r9 = (java.lang.String) r9
        L_0x00a7:
            java.lang.String r9 = r8.a()
            java.lang.String r10 = "rememberCompositionContext"
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L_0x00c0
            java.lang.String r8 = r8.c()
            java.lang.String r9 = "9igjgp"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 == 0) goto L_0x00c0
            goto L_0x00c3
        L_0x00c0:
            r0.add(r7)
        L_0x00c3:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x00c7:
            java.util.List r13 = kotlin.collections.CollectionsKt.a(r0)
            java.util.List r13 = kotlin.collections.CollectionsKt.Q(r13)
            r0 = r13
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
        L_0x00d6:
            if (r3 >= r0) goto L_0x0102
            java.lang.Object r1 = r13.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "\tat "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r12.append(r1)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.h(r12, r1)
            r2 = 10
            r12.append(r2)
            kotlin.jvm.internal.Intrinsics.h(r12, r1)
            int r3 = r3 + 1
            goto L_0x00d6
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.tooling.ComposeStackTraceKt.a(java.lang.StringBuilder, java.util.List):void");
    }

    public static final Throwable b(Throwable th, Function0 function0) {
        c(th, function0);
        return th;
    }

    public static final boolean c(Throwable th, Function0 function0) {
        DiagnosticComposeException diagnosticComposeException;
        Iterable b2 = ExceptionsKt.b(th);
        boolean z2 = false;
        if (!(b2 instanceof Collection) || !((Collection) b2).isEmpty()) {
            Iterator it = b2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Throwable) it.next()) instanceof DiagnosticComposeException) {
                        break;
                    }
                }
            }
            return z2;
        }
        try {
            List list = (List) function0.invoke();
            boolean isEmpty = list.isEmpty();
            z2 = !isEmpty;
            diagnosticComposeException = !isEmpty ? new DiagnosticComposeException(list) : null;
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            ExceptionsKt.a(th, diagnosticComposeException);
        }
        return z2;
    }
}
