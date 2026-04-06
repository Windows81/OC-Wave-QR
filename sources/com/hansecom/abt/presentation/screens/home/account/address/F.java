package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class F implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f35157A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f35158z;

    public /* synthetic */ F(List list, String str) {
        this.f35158z = list;
        this.f35157A = str;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.AnonymousClass2.AnonymousClass2.C(this.f35158z, this.f35157A, (ChangeAddress.State) obj);
    }
}
