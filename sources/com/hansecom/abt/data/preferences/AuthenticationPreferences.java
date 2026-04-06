package com.hansecom.abt.data.preferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@Singleton
@Metadata
public final class AuthenticationPreferences implements DataStore<Preferences> {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f33311b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33312c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static final Preferences.Key f33313d = PreferencesKeys.g("accessToken");

    /* renamed from: e  reason: collision with root package name */
    public static final Preferences.Key f33314e = PreferencesKeys.g("refreshToken");

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DataStore f33315a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AuthenticationPreferences(Context context) {
        Intrinsics.i(context, "context");
        this.f33315a = PreferencesDataStoreKt.c(context);
    }

    public Object a(Function2 function2, Continuation continuation) {
        return this.f33315a.a(function2, continuation);
    }

    public final Object d(Continuation continuation) {
        Object g2 = BuildersKt.g(Dispatchers.b(), new AuthenticationPreferences$clearTokens$2(this, (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final Object e(Continuation continuation) {
        return PreferencesDataStoreKt.b(this, f33313d, continuation);
    }

    public final Flow f() {
        return PreferencesDataStoreKt.a(this, f33313d, "");
    }

    public final Object g(Continuation continuation) {
        return PreferencesDataStoreKt.b(this, f33314e, continuation);
    }

    public Flow getData() {
        return this.f33315a.getData();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.preferences.AuthenticationPreferences$setTokens$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.preferences.AuthenticationPreferences$setTokens$1 r0 = (com.hansecom.abt.data.preferences.AuthenticationPreferences$setTokens$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.AuthenticationPreferences$setTokens$1 r0 = new com.hansecom.abt.data.preferences.AuthenticationPreferences$setTokens$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r8)
            goto L_0x0064
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.D
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.C
            com.hansecom.abt.data.preferences.AuthenticationPreferences r6 = (com.hansecom.abt.data.preferences.AuthenticationPreferences) r6
            kotlin.ResultKt.b(r8)
            goto L_0x0054
        L_0x0041:
            kotlin.ResultKt.b(r8)
            androidx.datastore.preferences.core.Preferences$Key r8 = f33313d
            r0.C = r5
            r0.D = r7
            r0.G = r4
            java.lang.Object r6 = com.hansecom.abt.data.preferences.PreferencesDataStoreKt.e(r5, r8, r6, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r6 = r5
        L_0x0054:
            androidx.datastore.preferences.core.Preferences$Key r8 = f33314e
            r2 = 0
            r0.C = r2
            r0.D = r2
            r0.G = r3
            java.lang.Object r6 = com.hansecom.abt.data.preferences.PreferencesDataStoreKt.e(r6, r8, r7, r0)
            if (r6 != r1) goto L_0x0064
            return r1
        L_0x0064:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.AuthenticationPreferences.h(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
