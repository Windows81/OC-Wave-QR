package androidx.privacysandbox.ads.adservices.appsetid;

import android.adservices.appsetid.AppSetId;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public abstract class AppSetIdManager {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22688a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext4Impl extends AppSetIdManager {

        /* renamed from: b  reason: collision with root package name */
        public final android.adservices.appsetid.AppSetIdManager f22689b;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1
                if (r0 == 0) goto L_0x0013
                r0 = r5
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1 r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1) r0
                int r1 = r0.F
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.F = r1
                goto L_0x0018
            L_0x0013:
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1 r0 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1
                r0.<init>(r4, r5)
            L_0x0018:
                java.lang.Object r5 = r0.D
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.F
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r0 = r0.C
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl) r0
                kotlin.ResultKt.b(r5)
                goto L_0x0044
            L_0x002d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0035:
                kotlin.ResultKt.b(r5)
                r0.C = r4
                r0.F = r3
                java.lang.Object r5 = r4.d(r0)
                if (r5 != r1) goto L_0x0043
                return r1
            L_0x0043:
                r0 = r4
            L_0x0044:
                android.adservices.appsetid.AppSetId r5 = androidx.privacysandbox.ads.adservices.appsetid.a.a(r5)
                androidx.privacysandbox.ads.adservices.appsetid.AppSetId r5 = r0.c(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl.a(kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final AppSetId c(AppSetId appSetId) {
            if (appSetId.getScope() == 1) {
                String a2 = appSetId.getId();
                Intrinsics.h(a2, "response.id");
                return new AppSetId(a2, 1);
            }
            String a3 = appSetId.getId();
            Intrinsics.h(a3, "response.id");
            return new AppSetId(a3, 2);
        }

        public final Object d(Continuation continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22689b.getAppSetId(new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public abstract Object a(Continuation continuation);
}
