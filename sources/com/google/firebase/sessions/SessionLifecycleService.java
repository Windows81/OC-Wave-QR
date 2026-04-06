package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

@Metadata
public final class SessionLifecycleService extends Service {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public MessageHandler f31565A;

    /* renamed from: B  reason: collision with root package name */
    public Messenger f31566B;

    /* renamed from: z  reason: collision with root package name */
    public final HandlerThread f31567z = new HandlerThread("FirebaseSessions_HandlerThread");

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class MessageHandler extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f31568a;

        /* renamed from: b  reason: collision with root package name */
        public long f31569b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f31570c = new ArrayList();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MessageHandler(Looper looper) {
            super(looper);
            Intrinsics.i(looper, "looper");
        }

        public final void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            SessionGenerator.Companion companion = SessionGenerator.f31544f;
            sb.append(companion.a().c());
            Log.d("SessionLifecycleService", sb.toString());
            SessionFirelogPublisher.f31535a.a().a(companion.a().c());
            for (Messenger messenger : new ArrayList(this.f31570c)) {
                Intrinsics.h(messenger, "it");
                f(messenger);
            }
        }

        public final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f31569b = message.getWhen();
        }

        public final void c(Message message) {
            this.f31570c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            Intrinsics.h(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f31570c.size());
        }

        public final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f31568a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f31568a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.f31569b = message.getWhen();
        }

        public final boolean e(long j2) {
            return j2 - this.f31569b > Duration.A(SessionsSettings.f31605c.c().c());
        }

        public final void f(Messenger messenger) {
            if (this.f31568a) {
                h(messenger, SessionGenerator.f31544f.a().c().b());
                return;
            }
            String a2 = SessionDatastore.f31509a.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + a2);
            if (a2 != null) {
                h(messenger, a2);
            }
        }

        public final void g() {
            SessionGenerator.Companion companion = SessionGenerator.f31544f;
            companion.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + companion.a().c().b());
            a();
            SessionDatastore.f31509a.a().b(companion.a().c().b());
        }

        public final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain((Handler) null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f31570c.remove(messenger);
            } catch (Exception e2) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e2);
            }
        }

        public void handleMessage(Message message) {
            Intrinsics.i(message, "msg");
            if (this.f31569b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f31569b + '.');
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                d(message);
            } else if (i2 == 2) {
                b(message);
            } else if (i2 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
                super.handleMessage(message);
            } else {
                c(message);
            }
        }
    }

    public final Messenger a(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a2 = a(intent);
        if (a2 != null) {
            Message obtain = Message.obtain((Handler) null, 4, 0, 0);
            obtain.replyTo = a2;
            MessageHandler messageHandler = this.f31565A;
            if (messageHandler != null) {
                messageHandler.sendMessage(obtain);
            }
        }
        Messenger messenger = this.f31566B;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f31567z.start();
        Looper looper = this.f31567z.getLooper();
        Intrinsics.h(looper, "handlerThread.looper");
        this.f31565A = new MessageHandler(looper);
        this.f31566B = new Messenger(this.f31565A);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f31567z.quit();
    }
}
