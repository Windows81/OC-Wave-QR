package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

public interface zae extends IInterface {
    void B1(Status status, ModuleInstallResponse moduleInstallResponse);

    void E1(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);

    void L0(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);

    void y2(Status status);
}
