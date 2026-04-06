package com.hansecom.abt.api;

import com.hansecom.abt.impl.Realm;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.api.RealmPreferences$getSelectedRealmBlocking$1", f = "RealmPreferences.kt", l = {46}, m = "invokeSuspend")
public final class RealmPreferences$getSelectedRealmBlocking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Realm>, Object> {
    public int D;
    public final /* synthetic */ RealmPreferences E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealmPreferences$getSelectedRealmBlocking$1(RealmPreferences realmPreferences, Continuation continuation) {
        super(2, continuation);
        this.E = realmPreferences;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealmPreferences$getSelectedRealmBlocking$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new RealmPreferences$getSelectedRealmBlocking$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!this.E.n()) {
                Realm unused = this.E.g();
            }
            RealmPreferences realmPreferences = this.E;
            this.D = 1;
            obj = realmPreferences.j(this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) obj;
        Iterator it = this.E.k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((Realm) obj2).name(), str)) {
                break;
            }
        }
        Realm realm = (Realm) obj2;
        return realm == null ? this.E.g() : realm;
    }
}
