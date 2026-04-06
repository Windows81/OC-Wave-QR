package com.hansecom.abt.data.preferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class LockPreferences implements DataStore<Preferences> {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f33317b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33318c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static final Preferences.Key f33319d = PreferencesKeys.a("isBiometricsAvailable");

    /* renamed from: e  reason: collision with root package name */
    public static final Preferences.Key f33320e = PreferencesKeys.a("isLocked");

    /* renamed from: f  reason: collision with root package name */
    public static final Preferences.Key f33321f = PreferencesKeys.a("biometricsLockActive");

    /* renamed from: g  reason: collision with root package name */
    public static final Preferences.Key f33322g = PreferencesKeys.g("biometricUnlockEndDateTime");

    /* renamed from: h  reason: collision with root package name */
    public static final Preferences.Key f33323h = PreferencesKeys.a("firstUserRun");

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DataStore f33324a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LockPreferences(Context context) {
        Intrinsics.i(context, "context");
        this.f33324a = PreferencesDataStoreKt.c(context);
    }

    public Object a(Function2 function2, Continuation continuation) {
        return this.f33324a.a(function2, continuation);
    }

    public final Flow b() {
        return new LockPreferences$getBiometricUnlockEndDateTime$$inlined$map$1(PreferencesDataStoreKt.a(this, f33322g, ""));
    }

    public final Object c(Continuation continuation) {
        return PreferencesDataStoreKt.d(this, f33323h, Boxing.a(false), continuation);
    }

    public final Object d(Continuation continuation) {
        return PreferencesDataStoreKt.d(this, f33319d, Boxing.a(false), continuation);
    }

    public final Flow e() {
        return PreferencesDataStoreKt.a(this, f33319d, Boolean.FALSE);
    }

    public final Object f(Continuation continuation) {
        return PreferencesDataStoreKt.d(this, f33321f, Boxing.a(false), continuation);
    }

    public final Flow g() {
        return PreferencesDataStoreKt.a(this, f33321f, Boolean.FALSE);
    }

    public Flow getData() {
        return this.f33324a.getData();
    }

    public final Flow h() {
        return PreferencesDataStoreKt.a(this, f33320e, Boolean.FALSE);
    }

    public final Object i(LocalDateTime localDateTime, Continuation continuation) {
        String str;
        Preferences.Key key = f33322g;
        if (localDateTime == null || (str = localDateTime.toString()) == null) {
            str = "";
        }
        Object e2 = PreferencesDataStoreKt.e(this, key, str, continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final Object j(boolean z2, Continuation continuation) {
        Object e2 = PreferencesDataStoreKt.e(this, f33323h, Boxing.a(z2), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final Object k(boolean z2, Continuation continuation) {
        Object e2 = PreferencesDataStoreKt.e(this, f33319d, Boxing.a(z2), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final Object l(boolean z2, Continuation continuation) {
        Object e2 = PreferencesDataStoreKt.e(this, f33321f, Boxing.a(z2), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final Object m(boolean z2, Continuation continuation) {
        Object e2 = PreferencesDataStoreKt.e(this, f33320e, Boxing.a(z2), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
