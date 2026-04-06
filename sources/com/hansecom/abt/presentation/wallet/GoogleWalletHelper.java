package com.hansecom.abt.presentation.wallet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.pay.Pay;
import com.google.android.gms.pay.PayClient;
import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.ktx.Firebase;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Singleton
@Metadata
public final class GoogleWalletHelper {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f37847e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f37848f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Context f37849a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f37850b = LazyKt.b(new a(this));

    /* renamed from: c  reason: collision with root package name */
    public Function2 f37851c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f37852d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public GoogleWalletHelper(Context context) {
        Intrinsics.i(context, "context");
        this.f37849a = context;
    }

    public static final PayClient c(GoogleWalletHelper googleWalletHelper) {
        return Pay.a(googleWalletHelper.f37849a);
    }

    public final boolean b(int i2) {
        return i2 == 3 || i2 == 1;
    }

    public final PayClient d() {
        return (PayClient) this.f37850b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.wallet.GoogleWalletHelper$getIsGoogleWalletAvailable$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.wallet.GoogleWalletHelper$getIsGoogleWalletAvailable$1 r0 = (com.hansecom.abt.presentation.wallet.GoogleWalletHelper$getIsGoogleWalletAvailable$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.wallet.GoogleWalletHelper$getIsGoogleWalletAvailable$1 r0 = new com.hansecom.abt.presentation.wallet.GoogleWalletHelper$getIsGoogleWalletAvailable$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.wallet.GoogleWalletHelper r0 = (com.hansecom.abt.presentation.wallet.GoogleWalletHelper) r0
            kotlin.ResultKt.b(r6)     // Catch:{ all -> 0x0071 }
            goto L_0x0056
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            kotlin.ResultKt.b(r6)
            java.lang.Boolean r6 = r5.f37852d     // Catch:{ all -> 0x0071 }
            if (r6 != 0) goto L_0x006a
            com.google.android.gms.pay.PayClient r6 = r5.d()     // Catch:{ all -> 0x0071 }
            com.google.android.gms.tasks.Task r6 = r6.c(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "getPayApiAvailabilityStatus(...)"
            kotlin.jvm.internal.Intrinsics.h(r6, r2)     // Catch:{ all -> 0x0071 }
            r0.C = r5     // Catch:{ all -> 0x0071 }
            r0.F = r4     // Catch:{ all -> 0x0071 }
            java.lang.Object r6 = kotlinx.coroutines.tasks.TasksKt.a(r6, r0)     // Catch:{ all -> 0x0071 }
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r5
        L_0x0056:
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0071 }
            if (r6 != 0) goto L_0x005b
            goto L_0x0062
        L_0x005b:
            int r6 = r6.intValue()     // Catch:{ all -> 0x0071 }
            if (r6 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r4 = r3
        L_0x0063:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r4)     // Catch:{ all -> 0x0071 }
            r0.f37852d = r6     // Catch:{ all -> 0x0071 }
            goto L_0x006b
        L_0x006a:
            r0 = r5
        L_0x006b:
            java.lang.Boolean r6 = r0.f37852d     // Catch:{ all -> 0x0071 }
            kotlin.jvm.internal.Intrinsics.f(r6)     // Catch:{ all -> 0x0071 }
            return r6
        L_0x0071:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.wallet.GoogleWalletHelper.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(int i2, int i3, Intent intent) {
        Function2 function2 = this.f37851c;
        if (function2 != null) {
            function2.m(Integer.valueOf(i3), intent != null ? intent.getStringExtra("extra_api_error_message") : null);
        }
    }

    public final void g(Activity activity) {
        Intrinsics.i(activity, "activity");
        try {
            Result.Companion companion = Result.f40519A;
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage("com.google.android.apps.walletnfcrel");
            intent.setFlags(268435456);
            activity.startActivity(intent);
            Result.b(Unit.f40552a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            Result.b(ResultKt.a(th));
        }
    }

    public final void h(String str, Activity activity, Function2 function2) {
        Object obj;
        Intrinsics.i(str, "link");
        Intrinsics.i(activity, "activity");
        Intrinsics.i(function2, "callback");
        try {
            Result.Companion companion = Result.f40519A;
            this.f37851c = function2;
            activity.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(str)), 1);
            obj = Result.b(Unit.f40552a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        Throwable e2 = Result.e(obj);
        if (e2 != null) {
            Timber.f44337a.c(e2);
            FirebaseCrashlyticsKt.a(Firebase.f30878a).c(e2);
            function2.m(100, e2.getMessage());
        }
    }

    public final void i(String str, Activity activity, Function2 function2) {
        Object obj;
        Intrinsics.i(str, "jwt");
        Intrinsics.i(activity, "activity");
        Intrinsics.i(function2, "callback");
        try {
            Result.Companion companion = Result.f40519A;
            this.f37851c = function2;
            d().b(str, activity, 3);
            obj = Result.b(Unit.f40552a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        Throwable e2 = Result.e(obj);
        if (e2 != null) {
            Timber.f44337a.c(e2);
            FirebaseCrashlyticsKt.a(Firebase.f30878a).c(e2);
            function2.m(100, e2.getMessage());
        }
    }
}
