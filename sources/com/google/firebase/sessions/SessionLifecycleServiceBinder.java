package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import kotlin.Metadata;

@Metadata
public interface SessionLifecycleServiceBinder {
    void a(Messenger messenger, ServiceConnection serviceConnection);
}
