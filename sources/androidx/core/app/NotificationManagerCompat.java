package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class NotificationManagerCompat {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f19633c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static String f19634d;

    /* renamed from: e  reason: collision with root package name */
    public static Set f19635e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f19636f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f19637a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f19638b;

    public static class Api23Impl {
    }

    public static class Api24Impl {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    public static class Api26Impl {
    }

    public static class Api28Impl {
    }

    public static class Api30Impl {
    }

    public static class Api34Impl {
    }

    public static class CancelTask implements Task {

        /* renamed from: a  reason: collision with root package name */
        public final String f19639a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19640b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19641c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f19642d;

        public void a(INotificationSideChannel iNotificationSideChannel) {
            if (this.f19642d) {
                iNotificationSideChannel.I0(this.f19639a);
            } else {
                iNotificationSideChannel.L1(this.f19639a, this.f19640b, this.f19641c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f19639a + ", id:" + this.f19640b + ", tag:" + this.f19641c + ", all:" + this.f19642d + "]";
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InterruptionFilter {
    }

    public static class NotificationWithIdAndTag {
    }

    public static class NotifyTask implements Task {

        /* renamed from: a  reason: collision with root package name */
        public final String f19643a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19644b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19645c;

        /* renamed from: d  reason: collision with root package name */
        public final Notification f19646d;

        public void a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.M2(this.f19643a, this.f19644b, this.f19645c, this.f19646d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f19643a + ", id:" + this.f19644b + ", tag:" + this.f19645c + "]";
        }
    }

    public static class ServiceConnectedEvent {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f19647a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f19648b;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.f19647a = componentName;
            this.f19648b = iBinder;
        }
    }

    public static class SideChannelManager implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final Context f19649a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f19650b;

        /* renamed from: c  reason: collision with root package name */
        public final Map f19651c;

        /* renamed from: d  reason: collision with root package name */
        public Set f19652d;

        public static class ListenerRecord {

            /* renamed from: a  reason: collision with root package name */
            public final ComponentName f19653a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f19654b = false;

            /* renamed from: c  reason: collision with root package name */
            public INotificationSideChannel f19655c;

            /* renamed from: d  reason: collision with root package name */
            public ArrayDeque f19656d = new ArrayDeque();

            /* renamed from: e  reason: collision with root package name */
            public int f19657e = 0;

            public ListenerRecord(ComponentName componentName) {
                this.f19653a = componentName;
            }
        }

        public final boolean a(ListenerRecord listenerRecord) {
            if (listenerRecord.f19654b) {
                return true;
            }
            boolean bindService = this.f19649a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(listenerRecord.f19653a), this, 33);
            listenerRecord.f19654b = bindService;
            if (bindService) {
                listenerRecord.f19657e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + listenerRecord.f19653a);
                this.f19649a.unbindService(this);
            }
            return listenerRecord.f19654b;
        }

        public final void b(ListenerRecord listenerRecord) {
            if (listenerRecord.f19654b) {
                this.f19649a.unbindService(this);
                listenerRecord.f19654b = false;
            }
            listenerRecord.f19655c = null;
        }

        public final void c(Task task) {
            i();
            for (ListenerRecord listenerRecord : this.f19651c.values()) {
                listenerRecord.f19656d.add(task);
                g(listenerRecord);
            }
        }

        public final void d(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.f19651c.get(componentName);
            if (listenerRecord != null) {
                g(listenerRecord);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            ListenerRecord listenerRecord = (ListenerRecord) this.f19651c.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.f19655c = INotificationSideChannel.Stub.J(iBinder);
                listenerRecord.f19657e = 0;
                g(listenerRecord);
            }
        }

        public final void f(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.f19651c.get(componentName);
            if (listenerRecord != null) {
                b(listenerRecord);
            }
        }

        public final void g(ListenerRecord listenerRecord) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + listenerRecord.f19653a + ", " + listenerRecord.f19656d.size() + " queued tasks");
            }
            if (!listenerRecord.f19656d.isEmpty()) {
                if (!a(listenerRecord) || listenerRecord.f19655c == null) {
                    h(listenerRecord);
                    return;
                }
                while (true) {
                    Task task = (Task) listenerRecord.f19656d.peek();
                    if (task == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + task);
                        }
                        task.a(listenerRecord.f19655c);
                        listenerRecord.f19656d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + listenerRecord.f19653a);
                        }
                    } catch (RemoteException e2) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + listenerRecord.f19653a, e2);
                    }
                }
                if (!listenerRecord.f19656d.isEmpty()) {
                    h(listenerRecord);
                }
            }
        }

        public final void h(ListenerRecord listenerRecord) {
            if (!this.f19650b.hasMessages(3, listenerRecord.f19653a)) {
                int i2 = listenerRecord.f19657e;
                int i3 = i2 + 1;
                listenerRecord.f19657e = i3;
                if (i3 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + listenerRecord.f19656d.size() + " tasks to " + listenerRecord.f19653a + " after " + listenerRecord.f19657e + " retries");
                    listenerRecord.f19656d.clear();
                    return;
                }
                int i4 = (1 << i2) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i4 + " ms");
                }
                this.f19650b.sendMessageDelayed(this.f19650b.obtainMessage(3, listenerRecord.f19653a), (long) i4);
            }
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c((Task) message.obj);
                return true;
            } else if (i2 == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                e(serviceConnectedEvent.f19647a, serviceConnectedEvent.f19648b);
                return true;
            } else if (i2 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i2 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public final void i() {
            Set c2 = NotificationManagerCompat.c(this.f19649a);
            if (!c2.equals(this.f19652d)) {
                this.f19652d = c2;
                List<ResolveInfo> queryIntentServices = this.f19649a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (c2.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f19651c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f19651c.put(componentName2, new ListenerRecord(componentName2));
                    }
                }
                Iterator it = this.f19651c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        b((ListenerRecord) entry.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f19650b.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f19650b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface Task {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    public NotificationManagerCompat(Context context) {
        this.f19637a = context;
        this.f19638b = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat b(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set c(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f19633c) {
            if (string != null) {
                try {
                    if (!string.equals(f19634d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f19635e = hashSet;
                        f19634d = string;
                    }
                } finally {
                }
            }
            set = f19635e;
        }
        return set;
    }

    public boolean a() {
        return Api24Impl.a(this.f19638b);
    }
}
