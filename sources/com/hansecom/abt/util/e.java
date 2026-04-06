package com.hansecom.abt.util;

import android.content.Context;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class e implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Context f39040A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GooglePayClient f39041z;

    public /* synthetic */ e(GooglePayClient googlePayClient, Context context) {
        this.f39041z = googlePayClient;
        this.f39040A = context;
    }

    public final Object invoke() {
        return GooglePayClient.c(this.f39041z, this.f39040A);
    }
}
