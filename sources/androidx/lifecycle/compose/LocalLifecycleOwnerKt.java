package androidx.lifecycle.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

@Metadata
public final class LocalLifecycleOwnerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f22039a;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r1 = null;
     */
    static {
        /*
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.f40519A     // Catch:{ all -> 0x002b }
            java.lang.Class<androidx.lifecycle.LifecycleOwner> r1 = androidx.lifecycle.LifecycleOwner.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.Intrinsics.f(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ all -> 0x002b }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch:{ all -> 0x002b }
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch:{ all -> 0x002b }
            int r3 = r2.length     // Catch:{ all -> 0x002b }
            r4 = 0
        L_0x001e:
            if (r4 >= r3) goto L_0x002d
            r5 = r2[r4]     // Catch:{ all -> 0x002b }
            boolean r5 = r5 instanceof kotlin.Deprecated     // Catch:{ all -> 0x002b }
            if (r5 == 0) goto L_0x0028
        L_0x0026:
            r1 = r0
            goto L_0x0037
        L_0x0028:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x002b:
            r1 = move-exception
            goto L_0x003c
        L_0x002d:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch:{ all -> 0x002b }
            boolean r2 = r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0026
            androidx.compose.runtime.ProvidableCompositionLocal r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1     // Catch:{ all -> 0x002b }
        L_0x0037:
            java.lang.Object r1 = kotlin.Result.b(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0046
        L_0x003c:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r1 = kotlin.ResultKt.a(r1)
            java.lang.Object r1 = kotlin.Result.b(r1)
        L_0x0046:
            boolean r2 = kotlin.Result.g(r1)
            if (r2 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = (androidx.compose.runtime.ProvidableCompositionLocal) r0
            if (r0 != 0) goto L_0x005b
            androidx.lifecycle.compose.a r0 = new androidx.lifecycle.compose.a
            r0.<init>()
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.CompositionLocalKt.j(r0)
        L_0x005b:
            f22039a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LocalLifecycleOwnerKt.<clinit>():void");
    }

    public static final LifecycleOwner b() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    public static final ProvidableCompositionLocal c() {
        return f22039a;
    }
}
