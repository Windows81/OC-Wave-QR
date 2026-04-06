package io.realm.kotlin;

import io.realm.Realm;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Realm.Transaction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f40373a;

    public /* synthetic */ a(Function1 function1) {
        this.f40373a = function1;
    }

    public final void a(Realm realm) {
        RealmExtensionsKt$executeTransactionAwait$2.C(this.f40373a, realm);
    }
}
