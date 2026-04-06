package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AsyncFontListLoader implements State<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final TypefaceRequest f18674A;

    /* renamed from: B  reason: collision with root package name */
    public final AsyncTypefaceCache f18675B;
    public final Function1 C;
    public final PlatformFontLoader D;
    public final MutableState E;
    public boolean F = true;

    /* renamed from: z  reason: collision with root package name */
    public final List f18676z;

    public AsyncFontListLoader(List list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1 function1, PlatformFontLoader platformFontLoader) {
        this.f18676z = list;
        this.f18674A = typefaceRequest;
        this.f18675B = asyncTypefaceCache;
        this.C = function1;
        this.D = platformFontLoader;
        this.E = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private void setValue(Object obj) {
        this.E.setValue(obj);
    }

    public Object getValue() {
        return this.E.getValue();
    }

    public final boolean h() {
        return this.F;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: androidx.compose.ui.text.font.Font} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078 A[SYNTHETIC, Splitter:B:27:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f8 A[SYNTHETIC, Splitter:B:40:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(kotlin.coroutines.Continuation r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$load$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = (androidx.compose.ui.text.font.AsyncFontListLoader$load$1) r2
            int r3 = r2.J
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.J = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.H
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.J
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0068
            if (r4 == r7) goto L_0x004a
            if (r4 != r6) goto L_0x0042
            int r4 = r2.G
            int r9 = r2.F
            java.lang.Object r10 = r2.D
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.C
            androidx.compose.ui.text.font.AsyncFontListLoader r11 = (androidx.compose.ui.text.font.AsyncFontListLoader) r11
            kotlin.ResultKt.b(r0)     // Catch:{ all -> 0x003f }
            goto L_0x010c
        L_0x003f:
            r0 = move-exception
            goto L_0x0132
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            int r4 = r2.G
            int r9 = r2.F
            java.lang.Object r10 = r2.E
            androidx.compose.ui.text.font.Font r10 = (androidx.compose.ui.text.font.Font) r10
            java.lang.Object r11 = r2.D
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.C
            androidx.compose.ui.text.font.AsyncFontListLoader r12 = (androidx.compose.ui.text.font.AsyncFontListLoader) r12
            kotlin.ResultKt.b(r0)     // Catch:{ all -> 0x0064 }
            r15 = r12
            r18 = r11
            r11 = r10
            r10 = r18
            goto L_0x00bf
        L_0x0064:
            r0 = move-exception
            r11 = r12
            goto L_0x0132
        L_0x0068:
            kotlin.ResultKt.b(r0)
            java.util.List r0 = r1.f18676z     // Catch:{ all -> 0x0130 }
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x0130 }
            int r4 = r4.size()     // Catch:{ all -> 0x0130 }
            r15 = r1
            r14 = r8
        L_0x0076:
            if (r14 >= r4) goto L_0x0115
            java.lang.Object r9 = r0.get(r14)     // Catch:{ all -> 0x00f5 }
            r13 = r9
            androidx.compose.ui.text.font.Font r13 = (androidx.compose.ui.text.font.Font) r13     // Catch:{ all -> 0x00f5 }
            int r9 = r13.b()     // Catch:{ all -> 0x00f5 }
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r10 = androidx.compose.ui.text.font.FontLoadingStrategy.f18719b     // Catch:{ all -> 0x00f5 }
            int r10 = r10.a()     // Catch:{ all -> 0x00f5 }
            boolean r9 = androidx.compose.ui.text.font.FontLoadingStrategy.f(r9, r10)     // Catch:{ all -> 0x00f5 }
            if (r9 == 0) goto L_0x0110
            androidx.compose.ui.text.font.AsyncTypefaceCache r9 = r15.f18675B     // Catch:{ all -> 0x00f5 }
            androidx.compose.ui.text.font.PlatformFontLoader r11 = r15.D     // Catch:{ all -> 0x00f5 }
            androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 r12 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1     // Catch:{ all -> 0x00f5 }
            r12.<init>(r15, r13, r5)     // Catch:{ all -> 0x00f5 }
            r2.C = r15     // Catch:{ all -> 0x00f5 }
            r2.D = r0     // Catch:{ all -> 0x00f5 }
            r2.E = r13     // Catch:{ all -> 0x00f5 }
            r2.F = r14     // Catch:{ all -> 0x00f5 }
            r2.G = r4     // Catch:{ all -> 0x00f5 }
            r2.J = r7     // Catch:{ all -> 0x00f5 }
            r16 = 0
            r10 = r13
            r17 = r12
            r12 = r16
            r16 = r13
            r13 = r17
            r17 = r14
            r14 = r2
            java.lang.Object r9 = r9.g(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00f5 }
            if (r9 != r3) goto L_0x00b9
            return r3
        L_0x00b9:
            r10 = r0
            r0 = r9
            r11 = r16
            r9 = r17
        L_0x00bf:
            if (r0 == 0) goto L_0x00f8
            androidx.compose.ui.text.font.TypefaceRequest r3 = r15.f18674A     // Catch:{ all -> 0x00f5 }
            int r3 = r3.e()     // Catch:{ all -> 0x00f5 }
            androidx.compose.ui.text.font.TypefaceRequest r4 = r15.f18674A     // Catch:{ all -> 0x00f5 }
            androidx.compose.ui.text.font.FontWeight r4 = r4.f()     // Catch:{ all -> 0x00f5 }
            androidx.compose.ui.text.font.TypefaceRequest r5 = r15.f18674A     // Catch:{ all -> 0x00f5 }
            int r5 = r5.d()     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = androidx.compose.ui.text.font.FontSynthesis_androidKt.a(r3, r0, r11, r4, r5)     // Catch:{ all -> 0x00f5 }
            r15.setValue(r0)     // Catch:{ all -> 0x00f5 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00f5 }
            kotlin.coroutines.CoroutineContext r2 = r2.f()
            boolean r2 = kotlinx.coroutines.JobKt.n(r2)
            r15.F = r8
            kotlin.jvm.functions.Function1 r3 = r15.C
            androidx.compose.ui.text.font.TypefaceResult$Immutable r4 = new androidx.compose.ui.text.font.TypefaceResult$Immutable
            java.lang.Object r5 = r15.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            return r0
        L_0x00f5:
            r0 = move-exception
            r11 = r15
            goto L_0x0132
        L_0x00f8:
            r2.C = r15     // Catch:{ all -> 0x00f5 }
            r2.D = r10     // Catch:{ all -> 0x00f5 }
            r2.E = r5     // Catch:{ all -> 0x00f5 }
            r2.F = r9     // Catch:{ all -> 0x00f5 }
            r2.G = r4     // Catch:{ all -> 0x00f5 }
            r2.J = r6     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = kotlinx.coroutines.YieldKt.a(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != r3) goto L_0x010b
            return r3
        L_0x010b:
            r11 = r15
        L_0x010c:
            r14 = r9
            r0 = r10
            r15 = r11
            goto L_0x0112
        L_0x0110:
            r17 = r14
        L_0x0112:
            int r14 = r14 + r7
            goto L_0x0076
        L_0x0115:
            kotlin.coroutines.CoroutineContext r0 = r2.f()
            boolean r0 = kotlinx.coroutines.JobKt.n(r0)
            r15.F = r8
            kotlin.jvm.functions.Function1 r2 = r15.C
            androidx.compose.ui.text.font.TypefaceResult$Immutable r3 = new androidx.compose.ui.text.font.TypefaceResult$Immutable
            java.lang.Object r4 = r15.getValue()
            r3.<init>(r4, r0)
            r2.invoke(r3)
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        L_0x0130:
            r0 = move-exception
            r11 = r1
        L_0x0132:
            kotlin.coroutines.CoroutineContext r2 = r2.f()
            boolean r2 = kotlinx.coroutines.JobKt.n(r2)
            r11.F = r8
            kotlin.jvm.functions.Function1 r3 = r11.C
            androidx.compose.ui.text.font.TypefaceResult$Immutable r4 = new androidx.compose.ui.text.font.TypefaceResult$Immutable
            java.lang.Object r5 = r11.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(androidx.compose.ui.text.font.Font r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r7 = r0.C
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.ui.text.font.Font) r7
            kotlin.ResultKt.b(r8)     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            goto L_0x004f
        L_0x002e:
            r8 = move-exception
            goto L_0x0051
        L_0x0030:
            r7 = move-exception
            goto L_0x007d
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            kotlin.ResultKt.b(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            r8.<init>(r6, r7, r4)     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            r0.C = r7     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            r0.F = r3     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.d(r2, r8, r0)     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            if (r8 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = r8
            goto L_0x0087
        L_0x0051:
            kotlin.coroutines.CoroutineContext r1 = r0.f()
            kotlinx.coroutines.CoroutineExceptionHandler$Key r2 = kotlinx.coroutines.CoroutineExceptionHandler.f41378w
            kotlin.coroutines.CoroutineContext$Element r1 = r1.d(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 == 0) goto L_0x0087
            kotlin.coroutines.CoroutineContext r0 = r0.f()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.m0(r0, r2)
            goto L_0x0087
        L_0x007d:
            kotlin.coroutines.CoroutineContext r8 = r0.f()
            boolean r8 = kotlinx.coroutines.JobKt.n(r8)
            if (r8 == 0) goto L_0x0088
        L_0x0087:
            return r4
        L_0x0088:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.m(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
