package com.hansecom.abt.api;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.GooglePayConfig;
import com.hansecom.abt.data.preferences.PreferencesDataStoreKt;
import com.hansecom.abt.impl.Realm;
import java.util.NoSuchElementException;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Singleton
@Metadata
public final class RealmPreferences implements DataStore<Preferences> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f33120d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f33121e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final Preferences.Key f33122f = PreferencesKeys.g("realm");

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DataStore f33123a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f33124b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f33125c = LazyKt.b(new d(this));

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RealmPreferences(Context context, AppInfo appInfo) {
        int i2;
        Intrinsics.i(context, "context");
        Intrinsics.i(appInfo, "appInfo");
        this.f33123a = PreferencesDataStoreKt.c(context);
        this.f33124b = appInfo.b();
        EnumEntries<Realm> k2 = k();
        boolean z2 = false;
        if (k2 == null || !k2.isEmpty()) {
            i2 = 0;
            for (Realm j2 : k2) {
                if (j2.j() && (i2 = i2 + 1) < 0) {
                    CollectionsKt.v();
                }
            }
        } else {
            i2 = 0;
        }
        if (!(i2 == 1 ? true : z2)) {
            throw new IllegalArgumentException("One realm must be set as default.");
        }
    }

    public static final Realm o(RealmPreferences realmPreferences) {
        return realmPreferences.m();
    }

    public Object a(Function2 function2, Continuation continuation) {
        return this.f33123a.a(function2, continuation);
    }

    public final String e() {
        String o2 = l().o();
        return o2 + "_app1";
    }

    public final String f() {
        return l().h();
    }

    public final Realm g() {
        for (Realm realm : k()) {
            if (realm.j()) {
                return realm;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public Flow getData() {
        return this.f33123a.getData();
    }

    public final GooglePayConfig h() {
        GooglePayConfig l2 = l().l();
        if (l2 != null) {
            return l2;
        }
        throw new IllegalStateException("Google Pay is not configured");
    }

    public final int i() {
        Integer m2 = l().m();
        Intrinsics.f(m2);
        return m2.intValue();
    }

    public final Object j(Continuation continuation) {
        return PreferencesDataStoreKt.b(this, f33122f, continuation);
    }

    public final EnumEntries k() {
        return Realm.k();
    }

    public final Realm l() {
        return (Realm) this.f33125c.getValue();
    }

    public final Realm m() {
        return (Realm) BuildersKt__BuildersKt.b((CoroutineContext) null, new RealmPreferences$getSelectedRealmBlocking$1(this, (Continuation) null), 1, (Object) null);
    }

    public final boolean n() {
        return this.f33124b;
    }

    public final Object p(String str, Continuation continuation) {
        Object e2 = PreferencesDataStoreKt.e(this, f33122f, str, continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final Object q(Realm realm, Continuation continuation) {
        if (!this.f33124b) {
            return Unit.f40552a;
        }
        Object p2 = p(realm.name(), continuation);
        return p2 == IntrinsicsKt.f() ? p2 : Unit.f40552a;
    }
}
