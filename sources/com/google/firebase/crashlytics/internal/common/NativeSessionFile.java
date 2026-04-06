package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.InputStream;

interface NativeSessionFile {
    String a();

    InputStream b();

    CrashlyticsReport.FilesPayload.File c();
}
