package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel;
import com.hansecom.mapi.models.FareMedium;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.PersistentList;

public final /* synthetic */ class E implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PersistentList f37278A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PersistentList f37279B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedium f37280z;

    public /* synthetic */ E(FareMedium fareMedium, PersistentList persistentList, PersistentList persistentList2) {
        this.f37280z = fareMedium;
        this.f37278A = persistentList;
        this.f37279B = persistentList2;
    }

    public final Object invoke(Object obj) {
        return TransferBalanceViewModel.AnonymousClass1.G(this.f37280z, this.f37278A, this.f37279B, (TransferBalance.State) obj);
    }
}
