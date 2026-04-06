package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class UserRepository$special$$inlined$create$2 extends ValueLocalDataProvider<User> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ UserRepository$special$$inlined$create$1 f33545f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, UserRepository$special$$inlined$create$1 userRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33545f = userRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33545f.a();
    }

    public Function1 y() {
        return this.f33545f.b();
    }
}
