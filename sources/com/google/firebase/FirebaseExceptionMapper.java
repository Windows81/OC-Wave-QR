package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

public class FirebaseExceptionMapper implements StatusExceptionMapper {
    public final Exception a(Status status) {
        return status.S() == 8 ? new FirebaseException(status.G0()) : new FirebaseApiNotAvailableException(status.G0());
    }
}
