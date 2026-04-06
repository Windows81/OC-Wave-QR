package com.hansecom.abt.data.preferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Singleton
@Metadata
public final class AppPreferences implements DataStore<Preferences> {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f33304b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33305c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static final Preferences.Key f33306d = PreferencesKeys.g("ignoredSoftUpdateVersion");

    /* renamed from: e  reason: collision with root package name */
    public static final Preferences.Key f33307e = PreferencesKeys.a("cashPaymentGuideShown");

    /* renamed from: f  reason: collision with root package name */
    public static final Preferences.Key f33308f = PreferencesKeys.g("defaultPaymentMethod");

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DataStore f33309a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AppPreferences(Context context) {
        Intrinsics.i(context, "context");
        this.f33309a = PreferencesDataStoreKt.c(context);
    }

    public Object a(Function2 function2, Continuation continuation) {
        return this.f33309a.a(function2, continuation);
    }

    public final Object b(Continuation continuation) {
        return PreferencesDataStoreKt.d(this, f33307e, Boxing.a(false), continuation);
    }

    public final Flow c() {
        return PreferencesDataStoreKt.a(this, f33307e, Boolean.FALSE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.preferences.AppPreferences$getDefaultPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.preferences.AppPreferences$getDefaultPaymentMethod$1 r0 = (com.hansecom.abt.data.preferences.AppPreferences$getDefaultPaymentMethod$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.AppPreferences$getDefaultPaymentMethod$1 r0 = new com.hansecom.abt.data.preferences.AppPreferences$getDefaultPaymentMethod$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            androidx.datastore.preferences.core.Preferences$Key r5 = f33308f
            r0.E = r3
            java.lang.Object r5 = com.hansecom.abt.data.preferences.PreferencesDataStoreKt.b(r4, r5, r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x006b
            kotlin.enums.EnumEntries r0 = com.hansecom.abt.data.localDomain.PaymentMethodType.f()
            java.util.Iterator r0 = r0.iterator()
        L_0x004b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0063
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.hansecom.abt.data.localDomain.PaymentMethodType r2 = (com.hansecom.abt.data.localDomain.PaymentMethodType) r2
            java.lang.String r2 = r2.name()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r5)
            if (r2 == 0) goto L_0x004b
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            com.hansecom.abt.data.localDomain.PaymentMethodType r1 = (com.hansecom.abt.data.localDomain.PaymentMethodType) r1
            if (r1 != 0) goto L_0x006d
            com.hansecom.abt.data.localDomain.PaymentMethodType r1 = com.hansecom.abt.data.localDomain.PaymentMethodType.CREDIT_CARD
            goto L_0x006d
        L_0x006b:
            com.hansecom.abt.data.localDomain.PaymentMethodType r1 = com.hansecom.abt.data.localDomain.PaymentMethodType.CREDIT_CARD
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.AppPreferences.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object e(Continuation continuation) {
        return PreferencesDataStoreKt.b(this, f33306d, continuation);
    }

    public final Object f(boolean z2, Continuation continuation) {
        Object e2 = PreferencesDataStoreKt.e(this, f33307e, Boxing.a(z2), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final Object g(PaymentMethodType paymentMethodType, Continuation continuation) {
        if (paymentMethodType != PaymentMethodType.CASH) {
            Object e2 = PreferencesDataStoreKt.e(this, f33308f, paymentMethodType.name(), continuation);
            return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
        }
        throw new IllegalArgumentException("Cash payment method cannot be set as default");
    }

    public Flow getData() {
        return this.f33309a.getData();
    }

    public final Object h(String str, Continuation continuation) {
        Object e2 = PreferencesDataStoreKt.e(this, f33306d, str, continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
