package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.SecurityQuestionAllResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SecurityQuestionsRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends SecurityQuestionAllResponse>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SecurityQuestionsRepository$special$$inlined$create$1 f33657f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecurityQuestionsRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, SecurityQuestionsRepository$special$$inlined$create$1 securityQuestionsRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33657f = securityQuestionsRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33657f.a();
    }

    public Function1 y() {
        return this.f33657f.b();
    }
}
