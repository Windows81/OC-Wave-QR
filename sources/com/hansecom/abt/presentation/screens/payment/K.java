package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.material3.SheetState;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class K implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SheetState f37812A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37813B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f37814z;

    public /* synthetic */ K(CoroutineScope coroutineScope, SheetState sheetState, NavHostController navHostController) {
        this.f37814z = coroutineScope;
        this.f37812A = sheetState;
        this.f37813B = navHostController;
    }

    public final Object invoke() {
        return PaymentMethodSelectorKt$PaymentMethodSelector$4.k(this.f37814z, this.f37812A, this.f37813B);
    }
}
