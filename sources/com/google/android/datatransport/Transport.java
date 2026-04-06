package com.google.android.datatransport;

public interface Transport<T> {
    void a(Event event);

    void b(Event event, TransportScheduleCallback transportScheduleCallback);
}
