package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class SnackbarHostState {

    /* renamed from: a  reason: collision with root package name */
    public final Mutex f11168a = MutexKt.b(false, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f11169b = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    @Metadata
    public static final class SnackbarDataImpl implements SnackbarData {

        /* renamed from: a  reason: collision with root package name */
        public final SnackbarVisuals f11170a;

        /* renamed from: b  reason: collision with root package name */
        public final CancellableContinuation f11171b;

        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, CancellableContinuation cancellableContinuation) {
            this.f11170a = snackbarVisuals;
            this.f11171b = cancellableContinuation;
        }

        public SnackbarVisuals a() {
            return this.f11170a;
        }

        public void b() {
            if (this.f11171b.b()) {
                CancellableContinuation cancellableContinuation = this.f11171b;
                Result.Companion companion = Result.f40519A;
                cancellableContinuation.q(Result.b(SnackbarResult.ActionPerformed));
            }
        }

        public void dismiss() {
            if (this.f11171b.b()) {
                CancellableContinuation cancellableContinuation = this.f11171b;
                Result.Companion companion = Result.f40519A;
                cancellableContinuation.q(Result.b(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarDataImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return Intrinsics.d(a(), snackbarDataImpl.a()) && Intrinsics.d(this.f11171b, snackbarDataImpl.f11171b);
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f11171b.hashCode();
        }
    }

    @Metadata
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {

        /* renamed from: a  reason: collision with root package name */
        public final String f11172a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11173b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f11174c;

        /* renamed from: d  reason: collision with root package name */
        public final SnackbarDuration f11175d;

        public String a() {
            return this.f11172a;
        }

        public boolean b() {
            return this.f11174c;
        }

        public String c() {
            return this.f11173b;
        }

        public SnackbarDuration d() {
            return this.f11175d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarVisualsImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            return Intrinsics.d(a(), snackbarVisualsImpl.a()) && Intrinsics.d(c(), snackbarVisualsImpl.c()) && b() == snackbarVisualsImpl.b() && d() == snackbarVisualsImpl.d();
        }

        public int hashCode() {
            int hashCode = a().hashCode() * 31;
            String c2 = c();
            return ((((hashCode + (c2 != null ? c2.hashCode() : 0)) * 31) + Boolean.hashCode(b())) * 31) + d().hashCode();
        }
    }

    public final SnackbarData b() {
        return (SnackbarData) this.f11169b.getValue();
    }

    public final void c(SnackbarData snackbarData) {
        this.f11169b.setValue(snackbarData);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00a2=Splitter:B:34:0x00a2, B:29:0x0099=Splitter:B:29:0x0099} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(androidx.compose.material3.SnackbarVisuals r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.SnackbarHostState$showSnackbar$2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0052
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.E
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r8 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r8
            java.lang.Object r8 = r0.D
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r0 = r0.C
            androidx.compose.material3.SnackbarVisuals r0 = (androidx.compose.material3.SnackbarVisuals) r0
            kotlin.ResultKt.b(r9)     // Catch:{ all -> 0x0039 }
            goto L_0x0099
        L_0x0039:
            r9 = move-exception
            goto L_0x00a2
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.D
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r2 = r0.C
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            kotlin.ResultKt.b(r9)
            r9 = r8
            r8 = r2
            goto L_0x0064
        L_0x0052:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.f11168a
            r0.C = r8
            r0.D = r9
            r0.H = r4
            java.lang.Object r2 = r9.d(r5, r0)
            if (r2 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r0.C = r8     // Catch:{ all -> 0x008e }
            r0.D = r9     // Catch:{ all -> 0x008e }
            r0.E = r0     // Catch:{ all -> 0x008e }
            r0.H = r3     // Catch:{ all -> 0x008e }
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch:{ all -> 0x008e }
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch:{ all -> 0x008e }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x008e }
            r2.G()     // Catch:{ all -> 0x008e }
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r3 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch:{ all -> 0x008e }
            r3.<init>(r8, r2)     // Catch:{ all -> 0x008e }
            r7.c(r3)     // Catch:{ all -> 0x008e }
            java.lang.Object r8 = r2.A()     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch:{ all -> 0x008e }
            if (r8 != r2) goto L_0x0093
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch:{ all -> 0x008e }
            goto L_0x0093
        L_0x008e:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x00a2
        L_0x0093:
            if (r8 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0099:
            r7.c(r5)     // Catch:{ all -> 0x00a0 }
            r8.e(r5)
            return r9
        L_0x00a0:
            r9 = move-exception
            goto L_0x00a6
        L_0x00a2:
            r7.c(r5)     // Catch:{ all -> 0x00a0 }
            throw r9     // Catch:{ all -> 0x00a0 }
        L_0x00a6:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.d(androidx.compose.material3.SnackbarVisuals, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
