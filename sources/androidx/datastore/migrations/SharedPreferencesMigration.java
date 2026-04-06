package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataMigration;
import java.io.IOException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedPreferencesMigration<T> implements DataMigration<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f20673a;

    /* renamed from: b  reason: collision with root package name */
    public final Function3 f20674b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f20675c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20676d;

    /* renamed from: e  reason: collision with root package name */
    public final Lazy f20677e;

    /* renamed from: f  reason: collision with root package name */
    public final Set f20678f;

    @Metadata
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4  reason: invalid class name */
    final class AnonymousClass4 extends Lambda implements Function0<SharedPreferences> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ String f20679A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Context f20680z;

        /* renamed from: b */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f20680z.getSharedPreferences(this.f20679A, 0);
            Intrinsics.h(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    @Metadata
    public static final class Api24Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api24Impl f20681a = new Api24Impl();

        @JvmStatic
        public static final boolean a(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "name");
            return context.deleteSharedPreferences(str);
        }
    }

    public Object a(Continuation continuation) {
        Context context;
        String str;
        SharedPreferences.Editor edit = e().edit();
        Set<String> set = this.f20678f;
        if (set == null) {
            edit.clear();
        } else {
            for (String remove : set) {
                edit.remove(remove);
            }
        }
        if (edit.commit()) {
            if (!(!e().getAll().isEmpty() || (context = this.f20675c) == null || (str = this.f20676d) == null)) {
                d(context, str);
            }
            Set set2 = this.f20678f;
            if (set2 != null) {
                set2.clear();
            }
            return Unit.f40552a;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r5.isEmpty() == false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            androidx.datastore.migrations.SharedPreferencesMigration r5 = (androidx.datastore.migrations.SharedPreferencesMigration) r5
            kotlin.ResultKt.b(r6)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.functions.Function2 r6 = r4.f20673a
            r0.C = r4
            r0.F = r3
            java.lang.Object r6 = r6.m(r5, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r5 = r4
        L_0x0046:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L_0x0054
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r0)
            return r5
        L_0x0054:
            java.util.Set r6 = r5.f20678f
            if (r6 != 0) goto L_0x006e
            android.content.SharedPreferences r5 = r5.e()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.Intrinsics.h(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x006c
            goto L_0x0098
        L_0x006c:
            r3 = r0
            goto L_0x0098
        L_0x006e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.e()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0082
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0082
            goto L_0x006c
        L_0x0082:
            java.util.Iterator r6 = r6.iterator()
        L_0x0086:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L_0x0086
        L_0x0098:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object c(Object obj, Continuation continuation) {
        return this.f20674b.d(new SharedPreferencesView(e(), this.f20678f), obj, continuation);
    }

    public final void d(Context context, String str) {
        Api24Impl.a(context, str);
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.f20677e.getValue();
    }
}
