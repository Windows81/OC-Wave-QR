package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.model.zza;
import java.util.Locale;

public class InstallException extends ApiException {
    public InstallException(int i2) {
        super(new Status(i2, String.format(Locale.getDefault(), "Install Error(%d): %s", new Object[]{Integer.valueOf(i2), zza.a(i2)})));
        if (i2 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
