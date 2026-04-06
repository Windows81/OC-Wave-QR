package com.google.android.gms.pay;

import android.app.Activity;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

public interface PayClient extends HasApiKey<Api.ApiOptions.NotRequiredOptions> {

    public enum ProductName {
        GOOGLE_PAY,
        GOOGLE_WALLET
    }

    public @interface RequestType {
    }

    public @interface SavePassesResult {
    }

    public @interface WearWalletIntentSource {
    }

    void b(String str, Activity activity, int i2);

    Task c(int i2);
}
