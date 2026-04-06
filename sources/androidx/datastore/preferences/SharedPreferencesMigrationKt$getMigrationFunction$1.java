package androidx.datastore.preferences;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;

    public SharedPreferencesMigrationKt$getMigrationFunction$1(Continuation continuation) {
        super(3, continuation);
    }

    /* renamed from: A */
    public final Object d(SharedPreferencesView sharedPreferencesView, Preferences preferences, Continuation continuation) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(continuation);
        sharedPreferencesMigrationKt$getMigrationFunction$1.E = sharedPreferencesView;
        sharedPreferencesMigrationKt$getMigrationFunction$1.F = preferences;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.E;
            Preferences preferences = (Preferences) this.F;
            Iterable<Preferences.Key> keySet = preferences.a().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(keySet, 10));
            for (Preferences.Key a2 : keySet) {
                arrayList.add(a2.a());
            }
            Map a3 = sharedPreferencesView.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : a3.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            MutablePreferences c2 = preferences.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    c2.j(PreferencesKeys.a(str), value);
                } else if (value instanceof Float) {
                    c2.j(PreferencesKeys.d(str), value);
                } else if (value instanceof Integer) {
                    c2.j(PreferencesKeys.e(str), value);
                } else if (value instanceof Long) {
                    c2.j(PreferencesKeys.f(str), value);
                } else if (value instanceof String) {
                    c2.j(PreferencesKeys.g(str), value);
                } else if (value instanceof Set) {
                    Preferences.Key h2 = PreferencesKeys.h(str);
                    Intrinsics.g(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    c2.j(h2, (Set) value);
                }
            }
            return c2.d();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
