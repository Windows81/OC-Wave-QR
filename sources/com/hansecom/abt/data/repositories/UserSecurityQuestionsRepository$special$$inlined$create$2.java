package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.SecurityQuestionResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class UserSecurityQuestionsRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends SecurityQuestionResponse>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ UserSecurityQuestionsRepository$special$$inlined$create$1 f33556f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserSecurityQuestionsRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, UserSecurityQuestionsRepository$special$$inlined$create$1 userSecurityQuestionsRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33556f = userSecurityQuestionsRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33556f.a();
    }

    public Function1 y() {
        return this.f33556f.b();
    }
}
