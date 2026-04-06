package androidx.datastore.preferences;

import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements Function2<Preferences, Continuation<? super Boolean>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Set F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set set, Continuation continuation) {
        super(2, continuation);
        this.F = set;
    }

    /* renamed from: A */
    public final Object m(Preferences preferences, Continuation continuation) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) s(preferences, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.F, continuation);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.E = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Iterable<Preferences.Key> keySet = ((Preferences) this.E).a().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(keySet, 10));
            for (Preferences.Key a2 : keySet) {
                arrayList.add(a2.a());
            }
            boolean z2 = true;
            if (this.F != SharedPreferencesMigrationKt.a()) {
                Iterable iterable = this.F;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!arrayList.contains((String) it.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z2 = false;
            }
            return Boxing.a(z2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
