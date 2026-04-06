package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class SnackbarHostState {

    /* renamed from: a  reason: collision with root package name */
    public final Mutex f8452a = MutexKt.b(false, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f8453b = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    @Metadata
    public static final class SnackbarDataImpl implements SnackbarData {

        /* renamed from: a  reason: collision with root package name */
        public final String f8454a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8455b;

        /* renamed from: c  reason: collision with root package name */
        public final SnackbarDuration f8456c;

        /* renamed from: d  reason: collision with root package name */
        public final CancellableContinuation f8457d;

        public SnackbarDataImpl(String str, String str2, SnackbarDuration snackbarDuration, CancellableContinuation cancellableContinuation) {
            this.f8454a = str;
            this.f8455b = str2;
            this.f8456c = snackbarDuration;
            this.f8457d = cancellableContinuation;
        }

        public String a() {
            return this.f8454a;
        }

        public void b() {
            if (this.f8457d.b()) {
                CancellableContinuation cancellableContinuation = this.f8457d;
                Result.Companion companion = Result.f40519A;
                cancellableContinuation.q(Result.b(SnackbarResult.ActionPerformed));
            }
        }

        public String c() {
            return this.f8455b;
        }

        public SnackbarDuration d() {
            return this.f8456c;
        }

        public void dismiss() {
            if (this.f8457d.b()) {
                CancellableContinuation cancellableContinuation = this.f8457d;
                Result.Companion companion = Result.f40519A;
                cancellableContinuation.q(Result.b(SnackbarResult.Dismissed));
            }
        }
    }

    public final SnackbarData b() {
        return (SnackbarData) this.f8453b.getValue();
    }

    public final void c(SnackbarData snackbarData) {
        this.f8453b.setValue(snackbarData);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: androidx.compose.material.SnackbarDuration} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6 A[Catch:{ all -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x00c3=Splitter:B:30:0x00c3, B:35:0x00cc=Splitter:B:35:0x00cc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r9, java.lang.String r10, androidx.compose.material.SnackbarDuration r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SnackbarHostState$showSnackbar$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.K = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = new androidx.compose.material.SnackbarHostState$showSnackbar$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.K
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x006f
            if (r2 == r4) goto L_0x0051
            if (r2 != r3) goto L_0x0049
            java.lang.Object r9 = r0.H
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r9 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r9
            java.lang.Object r9 = r0.G
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.Object r10 = r0.F
            androidx.compose.material.SnackbarDuration r10 = (androidx.compose.material.SnackbarDuration) r10
            java.lang.Object r10 = r0.E
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.D
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.C
            androidx.compose.material.SnackbarHostState r10 = (androidx.compose.material.SnackbarHostState) r10
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x0046 }
            goto L_0x00c3
        L_0x0046:
            r11 = move-exception
            goto L_0x00cc
        L_0x0049:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0051:
            java.lang.Object r9 = r0.G
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.Object r10 = r0.F
            r11 = r10
            androidx.compose.material.SnackbarDuration r11 = (androidx.compose.material.SnackbarDuration) r11
            java.lang.Object r10 = r0.E
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.D
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.C
            androidx.compose.material.SnackbarHostState r6 = (androidx.compose.material.SnackbarHostState) r6
            kotlin.ResultKt.b(r12)
            r12 = r9
            r9 = r2
            r2 = r11
            r11 = r10
            r10 = r6
            goto L_0x008a
        L_0x006f:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.sync.Mutex r12 = r8.f8452a
            r0.C = r8
            r0.D = r9
            r0.E = r10
            r0.F = r11
            r0.G = r12
            r0.K = r4
            java.lang.Object r2 = r12.d(r5, r0)
            if (r2 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r2 = r11
            r11 = r10
            r10 = r8
        L_0x008a:
            r0.C = r10     // Catch:{ all -> 0x00ba }
            r0.D = r9     // Catch:{ all -> 0x00ba }
            r0.E = r11     // Catch:{ all -> 0x00ba }
            r0.F = r2     // Catch:{ all -> 0x00ba }
            r0.G = r12     // Catch:{ all -> 0x00ba }
            r0.H = r0     // Catch:{ all -> 0x00ba }
            r0.K = r3     // Catch:{ all -> 0x00ba }
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch:{ all -> 0x00ba }
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch:{ all -> 0x00ba }
            r3.<init>(r6, r4)     // Catch:{ all -> 0x00ba }
            r3.G()     // Catch:{ all -> 0x00ba }
            androidx.compose.material.SnackbarHostState$SnackbarDataImpl r4 = new androidx.compose.material.SnackbarHostState$SnackbarDataImpl     // Catch:{ all -> 0x00ba }
            r4.<init>(r9, r11, r2, r3)     // Catch:{ all -> 0x00ba }
            r10.c(r4)     // Catch:{ all -> 0x00ba }
            java.lang.Object r9 = r3.A()     // Catch:{ all -> 0x00ba }
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch:{ all -> 0x00ba }
            if (r9 != r11) goto L_0x00bd
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch:{ all -> 0x00ba }
            goto L_0x00bd
        L_0x00ba:
            r11 = move-exception
            r9 = r12
            goto L_0x00cc
        L_0x00bd:
            if (r9 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            r7 = r12
            r12 = r9
            r9 = r7
        L_0x00c3:
            r10.c(r5)     // Catch:{ all -> 0x00ca }
            r9.e(r5)
            return r12
        L_0x00ca:
            r10 = move-exception
            goto L_0x00d0
        L_0x00cc:
            r10.c(r5)     // Catch:{ all -> 0x00ca }
            throw r11     // Catch:{ all -> 0x00ca }
        L_0x00d0:
            r9.e(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.d(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
