package com.hansecom.abt.presentation.screens.home.barcode;

import android.graphics.Bitmap;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class h implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Bitmap f35864z;

    public /* synthetic */ h(Bitmap bitmap) {
        this.f35864z = bitmap;
    }

    public final Object invoke(Object obj) {
        return BarcodeDisplayViewModel.AnonymousClass1.AnonymousClass2.C(this.f35864z, (BarcodeDisplay.State) obj);
    }
}
